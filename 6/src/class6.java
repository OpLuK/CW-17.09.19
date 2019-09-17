import java.util.Scanner;
public class class6 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		int num1 = in.nextInt();
		System.out.print("Введите второе число: ");
		int num2 = in.nextInt();
		System.out.print("Введите третье число: ");
		int num3 = in.nextInt();
		float sred = (num1 + num2 + num3)/3;
		System.out.println("Среднее арифметическое равно: " + sred);
	}
}
