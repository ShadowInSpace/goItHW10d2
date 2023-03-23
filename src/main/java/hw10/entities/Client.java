package hw10.entities;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Entity
@Table(name = "Client", schema = "hw10s")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Size(min = 3, max = 200)
    String name;

    @OneToMany(mappedBy = "Client", fetch = FetchType.LAZY)
    @Transient
    Set<Ticket> tickets;

}
