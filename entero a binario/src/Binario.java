//package binario;


public class Binario {
    public  static  void main(String[]args){
        Binario entero= new Binario();
        entero.binario(25);
    }
    public int binario(int n){
        int a=n;
        int c=0;


        a=(int)a/2;
        int b=n%2;
        c=(c/2)*10;

        n=a;
        a=(int)a/2;
        b=n%2;
        c=(c/2)*10;






        System.out.println(c);
        return c;
    }

}
