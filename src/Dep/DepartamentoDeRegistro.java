package Dep;

import java.util.Arrays;
import java.util.Scanner;


public class DepartamentoDeRegistro {

	public static void main(String[] args){
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1.Registrar Médico");
		System.out.println("2.Registrar Empleado");
		System.out.println("3.Registrar Paciente");
		Scanner input=new Scanner(System.in);
		int opcion=input.nextInt();
		switch(opcion){
		case 1:
			System.out.println("¿Cuántos médicos quieres registrar?");
			int n=input.nextInt();
			String[] especialidad= new String[n];
			Medico medicos[]=new Medico[n];
			for(int i=0;i<medicos.length;i++){
				medicos[i]=new Medico();
				System.out.printf("[%d]",i+1);
				medicos[i].Registrar();
			}
			System.out.println("Imprimir ordenados \n1.Si\n2.No");
			int opcion1=input.nextInt();
			if(opcion1==1){
			for(int i=0;i<medicos.length;i++){
				especialidad[i]=medicos[i].getEspecialidad();
			}
			Arrays.sort(especialidad);
				for(int i=0;i<especialidad.length;i++)
					for(int j=0;j<medicos.length;j++){
						if(especialidad[i].compareTo(medicos[j].getEspecialidad())==0){
							System.out.println(medicos[j].toString());
						}
					}
			}
				break;
		case 2:
		}
	}
}
