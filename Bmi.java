import java.util.Scanner;
public class Sample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("身長(cm)=");
double height1 = scanner.nextDouble() / 100;
System.out.print("体重(kg)=");
double weight1 = scanner.nextDouble();
double BMI1= + weight1 / height1 / height1;
System.out.println(String.format("%.2f", BMI1));
System.out.print("身長(cm)=");
double height2 = scanner.nextDouble() / 100;
System.out.print("体重(kg)=");
double weight2 = scanner.nextDouble();
double BMI2= + weight2 / height2 / height2;
System.out.println(String.format("%.2f", BMI2));
	}
}

