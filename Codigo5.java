import java.util.Scanner;

public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // crear scanner 
        System.out.print("Introduzca un número: "); // introducir numero
        String ni = s.nextLine(); // leer string ni 
        int c = Integer.parseInt(ni); // convertir input string a integer
        
        int afo = 0;
        int noAfo = 0;
        
        int originalNumber = c;

        while (c > 0) { // corregir c
            int digito = c % 10;  
            
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            } // if / else
            
            c /= 10;  
        } // while

        if (afo > noAfo) {
            System.out.println("El " + originalNumber + " es un número afortunado."); // corregir ortografía en el sysout
        } else {
            System.out.println("El " + originalNumber + " no es un número afortunado.");
        } // if / else
        
        s.close(); // cerrar scanner
    } // main 
} // class 
