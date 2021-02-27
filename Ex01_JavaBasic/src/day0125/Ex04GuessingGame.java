package day0125;
//컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를 사용자가 몇 번만에 맞추는지 기록하는 숫자 맞추기 게임
//조건. 무한루프를 사용해서 사용자가 1:게임 시작 / 2: 최고점수 보기 / 3. 게임 종료
//최고 점수는 가장 적은 횟수로 컴퓨터의 숫자를 맞춘 횟수가 최고점수가 된다.
//힌트1. 최고점수는 어떻게 기록해야 할까? 최고점수는 맨 처음 플레이하면 어떤게 최고점수가 될까?
//힌트2. random.nextInt(최대값)을 입력하면 0부터 최대값-1까지의 값이 랜덤하게 나온다.
//그렇다면 어떻게 해야 1~최대값의 범위가 나오도록 만들어줄 수 있을까?
//random.nextInt(10) -> 0 1 2 3 4 5 6 7 8 9
//random.nextInt(10) + 1 -> 1 2 3 4 5 6 7 8 9 10 
//사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 down, 작으면 up이라고 출력되어야 한다.
//사용자가 컴퓨터의 숫자를 맞출 때 까지 계속 입력을 받는다.
import java.util.Scanner;
import java.util.Random;
public class Ex04GuessingGame {
    static final int MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //최고기록을 저장할 int 변수 (리셋이 되면 안되니까 while밖에서 선언)
        int bestScore = 0;
        
        //메뉴 만들기
        while(true) {
            System.out.println("1.게임 시작 2.최고기록 보기 3.게임 종료");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
                //플레이 코드
                
                //사용자의 이번 점수를 저장할 int 변수 선언
                int currentScore = 1;
                
                System.out.print("숫자를 입력하세요: ");
                int userNumber = scanner.nextInt();
                
                //random을 사용하여 1~100 사이의 난수 생성
                int computerNumber = random.nextInt(MAX) + 1;
                
                while(userNumber != computerNumber) {
                    if(userNumber > computerNumber) {
                        System.out.println("DOWN");
                    }else {
                        System.out.println("UP");
                    }
                    
                    System.out.print("숫자를 입력하세요: ");
                    userNumber = scanner.nextInt();
                    currentScore++;
                }
                
                System.out.println("정답!!!!!!");
                System.out.println("이번 플레이의 점수는 "+currentScore+"입니다.");
                
                //최고기록을 확인하여 필요하다면 현재 점수로 최고기록을 바꿔준다.
                //최고기록을 현재기록으로 바꾸는 2가지 경우
                //1. 처음 플레이했을 때 (bestScore가 0일때)
                //2. 최고기록이 현재기록보다 클 때
                if(bestScore == 0 || bestScore > currentScore) {
                    bestScore = currentScore;
                    System.out.println("신기록입니다 !!!");
                }
            }
            else if(userChoice == 2) {
                //최고기록 보기 코드

                if(bestScore == 0) {
                    //아직 플레이 기록이 없으므로 경고 메시지만 출력
                    System.out.println("아직 플레이 기록이 없습니다.");
                }else {
                    System.out.println("현재 최고 기록: "+bestScore);
                }
  
            }
            else if(userChoice == 3) {
                System.out.println("게임 종료");
                break;
            }
                
        }
        scanner.close();
    }    
}
