import java.util.*;
public class checkEvenOdd {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan angkanya: ");
		a = sc.nextInt();
		sc.close();
		if(a % 2 == 0)
			System.out.println("Angka "+a+" merupakan bilangan genap");
		else
			System.out.println("Angka "+a+" merupakan bilangan ganjil");
	}
}
