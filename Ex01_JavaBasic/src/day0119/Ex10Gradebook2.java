//사용자로부터 나이, 이름, 국어, 영어, 수학 순으로 입력받아서
//나이, 이름, 국어, 영어, 수학, 총점, 평균이 출력되는 프로그램을 작성하세요.

package day0119;
import java.util.Scanner;

public class Ex10Gradebook2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("나이 입력.");
        int age = scanner.nextInt();
        
        System.out.println("이름 입력.");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.println("국어점수 입력.");
        int korean = scanner.nextInt();
        
        System.out.println("영어점수 입력.");
        int english = scanner.nextInt();
        
        System.out.println("수학점수 입력.");
        int math = scanner.nextInt();
        
        int sum = korean + english + math;
        double average = sum / 3.0;
                
        System.out.println("나이 : " +age);
        System.out.println("이름 : " +name);
        System.out.println("국어점수 : " +korean);
        System.out.println("영어점수 : " +english);
        System.out.println("수학점수 : " +math);
        System.out.println("총점 : " +sum);
        System.out.println("평균 : " +average);
        
        scanner.close();
    }
    

}
