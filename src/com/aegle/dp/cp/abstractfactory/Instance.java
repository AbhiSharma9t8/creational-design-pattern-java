package com.aegle.dp.cp.abstractfactory;

//Represents an abstract product
public interface Instance {
    enum Capacity{micro, small, large};
    void start();
    void attachStorage(Storage storage);
    void stop();
}
