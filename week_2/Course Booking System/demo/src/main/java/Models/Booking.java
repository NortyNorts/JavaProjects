package Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "bookings")
@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    private String date;//These are required

    @JsonIgnoreProperties({"bookings"})
    @ManyToOne(optional = false)
    @JoinColumn(name="course_id", nullable = false)
    private Course course;

    @JsonIgnoreProperties({"bookings"})
    @ManyToOne(optional = false)
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}