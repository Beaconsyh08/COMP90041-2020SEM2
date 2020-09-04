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
public class AppointmentTime {
    private int hour, minute, second;

    public AppointmentTime() {
        hour = 0;
        second = 0;
        minute = 0;
    }

    public AppointmentTime(int hour, int minute, int second) {
        this.hour = hour;
        this.second = second;
        this.minute = minute;
    }

    public void setTime(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
}
