package day0121;
//별찍기 10번
import java.util.Scanner;
public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 10번*****");
        System.out.println("출력할 줄 수를 입력하세요: ");
        int num = scanner.nextInt();
        
        for(int i = 1; i <= 2 * num -1; i++) {
            String stars = new String();
            
            //총 너비(별9개)미리 지정
            int totalWidth = 2 * num - 1;
            
            //첫번째 줄 혹은 제일 마지막줄인 경우
            //별을 2*num-1 개 만큼 넣어준다.
            if( i == 1 || i == 2 * num - 1) {
                for(int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }

            }else if (i <= num -1) {
                //첫번째 줄을 제외한 윗부분
                int upperI = i - 1;
                
                //해당 줄의 왼쪽 or 오른쪽 별의 개수 (동일함)
                int starWidth = num - upperI;
                
                //왼쪽 별
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                //해당 줄의 공백의 개수 = 총 너비 - 별 개수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                //가운데 공백
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                //오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
   
            }else {
                //맨 마지막 줄을 제외한 아랫부분
                int lowerI = i - num + 1;
                
                //해당 줄의 별 개수
                int starWidth = lowerI;
                
                //왼쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                //해당 줄의 공백의 개수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                //가운데 공백을 담당하는 j for 문
                for(int j =1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                //오른쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                    
                
            }
            
            System.out.println(stars);
       
        }   
        scanner.close();
    }

}