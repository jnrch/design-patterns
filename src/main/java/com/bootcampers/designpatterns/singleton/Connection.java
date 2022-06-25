package com.bootcampers.designpatterns.singleton;

public class Connection {

    private static Connection instance;

    private Connection() {

    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conexión establecida con la base de datos");
    }

    public void disconnect() {
        System.out.println("Desconectado de la base de datos");
    }


}
