package ru.home;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(ServerSocket socket = new ServerSocket(ServerConfig.PORT)
        ){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
