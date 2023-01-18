package ru.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static final int PORT = 8787;

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    System.out.println("Клиент " + clientSocket.getInetAddress().getHostName() + " подключен");

                    out.println("Ответ от сервера");
                    System.out.println(in.readLine());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
