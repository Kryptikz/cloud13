import java.net.*;
import java.io.*;
public class NodeManagerThread{
    Socket s;
    public NodeManagerThread(Socket S){
        s = S;
        run();
    }
    public void run(){
        while (s.isConnected()){
            //repeats while the node is online
            
        }
    }
}