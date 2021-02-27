package day0119;

public class Ex11Print {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("def");
        
        //1. pirint() 를 체험해보자
        System.out.print(str1);
        System.out.print(str2);
        
        //2. println() 을 체험해보자
        System.out.println(str1);
        System.out.println(str2);
        
        //3. printf() 를 체험해보자
        System.out.printf(str1);
        System.out.printf(str2);
        
        //4. 공백문자를 체험해보자
        System.out.println();
        System.out.println(str1+'\n');
        System.out.print(str1+'\t'+str2);
        
        
    }
}


