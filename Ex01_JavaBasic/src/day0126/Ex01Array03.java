package day0126;
//배열 안에서 중복 찾기
import java.util.Scanner;
public class Ex01Array03 {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //기본형이기 때문에 처음엔 0 0 0 0으로 채워진다.
        int[] intArray = new int[4];
        
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(i+"번째 값: ");
            int userInput = scanner.nextInt();
            
            for(int j = 0; j < intArray.length; j++) {
                if(userInput == intArray[j]) {
                    System.out.println("중복된 값입니다.");
                    System.out.print(i+"번째 값: ");
                    userInput = scanner.nextInt();
                    j = -1;
                }
            } 
            
            intArray[i] = userInput;
            
        }
        
        for(int i = 0; i <intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        scanner.close();
    }
}
