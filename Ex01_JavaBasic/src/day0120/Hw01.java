package day0120;
//숙제1: BMI계산기를 만들어서 사용자의 BMI수치와 현재 체중 상태를 출력하는 프로그램을 작성하세요. 
//단 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지 다시 입력을 받으세요.

import java.util.Scanner;
public class Hw01 {  
    static final double HEIGHT_LIMIT = 2.72;
    static final double WEIGHT_LIMIT = 465;
    static final double BMI_1 = 18.5;
    static final double BMI_2 = 23;
    static final double BMI_3 = 25;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키를 m단위로 입력하세요.");
        double height = scanner.nextDouble();
        
        System.out.print("몸무게를 kg단위로 입력하세요.");
        double weight = scanner.nextDouble();
        
        while(height > HEIGHT_LIMIT || weight > WEIGHT_LIMIT) {
            System.out.println("키 또는 몸무게가 정상 범위에 속하지 않습니다. 다시 입력해주세요.");
            System.out.print("키를 m단위로 입력하세요.");
            height = scanner.nextDouble();
            System.out.print("몸무게를 kg단위로 입력하세요.");
            weight = scanner.nextDouble(); 
        }
   
        if(height  < HEIGHT_LIMIT && weight < WEIGHT_LIMIT) {
            double bmi = weight / height / height;
            System.out.println("사용자의 BMI :" +bmi);

            if(bmi < BMI_1) {
                System.out.println("저체중입니다.");
            }else if(bmi < BMI_2) {
                System.out.println("정상 체중입니다.");
            }else if(bmi < BMI_3) {
                System.out.println("과체중입니다.");
            }else {
                System.out.println("비만입니다.");
            }
            
        }
        scanner.close();
    }
}