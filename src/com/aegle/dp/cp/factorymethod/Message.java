package com.aegle.dp.cp.factorymethod;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */
public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders(){

    }

    public void encrypt(){

    }

}
