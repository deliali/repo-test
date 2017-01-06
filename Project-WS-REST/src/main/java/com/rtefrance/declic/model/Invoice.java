package com.rtefrance.declic.model;

public class Invoice {

    private final long id;
    private final String name;

    public Invoice(long id, String content) {
        this.id = id;
        this.name = content;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
