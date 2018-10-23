import java.net.*;
import java.io.*;
import java.util.*;
public class NodeManager implements Runnable{
    ArrayList<NodeData> nodes;
    ServerSocket ss;
    public NodeManager(){
        nodes = new ArrayList<NodeData>();
        try{
            ss = new ServerSocket(53137);
        }
        catch (Exception e){
            System.out.print("ERROR ESTABLISHING NODE MANAGER SERVER: " + e);
        }
    }
    public void run(){
        while(true){
            Socket s = new Socket();
            try{
                s = ss.accept();
            }
            catch(Exception e){
                System.out.print("ERROR GETTING CONNECTION: " + e);
            }
            //waits for a connection
            nodes.add(new NodeData(s.getInetAddress().toString()));
            //adds the new node to the array of node data
            //(new Thread(new NodeManagerThread(s))).start();
            //starts a new thread
        }
    }
}