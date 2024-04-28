public class u4101examples2return{
    public static void main(String[] args){

        System.out.println("\n\n1) iterative sum");	
        System.out.println(sum1i(5));

        System.out.println("\n\n1) recursive sum");
        System.out.println(sum1r(5));


    } // close main



    // iterative sum
    public static int sum1i(int n){
        int sum = 0;
        for (int k = 1; k <= n; k++)
            sum += k;
        return sum;
   	}

    // recursive sum
	public static int sum1r(int n){
        if (n == 0)
            return 0;
        else
            return n + sum1r(n-1);
   	}




}

