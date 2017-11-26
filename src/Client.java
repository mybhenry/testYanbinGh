import jdk.nashorn.internal.runtime.ECMAException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by henrymbp on 8/10/17.
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1", 30000);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        long start = System.currentTimeMillis();
        while (true) {
            if(System.currentTimeMillis() - start > 1000*1000L) break;
            String line = br.readLine();
            System.out.println("Message from Server: " + line);
        }
        br.close();
        s.close();
    }
}
