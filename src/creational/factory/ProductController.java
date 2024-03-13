package creational.factory;

import creational.factory.matcha.Controller;
import creational.factory.matcha.MatchaViewEngine;
import creational.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
