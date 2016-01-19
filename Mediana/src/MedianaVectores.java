import java.util.Scanner;

public class MedianaVectores {

	
	public static double findMedianSortedArrays(int A[], int B[]) {	
		int total = A.length + B.length;
		int m = A.length;
		int n = B.length;
		if(total%2 != 0){
		    return find(A,m, B, n, total/2+1);
		}
		else 
		    return (find(A, m, B, n, total/2) + find(A, m, B, n, total/2 +1))/2;
		}
		
	private static void ordenar(int[] m) { 
		int aux; 
		//recorre las posiciones del array 
		for (int i = 0; i < m.length; i++) { 
		//se utiliza para comparar el valor de la posicion actual con el siguiente 
		for (int j = i+1; j < m.length; j++) { 
		//si uno de los siguientes valores es inferior al actual 
		//procede al intercambio de las posiciones del array 
		if (m[j] < m[i]){ 
		aux = m[i]; 
		m[i] = m[j]; 
		m[j] = aux; 
		} 
		} 
		} 

		}
	private static void mostrar(int[] m) { 
		for (int num:m){ 
			System.out.print(num + " "); 
		} 

		} 
		public static double find(int A[],int m,int B[],int n,int r)
	    {
	        if(m>n)
	        	return find(B, n, A, m, r);
	        if(m==0)
	        	return B[r-1];
	        if(r==1)
	        	return Math.min(A[0],B[0]);
	        /*
	         * Divide
	         */
	        int temp=r/2;			
	        if(Math.min(m,n)<temp)  //make sure temp is not out of any of those arrays' bounds
	        	temp=Math.min(m,n);
	        /*
	         * Conquer
	         */
	        /*
	         * delete the small one before A[temp](A[temp]-1)
	         */
	        if(A[temp-1]>=B[temp-1]){
	        	int[] p_B = new int[B.length-temp];
	        	for(int i = temp, j = 0; i<B.length && j<B.length-temp; i++, j++){
	        			p_B[j] = B[i];
	        	}
	        	return find(A,m,p_B,n-temp,r-temp);
	        }
	        else {
	        	int[] p_A = new int[A.length-temp];
	        	for(int i = temp, j = 0 ; i<A.length && j<A.length-temp; i++, j++){
	        			p_A[j] = A[i];
	        	}
	        	return find(p_A,m-temp,B,n,r-temp);
	        }
	    }

	//1,2,3,4,5,6,7,8,9
		//2,2,3,5,5,7,9,9,10,10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Mediana");
		System.out.println("Ingrese Tamaño del primer array: ");
	    int x = sc.nextInt() ;
		
	    
		int[] a1 = new int[x];
	    
	    for(int f=0;f<x;f++) {
	        System.out.print("Ingrese valor de el array:");
	        a1[f] = sc.nextInt();
	    }	
	    System.out.println("");
		System.out.println("Ingrese Tamaño del segundo array: ");
		int y = sc.nextInt() ;
		
		int[] a2 = new int[y];
		
		 for(int o=0;o<y;o++) {
		        System.out.print("Ingrese valor de el array:");
		        a2[o] = sc.nextInt();
		    }
		 
		 
		 ordenar (a1);
		 ordenar (a2);
		// mostrar (a1);
		 //	mostrar (a2);	

		//int[] a1 = {1,2};
		//int[] b1 = {3,4,5};
		double median = findMedianSortedArrays(a1,a2);
		System.out.println("");
		System.out.print("Mediana:  " + median);
		

	}

}
