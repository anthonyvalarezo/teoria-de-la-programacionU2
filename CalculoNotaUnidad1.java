import java.util.Scanner;

public class CalculoNotaUnidad1 {
    public static void main(String[] args) {

        // Declaracion de variables
        double nota1, nota2, nota3, notaFinal;
        String nivel, estado;

        Scanner leer = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese nota de evaluacion individual (0 a 10): ");
        nota1 = leer.nextDouble();

        System.out.print("Ingrese nota de trabajo grupal (0 a 10): ");
        nota2 = leer.nextDouble();

        System.out.print("Ingrese nota de evaluacion final (0 a 10): ");
        nota3 = leer.nextDouble();

        // Condicional doble para validar rango de 0 a 10
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
            
            // Calculo del promedio
            notaFinal = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);

            // Condicional multiple para el nivel de desempeno
            if (notaFinal >= 9.0) {
                nivel = "Excelente";
            } else if (notaFinal >= 8.0) {
                nivel = "Muy bueno";
            } else if (notaFinal >= 7.0) {
                nivel = "Bueno";
            } else if (notaFinal >= 5.0) {
                nivel = "Regular";
            } else {
                nivel = "Deficiente";
            }

            // Condicional doble para aprobado o reprobado
            if (notaFinal >= 7.0) {
                estado = "APROBADO";
            } else {
                estado = "REPROBADO";
            }

            // Salida de resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Evaluacion individual: " + nota1);
            System.out.println("Trabajo grupal: " + nota2);
            System.out.println("Evaluacion final: " + nota3);
            System.out.printf("Nota final: %.2f\n", notaFinal);
            System.out.println("Nivel de desempeno: " + nivel);
            System.out.println("Estado: " + estado);

            // Condicionales simples para mensajes adicionales
            if (notaFinal >= 9.0) {
                System.out.println("¡Felicitaciones! Rendimiento sobresaliente");
            }
            if (notaFinal < 7.0) {
                System.out.println("El estudiante requiere refuerzo academico");
            }

        } else {
            System.out.println("Error: Las notas deben estar entre 0 y 10");
        }

        leer.close();
    }
}