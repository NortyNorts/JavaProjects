package Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;//These are required

    @Column(name = "town", nullable = false)
    private String town;//These are required

    @Column(name = "age", nullable = false)
    private int age; //optional

    @JsonIgnoreProperties({"customer"})
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
