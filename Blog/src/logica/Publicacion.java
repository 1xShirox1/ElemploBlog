package logica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {

	private static int consecutivo = 1;
	private int codigo;
	private String titulo;
	private String texto;
	private String autor;
	private LocalDateTime fechaPublicacion;
	private List<Comentario> Comentarios;
	
	public Publicacion(String titulo, String texto, String autor) {
		this.codigo = consecutivo;
		consecutivo++;
		this.titulo = titulo;
	    this.texto = texto;
	    this.autor = autor;
	    this.fechaPublicacion = LocalDateTime.now();
	    this.Comentarios = new ArrayList<>();
	    
	}
	
	public void agregarComentario(String email, String ip, String texto) throws Exception {
	    Comentario nuevoComentario = new Comentario(email, ip, texto);
	    Comentarios.add(nuevoComentario);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	public List<Comentario> getComentarios() {
		return Comentarios;
	}
}