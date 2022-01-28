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
        System.out.println("Registrar animal" +
                "1.Editar animales\n" +
                "2.Editar todos los atributos del animal\n" +
                "3. Imprimir por posicion de la lista\n" +
                "4. Impirmir lista completa\n" +
                "5. Imprimir por nombre cientifico\n" +
                "6. Eliminar animal\n" +
                "Ingrese la opcion: ");
        return leer.nextInt();
    }
    public static void opcionAnimal(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1){
            registarAnimales();
        }

        /*else if(opcion == 2)

        else if(opcion == 3)

        else if(opcion == 4)

        else if(opcion == 5)

        else if(opcion == 6)
          */
    }
    public static void registarAnimales(){
        System.out.print("Nombre cientifico: ");
        String nombreCientifico = leer.nextLine();
        System.out.print("Nombre comun: ");
        String nombreComun = leer.next();
        System.out.print("Habitat: ");
        String Habitat = leer.next();
        System.out.print("Alimentacion: ");
        String alimentacion = leer.next();
        System.out.print("Rasgos: ");
        String rasgos = leer.nextLine();
        System.out.print("Distribucion: ");
        String Distribucion = leer.nextLine();
        System.out.print("Años de vida: ");
        int vida = leer.nextInt();
        animales.add(new Animal(nombreCientifico, nombreComun, Habitat, alimentacion, rasgos, Distribucion,vida));
    }
    public static void editarAnimal(){
        System.out.print("Ingrese la posicion: ");
        int pos = leer.nextInt();
        System.out.println("1. Editar un atributo");
        System.out.println("2. Editar todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        if(opcion == 1)
            editarAtributoAnimal(pos);
        else if(opcion == 2)
            editarTodosAtributos(pos);
    }
    public static void editarAtributoAnimal(int pos){
        System.out.print("Nombre cientifico: ");
        System.out.print("Nombre comun: ");
        System.out.print("Habitat: ");
        System.out.print("Alimentacion: ");
        System.out.print("Rasgos: ");
        System.out.print("Distribucion: ");
        System.out.print("Años de vida: ");
        System.out.print("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        if(opcion == 1){
            System.out.print("Nombre Cientiico: ");
            animales.get(pos).setNombreCientifico(leer.next());
        }else if(opcion == 2){
            System.out.print("Nombre Comun: ");
            animales.get(pos).setUsuario(leer.next());
        }else if(opcion == 3){
            System.out.print("Contrasena: ");
            lista.get(pos).setContrasena(sc.next());
        }else if(opcion == 4){
            System.out.println("Correo: ");
            lista.get(pos).setCorreo(sc.next());
        }else if(opcion == 5){
            System.out.print("Cuenta: ");
            lista.get(pos).setNumeroCuenta(sc.nextInt());
        }else if(opcion == 6){
            System.out.print("Año: ");
            lista.get(pos).setAnioIngreso(sc.nextInt());
        }else if(opcion == 7){
            System.out.println("Tipo: ");
            lista.get(pos).setTipo(sc.next());
        }
    }
}
