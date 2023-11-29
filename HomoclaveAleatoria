import java.util.Random;
public class Principal {

	public static String cadenaAleatoria(int longitud) {
		Random aleatorio = new Random();
	    // El banco de caracteres
	    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    // La cadena en donde iremos agregando un carácter aleatorio
	    String cadena = "";
	    for (int x = 0; x < longitud; x++) {
	        int indiceAleatorio = aleatorio.nextInt(banco.length());
	        char caracterAleatorio = banco.charAt(indiceAleatorio);
	        cadena += caracterAleatorio;
	    }
	    return cadena;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(cadenaAleatoria(3));
	}

}
