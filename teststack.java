/*
EX NO: 4 PROGRAM FOR STACK ADT USING INTERFACE 
AIM 
To design a java application to implement array implementation of stack using the concept of interface and exception handling. 
PROCEDURE
 1. Create the interface stackoperation with method declarations for push and pop. 
2. Create the class astack which implements the interface and provides implementation for the methods push and pop.Also define the method for displaying the values stored in the stack.Handle the stack overflow and stack underflow condition . 
3. Create the class teststack .Get the choice from the user for the operation to be performed . and also handle the exception that occur while performing the stack operation. 
4. Create the object and invoke the method for push,pop,display based on the input from the user.


Program:
*/
import java.io.*;
interface stackoperation
{
    public void Push(int I);
    public void Pop();
}
class Astack implements stackoperation 
{
    int stack[] = new int[5];
    int top = 1;
    int i;
    public void Push(int Item)
    {
        if(top>=4)
            System.out.println("OVERFLOW");
        else
        {
            top+=1;
            stack[top] = Item;
            System.out.println("Item Pushed  "+stack[top]);
        }
    }
    public void Pop()
    {
        if(top<0)
            System.out.println("UnderFlow");
        else
        {
            System.out.println("Item Popped "+stack[top]);
            top-=1;
        }
    }
    public void Display()
    {
        if(top<0)
            System.out.println("No Element in Stack");
        else
        {
            for(i=0;i<=top;i++)
                System.out.println("Element : "+stack[i]);
        }
    }  
}
class teststack
{
    public static void main(String args[]) throws IOException
    {
        int Ch,C,I;
        Astack S = new Astack();
        DataInputStream in = new DataInputStream(System.in);
        do
        {
            System.out.println("ARRAY STACK");
            System.out.print("1.Push | 2.Pop | 3.Display | 4.Exit : ");
            System.out.print("Enter your Choice : ");
            Ch = Integer.parseInt(in.readLine());
            switch(Ch)
            {
                case 1:
                    System.out.print("Enter a Value to Push : ");
                    I = Integer.parseInt(in.readLine());
                    S.Push(I);
                    break;
                case 2:
                    S.Pop();
                    break;
                case 3:
                    System.out.print("The Elements are : ");
                    S.Display();
                    break;
                case 4:
                    break;
            }
        System.out.print("Want to Continue [0-QUIT, 1-CONTINUE] : ");
        C=Integer.parseInt(in.readLine());
        }while(C==1);
    }
}
/*
OUTPUT:  
ARRAY STACK
1.Push | 2.Pop | 3.Display | 4.Exit : Enter your Choice : 1
Enter a Value to Push : 23
Item Pushed  23
Want to Continue [0-QUIT, 1-CONTINUE] : 1
ARRAY STACK
1.Push | 2.Pop | 3.Display | 4.Exit : Enter your Choice : 1
Enter a Value to Push : 13
Item Pushed  13
Want to Continue [0-QUIT, 1-CONTINUE] : 1
ARRAY STACK
1.Push | 2.Pop | 3.Display | 4.Exit : Enter your Choice : 1
Enter a Value to Push : 55
Item Pushed  55
Want to Continue [0-QUIT, 1-CONTINUE] : 1
ARRAY STACK
1.Push | 2.Pop | 3.Display | 4.Exit : Enter your Choice : 2
Item Popped 55
Want to Continue [0-QUIT, 1-CONTINUE] : 1
ARRAY STACK
1.Push | 2.Pop | 3.Display | 4.Exit : Enter your Choice : 3
The Elements are : Element : 0
Element : 0
Element : 23
Element : 13
Want to Continue [0-QUIT, 1-CONTINUE] : 0
*/
