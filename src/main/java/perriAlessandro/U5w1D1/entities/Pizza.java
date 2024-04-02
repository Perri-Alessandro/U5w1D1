package perriAlessandro.U5w1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Pizza extends Menù {

    public Map<String, Topping> pizze;

    public boolean xl;

    public Pizza(double prezzo, long calorie) {
        super(prezzo, calorie);
        this.pizze = new HashMap<>();

        Topping margherita = new Topping();
        margherita.aggiungiIngrediente("Pomodoro");
        margherita.aggiungiIngrediente("Mozzarella");
        pizze.put("Margherita", margherita);
    }

    public Pizza(double prezzo, long calorie, boolean xl) {
        super(prezzo, calorie);
        this.pizze = new HashMap<>();
        this.xl = xl;
    }

    public void addPizza(String nome, Topping topping) {
        pizze.put(nome, topping);
    }

    public Topping getToppingName(String nomePizza) {
        return pizze.get(nomePizza);
    }
}
