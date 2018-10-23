import java.util.*;
public class NodeData{
    ArrayList<String> fileNames;
    String ip;
    Boolean isOnline;
    //ArrayList<Block> data;
    public NodeData(String IP){
        fileNames = new ArrayList<String>();
        //data = new ArrayList<Block>();
        ip = IP;
        isOnline = true;
    }
}