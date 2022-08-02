package org.academiadecodigo.chat;


import java.io.IOException;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {


    public static void main(String[] args) throws IOException {
        ConcurrentHashMap<> map = new ConcurrentHashMap<>();
        ExecutorService pool = Executors.newFixedThreadPool(100);


        Scanner info = new Scanner(System.in);

        System.out.print("Insert Port Number: ");
        String port = info.nextLine();
        ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));







        while (true) {
            Socket acceptClient = serverSocket.accept();
            pool.submit(new ClientHandler(acceptClient));
            for (int i = 0; i <; i++) {

            }

            }



        }

    public void broadcast(String message)  {
        try {
            PrintWriter out = new PrintWriter(.getOutputStream(),true);
            out.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }




