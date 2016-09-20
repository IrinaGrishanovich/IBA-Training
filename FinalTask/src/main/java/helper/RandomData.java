package helper;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public class RandomData {

    public static String getRandomEmail() {
        return "something" + RandomStringUtils.randomNumeric(15) + "@gmail.com";
    }

    public static String getRandomText() {
        return RandomStringUtils.randomAlphabetic(14);
    }

    public static String getRandomNumber() {
        return RandomStringUtils.random(5, false, true);
    }

    public static String getRandomDayOfBirth() {
        int randomDayOfBirth = new Random().nextInt(27) + 1;
        return Integer.toString(randomDayOfBirth);
    }

    private enum MonthOfBirth { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
                                SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER }

    public static String getRandomMonthOfBirth() {
        MonthOfBirth[] values = MonthOfBirth.values();
        int randomMonthOfBirth = new Random().nextInt(12);
        return values[randomMonthOfBirth].toString();
    }

    public static String getRandomYearOfBirth() {
        int randomYearOfBirth = new Random().nextInt(115) + 1900;
        return Integer.toString(randomYearOfBirth);
    }

    public static int getRandomSearchItem(int allSearchItems){
        Random random = new Random();
        return random.nextInt(allSearchItems);
    }
}


