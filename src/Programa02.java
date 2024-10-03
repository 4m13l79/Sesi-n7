import java.util.Scanner;
public class Programa02 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int edad;
        String sexo;
        String continuar;
        int contadorAlumnos = 0;
        int sumaEdades = 0;
        int contadorMasculino = 0;
        int contadorFemenino = 0;
        do {
            // Ingresar edad
            System.out.print("Ingrese la edad: ");
            edad = lectura.nextInt();
            // Ingresar sexo
            System.out.print("Ingrese el sexo (M/F): ");
            sexo = lectura.next().toUpperCase();
            // Validar el sexo ingresado
            if (sexo.equals("M")) {
                contadorMasculino++;
            } else if (sexo.equals("F")) {
                contadorFemenino++;
            } else {
                System.out.println("Sexo no válido, se registrará como desconocido.");
            }
            // Actualizar contadores
            contadorAlumnos++;
            sumaEdades += edad;
            // Preguntar si desea continuar
            System.out.print("?Desea continuar registrando datos? (si/no): ");
            continuar = lectura.next().toLowerCase();
        } while (continuar.equals("si"));
        // Calcular promedio de edad
        double promedioEdad = (contadorAlumnos > 0) ? (double) sumaEdades / contadorAlumnos : 0;
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Cantidad de alumnos: " + contadorAlumnos);
        System.out.printf("Promedio de edad: %.2f\n", promedioEdad);
        System.out.println("Cantidad de alumnos masculinos: " + contadorMasculino);
        System.out.println("Cantidad de alumnos femeninos: " + contadorFemenino);
        lectura.close();
    }
}
