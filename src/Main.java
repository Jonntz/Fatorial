import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int num = 1;
        int fatorial = 1;


        for(int n = num; n <= 3; n++){
            fatorial *= n;
        }

        System.out.println(fatorial);
    }
}