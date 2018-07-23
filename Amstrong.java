package janani;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,temp,sum=0,a;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
temp=n;
while(n!=0){
	a=n%10;
	n=n/10;
	sum=sum+(a*a*a);
}
if(temp==sum){
	System.out.println("amstrong number");
}
else{
	System.out.println("not amstrong number");
}
	}

}
