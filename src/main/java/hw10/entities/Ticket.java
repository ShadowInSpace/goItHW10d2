package hw10.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ticket", schema = "hw10s")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_sequence")
    @SequenceGenerator(name = "ticket_sequence", sequenceName = "TICKET_SEQ", allocationSize = 1)
    int ticketId;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Timestamp createdAt;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id", nullable = false, unique = true)
//    Planet from;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id", nullable = false, unique = true)
//    Planet to;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
//    @Transient
//    @ToString.Exclude
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "from_planet_id", nullable = true)
Planet from;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_planet_id", nullable = true)

    Planet to;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    @Transient
    @ToString.Exclude
    private Client client;
}
