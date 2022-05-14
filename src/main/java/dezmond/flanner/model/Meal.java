package dezmond.flanner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Meal {

    @Id
    @Column
    private long id;

    @Column
    @NotNull(message = "{NotNull.Meal.name}")
    private String name;   

}
