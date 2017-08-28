package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Getter;
import lombok.Setter;

@Entity
public class ReservableRoom implements Serializable {
    @EmbeddedId @Getter @Setter
    private ReservableRoomId reservableRoomId;
    
    @ManyToOne 
    @JoinColumn(name = "room_id", insertable = false, updatable = false)
    @MapsId("roomId")
    @Getter @Setter
    private MeetingRoom meetingRoom;
    
    public ReservableRoom(ReservableRoomId reservableRoomId) {
        this.reservableRoomId = reservableRoomId;
    }
    
    public ReservableRoom() {
    }
}
