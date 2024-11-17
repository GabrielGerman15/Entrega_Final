package trabajo_final;

class Intermediario {
	int id_usuario;
	String nombre;
	String apellido;
	int dni;
	int cuit;
	int telefono;
	String email;
	String direccion;
	int altura;
	String codigo_postal;
	Conector uri = new Conector();
	
	public boolean Agregar() {
		
		if(uri.Agregara(this)) {
			return true;
	}else {
		return false;
		}
	}
	
	public boolean Eliminar() {
		
		if(uri.Eliminara(this)) {
			return true;
	}else {
		return false;
		}
	}
	
	public boolean Editar() {
		
		if(uri.Editara(this)) {
			return true;
	}else {
		return false;
		}
	}
	
	public boolean Buscar() {
		
		if(uri.Buscara(this)) {
			return true;
	}else {
		return false;
		}
	}
	
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	
	
}
