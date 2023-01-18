package ru.home;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {
    public static final int PORT = 8787;
    public static final String LOCAL_HOST = "127.0.0.1";

    public static void main(String[] args) {
        try (Socket socket = new Socket(LOCAL_HOST, PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println(in.readLine());
            out.println("Ответ от клиента");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

