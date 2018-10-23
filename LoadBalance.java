import java.util.*;
import java.net.*;
import java.io.*;
public class LoadBalance implements Runnable {
    ArrayList<Socket> centrals = new ArrayList<Socket>();
    ServerSocket ss;
    String[] central_ips = new String[]{"1.1.1.1","2.2.2.2","3.3.3.3"};
    int port = 53136;
    public LoadBalance() {
        try {
            for(String s : central_ips) {
                centrals.add(new Socket(s,port));
            }
            ss = new ServerSocket(53135);
        } catch (Exception e) {
            System.out.println("ERROR ESTABLISHING LOAD BALANCE SERVER: " + e.toString());   
        }
        run();
    }
    public void run() {
        while(true) {
            Socket s;
            try {
                s = ss.accept();
                //check all central servers for lowest load, then send that IP
                
                
            } catch (Exception e) {
                System.out.println("ERROR GETTING CONNECTION: " + e.toString());
            }
        }
        
        
    } 
}