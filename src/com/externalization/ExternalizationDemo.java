package com.externalization;

import java.util.*;
import java.io.*;
 
/**
 * Externalization Demo Program.
 * @author Sunil Pavan
 */
public class ExternalizationDemo {
 
    private String filePath = "/Users/sunilp/Documents/workspace-sts-3.9.0.RELEASE/Serialization/src/output/externalization.txt";
 
    public void serialize() throws IOException {
        User user = new User();
 
        user.setCode(123);
        user.setName("Tom");
        user.setBirthday(new Date());
        user.setPassword("secret123");
        user.setSocialSecurityNumber(1234567890);
 
 
        // serialize object's state
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);
        outputStream.writeObject(user);
        outputStream.close();
 
 
        System.out.println("User's details before serialization:\n" + user.toString());
        System.out.println("Serialization done");
    }
 
    public void deserialize() throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        User user = (User) inputStream.readObject();
        inputStream.close();
 
        System.out.println("User's details afeter de-serialization:\n" + user.toString());
    }
 
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        ExternalizationDemo demo = new ExternalizationDemo();
 
        demo.serialize();
 
        System.out.println("\n=============\n");
 
        demo.deserialize();
 
    }
 
}