package src.NOI;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

//In order to read data from file we uses file channel.
// Object of file channel can be created only by calling the getChannel() method on file object as we can't create file object directly.
public class FileChannel {
    public static void main(String[] args) throws IOException {
        RandomAccessFile FILE = new RandomAccessFile( "C:\\Users\\Shubham Patel\\OneDrive\\Desktop\\bookings.txt", "rw");
        java.nio.channels.FileChannel fileChannel = FILE.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        while (fileChannel.read(byteBuffer) > 0) {
            // flip the buffer to prepare for get operation
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
        }
        FILE.close();

    }
}
