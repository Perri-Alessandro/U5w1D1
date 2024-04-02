package perriAlessandro.U5w1D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import perriAlessandro.U5w1D1.entities.Bevande;
import perriAlessandro.U5w1D1.entities.Pizza;
import perriAlessandro.U5w1D1.entities.Topping;

@Configuration
public class BeansConfig {

    @Bean
    public Topping toppingSalame() {
        Topping topping = new Topping();
        topping.aggiungiIngrediente("salame piccante");
        topping.aggiungiIngrediente("olive");
        return topping;
    }

    @Bean
    public Topping toppingTonnoCipolla() {
        Topping topping = new Topping();
        topping.aggiungiIngrediente("tonno");
        topping.aggiungiIngrediente("cipolla");
        return topping;
    }


    @Bean
    public Topping toppingProsciuttoFunghi() {
        Topping topping = new Topping();
        topping.aggiungiIngrediente("prosciutto");
        topping.aggiungiIngrediente("funghi");
        return topping;
    }

    @Bean
    public Pizza margherita(Topping margherita) {
        Pizza p = new Pizza(6, 900);
        p.addPizza("margherita", margherita);
        return p;
    }

    @Bean
    public Pizza diavola(Topping toppingSalame) {
        Pizza pizza = new Pizza(8.2, 1500);
        pizza.addPizza("salamino", toppingSalame);
        return pizza;
    }

    @Bean
    public Pizza prosciuttoFunghi(Topping toppingProsciuttoFunghi) {
        Pizza p = new Pizza(7.5, 1350);
        p.addPizza("prosciutto e funghi", toppingProsciuttoFunghi);
        return p;
    }

    @Bean
    public Bevande acqua() {
        Bevande b = new Bevande(1.6, 0);
        b.aggiungiCocktail("acqua");
        return b;
    }

    @Bean
    public Bevande cocaCola() {
        Bevande b = new Bevande(2.5, 300);
        b.aggiungiCocktail("Coca Cola");
        return b;
    }

    @Bean
    public Bevande birra() {
        Bevande b = new Bevande(3, 500);
        b.aggiungiCocktail("Birra Moretti");
        return b;
    }

    @Bean
    public Bevande fanta() {
        Bevande b = new Bevande(2.5, 300);
        b.aggiungiCocktail("Fanta");
        return b;
    }
}
