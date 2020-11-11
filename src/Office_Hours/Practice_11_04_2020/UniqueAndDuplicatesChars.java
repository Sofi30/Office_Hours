package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueAndDuplicatesChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = scan.next();
                //"aabccd";

        String unique = ""; // "bd";
        String duplicate = "";

        for(int j =0; j <= str.length()-1; j++){

            char ch = str.charAt(j); // 'a', 'a', 'b', 'c', 'c', 'd'
            int frequency = 0; // frequency of ch

            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    frequency++;
                }
            }
            if(frequency == 1){ // if frequency is 1, it means the ch is unique
                unique+=ch;
            }
            if(frequency > 1 ){ // if frequency is more than 1, it means the ch is duplicated
                duplicate += ch;   //&& !duplicate.contains(""+ch) in order to contain one char
            }
        }

        System.out.println(unique);
        System.out.println(duplicate);


    }
}
