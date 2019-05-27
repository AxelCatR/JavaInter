package Vista;

import java.security.Permissions;
import java.util.Scanner;

import modelo.conexion.Conexion;
import modelo.conexion.PersonaVO;
import modelo.dao.PersonaDAO;

public class AppMian {
public static void main(String[] args) {
	Conexion c =new Conexion ();
	PersonaVO p1=new PersonaVO();
	Scanner sc = new Scanner (System.in);
//	System.out.println("Ingrese el id de la persona");
	//p1.setIdPersona(sc.nextInt());
	//System.out.println("Ingrese el Nombew de la persona");
	//p1.setNombrePersona(sc.next());
	//System.out.println("Ingrese la edad de la persona");
//	p1.setEdadPersona(sc.nextInt());
//	System.out.println("Ingrese la profecion de la persona");
//	p1.setProfecionPersona(sc.next());
//	System.out.println("Ingrese el Telefono de la persona");
//	p1.setTelefonoPersona(sc.nextInt());
	
	 PersonaDAO pd = new PersonaDAO();
	//pd.registraPersona(p1);
	//pd.buscarPersona(1);
	pd.eliminarPersona(1);
	
}


}
