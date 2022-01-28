package Lab_Progra2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2p2_Luis_12141367 {

    public static ArrayList<Animal> animales =new ArrayList<Animal>();
    public static Scanner leer = new Scanner(System.in);


    public static void main(String[] args) {
        do{
            opcionAnimal(menuAnimal() );
        }while(true);
    }
    public static int menuAnimal(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1.Editar nombre cientifico\n" +
                "2.Editar todos los atributos del animal\n" +
                "3. Imprimir por posicion de la lista\n" +
                "4. Impirmir lista completa\n" +
                "5. Imprimir por nombre cientifico\n" +
                "6. Eliminar animal\n" +
                "7. Mi perfil\n" +
                "8. Administrador Random\n" +
                "Ingrese la opcion: ");
        return leer.nextInt();
    }
    public static void opcionAnimal(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1){

        }

        /*else if(opcion == 2)

        else if(opcion == 3)

        else if(opcion == 4)

        else if(opcion == 5)

        else if(opcion == 6)
          */
    }
}
