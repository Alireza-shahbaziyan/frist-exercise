package tt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            System.out.println("enter a numbers: ");
            number[i] = myObject.nextInt();
        }
        float sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.print(sum / (number.length));
    }
}