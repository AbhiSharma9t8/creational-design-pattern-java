package com.aegle.dp.cp.builder.Singleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    private EagerRegistry() {

    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
