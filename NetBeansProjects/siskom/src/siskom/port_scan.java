package siskom;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class port_scan {
    public static void main(String[] args) throws UnknownHostException {

        String host = "localhost";
        InetAddress iA = InetAddress.getByName(host);
        String hostname = iA.getHostName();

        for (int port = 70; port <= 12370; port++) {
            System.out.println("Checking port " + port);
            try {
                Socket socket = new Socket(hostname, port);
                String text = hostname + " is listening on port " + port;
                System.out.println(text);
                socket.close();
            } catch (Exception e) {
            }

        }
    }

}
