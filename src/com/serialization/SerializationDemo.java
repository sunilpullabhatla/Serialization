package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CricketScore cs  = new CricketScore();
		cs.setCurrentScore(100);
		cs.setFallenWickets(1);
		cs.setOvers(15);
		
		serialize(cs);
		
		CricketScore cs1 = deSerialize();
		
		System.out.println(cs1.toString());
		
        
	}

	public static void serialize(CricketScore cs) {
		  
		try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/sunilp/Documents/workspace-sts-3.9.0.RELEASE/Serialization/src/output/serialize.txt"))){
	    	   
	    	   oos.writeObject(cs);
	    	   
	       }catch (Exception e) {
			// TODO: handle exception
	    	   System.out.println("Problem Occurs");
	    	   e.printStackTrace();
		}
		
	}
	
	
	public static CricketScore deSerialize() {
		
		CricketScore cs = null;
		
		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("/Users/sunilp/Documents/workspace-sts-3.9.0.RELEASE/Serialization/src/output/serialize.txt"))){
	    	   
		 cs = (CricketScore) oos.readObject();
	    	   
			
	       }catch (Exception e) {
			// TODO: handle exception
	    	   System.out.println("Problem Occurs");
	    	   e.printStackTrace();
		}
		
		return cs;
		
	}
}
