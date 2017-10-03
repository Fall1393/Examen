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

        n=a;
        a=(int)a/2;
        b=n%2;
        c=(c/2)*10;


        n=a;
        a=(int)a/2;
        b=n%2;
        c=(c/2)*10;

        System.out.println(c);
        return c;
    }

    public int ciclo(int n){
        int a,b;
        int c = 0;

        do {
            a = (int)n/2;
            b = n%2;
            c = c*10+b;
            n=a;

        }while(a > 0) ;
        return c;}

    
}

