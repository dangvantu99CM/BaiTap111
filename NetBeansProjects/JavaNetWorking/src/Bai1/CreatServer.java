package Bai1;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author vantu // Suport HungNguyen
 */


//=============================== khởi tạo server ==================================
public class CreatServer {

    public static void main(String[] args) {
        try {
            System.out.println("Server Starting ...");
            ServerSocket server = new ServerSocket(9900);
            
//        ===================  Server đợi client kết nối lên ====================
            System.out.println("Waiting for client...");
            
            Socket client = server.accept();
            System.out.println("New Client has been connetioned...");
            
            System.out.println("Get date of server");
            Date currentDate = new Date();
            
            // sent data from server
            System.out.println("Sent data");
            OutputStream out = client.getOutputStream();
            ObjectOutputStream sender = new ObjectOutputStream(out);
            sender.writeObject(currentDate);
            sender.flush();
            
            
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
