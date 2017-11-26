import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by henrymbp on 8/10/17.
 */
public class Server {
    public static void main(String[] args)throws Exception{
        ServerSocket ss = new ServerSocket(30000);
        while(true){
            Socket s = ss.accept();
            System.out.println("Get a Socket from a client: "+ s.getRemoteSocketAddress());
            PrintStream ps = new PrintStream(s.getOutputStream());
            System.out.println("Server is handling the request. 15s is needed.");
            Thread.sleep(10*1000L);
            ps.println("Hello, this is a message from the server.");
            System.out.println("Server Printed a message. Sleep 15s .");
            Thread.sleep(10*1000L);
            ps.println("2nd a message from the server.");
            System.out.println("Server Printed 2nd message. Sleep 15s .");
            Thread.sleep(10*1000L);
            ps.close();
            System.out.println("Server Closed ps. Sleep 15s .");
            Thread.sleep(10*1000L);
            s.close();
            System.out.println("Server Closed Socket.");
        }
    }
}
// new line
// a new line
// 3:48PM
