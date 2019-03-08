
package Bai1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

/**
 *
 * @author vantu
 */



//=============================== Client connetion to Server ============================
public class CreatClient {
    public static void main(String[]args) {
        try{
            Socket client = new Socket("localhost",9900);
            // luong Object
            // luong nhan la inputStream
            // ... ObjectInputStream
            InputStream in = client.getInputStream();
            ObjectInputStream receiver = new ObjectInputStream(in);
            Object obj = receiver.readObject();
            Date date = (Date)obj;
            System.out.println(date.toString());

        }
        catch(UnknownHostException e){
            e.printStackTrace();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
    
    }
}
