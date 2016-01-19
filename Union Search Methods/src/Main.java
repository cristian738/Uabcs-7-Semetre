import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class Main {
	
	public static int arreglo1[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "";
		int bub100 [] = new  int [100];
		int bub1000 [] = new  int [1000];
		int bub10000 [] = new  int [10000];
		
		int qui100 [] = new  int [100];
		int qui1000 [] = new  int [1000];
		int qui10000 [] = new  int [10000];
		int i=0;		
		
		try
		{
			FileReader lector=new FileReader("unoAdiezb.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				bub100[i]=Integer.parseInt(texto);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("");
		}
		i=0;
		try
		{
			FileReader lector=new FileReader("unoAcienb.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				bub1000[i]= Integer.parseInt(texto);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println(" ");
		}
		i=0;
		try
		{
			FileReader lector=new FileReader("unoAmilb.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				bub10000[i]= Integer.parseInt(texto);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("");
		}
		i=0;
		try
		{
			FileReader lector=new FileReader("unoAdiezq.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				qui100[i]= Integer.parseInt(texto);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("");
		}
		i=0;
		try
		{
			FileReader lector=new FileReader("unoAcienq.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				qui1000[i]= Integer.parseInt(texto);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("");
		}
		i=0;
		try
		{
			FileReader lector=new FileReader("unoAmilq.txt");
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
				qui10000[i]= Integer.parseInt(texto);
				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("");
		}	
		
		
		

		long time_start1a10b, time_end1a10b;
		time_start1a10b = System.currentTimeMillis();
		burbuja(bub100); 
		time_end1a10b= System.currentTimeMillis();
		
		File archivo1 =new File("unoAdiezb.txt");
		for(int i2=0; i2<arreglo1.length; i2++){
			try
			{
				FileWriter escribir=new FileWriter(archivo1,true);
				escribir.write(arreglo1[i2]+" ");
				escribir.close();
			}
			catch(Exception e)
			{
			System.out.println("Error al escribir");
			}
		}
		
	

		long time_start1a100b, time_end1a100b;
		time_start1a100b = System.currentTimeMillis();
		burbuja(bub1000); // llamamos a la tarea
		time_end1a100b= System.currentTimeMillis();
		
		File archivo2 =new File("unoAcienb.txt");
		for(int i2=0; i2<arreglo1.length; i2++){
			try
			{
				FileWriter escribir=new FileWriter(archivo2,true);
				escribir.write(arreglo1[i2]+" ");
				escribir.close();
			}
			catch(Exception e)
			{
			System.out.println("Error al escribir");
			}
		}
		
		
		

		long time_start1a1000b, time_end1a1000b;
		time_start1a1000b = System.currentTimeMillis();
		burbuja(bub10000); 
		time_end1a1000b= System.currentTimeMillis();
		
		File archivo3 =new File("unoAmilb.txt");
		for(int i2=0; i2<arreglo1.length; i2++){
			try
			{
				FileWriter escribir=new FileWriter(archivo3,true);
				escribir.write(arreglo1[i2]+" ");
				escribir.close();
			}
			catch(Exception e)
			{
			System.out.println("Error al escribir");
			}
		}
		
		

		long time_start1a10q, time_end1a10q;
		time_start1a10q = System.currentTimeMillis();
		quicksort(qui100,0,qui100.length-1); // llamamos a la tarea
		time_end1a10q= System.currentTimeMillis();
		
		File archivo4 =new File("unoAdiezq.txt");
		for(int i2=0; i2<arreglo1.length; i2++){
			try
			{
				FileWriter escribir=new FileWriter(archivo4,true);
				escribir.write(arreglo1[i2]+" ");
				escribir.close();
			}
			catch(Exception e)
			{
			System.out.println("Error al escribir");
			}
		}
		
		

		long time_start1a100q, time_end1a100q;
		time_start1a100q = System.currentTimeMillis();
		quicksort(qui1000,0,qui1000.length-1); // llamamos a la tarea
		time_end1a100q= System.currentTimeMillis();
		
		File archivo5 =new File("unoAcienq.txt");
		for(int i2=0; i2<arreglo1.length; i2++){
			try
			{
				FileWriter escribir=new FileWriter(archivo5,true);
				escribir.write(arreglo1[i2]+" ");
				escribir.close();
			}
			catch(Exception e)
			{
			System.out.println("Error al escribir");
			}
		}
		

		long time_start1a1000q, time_end1a1000q;
		time_start1a1000q = System.currentTimeMillis();
		quicksort(qui10000,0,qui10000.length-1); 
		time_end1a1000q= System.currentTimeMillis();
		
		
		File archivo6 =new File("unoAmilq.txt");
		for(int i2=0; i2<arreglo1.length; i2++){
			try
			{
				FileWriter escribir=new FileWriter(archivo6,true);
				escribir.write(arreglo1[i2]+" ");
				escribir.close();
			}
			catch(Exception e)
			{
			System.out.println("Error al escribir");
			}
		}
		
		System.out.println("	Metodo Burbuja: ");
		System.out.println("1 al 100: "+(time_end1a10b - time_start1a10b)+" Milisegundos");
		System.out.println("1 al 1,000: "+ (time_end1a100b - time_start1a100b)+" Milisegundos");
		System.out.println("1 al 10,000: "+ (time_end1a1000b - time_start1a1000b)+" Milisegundos");
		System.out.println("	Metodo Quicksort: ");
		System.out.println("1 al 100: "+(time_end1a10q - time_start1a10q)+" Milisegundos");
		System.out.println("1 al 1,000: "+ (time_end1a100q - time_start1a100q)+" Milisegundos");
		System.out.println("1 al 10,000: "+ (time_end1a1000q - time_start1a1000q)+" Milisegundos");
	}
	

	static void burbuja(int arreglo[])
    {
		arreglo1 = new int[arreglo.length];
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
        for(int i2=0; i2<arreglo.length; i2++){
        	arreglo1[i2]=arreglo[i2];
        }
    	
    }
	public static void quicksort(int A[], int izq, int der) {

	  arreglo1 = new int[A.length];
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
	   
	   for(int i2=0; i2<A.length; i2++){
        	arreglo1[i2]=A[i2];
       }
	}

}
