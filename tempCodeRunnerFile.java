import java.util.*;
public class Main
{
	public static int MAX = 10;
	public static int top = -1;
	public static Scanner s = new Scanner(System.in);
	public static int a[]	= new int[MAX];
	public static void empty()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			pop();
		}
	}
	public static void push()
	{
	    System.out.println("Enter element");
		top++;
		a[top] = s.nextInt();
	}
	public static void full()
	{
		if(top==MAX-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			push();
		}
	}
	public static void pop()
	{
	    System.out.println(a[top]+" is deleted from stack");
		top--;
	}
	public static void display()
	{
		if(top!=-1)
		{
			System.out.println("Stack elements are");
			for(int i=0; i<=top; i++)
				System.out.print(a[i]+" ");
			System.out.println();	
		}
		else
		{
			System.out.println("Stack doesn't have elements");
		}
	}
	public static void main(String[] args) {

		int op;
		char c;
		boolean n = true;
		while(n)
		{
			System.out.println("1.Push\n2.Pop\n3.Display");
			op = s.nextInt();
			switch(op)
			{
			case 1:
				full();
				break;
			case 2:
				empty();
				break;
			case 3:
				display();
				break;
		    default:
		        break;
			}
			System.out.println("\nEnter y to continue and n to stop");
			c = s.next().charAt(0);
			if(c=='y') n = true;
			else n = false;
		}
	}
}