package mrs.app.reservation;

import java.io.Serializable;
import java.time.LocalTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@EndTimeMustBeAfterStartTime(message = "終了時刻は開始時刻より後にしてください")
public class ReservationForm implements Serializable {
    @NotNull(message = "必須です")
    @ThirtyMinutesUnit(message = "30分単位で入力してください")
    @DateTimeFormat(pattern = "HH:mm")
    @Getter @Setter
    private LocalTime startTime;
    
    @NotNull(message = "必須です")
    @ThirtyMinutesUnit(message = "30分単位で入力してください")
    @DateTimeFormat(pattern = "HH:mm")
    @Getter @Setter
    private LocalTime endTime;
}
