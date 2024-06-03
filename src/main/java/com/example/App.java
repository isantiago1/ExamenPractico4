package com.example;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Examen 4!" );
    
        		 Empleado[] arrayEmpleados = {
        	        		Empleado.builder()
        	        			.nombre("Ana")
        	        			.primerApellido("Garcia")
        	        			.segundoApellido("Garcia")
        	        			.departamento(Departamento.CONTABILIDAD)
        	        			.salario(3000.00)
        	        			.genero(Genero.MUJER)
        	        			.salario(3000.00)
        	        			.build(), 
        	        		Empleado.builder()
        	        			.nombre("Luis")
        	        			.primerApellido("Sanchez")
        	        			.segundoApellido("Garcia")
        	        			.departamento(Departamento.RRHH)
        	        			.salario(3000.00)
        	        			.genero(Genero.HOMBRE)
        	        			.salario(2000.00)
        	        			.build(),
        	        		Empleado.builder()
        	        		.nombre("Juan")
        	    			.primerApellido("Martin")
        	    			.segundoApellido("Perez")
        	    			.departamento(Departamento.INFORMATICA)
        	    			.salario(3000.00)
        	    			.genero(Genero.MUJER)
        	    			.salario(3000.00)
        	    			.build()  		     			
        };
        		 
  		 
        
    	System.out.println("Recorriendo el array Empleado  -------------------");
    	for(Persona emp : arrayEmpleados)
    		System.out.println(emp);
    	System.out.println("--------------------------------------------------");
    	// variables
       	double sumatoriaDeLosSalarios = 0.0;
    	int totalDePersonas = arrayEmpleados.length;
    	double salarioPromedio = 0.0;
    	
    	//for mejorado
    	for(Empleado emp: arrayEmpleados ) {
    		// sumatoriaDeLosSalarios =  sumatoriaDeLosSalarios + emp.getSalario();
    		// mejorado sentencia de asignacion compuesta
			sumatoriaDeLosSalarios +=  emp.getSalario();
		
    	};
		
		salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
		System.out.println("El salario promedio de todas las personas es " + salarioPromedio);
		System.out.println("--------------------------------------------------");     
    }
}