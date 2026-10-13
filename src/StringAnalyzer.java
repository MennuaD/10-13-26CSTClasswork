import java.util.*;

public class StringAnalyzer {

    public static void main(String[] args){
        String str; //input string
        char[] arr; //input array
        int letters = 0, digits = 0, whitespaces = 0; //total count for each respectively

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");{
            str = s.nextLine();

            arr = str.toCharArray(); //converting input string to char array
            //Mennua Netri Herta Davis
            for(int i = 0; i <= arr.length - 1; i++){ //counts up each type and
                if(Character.isLetter(arr[i])){       //updates variable
                    letters++;
                }else if(Character.isDigit(arr[i])){
                    digits++;
                }else if(Character.isWhitespace(arr[i])){
                    whitespaces++;
                }
            }

            System.out.println("This string contains " + letters + " letters, "
            + digits + " digits, and " + whitespaces + " whitespace characters.");
        }
    }


}
