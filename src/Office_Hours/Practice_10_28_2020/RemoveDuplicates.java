package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "Cybertek"; // ab
        String nonDup = ""; // a
        // if the character is not exist in NonDup, then we can concated it

        for(int i =0; i <= str.length()-1; i++){

           String eachChar = ""+str.charAt(i);

            if(nonDup.contains(eachChar )){
               continue;
            }else{
                nonDup += eachChar;
            }
        }
        System.out.println(nonDup);

    }
}
