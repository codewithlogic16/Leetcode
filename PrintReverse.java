import java.util.*;
public class PrintReverse {
      public static void main(String args[]){
           int n=10899;
            do{
            int lastdigit= n % 10;
            System.out.print(lastdigit);
            n=n/10;
            }while(n>0);
            System.out.println();
      }
}