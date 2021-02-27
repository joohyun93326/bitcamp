import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

    public static void main(String[] args) {
        //사원 1명을 만드세요 
        Emp emp = new Emp(100,"김유신","군인");
        System.out.println(emp.toString());
        
        //사원 2명을 만드세요 
        //Array 
        Emp[] emplist = {new Emp(100,"김씨","일반"), new Emp(200,"박씨","학생")};
        for(Emp e : emplist) {
            System.out.println(e.toString());
        }
        
        //1명이 입사를 더 했어요 
        //Collection
        //Arraylist
        ArrayList elist = new ArrayList();
        elist.add(new Emp(1,"강","IT"));
        elist.add(new Emp(2,"김","IT"));
        //1명 입사
        elist.add(new Emp(3,"이","IT"));
        System.out.println(elist.size()); //3
        for(int i = 0; i < elist.size(); i++) {
            //System.out.println(elist.get(i));
            Object obj = elist.get(i);
            System.out.println(obj); //재정의한 toString() 호출
        }
        
        for(Object e : elist) {
            //목적에 따라서는 다운캐스팅 
            Emp e2 = (Emp)e;
        }
        
        ArrayList<Emp> list2 = new ArrayList<Emp>();
        list2.add(new Emp(1, "A","IT"));
        
        for(Emp e : list2) {
            System.out.println(e.getEmpno());
        }
        
    }

}
