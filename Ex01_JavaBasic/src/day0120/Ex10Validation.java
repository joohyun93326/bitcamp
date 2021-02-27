package day0120;
//사용자로부터 키와 몸무게를 입력받아서 BMI를 계산하는 프로그램을 작성하세요.
//BMI 계산식 : 몸무게 / 키 / 키
//BMI 18.5 미만 : 저체중
// 23미만 : 정상체중
// 25미만 : 과체중
// 그  외 : 비만
//기네스북에 따르면 세계에서 가장 키가 컸던 사람은 2.72m였습니다.
//기네스북에 따르면 세계에서 가장 무거웠던 사람은 465kg이었습니다.
//2개의 정보를 사용해서 데이터 검증도 적용하세요.


import java.util.Scanner;
public class Ex10Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키를 m단위로 입력하세요.");
        double num1 = scanner.nextDouble();
        
        System.out.println("몸무게를 kg단위로 입력해주세요.");
        double num2 = scanner.nextDouble();
        
        if(num1 >= 0 && num1 < 2.72 && num2 >= 1 && num2 < 465) {
            //키와 몸무게가 정상 범위이므로 출력 시작
            double bmi = num2 / num1 / num1;
            System.out.println("사용자의 BMI : "+bmi);

            if(bmi < 18.5) {
                System.out.println("저체중입니다.");
            }else if(bmi < 23) {
                System.out.println("정상 체중입니다.");
            }else if(bmi < 25) {
                System.out.println("과체중입니다.");
            }else {
                System.out.println("비만입니다.");
            }
            
        }else {
            System.out.println("키 또는 몸무게가 정상 범위에 속하지 않습니다.");
        }
        scanner.close();
    }
}
