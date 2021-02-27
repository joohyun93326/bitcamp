package day0125;
//가위바위보 게임 (주현ver.)
//가위: int 1
//바위: int 2
//보: int 3
//예시: 
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 5
//잘못입력하셨습니다.
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 2
//사용자: 바위
//컴퓨터: 가위
//사용자 승!!!
//현재 전적: 1승 3무 2패
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 2
//현재 전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트 입니다.
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 3
//사용해주셔서 감사합니다.
import java.util.Scanner;
import java.util.Random;
public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //현재 전적
        int win = 0;
        int draw = 0;
        int lose = 0;
        
        while(true) {
            System.out.println("1.플레이 2.현재 전적 보기 3.종료");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
                
                //플레이
                //사용자
                int user = 0;
                System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)");
                user = scanner.nextInt();
                
                //컴퓨터
                int computer = random.nextInt(3) +1;
                
                if(user == 0 || user >= 4) {
                    System.out.println("잘못 입력하셨습니다.");
                    
                }else if(user == computer) {
                    System.out.println("무승부");
                    draw++;
                }else if(user == 1 && computer == 3 || user == 2 && computer == 1 ||
                        user == 3 && computer == 2) {
                    System.out.println("사용자 승 !!!");
                    win++;
                }else {
                    System.out.println("컴퓨터 승 ㅠㅠ");
                    lose++;
                }

                
            }else if(userChoice == 2) {
                //승률
                int sum = win + lose + draw;
                double temp = ((double)win / sum) * 100 ;

                //현재 전적 보기
                System.out.printf("현재 전적은 %d승 %d무 %d패 입니다. 승률은 %.2f퍼센트 입니다.\n ", win, draw, lose, temp);
                

            }else {
                //종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
     
        }
        
        scanner.close();
    }

}
