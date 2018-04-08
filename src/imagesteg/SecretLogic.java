/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesteg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SecretLogic {
    private String secretMessage="";
    FileInputStream inputFile;
    int read;
    int messageLenghtCounter = 0;
    
    
    public String getSecretMessage(String filePath) throws IOException
    {
            setMessageLength(filePath);
        try {
                inputFile = new FileInputStream(filePath);
                inputFile.skip(inputFile.available()-messageLenghtCounter);            

                for(int i=0; i<messageLenghtCounter;i++)
                {
                    read = inputFile.read();
                    secretMessage += (char) decoder(read);
                }
            } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(SecretLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return secretMessage;
    }
    
    public void setSecretMessage(String message, String filePath) throws FileNotFoundException, IOException
    {
           inputFile = new FileInputStream(filePath);
           String msg="";

           msg+='!'; //(int)Indication to starting the message
           for(int i=0; i<message.length();i++)
           {
                msg+=(char)encoder((int)message.charAt(i));
           }
           PrintWriter bw = new PrintWriter(new FileWriter(filePath, true));
           bw.write(msg);
           bw.close();
    }
    
    public int decoder(int encodedChar)//tested
    {
        int value = encodedChar - 10;
        while(value < 0)
            value += 128;
        return value;
    }
    
    public int encoder(int asciiOfChar)//tested
    {
        int value = asciiOfChar + 10;
        while(value > 127)
            value -= 128;
        return value;
    }
    
    public void  setMessageLength(String filePath) throws FileNotFoundException, IOException //tested
    {
        inputFile = new FileInputStream(filePath);
        inputFile.skip(inputFile.available()-1);
        read = inputFile.read();
        
        while(read != 33)//special character ! ascii // Still back till find the begining of the message
                {
                    messageLenghtCounter++;
                    inputFile.close();
                    
                    inputFile = new FileInputStream(filePath);
                    inputFile.skip(inputFile.available() - messageLenghtCounter -1); //Read before the last readed character 
                    read = inputFile.read();
                }
                inputFile.close();
                                
    }
}
