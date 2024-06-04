package com.example;

/**
 * Examen 4 Iván
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Rama_5!");
		
	

		// Array que permita almacenar tanto objetos empleados como objetos estudiantes.

		Object[] empleadosYEstudiantes = {
				Empleado.builder().nombre("Ana").primerApellido("Garcia").segundoApellido("Garcia")
						.departamento(Departamento.CONTABILIDAD).salario(3000.00).genero(Genero.MUJER).build(),
				Empleado.builder().nombre("Nuria").primerApellido("Perez").segundoApellido("Garcia")
						.departamento(Departamento.CONTABILIDAD).salario(3000.00).genero(Genero.MUJER).build(),
				Estudiante.builder().nombre("Eva").primerApellido("Santiago").segundoApellido("Gomez")
						.genero(Genero.MUJER).facultad(Facultad.DERECHO).totalAsignaturasMatriculadas(8).build(),
				Estudiante.builder().nombre("Maria").primerApellido("Lopez").segundoApellido("Gomez")
						.genero(Genero.MUJER).facultad(Facultad.DERECHO).totalAsignaturasMatriculadas(8).build(),
				Estudiante.builder().nombre("Roberto").primerApellido("Santos").segundoApellido("Alvarez")
						.genero(Genero.HOMBRE).facultad(Facultad.INFORMATICA).totalAsignaturasMatriculadas(9).build() };

		// Recorrer el Array con un for mejorado
		System.out.println("Recorriendo el array Empleado Y Estudiante  -------------------");
		for (Object obj : empleadosYEstudiantes) {
			// System.out.println(obj);
			if (obj instanceof Empleado) {
				System.out.println("Empleado ###");
				Empleado em = (Empleado) obj;
				System.out.println("Nombre del Empleado: " + em.getNombre());
				System.out.println("Apellido del Empleado: " + em.getPrimerApellido());
				System.out.println("Apellido del Empleado: " + em.getSegundoApellido());
				System.out.println("Genero del Empleado: " + em.getGenero());
				System.out.println("Departamento del Empleado: " + em.getDepartamento());
				System.out.println("Salario del Empleado: " + em.getSalario());
			} else if (obj instanceof Estudiante) {
				System.out.println("Estudiante ###");
				Estudiante es = (Estudiante) obj;
				System.out.println("Nombre del Estudiante: " + es.getNombre());
				System.out.println("Apellido del Estudiante: " + es.getPrimerApellido());
				System.out.println("Apellido del Estudiante: " + es.getSegundoApellido());
				System.out.println("Genero del Estudiante: " + es.getGenero());
				System.out.println("Facultad del Estudiante: " + es.getFacultad());
				System.out.println("Asignaturas del Estudiante: " + es.getTotalAsignaturasMatriculadas());
			}
		}
		;
		System.out.println("--------------------------------------------------");
		System.out.print("Numero de elementos que posee el Array: ");
		System.out.print(empleadosYEstudiantes.length);
		System.out.println("");

		// System.out.println("Recorriendo el array Empleado Y Estudiante
		// -------------------");
		// for (Object obj : empleadosYEstudiantes)
		// System.out.println(obj);

		// Array de Estudiantes del sexo Mujer que tengan un total de Asignaturas igual o superior a la media
		// Averiguamos que tipo de objetos tenemos almacenados
		
		Estudiante[] arrayMujeres = new Estudiante[5];
		int j= 0;
		
		for (int i = 0; i < empleadosYEstudiantes.length; i++) {
			if (empleadosYEstudiantes[i] instanceof Empleado) {
				System.out.println("En la posicion: " + i + " tenemos un Empleado");
			} else if (empleadosYEstudiantes[i] instanceof Estudiante) {
				System.out.print("En la posicion: " + i + " tenemos un Estudiante" + " y es: ");
				System.out.println(((Estudiante) empleadosYEstudiantes[i]).getGenero());
				if (((Estudiante) empleadosYEstudiantes[i]).getGenero().equals(Genero.MUJER)){
					//System.out.println("················");
					//System.out.println(j);
					arrayMujeres[j] = ((Estudiante) empleadosYEstudiantes[i]);
					System.out.print(" --> Como es mujer se añade al array de mujeres: " + arrayMujeres[j].getNombre());
					System.out.println(" Genero " + arrayMujeres[j].getGenero());
					j= j+1;
				}		
				
			}
		}
		
	    // Mostramos el Array
		System.out.println("Array de Mujeres -----------------------------");
		for (int z= 0; z < arrayMujeres.length; z++) {
			System.out.println(arrayMujeres[z]);	
		}
		
	}
}