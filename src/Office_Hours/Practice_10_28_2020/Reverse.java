package Office_Hours.Practice_10_28_2020;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        /*String name = "Cybertek School";*/
        //             01234567
        String result = "";

        /*result += name.charAt(7);
        result += name.charAt(6);
        result += name.charAt(5);
        result += name.charAt(4);
        result += name.charAt(3);
        result += name.charAt(2);
        result += name.charAt(1);
        result += name.charAt(0);*/

        for(int i = name.length()-1; i >= 0; i--){
            result += name.charAt(i);
        }

        System.out.println(result);
    }
}
