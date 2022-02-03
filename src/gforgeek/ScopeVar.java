package gforgeek;

public class ScopeVar {
    static int x = 11;
    private int y = 33;
    public void method1(int x){
        ScopeVar T = new ScopeVar();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + ScopeVar.x);
        System.out.println("this.x: "+ this.x);
        System.out.println("this.y: "+ this.y);
        System.out.println("Y: " + y);
    }

    public static void main(String[] args) {
        ScopeVar T = new ScopeVar();
        T.method1(9);
    }
}
