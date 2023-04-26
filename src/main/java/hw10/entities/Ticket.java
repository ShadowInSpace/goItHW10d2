package hw10.entities;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.sql.Timestamp;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ticket", schema = "hw10s")
public class Ticket {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
        Timestamp createdAt;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "from_planet_id", nullable = false, unique = true)
        Planet from;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "to_planet_id", nullable = false, unique = true)
        Planet to;


        @ManyToOne(cascade = CascadeType.MERGE)
        @JoinColumn(name = "client_id")
        Client client;


}
