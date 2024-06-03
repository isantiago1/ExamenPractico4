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
    	
		// variables;
		
		double sumatoriaContabilidad = 0.0;
		double sumatoriaInformatica = 0.0;
		double sumatoriaRrhh = 0.0;
		
		int totalDepContabilidad = 0;
    	int totalDepInformatica = 0;
    	int totalDepRrhh = 0;
    	
    	double salarioPromedioContabilidad = 0.0;
    	double salarioPromedioInformatica = 0.0;
    	double salarioPromedioRrhh = 0.0;
		
    	for(Empleado emp1 : arrayEmpleados) {
    		if(emp1.getDepartamento().equals(Departamento.CONTABILIDAD)) {
    			sumatoriaContabilidad += emp1.getSalario();
    			totalDepContabilidad++;
    		} else if(emp1.getDepartamento().equals(Departamento.INFORMATICA)) {
    			sumatoriaInformatica += emp1.getSalario();
    			totalDepInformatica++;
    		} else {
    			sumatoriaRrhh += emp1.getSalario();
    			totalDepRrhh++;
    		}
    	};
		salarioPromedioContabilidad = sumatoriaContabilidad / totalDepContabilidad;
		System.out.println("El salario promedio del Dep Contabilidad " + salarioPromedioContabilidad);
		System.out.println("--------------------------------------------------");	
		salarioPromedioInformatica = sumatoriaInformatica / totalDepInformatica;
		System.out.println("El salario promedio del Dep Informatico " + salarioPromedioInformatica);
		System.out.println("--------------------------------------------------");
		salarioPromedioRrhh = sumatoriaRrhh / totalDepRrhh;
		System.out.println("El salario promedio del Dep RRHH " + salarioPromedioRrhh);
		System.out.println("--------------------------------------------------");
    	
    	// variables;
    	double sumatoriaSalariosHombre = 0.0;
    	double sumatoriaSalarioMujer = 0.0;
    	double sumatoriaSalarioOtro = 0.0;
    	
    	int totalGeneroHombre = 0;
    	int totalGeneroMujer = 0;
    	int totalGeneroOtro = 0;
    	
    	double salarioPromedioHombres = 0.0;
    	double salarioPromedioMujeres = 0.0;
    	double salarioPromedioOtro = 0.0;
    	
    	for(Empleado emp2 : arrayEmpleados) {
    		if(emp2.getGenero().equals(Genero.HOMBRE)) {
    			sumatoriaSalariosHombre += emp2.getSalario();
    			totalGeneroHombre++;
    		} else if(emp2.getGenero().equals(Genero.MUJER)) {
    			sumatoriaSalarioMujer += emp2.getSalario();
    			totalGeneroMujer++;
    		} else {
    			sumatoriaSalarioOtro += emp2.getSalario();
    			totalGeneroOtro++;
    		}
    	};
		salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
		System.out.println("El salario promedio de los Hombres " + salarioPromedioHombres);
		System.out.println("--------------------------------------------------");	
		salarioPromedioMujeres = sumatoriaSalarioMujer / totalGeneroMujer;
		System.out.println("El salario promedio de las Mujeres " + salarioPromedioMujeres);
		System.out.println("--------------------------------------------------");
		salarioPromedioOtro = sumatoriaSalarioOtro / totalGeneroOtro;
		System.out.println("El salario promedio de los Otros " + salarioPromedioOtro);
		System.out.println("--------------------------------------------------");
		
		
		
		
		
    }
}