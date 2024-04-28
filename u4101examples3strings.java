public class u4101examples3strings {

    public static void main(String args[]){
        String str = "abcdefgh";
        System.out.println("\nOriginal string: " + str);


        //recursive method to reverse String in Java
        System.out.println("\nReverse String using Recursion: " + reverseRecursively(str));
       
    
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





}