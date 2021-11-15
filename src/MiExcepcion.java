import java.util.Random;

public class MiExcepcion extends Exception{

    public MiExcepcion(String mensaje){
        super(mensaje);
    }
    // Este ejemplo es de un dado que al caer en un número par, activa la excepción personalizada


    public static void main(String[] args) {
        Random rand = new Random();
        int valor = rand.nextInt(7);
        System.out.println(valor);

        boolean par;


        try{
            if (valor%2 == 0){
                par = true;
                throw new MiExcepcion("EL dado dio el numero par "+valor);
            }else{
                par = false;
            }
        }catch (MiExcepcion mie){
            System.err.println(mie);
        }
    }
}
