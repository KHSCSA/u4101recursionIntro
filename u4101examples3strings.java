public class u4101examples3strings {

    public static void main(String args[]){
        String str = "abcdefgh";
        System.out.println("\nOriginal string: " + str);


        //recursive method to reverse String in Java
        System.out.println("\nReverse String using Recursion: " + reverseRecursively(str));
        System.out.println("\nReverse String using iteration: " + reverse(str));
    
    } // close main




    // reverse a string using recursion
    public static String reverseRecursively(String str){
        // base case to handle string with one char and return
        if (str.length() == 1) {
            return str.substring(0);
        }
        // recurse with char at beginning removed
        return reverseRecursively(str.substring(1)) + str.substring(0, 1);
    }


    // reverse a string using iteration
    public static String reverse(String str){
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            ans += str.substring(i, i+1);
        }
        return ans;
    }



}