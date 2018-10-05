package aula0510;

/**
 *
 * @author Marcus
 */
public class Calculadora {
    private int a;
    private int b;
    

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void tratarException(Exception e){
        System.out.println("Erro! "+e.toString());
    }
    
    public static float dividir(int a, int b){
        float x = 0;
        try{
            x = a/b;
        }
        catch(ArithmeticException e){
            tratarException(e);
        }
        return x;
    }
    public static void tratamentoArray(int valor){
        int array[];
        array = new int[3];
        for(int i = 0; i<10; i++){
            try{
                array[i] = i;
                System.out.println(array[i]);
            }
            catch(Exception f){
                tratarException(f);
            }
        }
        for(int j = 0; j<5; j++){
            try{
                System.out.println(dividir(array[j],0));
            }
            catch(ArithmeticException e){
                tratarException(e);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }
        try{
            for (int i = 0; i<array.length;i++){
                array[i] = i + 1;
                System.out.println(i);
                System.out.println("Dividindo...");
                int x = array[i] / 0;
            }
        
        }
        catch(Exception e){
            tratarException(e);
        }
    }
    
    
}
