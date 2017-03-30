/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Herencia3 {

    public static int menu (){
        int opcion = 0; 
        Scanner teclado = new Scanner(System.in);
            System.out.println("1.Agregar\n" 
                    + "2.Listar\n" 
                    + "3.Nomina\n" 
                    + "4. Nomina Programador\n" 
                    + "5. Salir\n");
            opcion = teclado.nextInt();
            return opcion;
        
    }
        
    public static void main(String[] args) {
        int opcion = 1;
        Empresa empresa = new Empresa ();
        Scanner teclado = new Scanner (System.in);
        do{
            opcion = menu();
            switch (opcion){
                case 1:
                System.out.println("Ingresar nombre empleado");
                String nombre = teclado.nextLine ();
                System.out.println("Tipo de empleado: 1.pro 2. arq");
                int tipo = teclado.nextInt ();
                Empleado empleado = null;
                if (tipo == 1){
                    empleado = new Programador (nombre);
                }else if (tipo ==2){
                    empleado = new Arquitecto(nombre);
                }
                
                    break;
                case 2:
                   ArrayList<Empleado> empleados = empresa.listarEmpleado();
                   for(int i = 0; i<empleados.size(); i++) {
                       Empleado e = empleados.get(i);
                       if (e instanceof Programador)
                           System.out.println(e.getNombre()+"Programador");
                   else
                           System.out.println(e.getNombre()+"Arquitecto");        
                }
                     break;
                case 3:
                    double nomina= empresa.calcularNomina();
                    System.out.println("nomina"+ nomina);
                    break;
                case 4:
                   double nominaProgramador = empresa.calcularNominaProgramador();
                    System.out.println("Nomina Programdor"+ nominaProgramador);
                    break; 
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Invalido");
                  
            }    
        }while (opcion!=5);
}
}