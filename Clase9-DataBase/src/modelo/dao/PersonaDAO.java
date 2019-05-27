package modelo.dao;

import java.sql.SQLException;
import java.sql.*;

import javax.swing.JOptionPane;

import Vista.*;
import modelo.conexion.Conexion;
import modelo.conexion.PersonaVO;

// calse que nos permite el accseso a los datos de la base
/**
 * Utilizamos este tipo de clases apilcando el patron dao - Data access Object
 * basicamente este patron consiste en que centralicemos todos los procesos de
 * accesos a nuestra base de datos evitando de esta manera tener inconcistengia
 * y posibles problemas cuando se realiza modificaciones de tipo upfate, read ,
 * delete y private con este patron lo que estamos habiendo ees independisando
 * toda la logica de acceso a los datos obteniendo havi una mayor organiciacion
 * y flexibilidad en el sistema
 *
 **/
public class PersonaDAO {
	public void registraPersona(PersonaVO miPersona) {
		Conexion com = new Conexion();
		try {
			Statement estatuto = com.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES('" + miPersona.getIdPersona() + "','"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfecionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
			JOptionPane.showMessageDialog(null, "Se resitro la persona", "INFORMACION",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Se inserto correctamente");
			estatuto.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se pudo registrar");
			System.out.println("No se pudo registarar la perso en la Base");

		} finally {
			com.desconectar();
		}
	}

	public PersonaVO buscarPersona(int codigo) {
		Conexion com = new Conexion();
		PersonaVO p1 = new PersonaVO();
		boolean existe = true;
		try {

			java.sql.PreparedStatement consulta = com.getConnection()
					.prepareStatement("select * FROM pesona when id= ?");
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = false;
				p1.setIdPersona(Integer.parseInt(res.getString("id")));
				p1.setNombrePersona(res.getString("nombre"));
				p1.setEdadPersona(Integer.parseInt(res.getString("edad")));
				p1.setProfecionPersona(res.getString("Profecion"));
				p1.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));

				PersonaDAO pd = new PersonaDAO();
				// pd.regidtraPersona (p1);
				System.out.println(pd.buscarPersona(1));
				System.out.println(pd.buscarPersona(2));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se conecto");
		}
		if (existe) {
			return p1;
		} else {
			return null;
		}
	}

	public void eliminarPersona(int codigo) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto =conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id= '" +codigo +"'");
			JOptionPane.showMessageDialog(null, "Se logro eliminar correctamente ","info",JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("no se pudo eliminar");
		}
	}
}
