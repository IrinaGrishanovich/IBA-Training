package helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomData {

    public static String getRandomEmail() {
        int lenght = 15;
        String randomEmail = "mail" + RandomStringUtils.randomNumeric(lenght) + "@gmail.com";
        return randomEmail;
    }

    public static String getRandomText() {
        String randomText = RandomStringUtils.randomAlphabetic(14);
        return randomText;
    }

    public static String getRandomNumber() {
//        param count the length of random string to create param letters if <code>true</code>,
//        generated string will include alphabetic characters
//        param numbers if <code>true</code>, generated string will include numeric characters
//        return the random string
        String randomNumber = RandomStringUtils.random(5, false, true);
        return randomNumber;
    }

    public static String getRandonDayOfBirth() {
        int randonDayOfBirth = new Random().nextInt(27) + 1;
        return Integer.toString(randonDayOfBirth);
    }

    public static String getRandonMonthOfBirth() {
        Random random = new Random();
        String MonthOfBirth[] = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        int pos = random.nextInt(MonthOfBirth.length);
        return MonthOfBirth[pos];
    }

    public static String getRandomYearOfBirth() {
        int randomYearOfBirth = new Random().nextInt(115) + 1900;
        return Integer.toString(randomYearOfBirth);
    }

    public static int getRandomSearchItem(int allSearchItems){
        Random random = new Random();
        int randomValue = random.nextInt(allSearchItems);

        return randomValue;   //new Random().nextInt(allSearchItems);
    }
}


