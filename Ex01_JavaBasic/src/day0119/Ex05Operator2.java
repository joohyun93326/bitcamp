package day0119;

public class Ex05Operator2 {
    public static void main(String[] args) {
        int number;
        //1. = 은 오른쪽 값을 왼쪽 공간에 할당한다.
        number = 5;
        System.out.println("1.number = 5 결과값: "+number);
        
        //2. += 은 왼쪽 공간에 현재 값에 오른쪽 값을 더한 결과값을
        //왼쪽 공간에 다시 할당한다.
        //+=은 string에서도 사용 가능하다.
        number += 4;
        System.out.println("2.number = 4 결과값: "+number);
        
        String str = new String("123");
        str += 45;
        System.out.println("2.number += 45 결과값: "+str);
        
        //3. -= 은 현재 값에 오른쪽 값을 뺸 결과값을 왼쪽 공간에 다시 할당한다.
        number -= 2;
        System.out.println("3.number -= 2 결과값: "+number);
        
        //4. *= 은 현재 값에 오른쪽 값을 곱한 결과값을 왼쪽 공간에 다시 할당한다.
        number *= 4;
        System.out.println("4.number *= 4 결과값: "+number);
        
        //5. /= 은 현재 값에 오른쪽 값을 나눈 몫을 왼쪽 공간에 다시 할당한다.
        number /= 3;
        System.out.println("5.number /= 3 결과값: "+number);
        
        //6. %= 은 현재 값에 오른쪽 값을 나눈 나머지를 왼쪽 공간에 다시 할당한다.
        number %= 7;
        System.out.println("6.number %= 7 결과값: "+number);
        
        //++와 --은 해당 공간의 값을 1씩 변화시키는데
        //변수의 앞에 붙냐 뒤에 붙냐에 따라서 실행 시점이 달라지게 된다.
        System.out.println(++number);
        //++혹은 --가 변수의 앞에 붙어있을 경우
        //해당 줄에서 가장 먼저 실행이 된다.
        //즉 위의 경우 먼저 ++number가 실행돼서 number의 현재 값이 1 증가된다.
        //그리고 나서 println이 샐행되면서 1 증가된 number의 값이 출력된다.
        System.out.println("number의 현재값: "+number);
        
        //반대로 ++ 혹은 -- 가 뒤에 붙으면 그 줄에서 가장 마지막에 실행된다.
        System.out.println(number++);
        //1.System.out.println(number) 실행
        //2.number++ 실행
        System.out.println("number의 현재값: "+number);
         
    }
}
