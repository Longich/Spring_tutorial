package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer reservationId;
    @Getter @Setter
    private LocalTime startTime;
    @Getter @Setter
    private LocalTime endTime;
    
    @ManyToOne
    @JoinColumns({ @JoinColumn(name = "reserved_date"),
            @JoinColumn(name = "room_id")})
    @Getter @Setter
    private ReservableRoom reservableRoom;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    @Getter @Setter
    private User user;
}
