package src.day23_multiDimensionalArrays;

import java.util.Arrays;


public class C08_EkstraSoruCopyOf {

	public static void main(String[] args) {
		/*
		 P ve q boyutunda iki s�ralanm�� A ve B dizisi verildi�inde, s�ralanm�� d�zeni koruyarak 
		 * A'n�n ��elerini B ile birle�tirmek i�in bir Java program� yaz�n, yani A'y� ilk p en k���k ��elerle doldurun 
		 * ve B'yi kalan ��elerle doldurun.
            �rnek:
        Giri� :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }
        ��k��:
        S�ral� Diziler:
         A: [1, 2, 4, 5, 6, 7]
         B: [8, 9, 10]
		 */
		
		int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        
        int birlesmis[]= Arrays.copyOf(A, A.length +B.length);
        
        System.out.println(Arrays.toString(birlesmis)); // [1, 5, 6, 7, 8, 10, 0, 0, 0]
        
        for (int i = A.length; i < birlesmis.length; i++) { // B nin elemanlarini sona ekleyelim
        	birlesmis[i]= B[i-A.length];
			
		}
		
        System.out.println(Arrays.toString(birlesmis)); // [1, 5, 6, 7, 8, 10, 2, 4, 9]
        
        Arrays.sort(birlesmis); // siralayalim
        System.out.println(Arrays.toString(birlesmis)); // [1, 2, 4, 5, 6, 7, 8, 9, 10]
        
        // A nin uzunlugu kadar elemani birlesmisten aLIP a'ya atayalim
        
        for (int i = 0; i < A.length; i++) {
        	A[i]=birlesmis[i];
			
		}
        System.out.println(Arrays.toString(A)); // [1, 2, 4, 5, 6, 7] A nin son hali
        
        // Kalan elemanlari B ye atayalim
        
        for (int i = A.length; i < birlesmis.length; i++) { // B nin elemanlarini sona ekleyelim
        	B[i-A.length]=birlesmis[i];
			
		}
        System.out.println(Arrays.toString(B)); // [8, 9, 10]B nin son hali
        



	}

}
