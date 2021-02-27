package kr.or.bit;
import java.util.Stack;

//Stack 자료 구조 설계 
//저장 공간 : Array : Object[] sarray 
//MyStack my = new MyStack(); 을 하면 기본적으로 배열 생성, 크기를 설정 가능하게 설계하자  
//위치 정보 : 저장되는 값이 있는 위치 정보가 필요함 (position, index..)
//기능 : push(Object), Object pop, isFull/isEmpty를 사용하면 배열이 비어있는지 아닌지 boolean값 리턴 

//나만의 스택 내부 구조를 설계하자.....
public class MyStack {
    private Object[] stackarr; //저장 공간 //Object가 최상위 부모객체여서 모든걸 넣어버리려고 Object로 만든다.
    private int maxsize; //최대 크기 
    private int top; //배열의 index (위치 정보) 
    
    //위치 정보 
    public MyStack(int maxsize) {
        this.maxsize = maxsize;
        stackarr = new Object[maxsize]; 
        top = -1; //인덱스에 값 추가할 때 마다 포인터도 1씩 올라가서 초기값을 -1로.
    }
    
    //isEmpty
    public boolean isEmpty() { //비어있니?
        return (top == -1); //-1이면 true 아니면 false 
    }
    
    //isFull
    public boolean isFull() { //다 찼니?
        return (top == maxsize-1); //10칸이면 9가 마지막이니까 -1 //꽉 찼으면 true 아니면 false 
    }
    
    //push
    public void push(Object i) {
        //Object[]는 정적배열이니까 ArrayList 쓰지마십쇼
        if(isFull()) {
            System.out.println("Stack Full 이다 !");
        }else {
            stackarr[++top] = i; //-1이었으니까 0으로 만들고 그 방에 데이터 넣음 
        }
    }
    
    //pop
    public Object pop() {
        Object value = null;
        
        if(isEmpty()) {
            System.out.println("stack empty");
        }else {
            value = stackarr[top];
            top--;
        }
        
        return value;
    }
    
}
