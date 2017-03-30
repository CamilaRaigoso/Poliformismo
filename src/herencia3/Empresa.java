/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class Empresa {
   private ArrayList <Empleado> empleados;
   
   public Empresa (){
       this.empleados = new ArrayList <> ();
   }
   public void AgregarEmpleado (Empleado e){
       this.empleados.add(e);
   }
   
   public double calcularNomina (){
       double nomina = 0;
       for(Empleado empleado : empleados){
           nomina+=empleado.calcularSalario();  
       }
       return nomina;
   }
    public double calcularNominaProgramador (){
       double nomina = 0;
       for(Empleado empleado : empleados){
           if(empleado instanceof Programador){
           nomina+=empleado.calcularSalario();  
           }
       }
       return nomina;
   }
    public ArrayList <Empleado> listarEmpleado (){
        return this.empleados;
    }
}
    

