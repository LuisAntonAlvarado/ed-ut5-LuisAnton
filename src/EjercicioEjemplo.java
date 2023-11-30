import java.util.Scanner;
public class EjercicioEjemplo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Introducimos dos variables númericas y una booleana
            int i, nota;
            boolean suspenso = false;
            // Iniciamos un bucle for que se repetirá 5 veces a menos que haya un suspenso
            for (i = 1; i <= 5; i++) {
                System.out.print ("Introduce un número del 1 al 10: ");
                nota = sc.nextInt();
                // Si la nota es menor que 1 o mayor que 10 indicamos que la nota es incorrecta
                if (nota < 1 || nota > 10) {
                    System.out.println ("Nota incorrecta. ");
                    // Restamos 1 de valor a i para poder tener 5 notas correctas
                    i--;
                    // Si la nota es suspenso entre 1 y menor que 5, suspenso es igual a true y nos saca del bucle
                } else if (nota >= 1 && nota < 5) {
                    suspenso = true;
                    break;
                }
            }
            // Indicamos si hay suspenso o no
            if (suspenso == true) {
                System.out.print ("Hay alumnos suspensos.");
            } else {
                System.out.print ("No hay alumnos suspensos.");
            }
        }
}
