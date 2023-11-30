import java.util.Scanner;

public class Pravoagolnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double str1,str2,povrsina,perimetar;
Scanner tastatura = new Scanner(System.in);
	System.out.print("Programata presmetuva plostina i perimetar na pravoagolnik");	System.out.print("Vnesete dolzina na edna strana");
	str1=tastatura.nextDouble();
	System.out.println("Vnesete dolzina na druga strana");
	str2=tastatura.nextDouble();
povrsina=str1*str2;
perimetar=2*str1+2*str2;
System.out.println();
System.out.print("Povrsinata e"+ povrsina);
System.out.print("Perimetarot e"+ perimetar);

	}

}
