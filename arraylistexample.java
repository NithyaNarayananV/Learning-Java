import java.io.*;
import java.util.*;
public class arraylistexample
{
    public static void main(String args[]) throws IOException
    {
        ArrayList<String>obj = new ArrayList<String>();
        DataInputStream in = new DataInputStream(System.in);
        int c,ch,i,j;
        String str,str1;
        System.out.println("    STRING MANIPULATION");
        System.out.println("******************************");
        do
        {
            ch=1;
            System.out.println(" ~~~~~ Choices ~~~~~");
            System.out.println("1.Append 2.Insert 3.Search 4.Search by 1st Letter 5.Size  6.Remove 7.Sort 8.Display 9.Exit" );
            System.out.print("Enter the choice : ");
            c=Integer.parseInt(in.readLine());
            switch(c)
            {
                case 1:
                {
                    System.out.print("Enter the string : ");
                    str=in.readLine();
                    obj.add(str);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the string : ");
                    str=in.readLine();
                    System.out.print("Specify the position to insert : ");
                    i=Integer.parseInt(in.readLine());
                    obj.add(i-1,str);
                    System.out.println("The array list has following elements : "+obj);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the string to search : ");
                    str=in.readLine();
                    j=obj.indexOf(str);
                    if(j==-1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Index of '"+str+"' is "+j);
                    break;
                }
                case 4:
                {
                    System.out.print("Enter the first character : ");
                    str=in.readLine();
                    for(i=0;i<(obj.size()-1);i++)
                    {
                        str1=obj.get(i);
                        if(str1.startsWith(str))
                            System.out.println(str1);
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Size of the list : "+obj.size());
                    break;
                }
                case 6:
                {
                    System.out.print("Enter the element to remove : ");
                    str=in.readLine();
                    if(obj.remove(str))
                        System.out.println("Element Removed : "+str);
                    else
                        System.out.println("Element not present");
                    break;
                }
                case 7:
                {
                    Collections.sort(obj);
                    System.out.println("The array list has following elements : "+obj);
                    break;
                }
                case 8:
                {
                    System.out.println("The array list has following elements : "+obj);
                    break;
                }
                case 9:
                    ch=0;
            }
        }while(ch==1);
    }
}
