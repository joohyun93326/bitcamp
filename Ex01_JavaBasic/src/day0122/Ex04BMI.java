package day0122;
import java.util.Scanner;

//BMI계산기에 메뉴를 적용시켜 프로그램을 완성시키세요.
//키는 m단위로 입력받고, BMI계산 방법은 몸무게 / 키 / 키
public class Ex04BMI {
    //사용자의 최대 키 
    static final double MAX_HEIGHT = 2.72;
    //사용자의 최대 몸무게 
    static final double MAX_WEIGHT = 465;
    //저체중 BMI 
    static final double LOW_WEIGHT_BMI = 18;
    //정상체중 BMI 
    static final double NORMAL_WEIGHT_BMI = 23;
    //과체중 BMI
    static final double OVER_WEIGHT = 25;
    //입력 옵션값
    static final int OPTION_INSERT = 1;
    //출력 옵션값
    static final int OPTION_PRINT = 2;
    //종료 옵션값
    static final int OPTION_END = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //변수 선언
        double height = 0;
        double weight = 0;
        
        while(true) {
            System.out.println("1.입력 2.출력 3.종료");
            System.out.println("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == OPTION_INSERT) {
                System.out.print("키를 m단위로 입력: ");
                height = scanner.nextDouble();
                while(height < 0 || height > MAX_HEIGHT) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("키를 m단위로 입력: ");
                    height = scanner.nextDouble();
                }
                System.out.print("몸무게를 kg단위로 입력: ");
                weight = scanner.nextDouble();
                while(weight < 0 || weight > MAX_WEIGHT) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("키를 m단위로 입력: ");
                    weight = scanner.nextDouble();
                }
                
            }else if(userChoice == OPTION_PRINT) {
                
                
                if(weight == 0 ) {
                    //아직 입력된 값이 없다. 라는 의미이므로 경고메시지만 출력
                    System.out.println("아직 입력된 값이 없습니다.");
                }else {
                    
                double bmi = weight / height / height;
                
                if(bmi <= LOW_WEIGHT_BMI) {
                    System.out.println("저체중입니다.");
                }else if(bmi <= NORMAL_WEIGHT_BMI) {
                    System.out.println("정상체중입니다.");
                }else {
                    System.out.println("과체중입니다.");
                }
             }

            }else if(userChoice == OPTION_END) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
            
        }
        scanner.close();
    }
    
    
}
