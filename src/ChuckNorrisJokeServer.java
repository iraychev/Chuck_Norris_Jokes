import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ChuckNorrisJokeServer {


    private void go(){
        try(ServerSocketChannel serverChannel = ServerSocketChannel.open()) {
            serverChannel.bind(new InetSocketAddress("localhost", 5000));

            while(serverChannel.isOpen()){
                SocketChannel clientChannel = serverChannel.accept();
                PrintWriter writer = new PrintWriter(Channels.newOutputStream(clientChannel));
                String joke = new ChuckNorrisJoke().getJoke();
                writer.println(joke);
                writer.close();
                System.out.println(joke);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        new ChuckNorrisJokeServer().go();
    }
}
