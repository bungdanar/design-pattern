import structural.decorator.CloudStream;
import structural.decorator.CompressedCloudStream;
import structural.decorator.EncryptedCloudStream;
import structural.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}