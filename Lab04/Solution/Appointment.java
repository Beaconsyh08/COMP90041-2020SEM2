/**
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

// there should be a lot more valid check for you to explore
public class Appointment {
    private AppointmentTime startTime, endTime;
    private AppointmentDate date;

    public Appointment(AppointmentTime startTime, AppointmentTime endTime, AppointmentDate date) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }

    public Appointment() {
    }

    public Appointment(int day, int month, int year,
                       int startHr, int startMin, int startSec,
                       int endHr, int endMin, int endSec) {
        startTime = new AppointmentTime(startHr, startMin, startSec);
        endTime = new AppointmentTime(endHr, endMin, endSec);
        date = new AppointmentDate(day, month, year);
    }


    public AppointmentTime getStartTime() {
        return startTime;
    }

    public void setStartTime(AppointmentTime time) {
        startTime = time;
    }

    public AppointmentTime getEndTime() {
        return endTime;
    }

    public void setEndTime(AppointmentTime time) {
        if (isAfterStart(time.getHour(), time.getMinute(), time.getSecond())) {
            endTime = time;
        } else {
            System.out.println("Not valid input");
            System.exit(0);
        }
    }

    public AppointmentDate getDate() {
        return date;
    }

    public void setDate(AppointmentDate date) {
        this.date = date;
    }

    public void setStartTime(int hr, int min, int sec) {
        startTime.setTime(hr, min, sec);
    }

    public void setEndTime(int hr, int min, int sec) {
        if (isAfterStart(hr, min, sec)) {
            endTime.setTime(hr, min, sec);
        } else {
            System.out.println("Not valid input");
            System.exit(0);
        }
    }

    public void setDate(int day, int month, int year) {
        date.setDate(day, month, year);
    }

    private boolean isAfterStart(int endHr, int endMin, int endSec) {
        return (endHr * 3600 + endMin * 60 + endSec) > (startTime.getHour() * 3600 + startTime.getMinute() * 60 + startTime.getSecond());


    }

    public String toString() {
        return date + ", " + startTime + " - " + endTime;
    }
}

