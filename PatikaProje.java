import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yarıçapını giriniz: ");
		int r = input.nextInt();
		System.out.print("Daire diliminin merkez açısını giriniz: ");
		int a = input.nextInt();
		double pi = 3.14, daireDilimininAlani = pi * r * r * a / 360;
		System.out.println("Daire diliminin alanı -> " + daireDilimininAlani);
	}

}