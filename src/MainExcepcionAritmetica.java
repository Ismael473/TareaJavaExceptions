public class MainExcepcionAritmetica {

    public static void main(String[] args) {
        //Ejemplo con ArithmeticException
        try{
            int X = 50;
            int Y = 0;
            int divForzada = X/Y;
            System.out.println(divForzada);
        }catch (ArithmeticException ari){
            System.out.println("Cae en excepción por que no se puede dividir por 0");
        }finally{
            System.out.println("Esa división tiende a infinito");
        }
    }

}
