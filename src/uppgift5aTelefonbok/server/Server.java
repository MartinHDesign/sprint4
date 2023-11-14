package uppgift5aTelefonbok.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Dao dataBase = new Dao();

    public Server(int port){
        try (ServerSocket ss = new ServerSocket(port);
             Socket socketToClient = ss.accept();
             PrintWriter out = new PrintWriter(socketToClient.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socketToClient.getInputStream()));
        ){
            out.println("Connected");

            String clientInput;
            while ((clientInput = in.readLine()) != null){
                Kompis1 searchedName;
                if ((searchedName = dataBase.searchKompis(clientInput)) != null){
                    out.println(dataBase.printAllData(searchedName));
                } else
                    out.println("Namn hittades inte");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Server(5555);
    }
}
