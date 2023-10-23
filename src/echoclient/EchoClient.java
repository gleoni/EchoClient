package echoclient;

import java.io.*;
import java.net.*;

public class EchoClient {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1", 5555);
        BufferedReader sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
        
        while (true) {
            sock_out.println(std_in.readLine());
            std_out.println(sock_in.readLine());
        }
    }
}
