public class NextDayCalculator {
    public static int findNextDay(int inputDay, int inputMonth, int inputYear) {
        switch (inputMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (inputDay == 31) {
                    return 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (inputDay == 30) {
                    return 1;
                }
                break;
            case 2:
                if (checkLeapYear(inputYear)) {
                    if (inputDay == 29) {
                        return 1;
                    } else if (inputDay == 28) {
                        return inputDay + 1;
                    }
                } else {
                    if (inputDay == 28) {
                        return inputDay = 1;
                    }
                }
        }
        return inputDay + 1;
    }

    public static int findNextMonth(int inputDay, int inputMonth, int inputYear) {
        switch (inputMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (inputDay == 31) {
                    return inputMonth + 1;
                }
                break;
            case 12:
                if (inputDay == 31) {
                    return 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (inputDay == 30) {
                    return inputMonth + 1;
                }
                break;
            case 2:
                if (checkLeapYear(inputYear)) {
                    if (inputDay == 29) {
                        return inputMonth + 1;
                    }
                } else {
                    if (inputDay == 28) {
                        return inputMonth + 1;
                    }
                }
        }
        return inputMonth;
    }

    public static int findNextYear(int inputDay, int inputMonth, int inputYear) {
        if (inputDay == 31 && inputMonth == 12) {
            inputYear = inputYear + 1;
        }
        return inputYear;
    }


    public static boolean checkLeapYear(int inputYear) {
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = inputYear % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = inputYear % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = inputYear % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
