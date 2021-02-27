
class Human {
    String name;
}

class Test3 {
    int add (int i, int j) {
        return i + j;
    }
    //배열은 객체다 (배열은 주소값을 가지고 있다 : heap 생성) 
    int[] add2 (int[] param) { //int[] 주소값을 리턴, int[] 배열의 주소값을 받겠다
        //return null;
        //return new int[5]; //return new Tv() 랑 같다.
        int[] arr = new int[param.length]; 
        for(int i = 0; i < arr.length; i++) {
            arr[i] = param[i]+1;
        }
        return arr;
    }
    
    //함수 안에 코드를 마음대로 작성하시고 main 안에서 가지고 놀아보세요.
    int[] add3(int[] so, int[] so2) {
        int[] arr2 = new int[so.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = so[i] + so2[i];
            
        }
        return arr2;
        
    }
    
    //함수 안에 코드를 마음대로 작성하시고 main 안에서 가지고 놀아보세요.
    int[] add4(int[] aa, int[] bb) {
        int[] arr3 = new int[aa.length];
        for(int i = 0; i < aa.length; i++) {
            arr3[i] = aa[i] + bb[i];
        }
           
        return arr3;    
    }
    
    
    
}


public class Ex03_MethodCall_Array {

    public static void main(String[] args) {
        Test3 t = new Test3();
        int result = t.add(10,10);
        System.out.println("result: " + result);
        
        
        //add2() 호출
        int[] array = {10,20,30};
        int[] resultarray = t.add2(array);
        for(int i : resultarray) {
            System.out.println("i :" +i);
        }
        
        //add3() 호출
        int[] array2 = {9,18,27};
        int[] array3 = {1,2,3};
        int[] resultarray2 = t.add3(array2, array3);
        for(int i : resultarray2) {
            System.out.println("두개의 합 : " +i);
        }
        
        //add4() 호출
        int[] array4 = {1,2,3};
        int[] array5 = {3,2,1};
        int[] resultarray3 = t.add4(array4, array5);
        for(int i : resultarray3) {
            System.out.println("합 :" +i);
        }
        
        
        }
        
    }



