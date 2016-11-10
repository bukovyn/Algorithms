import java.util.Scanner;

public class Absolute{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long answer = Math.abs(x-y);
            System.out.println(answer);
        }
    }
}