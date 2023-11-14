package uppgift5aTelefonbok.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public Client(int port){

        try (Socket socketToServer = new Socket("127.0.0.1",port);
             PrintWriter out = new PrintWriter(socketToServer.getOutputStream(),true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socketToServer.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        ){
            System.out.println(in.readLine());
            while (true){
                System.out.println("Sök efter namn");
                String userRequest = userInput.readLine();
                out.println(userRequest);
                System.out.println(in.readLine());
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Client(5555);
    }
}
