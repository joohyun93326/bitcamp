package day0125;

public class Ex01Array {
   public static void main(String[] args) {
       //int 타입의 배열 intArray
       int[] intArray = new int[5];
       
       //배열의 각 인덱스를 접근할 때에는 변수를 써서 접근 가능하다.
       //그렇다면 0번부터 4번까지 차례대로 출력하고 싶다면 무엇을 사용해야 할까?
       //for 반복문을 사용해서 접근한다 !
       
       for(int i = 0; i < 5; i++) {
           System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
       }
       
       //배열의 2번 인덱스에 45를 넣어보자
       intArray[2] = 45;
       
       //배열의 2번 인덱스에 할당된 값을 출력해보자.
       System.out.println(intArray[2]);
       
       
       String[] stringArray = new String[3];
       //배열의 지정된 크기를 호출할 때에는 배열이름.length로 호출 가능하다.
       System.out.println("intArray 배열의 크기: "+intArray.length);
       System.out.println("stringArray 배열의 크기: "+stringArray.length);
       
       //참조형 데이터타입의 배열인 stringArray의 값을 출력해보자
       for(int i = 0; i < stringArray.length; i++) {
           System.out.printf("stringArray[%d]: %s\n", i, stringArray[i]);
       }
       
       //참조형 데이터타입의 배열만 초기화하면 각 인덱스에 있는 String은 null상태가 된다.
       //null상태에서는 아무런 메소드도 실행할 수 없다.
       //System.out.println(stringArray[0].equals("abc"));
       
       //그렇다면 null은 어떻게 비교해야 할까?
       //null은 '상태'이므로 비교연산자를 사용하여 비교해야 한다.
       System.out.println(stringArray[0] == null);
       
       //배열의 크기도 변수를 통해서 지정해줄 수 있다.
       int size = 4;
       int[] intArray2 = new int[size];
       System.out.println("intArray2의 크기 : " +intArray2.length);

       
   }
    
}
