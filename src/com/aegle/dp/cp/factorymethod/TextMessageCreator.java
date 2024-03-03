package com.aegle.dp.cp.factorymethod;
/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
