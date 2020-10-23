package CurrencyConverter;
import java.util.Scanner;
public class Currency 
{
    public  static void main( String args[])
    {
        double R,I;
        Scanner S = new Scanner(System.in); 

        System.out.print("   Convert from (R,U,Y,E) :");
        char A = S.next().charAt(0);
        System.out.print("   Amount :");
        I = S.nextInt();

        System.out.print("   Convert to (R,U,Y,E) :");
        char B = S.next().charAt(0);

        if ( A == 'U' && B == 'R')
        {    
            R = 75 * I ;
            System.out.println("Amount in INR : "+R);
        }    
        if ( A == 'R' && B == 'U')
        {    
            R = I / 75 ;
            System.out.println("Amount in USD : "+R);
        }       
        if ( A == 'E' && B == 'R')
        {         
            R = 85 * I ;
            System.out.println("Amount in INR : "+R);
        }    
        if ( A == 'R' && B == 'E')
        {
            R = I / 85 ;
            System.out.println("Amount in EURO : "+R);
        }
        if ( A == 'Y' && B == 'R')
        {
            R = I / 1.44 ;
            System.out.println("Amount in INR : "+R);
        }
        if ( A == 'R' && B == 'Y')
        {
            R = 1.44 * I ;
            System.out.println("Amount in YEN : "+R);    
        }
    }
}



