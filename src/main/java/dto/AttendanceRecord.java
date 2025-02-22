package dto;

import domain.AttendanceTime;
import java.time.LocalDate;

public record AttendanceRecord(
        LocalDate date,
        AttendanceTime attendanceTime
) {

}
