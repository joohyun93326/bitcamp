package day0125;
//Random 클래스
//Random 클래스란 말 그대로 랜덤한 숫자를 생성해주는 클래스이다.
//스캐너와 마찬가지로 외부 클래스이므로 import 해주어야 한다.
import java.util.Random;
public class Ex03Random {
    public static void main(String[] args) {
        Random random = new Random();
        
        //ramdom.nextInt()를 사용해서 4개의 랜덤한 숫자를 뽑아보자
        for(int i = 0; i < 4; i++) {
            System.out.println(random.nextInt());
        }
        
        //random.nextInt()를 사용해서 0~10 사이의 랜덤한 숫자 5개를 뽑아보자
        for(int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(10));
        } 
    }
}
