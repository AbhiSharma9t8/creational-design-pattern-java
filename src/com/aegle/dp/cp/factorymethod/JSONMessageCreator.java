package com.aegle.dp.cp.factorymethod;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
