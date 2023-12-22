
import java.util.Scanner;

public class IU_Usuario {
    private Scanner scanner;

    public IU_Usuario() {
        this.scanner = new Scanner(System.in);
    }

    public String leerCadena(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public int leerEntero(String mensaje) throws DatosNoValidosException {
        System.out.println(mensaje);
        if (!scanner.hasNextInt()) {
            scanner.next(); // Limpiar el buffer
            throw new DatosNoValidosException("Se esperaba un número entero");
        }
        return scanner.nextInt();
    }
    
    public boolean leerBoolean(String mensaje) {
        System.out.print(mensaje);
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                return Boolean.parseBoolean(input);
            } else {
                System.out.println("Entrada inválida. Por favor ingrese 'true' o 'false':");
            }
        }
    }
}
