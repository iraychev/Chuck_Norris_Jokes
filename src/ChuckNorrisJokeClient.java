import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
public class ChuckNorrisJokeClient {

    public void go() {
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 5000);
        try (SocketChannel socketChannel = SocketChannel.open(serverAddress)) {
            Reader channelReader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(channelReader);
            String advice = reader.readLine();
            System.out.println("Generating a truth about Chuck Norris: \n" + advice);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ChuckNorrisJokeClient().go();
    }
}