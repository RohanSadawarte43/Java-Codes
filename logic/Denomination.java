import java.util.Scanner;


public class Denomination {
public static void main(String[]args){
		int l=0,amount;
		System.out.println("Enter the amount");
		Scanner sc= new Scanner(System.in);
		amount=sc.nextInt();
		if(amount>=2000){
			l=amount/2000;
			System.out.println("2000:"+l);
			amount=amount%2000;
			}
		if(amount>=500){
				l=amount/500;
				System.out.println("500:"+l);
				amount=amount%500;
				}
		if(amount>=100){
			l=amount/100;
			System.out.println("100:"+l);
			amount=amount%100;
		}
		if(amount>=50){
			l=amount/50;
			System.out.println("50:"+l);
			amount=amount%50;
			}
		if(amount>=20){
			l=amount/20;
			System.out.println("20:"+l);
			amount=amount%20;
			}
		if(amount>=10){
			l=amount/10;
			System.out.println("10:"+l);
			amount=amount%10;
			}
		if(amount>=5){
			l=amount/5;
			System.out.println("5:"+l);
			amount=amount%5;
			}
		if(amount>=2){
			l=amount/2;
			System.out.println("2:"+l);
			amount=amount%2;
			}
		if(amount>=1)
		System.out.println("1:"+l);

		}
}
