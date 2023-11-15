package code.personalProjects;
import java.util.Random;

public class RandomPasswordGenerator {
    private int length;
    private int numCount;
    private int specialCharCount;
    private Random random;

    private String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowerCaseLetters = upperCaseLetters.toLowerCase();
    private String numbers = "0123456789";
    private String specialChars = "!@#$%^&*";

    public RandomPasswordGenerator(int length, int numCount, int specialCharCount) {
        this.length = length;
        this.numCount = numCount;
        this.specialCharCount = specialCharCount;
        this.random = new Random();
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();

        // Generate letters
        for (int i = 0; i < length - numCount - specialCharCount; i++) {
            int randomIndex = random.nextInt(upperCaseLetters.length());
            char randomChar = upperCaseLetters.charAt(randomIndex);
            password.append(randomChar);
        }

        // Generate numbers
        for (int i = 0; i < numCount; i++) {
            int randomIndex = random.nextInt(numbers.length());
            char randomChar = numbers.charAt(randomIndex);
            password.append(randomChar);
        }

        // Generate special characters
        for (int i = 0; i < specialCharCount; i++) {
            int randomIndex = random.nextInt(specialChars.length());
            char randomChar = specialChars.charAt(randomIndex);
            password.append(randomChar);
        }

        // Shuffle the characters to make the password more random
        for (int i = password.length() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int length = 12;
        int numCount = 3;
        int specialCharCount = 2;

        RandomPasswordGenerator passwordGenerator = new RandomPasswordGenerator(length, numCount, specialCharCount);
        String password = passwordGenerator.generatePassword();
        System.out.println("Random Password: " + password);
    }
}