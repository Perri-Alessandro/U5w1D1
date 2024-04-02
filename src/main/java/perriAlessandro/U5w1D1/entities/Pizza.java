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

    public Map<String, String> pizze;

    public Pizza(long id, double prezzo, long calorie) {
        super(id, prezzo, calorie);
        this.pizze = new HashMap<>();
        this.pizze.put("Margherita", "Pomodoro, Mozzarella");
    }

    public void addPizza(String nome, String ingredienti) {
        pizze.put(nome, ingredienti);
    }

    public String getIngredientiPerNome(String nomePizza) {
        return pizze.get(nomePizza);
    }
}
