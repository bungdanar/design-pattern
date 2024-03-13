import creational.builder.MovieBuilder;
import creational.builder.Presentation;
import creational.builder.Slide;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        var movie = builder.getMovie();
    }
}