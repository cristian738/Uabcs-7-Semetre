
import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;
 

	
public class TablaQuickSortBurbuja
	{
	
	public static void main(String arg[])
		{
		String texto="";
		ArrayList <String> listaDiez = new ArrayList<String>();
		int diez[]= new int [10];
		int cien[]= new int [100];
		int mil[]= new int [1000];

		ArrayList <String> listaCien = new ArrayList<String>();
		ArrayList <String> listaMil = new ArrayList<String>();

		try
		{
			FileReader lector=new FileReader("unoAdiez.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				listaDiez.add(texto);
			}
		}
		
		catch(Exception e)
		{
		System.out.println("Error al leer");
		}
		
		try
		{
			FileReader lector=new FileReader("unoAcien.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				listaCien.add(texto);
			}
		}
		
		catch(Exception e)
		{
		System.out.println("Error al leer");
		}
		try
		{
			FileReader lector=new FileReader("unoAmil.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				listaMil.add(texto);
			}
		}
		
		catch(Exception e)
		{
		System.out.println("Error al leer");
		}

		for(int i=0;i<listaDiez.size();i++){
			diez[i]=Integer.parseInt(listaDiez.get(i));
		}
		
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		burbuja(diez); // llamamos a la tarea
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" Milliseconds");
		
		
		for(int i=0;i<listaCien.size();i++){
			cien[i]=Integer.parseInt(listaCien.get(i));
		}
		for(int i=0;i<listaMil.size();i++){
			mil[i]=Integer.parseInt(listaMil.get(i));
		}
		
	}
	
	public static void quicksort(int A[], int izq, int der) {


		  int pivote=A[izq]; 
		  int i=izq; 
		  int j=der; 
		  int aux;
		 
		  while(i<j){
		     while(A[i]<=pivote && i<j) i++; 
		     while(A[j]>pivote) j--;         
		     if (i<j) {                                            
		         aux= A[i];                  
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j];
		   A[j]=pivote; 
		   if(izq<j-1)
		      quicksort(A,izq,j-1); 
		   if(j+1 <der)
		      quicksort(A,j+1,der); 
		}
	
	static int[] burbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        System.out.println("Para");
		return arreglo;
    }
}


