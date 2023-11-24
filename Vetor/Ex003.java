import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int TAMANHO = 10;
		
		int[] a = new int[TAMANHO];
		int[] b = new int[TAMANHO];
		
		//le o valor de a
		for(int i=0; i<a.length; i++) {
			System.out.println("");
			a[i] = scan.nextInt();
		}
		
		//vai de trás para frente na variavel a e guarda de frente para tras na variavel b
		int j = 0;
		
		for(int i=(a.length - 1); i>=0; i--) {
			b[j] = a[i];
			
			j++;
			
			
		}
		
		System.out.print("[");
		for(int atualB : b) {
			System.out.print(atualB + " ");
		}
		System.out.println("]");
		
		scan.close();
		
	}

}
