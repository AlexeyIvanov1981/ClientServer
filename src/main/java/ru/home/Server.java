package ru.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(ServerConfig.PORT);) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
                ) {
                    //TODO
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
