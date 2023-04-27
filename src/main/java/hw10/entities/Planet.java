package hw10.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Planet", schema = "hw10s")
public class Planet {
    @Id
    @Pattern(regexp = "[A-Z0-9]+")
     String id;

    @OneToMany(mappedBy="Ticket")
    @Transient
    Set<Ticket> ticketsToThisPlanet;

    @OneToMany(mappedBy="Ticket")
    @Transient
    Set<Ticket> ticketFromThisPlanet;

    @Size(min = 1, max = 500)
     String Name;




}
