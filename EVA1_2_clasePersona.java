package poo;

public class EVA1_2_clasePersona/*Declaraci�n*/{ /* Implementaci�n*/

    public static void main(String[] args) {
        //Crear un objeto (instanciar)
        Persona estudiante = new  Persona(); /*Con el new se le asigna un espacio en memoria*/
        estudiante.id = "21550349";
        estudiante.nombre = "Liliana Rocio L�pez Jim�nez";
        estudiante.edad = 18;
        estudiante.imprimirDatos();
        estudiante.calcularA�oNacimiento();
        
        Persona estudiante2 = new Persona();
        estudiante2.id = "21550349";
        estudiante2.nombre = "Liliana Rocio L�pez Jim�nez 2";
        estudiante2.edad = 19;
        estudiante2.imprimirDatos();
        estudiante2.calcularA�oNacimiento();
        
        Persona estudiante3 = new Persona();
        estudiante3.id = "21550349";
        estudiante3.nombre = "Batman";
        estudiante3.edad = 18;
        estudiante3.imprimirDatos();
        estudiante3.calcularA�oNacimiento();
        
        
    }
}

//Una clase es un tipo de dato abstracto
class Persona{
        //Atributos
        String nombre, id;
        int edad;
        //Comportamiento o funciones
        //M�todo imprimir datos
        void imprimirDatos(){
            System.out.println("El nombre es: " + nombre);
            System.out.println("Su id es: " + id);
            System.out.println("su edad es: " + edad);
        }
        
        void calcularA�oNacimiento(){
            int a�o = 2022 - edad;
            System.out.println("A�o de nacimiento: "+a�o);
            System.out.println("");
        }
}