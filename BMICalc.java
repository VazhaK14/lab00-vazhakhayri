import java.util.Scanner;

public class BMICalc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan(cm): ");
        double height = scanner.nextDouble() / 100;

        System.out.print("Masukkan berat badan(kg): ");
        double weight = scanner.nextDouble();
        scanner.close();

        double bmi = weight/(height*height);
        
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi <= 24.9) System.out.println("Normal");
        else if (bmi >= 25.0 && bmi <= 29.0) System.out.println("Overweight");
        else if (bmi >= 30.0 && bmi <= 40.0) System.out.println("Obese");
        else if (bmi > 40) System.out.println("Obese");

        
    }
}
