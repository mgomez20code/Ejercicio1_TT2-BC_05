import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    private static IU_Usuario iu = new IU_Usuario();

    public static void main(String[] args) {
        try {
            Persona persona = crearPersonaDesdeConsola();
            mostrarInformacionPersona(persona);
        } catch (DatosNoValidosException | DateTimeParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Persona crearPersonaDesdeConsola() throws DatosNoValidosException {
        String nombre = iu.leerCadena("Ingrese el nombre: ");
        String apellidos = iu.leerCadena("Ingrese los apellidos: ");
        LocalDate fechaNacimiento = leerFecha("Ingrese la fecha de nacimiento (formato YYYY-MM-DD): ");
        String nacionalidad = iu.leerCadena("Ingrese la nacionalidad: ");
        String titulacion = iu.leerCadena("Ingrese la titulación: ");
        boolean certificacionIngles = iu.leerBoolean("¿Tiene certificación de inglés? (true/false): ");
        String numeroTelefono = iu.leerCadena("Ingrese el número de teléfono: ");
        String correoElectronico = iu.leerCadena("Ingrese el correo electrónico: ");

        return new Persona(nombre, apellidos, fechaNacimiento, nacionalidad, 
                           titulacion, certificacionIngles, numeroTelefono, correoElectronico);
    }

    private static LocalDate leerFecha(String mensaje) throws DatosNoValidosException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fecha = iu.leerCadena(mensaje);
        try {
            return LocalDate.parse(fecha, formatter);
        } catch (DateTimeParseException e) {
            throw new DatosNoValidosException("Formato de fecha inválido.");
        }
    }

    private static void mostrarInformacionPersona(Persona persona) {
        System.out.println("\nInformación de la persona:");
        System.out.println("Es europeo: " + persona.esEuropeo());
        System.out.println("Es mayor de edad: " + persona.esMayorDeEdad());
        System.out.println("Puede matricularse en un programa de doctorado: " + persona.puedeMatricularseDoctorado());
    }
}
