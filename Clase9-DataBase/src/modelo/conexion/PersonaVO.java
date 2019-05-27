package modelo.conexion;

/**
 * PATRON VALUE OBJECT = OTO
 * 
 * Ateriormente conodico como como DTO (Data transefer Object) en el vamos a
 * respresentar las entidadse (tabla dentro de la db)la tabla consta de l
 * 
 */
public class PersonaVO {

	private Integer telefonoPersona;
	private Integer idPersona;
	private String nombrePersona;
	private Integer edadPersona;
	private String profecionPersona;

	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfecionPersona() {
		return profecionPersona;
	}

	public void setProfecionPersona(String profecionPersona) {
		this.profecionPersona = profecionPersona;
	}

	@Override
	public String toString() {
		return "PersonaVO [telefonoPersona=" + telefonoPersona + ", idPersona=" + idPersona + ", nombrePersona="
				+ nombrePersona + ", edadPersona=" + edadPersona + ", profecionPersona=" + profecionPersona + "]";
	}

}
