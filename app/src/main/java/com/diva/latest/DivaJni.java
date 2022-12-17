package com.diva.latest;

public class DivaJni {

    private static final String soName =  "divajni";

    static
    {
        System.loadLibrary(soName);
    }
    // Jni function
    // Returns 1 if the key specified by user is valid, 0 otherwise
    public native int access(String key);
    public native int initiateLaunchSequence(String code);
}