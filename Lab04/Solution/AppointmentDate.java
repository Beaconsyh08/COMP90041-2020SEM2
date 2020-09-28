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
public class AppointmentDate {
    private int day, month, year;

    public AppointmentDate() {
        day = 1;
        month = 1;
        year = 1970;
    }

    public AppointmentDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            // Use "this" to differentiate instance variables
            // from local variables
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Not valid input");
            System.exit(0);
        }
    }

    // Check if a given date is valid
    private boolean isValidDate(int day, int month, int year) {
        // Validate year (we assume four-digit year)
        if (year < 1000 || year > 9999) {
            return false;
        }

        // Validate month
        if (month < 1 || month > 12) {
            return false;
        }

        // Validate day
        if (day < 1) {
            return false;
        }
        if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 ||
                month == 12) {
            // Months having 31 days
            return day <= 31;
        } else if (month == 4 || month == 6 || month == 9 ||
                month == 11) {
            // Months having 30 days
            return day <= 30;
        } else {
            // February
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
    }

    // Check if a given year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
