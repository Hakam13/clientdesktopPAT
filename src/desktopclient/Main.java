
package desktopclient;

import java.io.*;
import java.net.*;
public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket();
        DataInputStream input = null;
        String hostname ="moodle777.ddns.net";
        pcClient client = new pcClient(socket);
        try{
            System.out.println("menunggu jaringan");
            socket.connect(new InetSocketAddress(hostname, 9999));
            client.setVisible(true);
            client.statusAppend();
            input = new DataInputStream(socket.getInputStream());
            String line = input.readUTF();
            System.out.println(line);
            if (!line.equals("login")){
                client.searchRec();
            }

            
        }
        catch(Exception e){
            
        }
        
    }
}
