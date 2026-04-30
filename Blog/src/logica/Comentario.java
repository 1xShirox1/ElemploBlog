package logica;

import java.time.LocalDateTime;

public class Comentario {
	
	private LocalDateTime fechaCreacion;
	private String email;
	private String ip;
	private String texto;
	
	public Comentario(String email, String ip, String texto) {
		this.email = email;
		this.ip = ip;
		this.texto = texto;
		this.fechaCreacion = LocalDateTime.now();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	@Override
	public String toString() {
	    return "Comentario: fechaCreacion=" + fechaCreacion +
	            ", email='" + email + '\'' +
	            ", ip='" + ip + '\'' +
	            ", texto='" + texto + '\'';
	}
}