import java.net.*;
import java.io.*;
public class NodeManagerThread implements Runnable{
    Socket s;
    NodeData nd;
    public NodeManagerThread(Socket S,NodeData ND){
        s = S;
        nd = ND;
        run();
    }
    public void run(){
        while (s.isConnected()){
            //repeats while the node is online
            /*
             * Check if someone wants to pull data
             * Check if someone wants to store data
             */
            if(pull()){
                
            }
            else if(push()){
                
            }
        }
        nd.isOnline = false;
    }
    public boolean pull(){
        return false;
    }
    public boolean push(){
        return false;
    }
}