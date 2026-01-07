package PasswordGenerator;
import java.util.Random;
public class SampleSpace {
    private final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String numbers = "0123456789";
    private final String symbols = "!@#$%^&*()~{}[]:;'<>,.?/-_+=`";
    private final Random random=new Random();
    public char randomLower(){
        return lowerCase.charAt(random.nextInt(0,26));
    }
    public char randomUpper(){
        return upperCase.charAt(random.nextInt(0,26));
    }
    public char randomNumber(){
        return numbers.charAt(random.nextInt(0,10));
    }
    public char randomSymbol(){
        return symbols.charAt(random.nextInt(symbols.length()));
    }
}
