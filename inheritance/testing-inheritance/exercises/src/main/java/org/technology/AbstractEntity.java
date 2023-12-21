package org.technology;

import java.util.UUID;

abstract class AbstractEntity {
    // id field of type String
    private String id;

    //constructor that assigns a random UUID to ID
    public AbstractEntity() {
        this.id = UUID.randomUUID().toString();
    }

    //getter method for id

    public String getId() {
        return id;
    }
}
