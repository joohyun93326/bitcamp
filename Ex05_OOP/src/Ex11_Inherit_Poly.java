class Pbase{
   int p = 100;
}

class Cbase extends Pbase{
   int c =200;
}

class Dbase extends Pbase{
   
}
// 지금 Cbase와 Dbase는 형제관계

public class Ex11_Inherit_Poly {

   public static void main(String[] args) {
      
      Cbase cbase = new Cbase();
      System.out.println(cbase.toString());
      
      Pbase p = cbase;
      System.out.println(p);
      
      Dbase dbase = new Dbase();
      p = dbase;
      System.out.println(p);
      // 부모타입에는 그 부모에게서 상속 받는 자식 타입의 주소값이 여러개 담길 수 있다
      
      Cbase c = (Cbase)p;
      // 부모가 객체의 주소를 다시 자식에게 줄 때는
      // 자식타입으로 casting을 해서 전달해야 한다

   }

}

