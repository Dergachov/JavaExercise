package javacore.io.serializable;

import java.io.Serializable;

public class TestSerial implements Serializable {
    private String id;
    private String name;
    private String card;

    public TestSerial(String id, String name, String card) {
        this.id = id;
        this.name = name;
        this.card = card;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCard() {
        return card;
    }
}
