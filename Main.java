import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("身長(cm)=");
double height = scanner.nextDouble() / 100;
System.out.print("体重(kg)=");
double weight = scanner.nextDouble();
double BMI= + weight / height / height;
System.out.println(String.format("%.2f", BMI));

	}
}


