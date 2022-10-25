package toBinary;

import java.util.Scanner;
import java.util.Stack;

public class Binary {

    public void numToBinary () {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter decimal number : ");

        int num = in.nextInt();

        if(num > 0) {

            String bin = Integer.toBinaryString(num);

            System.out.println("decimal to binary is : " + bin);

        }else {
            System.out.println("Wrong input !");
        }



    }



}
