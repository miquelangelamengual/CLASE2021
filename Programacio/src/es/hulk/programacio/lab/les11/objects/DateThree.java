package es.hulk.programacio.lab.les11.objects;

/**
 * Created by Hulk
 * at 06/10/2021 9:28
 */

public class DateThree {

    private int day;
    private int month;
    private int year;

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

    public void day31(int m, int d) {
        this.month = m;
        if (d < 32 && d >= 1) {
            this.day = d;
        } else {
            System.out.println("Invalid Day for month " + month);
        }
    }

    public void day30(int m, int d) {
        this.month = m;
        if (d < 31 && d >= 1) {
            this.day = d;
        } else {
            System.out.println("Invalid Day for month " + month);
        }
    }

    public void setDate(int d, int m, int y) {
        if (y > 1000 && y < 10000) {
            this.year = y;
        } else {
            System.out.println("Invalid Year");
        }

        switch (m) {
            case 1:
                day31(m, d);
                break;
            case 2:
                this.month = m;
                if (d < 28 && d >= 1) {
                    this.day = d;
                } else {
                    System.out.println("Invalid Day for month " + month);
                }
                break;
            case 3:
                day31(m, d);
                break;
            case 4:
                day30(m, d);
                break;
            case 5:
                day31(m, d);
                break;
            case 6:
                day30(m, d);
                break;
            case 7:
                day31(m, d);
                break;
            case 8:
                day30(m, d);
                break;
            case 9:
                day31(m, d);
                break;
            case 10:
                day30(m, d);
                break;
            case 11:
                day31(m, d);
                break;
            case 12:
                day30(m, d);
                break;
        }
    }

    public void displayDate() {
        if (day == 0 && month == 0 && year == 0) {
            System.out.println("Invaid Date");
        } else {
            System.out.println("Date is: " + day + "/" + month + "/" + year);
        }
    }
}
