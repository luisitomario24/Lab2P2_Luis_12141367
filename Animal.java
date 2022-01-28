package Lab_Progra2;

import java.util.Scanner;

public class Animal {
    Scanner leer = new Scanner(System.in);
    private String nombreCientifico;
    private String nombreComun;
    private String Habitat;
    private String alimentacion;
    private String rasgos;
    private String Distribucion;
    private int vida;
    int hol;

    public Animal(){

    }

    public Animal(String nombreCientifico,String nombreComun,String Habitat,String alimentacion,String rasgos,String Distribucion,int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.Habitat=Habitat;
        this.alimentacion=alimentacion;
        this.rasgos=rasgos;
        this.Distribucion=Distribucion;
        this.vida=vida;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public void setDistribucion(String distribucion) {
        Distribucion = distribucion;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getHabitat() {
        return Habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getRasgos() {
        return rasgos;
    }

    public String getDistribucion() {
        return Distribucion;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return  "nombreCientifico='" + nombreCientifico + '\'' +
                ", nombreComun='" + nombreComun + '\'' +
                ", Habitat='" + Habitat + '\'' +
                ", alimentacion='" + alimentacion + '\'' +
                ", rasgos='" + rasgos + '\'' +
                ", Distribucion='" + Distribucion + '\'' +
                ", vida=" + vida +
                '}';
    }


}
