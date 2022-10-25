package toDecimal;

import java.util.Scanner;

public class Decimal {

    public void numToDecimal () {

        int decimal = 0 ;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number : ");

        int num = sc.nextInt();

        while (true){
           if(num == 0){
               break;
           }else {
               int temp = num % 10;
               decimal += temp * Math.pow(2,n);
               num = num/10;
               n++;
           }
        }
        System.out.println("binary to decimal is : " + decimal);

    }

}
