
package ServicioAlumno;

import guia8_colecciones_ej3_notasalumnos.Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioAlumno {
   private ArrayList<Alumno>alumno = new ArrayList();
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlumno(){
      Alumno a1 = new Alumno();
      
      Integer n1, n2, n3;
      ArrayList notita = new ArrayList();
    
          System.out.println("Nombre del alumno");
          
          a1.setNombre(leer.next()); //agrego el nombre al alumno
          
          System.out.println("Nota 1:");
          n1 = leer.nextInt();
           notita.add(n1);
           System.out.println("Nota 2:");
          n2 = leer.nextInt();
           notita.add(n2);
           System.out.println("Nota 3:");
          n3 = leer.nextInt();
          notita.add(n3);
          
          a1.setNotas(notita); //agrego las 3 notas al atributo notas
          
          alumno.add(a1);
           
        //preguntar si desea crear otro alumno
          
    }
    
    public void fabricaAlumno(){
        String op;
        int cont= 0;
       do {
            System.out.println("Desea crear un alumno??");
            op = leer.next();
            
             if (op.equalsIgnoreCase("s")){
              crearAlumno();
              cont++;
             } else  if (!op.equalsIgnoreCase("n")&& !op.equalsIgnoreCase("s")){
                  System.out.println("La opción ingresada es incorrecta, ingrese S o N");
                  System.out.println("Desea crear un alumno??");
                  op = leer.next();
             }
        
              if (cont >= 1){
           mostrarAlumnos();
         
       } else {
           System.out.println("Hasta luego!!");
       }
        }while(!op.equalsIgnoreCase("n"));  
        buscarAlumno();
    }
    
    public void mostrarAlumnos(){
        for (Alumno aux : alumno) {
            System.out.println(aux);
        }
    }
    
    public void notaFinal(ArrayList<Integer>notas){
        Integer alNotaFinal;
       alNotaFinal = ((notas.get(0)+ notas.get(1)+ notas.get(2))/3); 
        System.out.println("La nota final es: " + alNotaFinal);
    }
    
    public void buscarAlumno(){
        System.out.println("Alumno que desea calcular Nota Final: ");
        String nombre = leer.next();
        for (Alumno aux : alumno) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                notaFinal(aux.getNotas());
            } else {
                System.out.println("El alumno ingresado no se encuentra en la lista");
            }
       }
    }
}
