public class u4101examples1{
    static int k = 0;
    public static void main(String[ ] args){
        System.out.println("\n\n1) iterative count using loop variable");	
        count1i();

        System.out.println("\n\n1) recursive count using class variable");
        count1r();




        System.out.println("\n\n2) iterative count using parameter");	
        count2i(5);

        System.out.println("\n\n2) pre-recursive count using parameter");
        count2rPre(5);

        System.out.println("\n\n2) post-recursive count using parameter");
        count2rPost(5);





        System.out.println("\n\n3) iterative count using parameters");	
        count3i(5, 10);

        System.out.println("\n\n3) pre-recursive count using parameters");
        count3rPre(5, 10);

        System.out.println("\n\n3) post-recursive count using parameters");
        count3rPost(5, 10);



        System.out.println("\n\n4) showing more detail of the stack handling");
        count4(1, 3);

        
    } // close main ----------------------------------------------


    // iterative count up using loop variable
    public static void count1i(){
        for (int k = 1; k <= 10; k++)
            System.out.print(k + "  ");
    }

    // recursive count up using class variable
    public static void count1r(){
        k++;
        System.out.print(k + "  ");
        if (k < 10) count1r();
    }

    // -------------------------------------------------

    // iterative count up using parameter
    public static void count2i(int num){
        for(int i=1; i<=num; i++){
            System.out.print(i + "  ");
        }
    }

    // recursive count using parameter
    // 'pre-recursive print'
    public static void count2rPre(int num){
        System.out.print(num + "  ");
        if(num > 1)
            count2rPre(num-1);
    }

    // recursive count using parameter
    // 'post-recursive print'
    public static void count2rPost(int num){
        if(num > 1)
            count2rPost(num-1);
        System.out.print(num + "  ");
    }



    // -------------------------------------------------
    // iterative count between
    public static void count3i(int a, int b){
        for(int i=a; i<=b; i++){
            System.out.print(i + "  ");
        }
    }

    // pre-recursive count between
    public static void count3rPre(int a, int b){
        if (a <= b){
            count3rPre(a+1,b);
            System.out.print(a + "  ");
        }
    }

    // post-recursive count between
    public static void count3rPost(int a, int b){
        if (a <= b){
            System.out.print(a + "  ");
            count3rPost(a+1,b);
        }
    }




    // -------------------------------------------------
    // showing more detail of the stack handling
    public static void count4(int a, int b){
		if (a <= b){
			System.out.print("Interrupting method completion. ");
            System.out.println("Pushing " + a + " on stack.");
			count4(a+1,b);
			System.out.print("Returning to complete method. ");
            System.out.println("Popping " + a + " from stack.");
			System.out.println("Displaying popped value " + a);       
		}
	}


    



} // close class