package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * En esta clase tendremos la cadena de conexion con que trabajara nuestra aplicacion, en esta se 
 * definira la vase de datos, el user, la pasword y el driver de conexion
 * 
 * por defecto los datos de login en MySQL son
 *  User: root
 *  Password : vacio
 *  
 * */
public class Conexion {
static String db="persona";
static String login = "root"; // nombre de usuario de la db "database"
static String password ="";
static String url= "jdbc:mysql://localhost/"+db;

Connection com = null;

// constructor de db conection 
public Conexion() {
	try {//driver mysql
		Class.forName("com.mysql.jdbc.Driver");
		//optenemos comecction
		com = DriverManager.getConnection(url,login,password);
		if (com != null) { System.out.println("Connexion a la Base de datos: "+ db +" es corecta");}
		
	}catch (SQLException e) {
		System.out.println(e);
	}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	catch (Exception e) {
		System.out.println(e);
	}
	}

public Connection getConnection () {
	return com;
}

public void desconectar () {
	com=null;
}

}
