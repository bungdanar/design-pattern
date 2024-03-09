import iterator.BrowseHistory;
import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();

        imageStorage.store("picture", new JpegCompressor(),
                new BlackAndWhiteFilter());
    }
}