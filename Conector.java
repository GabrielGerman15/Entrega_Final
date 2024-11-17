package trabajo_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 class Conector {
	
	private static final String Controlador = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/income";
	private static final String Usuario = "root";
	private static final String Contraseña = "";
	
	static {
		try {
			Class.forName(Controlador);
			System.out.println("Controlador cargado");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Controlador no cargado");
		}
	}
	
	static {
		try {
			Class.forName(Controlador);
			System.out.println("Controlador cargado");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Controlador no cargado");
		}
	}
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, Usuario, Contraseña);
			System.out.println("Conexion cargada");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Conexion no cargada");
		}
		
		return conexion;
	}
	
	public boolean Agregara(Intermediario a) {
		try {
			String query = "INSERT INTO `usuario`(`nombre`, `apellido`, `dni`, `cuit`, `telefono`, `email`, `direccion`, `altura`, `codigo_postal`) VALUES(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement sta = conectar().prepareStatement(query);
			
			sta.setString(1, a.getNombre());
			sta.setString(2, a.getApellido());
			sta.setInt(3, a.getDni());
			sta.setInt(4, a.getCuit());
			sta.setInt(5, a.getTelefono());
			sta.setString(6, a.getEmail());
			sta.setString(7, a.getDireccion());
			sta.setInt(8, a.getAltura());
			sta.setString(9, a.getCodigo_postal() );
			
			sta.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			
		}finally {
			try {
				if (conectar()!=null) {
					conectar().close();
				}
								
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean Eliminara(Intermediario b) {
		try {
			String query = "DELETE FROM `usuario` WHERE `id_usuario` = ?)";
			
			PreparedStatement sta = conectar().prepareStatement(query);
			
			sta.setInt(1, b.getId_usuario());
			sta.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			
		}finally {
			try {
				if (conectar()!=null) {
					conectar().close();
				}
								
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean Editara(Intermediario c) {
		try {
			String query = "UPDATE `usuario` SET ,`nombre`=?,`apellido`=?,`dni`=?,`cuit`=?,`telefono`=?,`email`=?,`direccion`=?,`altura`=?,`codigo_postal`=? WHERE 'usuario'.`id_usuario`=?";
			
			PreparedStatement sta = conectar().prepareStatement(query);
			
			sta.setString(1, c.getNombre());
			sta.setString(2, c.getApellido());
			sta.setInt(3, c.getDni());
			sta.setInt(4, c.getCuit());
			sta.setInt(5, c.getTelefono());
			sta.setString(6, c.getEmail());
			sta.setString(7, c.getDireccion());
			sta.setInt(8, c.getAltura());
			sta.setString(9, c.getCodigo_postal() );
			sta.setInt(10, c.getId_usuario());

			sta.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			
		}finally {
			try {
				if (conectar()!=null) {
					conectar().close();
				}
								
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean Buscara(Intermediario d) {
		
		ResultSet  rs = null;
		
		try {
			String query = "SELECT * FROM `usuario` WHERE `id_usuario`= ?)";
			
			
			
			PreparedStatement sta = conectar().prepareStatement(query);
			
			sta.setInt(1, d.getId_usuario());
		
			rs = sta.executeQuery();
			
			if(rs.next()) {
				d.setNombre(rs.getString("nombre"));
				d.setApellido(rs.getString("apellido"));
				d.setDni(Integer.parseInt(rs.getString("dni")));
				d.setCuit(Integer.parseInt(rs.getString("cuit")));
				d.setTelefono(Integer.parseInt(rs.getString("telefono")));
				d.setEmail(rs.getString("email"));
				d.setDireccion(rs.getString("direccion"));
				d.setAltura(Integer.parseInt(rs.getString("altura")));
				d.setCodigo_postal(rs.getString("codigo_postal"));
				
			}
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			
		}finally {
			try {
				if (conectar()!=null) {
					conectar().close();
				}
								
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}

