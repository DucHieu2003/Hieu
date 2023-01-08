package Exercises1_3;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        int lastDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            lastDay += DAYS_IN_MONTHS[month - 1] + 1;
        }
        return ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12) && (day >= 1 && day <= lastDay));
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] allYearMonthNumber = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearMonthNumber = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        if (!isValidDate(year, month, day)) {
            return -1;
        }
        int centuryNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int yearNumber = lastTwoDigitsOfYear / 4;
        int monthNumber = 0;
        if (isLeapYear(year)) {
            monthNumber += leapYearMonthNumber[month - 1];
        }
        monthNumber += allYearMonthNumber[month - 1];
        int dayNumber = day;
        return (centuryNumber + lastTwoDigitsOfYear + yearNumber + monthNumber + dayNumber) % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            System.out.println("Invalid year!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 && year > 9999) {
            System.out.println("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 && month > 12) {
            System.out.println("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int lastDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            lastDay += DAYS_IN_MONTHS[month - 1] + 1;
        }
        if (day < 1 && day > lastDay) {
            System.out.println("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int weekDay = getDayOfWeek(year, month, day);
        return strDays[weekDay] + " " + day + " " + strMonths[month - 1] + " " + year;

    }

    public MyDate nextDay() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            maxDay += DAYS_IN_MONTHS[month - 1] + 1;
        }

        if (maxDay == day && month == 12 && year == 9999) {
            return this;
        }

        if (maxDay == day && month == 12) {
            setDate(year + 1, 1, 1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month + 1, 1);
        }

        setDate(year, month, day + 1);
        return this;
    }

    public static int getMonthLastDay(int year, int month) {
        int daysInMonths = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            daysInMonths += DAYS_IN_MONTHS[month - 1] + 1;
        }
        return daysInMonths;
    }

    public MyDate nextMonth() {
        if (month == 12 && year == 9999) {
            return this;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 12) {
            maxDay = getMonthLastDay(year + 1, 1);
        } else {
            maxDay = getMonthLastDay(year, month + 1);
        }

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (month == 12) {
            setDate(year + 1, 1, maxDay);
            return this;
        }

        setDate(year, month + 1, maxDay);
        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) {
            return this;
        }

        int maxDay = getMonthLastDay(year + 1, month);
        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year + 1, month, maxDay);
        return this;
    }

    public MyDate previousDay() {
        if (day == 1 && month == 1 && year == 1) {
            return this;
        }

        if (day == 1 && month == 1) {
            setDate(year - 1, 12, getMonthLastDay(year - 1, 12));
            return this;
        }

        if (day == 1) {
            setDate(year, month - 1, getMonthLastDay(year, month - 1));
            return this;
        }

        setDate(year, month, day--);
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1 && year == 1) {
            return this;
        }

        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 1) {
            maxDay = getMonthLastDay(year - 1, 12);
        } else {
            maxDay = getMonthLastDay(year, month - 1);
        }
        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (month == 1) {
            setDate(year - 1, 12, maxDay);
            return this;
        }

        setDate(year, month - 1, maxDay);
        return this;
    }

    public MyDate previousYear() {
        if (year == 1) {
            return this;
        }

        int maxDay = getMonthLastDay(year - 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year - 1, month, maxDay);
        return this;
    }
}
