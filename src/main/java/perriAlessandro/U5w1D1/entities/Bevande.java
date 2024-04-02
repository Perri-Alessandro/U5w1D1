package perriAlessandro.U5w1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Bevande extends Menù {

    public List<String> cocktail;

    public Bevande(long id, double prezzo, long calorie) {
        super(id, prezzo, calorie);
        this.cocktail = new ArrayList<>();
    }

    public void aggiungiCocktail(String nomeCocktail) {
        this.cocktail.add(nomeCocktail);
    }
}
