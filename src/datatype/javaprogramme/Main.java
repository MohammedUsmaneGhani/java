package datatype.javaprogramme;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		/*System.out.println("Bike Rent programme");
		int rent=500;
		int day=6;
		int time=19;
		
		if(day==1 && time>=21) {
			System.out.print("The rent is:");
			System.out.println(rent+200);
		}
		else if (day>1 && time<=       20) {
			System.out.print("The rent is:");
			System.out.println(rent);
		}else {
			System.out.print("The rent is:");
			System.out.println(rent+100);
		}
		
		int a=10,b=30,c=40;
		
		if(a>b) {
			System.out.println("A is graeater");
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("C is greater");
		}*/
		
		/*int start=10;
		int num=7,j=2,stop=25;
		boolean p=true;
		for(int i=start;i<=stop;i++) {
			p=false;
			for(j=2;j<i;j++) {
				p=true;
				break;
			}
		}
		if(p==false) {
			System.out.println(i);
		}*/
		
		/*int count=0,start=100,stop=200,num=5;
		
		for(int i=start;i<=stop;i++) {
			if(i%num==0) {
				count++;
			}
		}
		System.out.println(count);*/
		
		/*int num,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		while(num!=0) {
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);*/
		
		/*int  rev=0,r,count=0,stop;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		stop=sc.nextInt();
		
		for(int i=10;i<=stop;i++) {
			int num=i;
			 rev=0;
		while(num!=0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(i==rev) {
			count++;
			System.out.println(i);
		}
		}
		System.out.println(count);*/
		//GCD OF NUMBER
	/* int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1:");
		n1=sc.nextInt();
		System.out.print("Enter n2:");
		n2=sc.nextInt();
	 while(n1!=n2) {
		 if(n1>n2)
			 n1=n1-n2;
		 else
			 n2=n2-n1;
	 }
	 System.out.printf("gcd of the number:"+n2);*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("enter the month:");
        String month= scanner.nextLine();
        switch (month) {
            case "jan","mar","may","jul","aug","oct","dec":
                System.out.println("31 days");
                break;
            case "apr","june","sep","nov":
                System.out.println("30 days");
                break;
             default:
            	 System.out.println("28 or 29 days");
               
        }*/
		/*int n=10;
		for(int i=0;i<10;i++) {
		if(i==5) {
			continue;
			
		}System.out.print(i+ " ");
		}*/
		
       /* int age[]= {17,18,20,22};
        for(int i=0;i<age.length;i++) {
        	if(age[i]<18) {
        		System.out.println("invalid age "+age[i]);
        		continue;
        	}else {
        		System.out.println("valid age "+age[i]);
        	}
        }*/
		/*int n=5;
		for(int i=0;i<n;i++) {
			for(int j=4;j>=i;j--) {
				System.out.println(i+" ");
			}System.out.println();
		}*/
		
		//IMPLICIT 
		
	}
}
        

        
	
		



