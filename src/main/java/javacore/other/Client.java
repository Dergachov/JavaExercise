package javacore.other;

import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 5050; // здесь обязательно нужно указать порт к которому привязывается сервер.
        String address = "85.238.99.7"; // это IP-адрес компьютера, где исполняется наша серверная программа.
        // Здесь указан адрес того самого компьютера где будет исполняться и клиент.
        UUID uuid = UUID.randomUUID();


        String connectionInitial = "Connection\\Start";
        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
            System.out.println("Yes! I just got hold of the program.");

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиентом.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // Создаем поток для чтения с клавиатуры.
            //BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            //System.out.println("Type in something and press enter. Will send it to the server and tell ya what it thinks.");
            //System.out.println();
            boolean connStart = false;
            while (true) {
                //line = keyboard.readLine(); // ждем пока пользователь введет что-то и нажмет кнопку Enter.
                //System.out.println("Sending this line to the server...");
                //out.writeBytes(line);
                //out.writeUTF(line); // отсылаем введенную строку текста серверу.
                if(!connStart){
                    out.writeBytes(connectionInitial);
                }
                System.out.println(connectionInitial);

                //out.writeBytes(uuid.toString());
                out.flush(); // заставляем поток закончить передачу данных.
                //line = in.readUTF(); // ждем пока сервер отошлет строку текста.
                int c;
                char[] buffer = new char[1024];
                for (int i = 0; (c = in.read()) > 0; i++) {
                    buffer[i] = (char)c;
                }
                String buff = new String (buffer);
                System.out.println(buff);
                if(buff.startsWith("Start init")){
                    connStart = true;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    Date now = new Date();
                    String strDate = sdf.format(now);
                    out.writeBytes("\n" + strDate + "\tRemote");

                    out.writeBytes("\n" + uuid.toString() + "\n");
                    out.flush();
                    System.out.println(uuid.toString());
                }
                //System.out.println(line);
                // System.out.println("The server was very polite. It sent me this : " + line);
               // System.out.println("Looks like the server is pleased with us. Go ahead and enter more lines.");
                System.out.println();
                //Thread.sleep(1000);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}