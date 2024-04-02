package perriAlessandro.U5w1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Menù {

    @GeneratedValue
    public long id;
    public double prezzo;
    public long calorie;

    public Menù(double prezzo, long calorie) {
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    ;

}
