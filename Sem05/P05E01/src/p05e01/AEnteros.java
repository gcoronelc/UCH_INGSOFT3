package p05e01;

public class AEnteros {
    protected int[] a;
    public AEnteros(){
      a = new int[100];
    }
    public void llena(int i){
      if(i>0)        
        llena(i-1);
      a[i] = aleatorio(10,99);
    }
    public void contenido(int i){
      if(i<30){
        System.out.println( i+".-"+a[i]);
        contenido(i+1);
      }      
    }    
    private int aleatorio(int a, int b){
      return (int)(Math.random()*(a-b+1)+b);
    }
}
