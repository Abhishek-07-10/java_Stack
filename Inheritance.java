import com.*;


class First{
    public void sing(){
        System.out.println("I can Sing: ): ");
    }
}

class Second extends First{

}


public class Inheritance {

    public static void main(String[] args) {
        Second a = new Second();
        a.sing();
        Package1 p = new Package1();
        p.sum();
    }
}
