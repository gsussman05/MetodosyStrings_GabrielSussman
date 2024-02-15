/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosmetodos_strings_gabrielsussman;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class EjerciciosMetodos_Strings_GabrielSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("BIENVENIDO A LA PRACTICA DE METODOS Y STRINGS");
            System.out.println("1. Replace");
            System.out.println("2. Factorial");
            System.out.println("3. Mensajes");
            System.out.println("4. Promedios");
            System.out.println("5. Aprobado o Reprobado");
            System.out.println("6. Contains");
            System.out.println("Ingrese el numero de la opcion que desea: ");
            int opMenu=sc.nextInt();
            switch (opMenu){
                case 1:
                    System.out.println("Ingrese una cadena: ");
                    String cad=sc.nextLine();
                    String nuevaCadena=metodoReplace(cad, 'a', 'b');
                case 2:
                    System.out.println("Ingrese un numero: ");
                    int num=sc.nextInt();
                    int resu=printFactorial(num);
                    System.out.println("El factorial de " +num+ "es: "+resu);
                case 3:
                    System.out.println("Ingrese una cadena: ");
                    sc.nextLine();
                    String cad2=sc.nextLine();
                    mostrarString(cad2);
                case 4:
                    calcularPromedio();
                case 5: 
                    System.out.println("Ingrese la nota del estudiante: ");
                    int nota=sc.nextInt();
                    calcularNota(nota);
                case 6:
                    System.out.println("Ingrese una cadena: ");
                    sc.nextLine();
                    String cadenaMain=sc.nextLine();
                    System.out.println("Ingrese la cadena secundaria: ");
                    String cadenaSecu=sc.nextLine();
                    boolean siContiene=metodoContains(cadenaMain, cadenaSecu);
                    if (siContiene){
                        System.out.println("La cadena principal contiene la secundaria");
                    } else{
                        System.out.println("La cadena principal no contiene la secundaria");
                    }
                    
            }
        }
    }
    public static String metodoReplace(String cadena, char char1, char char2){
        String nuevaCadena="";
        for (int i=0; i<cadena.length(); i++){
            char char0=cadena.charAt(i);
            if (char0==char1){
                char0=char2;
            }
            nuevaCadena+=char0;
        }
        return nuevaCadena;
    
    }
    public static int printFactorial(int num){
        int resu=1;
        for (int i=2; i<=num;i++){
            resu*=i;
        }
        return resu;
    }
    public static void mostrarString (String cad){
        System.out.println(cad);
    }
    public static double calcularPromedio(){
        Scanner sc=new Scanner(System.in);
        int suma=0;
        for (int i=0; i<4;i++){
            System.out.println("Ingrese la nota: ");
            int nota=sc.nextInt();
            suma+=nota;
        }
        double promedio=suma/4;
        System.out.println("El promedio de las notas es: "+promedio);
        return promedio;
    }
    public static boolean calcularNota(int nota){
        Scanner sc=new Scanner(System.in);
        boolean siReprobo=true;
        System.out.println("Ingrese la nota del estudiante: ");
        nota=sc.nextInt();
        if (nota>=60){
            System.out.println("El estudiante aprobo la clase");
            siReprobo=false;
        } else{
            System.out.println("El estudiante reprobo la clase");
        }
        return siReprobo;
    }
    public static boolean metodoContains(String cadenaPrincipal, String cadena2){
        return cadenaPrincipal.contains(cadena2);
    }
}
