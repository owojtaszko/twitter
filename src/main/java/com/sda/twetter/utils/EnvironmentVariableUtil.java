package com.sda.twetter.utils;

public class EnvironmentVariableUtil {
    //zamiana:
    //hibernate.connection.username
    //na:
    //hibernate_connection_username
    public static String getVariable(String key) {
        return System.getenv(key.replace('.', '_'));
    }
}
