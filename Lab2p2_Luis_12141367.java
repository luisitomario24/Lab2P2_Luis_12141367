package Lab_Progra2;

import java.util.ArrayList;
import java.util.Scanner;



public class Lab2p2_Luis_12141367 {

    public static ArrayList<Animal> animales =new ArrayList<Animal>();

    public static Scanner leer = new Scanner(System.in);
    public static int vida;
    //Creacion de tres animales por defecto
    Animal puma =new Animal();
    Animal tigre =new Animal();
    Animal perro=new Animal();

    public static void main(String[] args) {
       Animal puma=new Animal("pumilla","puma","bosque","hojas","veloz","Honduras",500);
       Animal tigre=new Animal("tigrillo","tigre","selva","dinosaurios","lento","Alemania",800);
       Animal perro=new Animal("perritus","perro","casa hogar","doggy cachorro","muy lento","Guatemala",1);
        do{
            opcionAnimal( menuAnimal() );
        }while(true);
    }
    public static int menuAnimal(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1.Registrar animal\n" +
                "2. Editar animales\n" +
                "3. Imprimir por posicion de la lista\n" +
                "4. Impirmir lista completa\n" +
                "5. Imprimir por nombre cientifico\n" +
                "6. Eliminar animal\n" +
                "7. Alimentar animal" +
                "Ingrese la opcion: ");
        return leer.nextInt();
    }
    public static void opcionAnimal(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1){
            registarAnimales();
        }
        else if(opcion == 2){
            editarAnimal();
        }
       else if(opcion == 3){
            listarxordendeLista();
        }

       else if(opcion == 4){
            listarAnimales();
        }

        else if(opcion == 5){
            listarNombreCientifico();
        }
        else if(opcion == 6){
            eliminarAnimal();
        }
        else if (opcion == 7){
            alimentacionAnimal();
        }

    }
    public static void registarAnimales(){
        System.out.println("Nombre cientifico: ");
        String nombreCientifico = leer.next();
        System.out.println("Nombre comun: ");
        String nombreComun = leer.next();
        System.out.println("Habitat: ");
        String Habitat = leer.next();
        System.out.println("Alimentacion: ");
        String alimentacion = leer.next();
        System.out.println("Rasgos: ");
        String rasgos = leer.next();
        System.out.println("Distribucion: ");
        String Distribucion = leer.next();
        System.out.println("Años de vida: ");
        int vida = leer.nextInt();
        animales.add(new Animal(nombreCientifico, nombreComun, Habitat, alimentacion, rasgos, Distribucion,vida));

    }
    public static void editarAnimal(){
        System.out.println("Ingrese la posicion: ");
        int pos = leer.nextInt();
        System.out.println("1. Editar un atributo");
        System.out.println("2. Editar todos los atributos");
        System.out.println("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        if(opcion == 1)
            editarAtributoAnimal(pos);
        else if(opcion == 2)
            editarTodosAtributos(pos);
    }
    public static void editarAtributoAnimal(int pos){
        System.out.println("Nombre cientifico: ");
        System.out.println("Nombre comun: ");
        System.out.println("Habitat: ");
        System.out.println("Alimentacion: ");
        System.out.println("Rasgos: ");
        System.out.println("Distribucion: ");
        System.out.println("Años de vida: ");
        System.out.println("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        if(opcion == 1){
            System.out.println("Nombre Cientiico: ");
            animales.get(pos).setNombreCientifico(leer.next());
        }else if(opcion == 2){
            System.out.println("Nombre Comun: ");
            animales.get(pos).setNombreComun(leer.next());
        }else if(opcion == 3){
            System.out.println("Habitat: ");
            animales.get(pos).setHabitat(leer.next());
        }else if(opcion == 4){
            System.out.println("Alimentacion: ");
            animales.get(pos).setAlimentacion(leer.next());
        }else if(opcion == 5){
            System.out.println("Rasgos: ");
            animales.get(pos).setRasgos(leer.next());
        }else if(opcion == 6){
            System.out.println("Distribucion: ");
            animales.get(pos).setDistribucion(leer.next());
        }else if(opcion == 7){
            System.out.println("Años de vida: ");
            animales.get(pos).setVida(leer.nextInt());
        }

    }
    public static void editarTodosAtributos(int pos){
        System.out.println("Nombre Cientiico: ");
        animales.get(pos).setNombreCientifico(leer.next());
        System.out.println("Nombre Comun: ");
        animales.get(pos).setNombreComun(leer.next());
        System.out.println("Habitat: ");
        animales.get(pos).setHabitat(leer.next());
        System.out.println("Alimentacion: ");
        animales.get(pos).setAlimentacion(leer.next());
        System.out.println("Rasgos: ");
        animales.get(pos).setRasgos(leer.next());
        System.out.println("Distribucion: ");
        animales.get(pos).setDistribucion(leer.next());
        System.out.println("Años de vida: ");
        animales.get(pos).setVida(leer.nextInt());
    }
    public static void eliminarAnimal(){
        System.out.println("Posicion: ");
        animales.remove(leer.nextInt());
    }
    public static void listarAnimales(){
        for (Animal ani:animales){
            System.out.println(animales.toString());
        }
    }
    public static void listarNombreCientifico(){
        for(Animal ani:animales){
            // Cuando es listar un solo elemento se usa el nombre inventado
            System.out.println(ani.getNombreCientifico());
        }
    }
    public static void listarxordendeLista(){
        System.out.println("posicion a buscar ");
        System.out.println(animales.get(leer.nextInt()));
    }
    public static void alimentacionAnimal(){

        System.out.println("Ingrese la posicion del animal 1 que comera a otro: ");
        int animalcomedor=leer.nextInt();
        System.out.println("Ingrese la posicion del animal numero 2 que sera deborado: ");
        int animaldeborado=leer.nextInt();
        //metodo para eliminar el animal deborado
        animales.get(animalcomedor).vida+= animales.get(animaldeborado).vida;
        animales.remove(animaldeborado);


    }

}
