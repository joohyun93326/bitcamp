package day0120;
//국어, 영어, 수학 점수를 입력받아서 모든 점수가 60점 이상이고
//평균이 70점 이상이면 합격, 그 외에는 불합격이 뜨는 프로그램을 작성하세요.
import java.util.Scanner;
public class Ex11GradeBook {
    //일일이 하드코딩 하지 않고 아래처럼 상수를 지정하여 기준 점수만 변경한다.
    static final int MIN_SCORE_LIMIT = 60;
    static final int MIN_SUM_LIMIT = 210;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("국어 점수 : ");
        int korean = scanner.nextInt();
        System.out.print("영어 점수 : ");
        int english = scanner.nextInt();
        System.out.print("수학 점수 : ");
        int math = scanner.nextInt();
        
        int sum = korean + english + math;
        
        if(korean >= MIN_SCORE_LIMIT && 
                english >= MIN_SCORE_LIMIT && 
                math >= MIN_SCORE_LIMIT &&
                sum >= MIN_SUM_LIMIT) {
           System.out.println("합격");
        }else {
            System.out.println("불합격");
        }

        scanner.close();
    } 
}
