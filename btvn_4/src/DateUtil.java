public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        int[] numMonths = new int[strMonths.length];
        for (int i = 0; i < strMonths.length; i++) {
            numMonths[i] = i + 1;
        }

        if (year < 1 || year > 9999) {
            return false;
        } else if (month < 1 || month > 12) {
            return false;
        } else if (day < 1) {
            return false;
        } else {
            if (isLeapYear(year)) {
                for (int i = 0; i < numMonths.length; i++) {
                    if (numMonths[i] == month && day > daysInMonths[i] && month != 2) {
                        return false;
                    } else if (month == 2) {
                        if (day > 29) {
                            return false;
                        }
                    }
                }
            } else {
                for (int i = 0; i < numMonths.length; i++) {
                    if (numMonths[i] == month && day > daysInMonths[i]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] numMonths = new int[strMonths.length];
        for (int i = 0; i < strMonths.length; i++) {
            numMonths[i] = i + 1;
        }
        int[] centuryArray = {6, 4, 2, 0};
        int firstVal = 0;
        int fourthVal = 0;
        int secondVal, thirdVal, fifthVal;
        for (int i = 0; i < 4; i++) {
            int twoDigit = year / 100;
            if (twoDigit % 4 == i) {
                firstVal = centuryArray[i];
            }
        }
        secondVal = year % 100;
        thirdVal = secondVal / 4;

        int[] nonLeapYearArray = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearArray = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        if (isLeapYear(year)) {
            for (int i = 0; i < strMonths.length; i++) {
                if (month == numMonths[i]) {
                    fourthVal = leapYearArray[i];
                }
            }
        } else {
            for (int i = 0; i < strMonths.length; i++) {
                if (month == numMonths[i]) {
                    fourthVal = nonLeapYearArray[i];
                }
            }
        }

        fifthVal = day;
        int dayOfWeek = (firstVal + secondVal + thirdVal + fourthVal + fifthVal) % 7;
        return dayOfWeek;
    }

    public static String toString(int year, int month, int day) {
        String[] daysName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String theDay = null;
        String theMonth = null;
        for (int i = 0; i < daysName.length; i++) {
            if (getDayOfWeek(year, month, day) == i) {
                theDay = daysName[i];
            }
        }
        for (int i = 0; i < strMonths.length; i++) {
            if (month == i) {
                theMonth = strMonths[i - 1];
            }
        }
        return theDay + " " + day + " " + theMonth + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
}
