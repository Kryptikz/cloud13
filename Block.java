import java.util.*;
public class Block {
    /*
     * Blocks contain the following:
     * -Data hash
     * -Data size
     * -File ID(order the file is from original file if >10mb, otherwise 1)
     * -File hash(hash of the original file)
     * -Data content
     */
    String dHash;
    String dSize;
    String fID;
    String fHash;
    byte[] dContent;
    
    public Block(String dHash1, String dSize1, String fID1, String fHash1, byte[] dContent1) {
        dHash=dHash1;
        dSize=dSize1;
        fID=fID1;
        fHash=fHash1;
        dContent=dContent1;
    }
    
    public void setDataHash(String dHash1) {
        dHash=dHash1;
    }
    public void setDataSize(String dSize1) {
        dSize=dSize1;
    }
    public void setFileID(String fID1) {
        fID=fID1;
    }
    public void setFileHash(String fHash1) {
        fHash=fHash1;
    }
    public void setDataContent(byte[] dContent1) {
        dContent=dContent1;
    }
    
    public String getDataHash() {
        return dHash;
    }
    public String getDataSize() {
        return dSize;
    }
    public String getFileID() {
        return fID;
    }
    public String getFileHash() {
        return fHash;
    }
    public byte[] getDataContent() {
        return dContent;
    }
}