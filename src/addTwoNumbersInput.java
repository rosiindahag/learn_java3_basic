import java.util.Scanner;
public class addTwoNumbersInput {
	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan angka pertama: ");
		a = sc.nextInt();
		System.out.println("Masukkan angka kedua: ");
		b = sc.nextInt();
		sum = a+b;
		sc.close();
		System.out.println("Jumlahnya: "+sum);}
	}
