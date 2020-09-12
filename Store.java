import java.util.*;
class Store
{
public static void main(String args[])
{
int n,m,index=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Monthly Sale");
m=0;
for(int i=1;i<=12;i++)
{
n=sc.nextInt();
   if(n>m)
    {
      m=n;
      index=i;
     }
}
switch(index)
{
case 1:
System.out.println("April"+m);
break;
case 2:
System.out.println("May"+m);
break;
case 3:	
System.out.println("June"+m);
break;
case 4:
System.out.println("July"+m);
break;
case 5:
System.out.println("Aug"+m);
break;
case 6:
System.out.println("Sept"+m);
break;
case 7:
System.out.println("Oct"+m);
break;
case 8:
System.out.println("Nov"+m);
break;
case 9:
System.out.println("Dec"+m);
break;
case 10:
System.out.println("Jan"+m);
break;
case 11:
System.out.println("Feb"+m);
break;
case 12:
System.out.println("March"+m);
break;
}
}	
}