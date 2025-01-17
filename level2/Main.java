import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String-");
			String s = sc.next();
			PalindromeChecker pl = new PalindromeChecker(s);
			pl.IsPalindrom();
    }
}