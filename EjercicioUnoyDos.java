package claseNroTres;

public class EjercicioUnoyDos {

	public static void main(String[] args) {
// A) Dado un string y una letra, que cuente la cantidad de apariciones de la letra en el string.
		
		char unaLetra = 'a';
		String unTexto = "agroecologia";
		int suma = 0;
				
		for (int i = 0; i <= 11 ; i++) {
			if (unTexto.charAt(i) == unaLetra) {
				suma = suma +1;
			}
		}
		System.out.print("La cantidad de veces de aparece es: " + suma);
	}

//B) Dado un vector de 3 numeros desordenados, ordene los mismos y retorne el mayor.

		int []vectorA = {80,56,2};
		int num1=0, num2=0,num3=0, aux=0, mayor=0;
		num1 = vectorA[0];
		num2 = vectorA[1];
		num3 = vectorA[2];

		System.out.println(num1+" " + num2+" " + num3);
			if (num1 > num2) {
				aux=num1;
				if (num1 > num3) {
					mayor=num1;
					}
				}else{
					if (num2 > num3) {
						mayor=num2;
						}else {
							mayor=num3;
							}
					}

System.out.println("El mayor es: "+mayor);


//C) Dado un vector de numeros, y un numero x, que sume todos los numeros > x y retorne el resultado.
		int vectorA[] = {2,12,23,45,56,78,85};
		int x=45, suma = 0;
		
		for (int i=0; i<= vectorA.length - 1; i++) {
			if (vectorA[i] > x) {
				suma = suma + vectorA[i];
			}
		}
	System.out.print("La suma es: " + suma);
	}
	// 2) Genere una clase, utilice el metodo split para separar una lista de 10 nombres tomados de una variable, luego muestre por consola el resultado.
		String nombres = "Sofia_Ernestina_Ciro_Benjamin_Emilia_Catalina_Matias_Ezequiel_Maria_Luisa";
		String[] nombresPorSeparado = nombres.split("_"); 
		for (String nombre : nombresPorSeparado) {
			System.out.print(nombre + "\n");
		}
	}
}


