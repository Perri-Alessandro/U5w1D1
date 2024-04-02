package perriAlessandro.U5w1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Topping {
    private List<String> topping;

    public Topping() {
        this.topping = new ArrayList<>();
    }

    public void aggiungiIngrediente(String ingrediente) {
        topping.add(ingrediente);
    }
}
