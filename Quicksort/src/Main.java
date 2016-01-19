
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arreglo = {5,2,7,4,12,5,6,1,8};
		
		Ordenador o = new  Ordenador();
		o.OrdenarQuicksort(arreglo);
		
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
		
	}

}
