package hw10.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Planet", schema = "hw10s")
public class Planet {
    @Id
    @Pattern(regexp = "[A-Z0-9]+")
    private String id;

    @Size(min = 1, max = 500)
    private String Name;




}
