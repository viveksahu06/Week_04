package com.problemstatement.junit.basic.testingbeforeeachandaftereachannotations;

public class DatabaseConnection {
    private boolean isConnected;

    //Connecting to database
    public void connect(){
        isConnected=true;
        System.out.println("Database is connected");
    }

    //Disconnecting from database
    public void disconnect(){
        isConnected=false;
        System.out.println("Database is disconnected");
    }

    //Checking connection status
    public boolean isConnected(){
        return isConnected;
    }
}
