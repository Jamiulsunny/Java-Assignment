public class FibonacciSerice {
    public static void main(String[] args){
        int n1=0;
        int n2=1;
        int n3,count =0;
        System.out.println("Fibonacci Serice:" + n1 + " " +1);
        while (count<10)
        {
            n3=n1+n2;
            System.out.println( " " + n3 );
            n1=n2;
            n2=n3;

            count++;
        }
    }

    
}
