import java.util.Scanner;
public class class8 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		int num1 = in.nextInt();
		System.out.print("Введите второе число: ");
		int num2 = in.nextInt();
		System.out.print("Введите третье число: ");
		int num3 = in.nextInt();
		in.close();
		
		if (num1 < num2 && num1 < num3) {
			System.out.print("Самое меньшее число: " + num1);
		}
		
		else if (num2 < num1 && num2 < num3) {
			System.out.print("Самое меньшее число: " + num2);
		}
		
		else {System.out.print("Самое меньшее число: " + num3);}
	}
}