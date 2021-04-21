package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort.service.SelectionSortt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SelectionSortApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelectionSortApplication.class, args);

		SelectionSortt a = new SelectionSortt();
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese la cantidad de nombres que desea ordenar: ");
		int n=sc.nextInt();
		String[] sarray=new String[n];

		for(int i=0;i<n;i++){
			System.out.print("Ingrese el nombre "+(i+1)+": ");
			sarray[i]=sc.next();
		}
		System.out.println("Los nombres ordenados son: ");
		a.sort(sarray);
		a.printArray(sarray);

	}

}
