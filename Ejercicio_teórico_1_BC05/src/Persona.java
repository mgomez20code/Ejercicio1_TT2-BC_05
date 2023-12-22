import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String titulacion;
    private boolean certificacionIngles;
    private String numeroTelefono;
    private String correoElectronico;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, 
                   String nacionalidad, String titulacion, boolean certificacionIngles, 
                   String numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.titulacion = titulacion;
        this.certificacionIngles = certificacionIngles;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public boolean esMayorDeEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    public boolean esEuropeo() {
        return this.nacionalidad.equalsIgnoreCase("europea");
    }

    public boolean puedeMatricularseDoctorado() {
        return this.titulacion.equalsIgnoreCase("master") || 
               this.titulacion.equalsIgnoreCase("doctorado");
    }

    //Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public boolean isCertificacionIngles() {
		return certificacionIngles;
	}

	public void setCertificacionIngles(boolean certificacionIngles) {
		this.certificacionIngles = certificacionIngles;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

    
    
}

