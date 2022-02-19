package poo;

public class EVA1_2_clasePersona/*Declaración*/{ /* Implementación*/

    public static void main(String[] args) {
        //Crear un objeto (instanciar)
        Persona estudiante = new  Persona(); /*Con el new se le asigna un espacio en memoria*/
        estudiante.id = "21550349";
        estudiante.nombre = "Liliana Rocio López Jiménez";
        estudiante.edad = 18;
        estudiante.imprimirDatos();
        estudiante.calcularAñoNacimiento();
        
        Persona estudiante2 = new Persona();
        estudiante2.id = "21550349";
        estudiante2.nombre = "Liliana Rocio López Jiménez 2";
        estudiante2.edad = 19;
        estudiante2.imprimirDatos();
        estudiante2.calcularAñoNacimiento();
        
        Persona estudiante3 = new Persona();
        estudiante3.id = "21550349";
        estudiante3.nombre = "Batman";
        estudiante3.edad = 18;
        estudiante3.imprimirDatos();
        estudiante3.calcularAñoNacimiento();
        
        
    }
}

//Una clase es un tipo de dato abstracto
class Persona{
        //Atributos
        String nombre, id;
        int edad;
        //Comportamiento o funciones
        //Método imprimir datos
        void imprimirDatos(){
            System.out.println("El nombre es: " + nombre);
            System.out.println("Su id es: " + id);
            System.out.println("su edad es: " + edad);
        }
        
        void calcularAñoNacimiento(){
            int año = 2022 - edad;
            System.out.println("Año de nacimiento: "+año);
            System.out.println("");
        }
}