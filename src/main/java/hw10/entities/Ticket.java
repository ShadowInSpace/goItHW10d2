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
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Ticket", schema = "hw10s")
public class Ticket {
    @Id
    @GeneratedValue
    int ticketId;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Timestamp createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    @Column(unique = true)
    Planet from;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    @Column(unique = true)
    Planet to;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @Transient
    @ToString.Exclude
    private Client client;

}
