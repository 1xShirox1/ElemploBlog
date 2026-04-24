package logica;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class Blog {

	private static int consecutivo = 1;
	private int codigo;
	private String nombre;
	private String descripcion;
	private LocalDateTime fechaCreacion;
	private Map<Integer, Publicacion> publicaciones;
	
	
	public Blog(String nombre, String descripcion) throws Exception {
		if (nombre == "") {
			throw new Exception("El blog debe de tener un nombre");
		}
		codigo = consecutivo;
		consecutivo++;
		this.nombre = nombre;
		this.descripcion = descripcion;
		fechaCreacion = LocalDateTime.now();
		publicaciones = new TreeMap<Integer, Publicacion>();
	}
	
	public void crearPublicacion(String titulo, String texto, String autor) {
		Publicacion nuevaPublicacion = new Publicacion(titulo, texto, autor);
		publicaciones.put(nuevaPublicacion.getCodigo(), nuevaPublicacion);
	}
	
	public void borrarPublicacion(int codigo) {
		publicaciones.remove(codigo);
	}
	
	public List<Publicacion> listarPublicaciones() {
	    return new ArrayList<>(publicaciones.values());
	}

	public Publicacion obtenerPublicacion(int codigo) {
	    return publicaciones.get(codigo);
	}
	
	public void crearComentario(int codigoPublicacion, String email, String ip, String texto) throws Exception {
	    Publicacion publicacion = publicaciones.get(codigoPublicacion);

	    if (publicacion == null) {
	        throw new Exception("No existe una publicación con ese código");
	    }

	    publicacion.agregarComentario(email, ip, texto);
	}

	public static int getConsecutivo() {
		return consecutivo;
	}


	public static void setConsecutivo(int consecutivo) {
		Blog.consecutivo = consecutivo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCodigo() {
		return codigo;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}


	public Map<Integer, Publicacion> getPublicaciones() {
		return publicaciones;
	}
	
	
	
}
	