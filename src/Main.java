import structural.adapter.CaramelFilter;
import structural.adapter.Image;
import structural.adapter.ImageView;
import structural.adapter.VividFilter;
import structural.adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}