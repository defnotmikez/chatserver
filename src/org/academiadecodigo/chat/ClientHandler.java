package org.academiadecodigo.chat;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private Server server;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        synchronized (server) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String read = in.readLine();
                send(read);
               server.broadcast(read);

             /*  *//* if (read.equals("exit")) {
                    in.close();
                    serverSocket.close();
                    acceptClient.close();
                    System.out.println("Connection closed!");
                    break;
*//*

                }*/

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private void send(String message ){
        System.out.println(getThreadName() + message);

    }


    private String getThreadName() {
        return Thread.currentThread().getName() + " : ";
    }
}
