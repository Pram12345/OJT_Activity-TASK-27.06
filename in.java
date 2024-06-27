enum A{
    Ram,
    Kunjesh,
    Kavita,
    Bhagwan;
  
    public void show(){
        System.out.println("student are studying");
    }
}
public class in {

    public static void main(String[] args) {
    //    A obj[] = A.values();
    //    System.out.println(obj);
       
    //    for(int i=1; i<=obj.length; i++){
    //     System.out.print(obj[i]);
    //    }


    for(A s : A.values()){
        // System.out.println(s.ordinal()+1 + " " +s);
        // System.out.println(s);
        System.out.print(s.name() + " ");
        // System.out.println(s.toString());
        System.out.println("Kunjesh");
    }
    }
}