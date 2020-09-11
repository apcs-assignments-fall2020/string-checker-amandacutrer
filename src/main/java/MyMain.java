import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char char1 = str.charAt(i);
            if (char1==('a') || char1==('b') || char1==('c'))
            count++;
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String str1 = str.toLowerCase();
        for (int i = 0; i < str.length()-2; i++){
            if (i < str1.length()-2 && str1.charAt(i)=='t' && str1.charAt(i+1)=='h' && str1.charAt(i+2)=='e')
            return true; 
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String str2 = str.replaceAll(" ", "");
        int j = str2.length(); int i = -1;
        while (i < j){
            i++;
            j--;
            if (str2.charAt(i)!= str2.charAt(j)){
                    return false;
            }
    }
                return true;
            }
            
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("There are " + countABC(name) + " a's, b's or c's");
        if (containsThe(name) == true){
            System.out.println("Your string DOES contain the");
        }
        else{
            System.out.println("Your string DOES NOT contain the");
        }
        if (isPalindrome(name) == true){
            System.out.println("Your string IS a palandrome");
        }
        else{
            System.out.println("Your string IS NOT a palandrome");
        }
            scan.close();
    }
}
