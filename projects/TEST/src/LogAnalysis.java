package TEST1;

import java.util.*;
import java.io.*;

public class LogAnalysis {

}


class RecordPacks{
	private int blockId;
	private static long recordId;
	private String threadId;
	private String recordBody;
	
	public RecordPacks(){
		this.blockId = 0;
		this.threadId = null;
		this.recordBody = null;
	}
	
	public RecordPacks(int blockId,String threadId,String recordBody){
		this.blockId = blockId;
		this.threadId = threadId;
		this.recordBody = recordBody;
	}
	
	public void setBlockId(int blockId){
		this.blockId = blockId;
	}
	
	public int getBlockId(){
		return blockId;
	}
	
	public void setThreadId(String threadId){
		this.threadId = threadId;
	}
	
	public String getThreadId(){
		return threadId;
	}
	
	public void setRecordBody(String recordBody){
		this.recordBody = recordBody;
	}
	
	public String toString(){
		return ("[BLOCKID=" + this.blockId + "] " +  this.recordBody);
	}

	public boolean isFirstLine(){
		return this.recordBody.startsWith("[");
	}
	
	public String getTimeLable(){
		String[] strArr = this.recordBody.split("\\s+",4);
		return strArr[0];
	}
	
	public String getThreadIdLable(){
		String[] strArr = this.recordBody.split("\\s+",4);
		return strArr[1];
	}
	
	public String getStatusLable(){
		String[] strArr = this.recordBody.split("\\s+",4);
		return strArr[2];
	}
	
	public String getRecordText(){
		String[] strArr = this.recordBody.split("\\s+",4);
		return strArr[3];
	}
	
}

class BlockPacks{
	private int blockId;
	private String threadId;
	private List<RecordPacks> recordPack = new ArrayList<RecordPacks>();
	
	public BlockPacks(){
		this.blockId = 0;
		this.threadId = null;
	}
	
	public BlockPacks(int blockId,String threadId,List<RecordPacks> recordPack){
		this.blockId = blockId;
		this.threadId = threadId;
		this.recordPack = recordPack;
	}
	
	public void setBlockId(int blockId){
		this.blockId = blockId;
	}
	
	public int getBlockId(){
		return blockId;
	}
	
	public void setThreadId(String threadId){
		this.threadId = threadId;
	}
	
	public String getThreadId(){
		return threadId;
	}
	
	public List<RecordPacks> getRecordPack(){
		return recordPack;
	}
	
	public void setRecordPack(List<RecordPacks> recordPack){
		this.recordPack = recordPack;
	}
}