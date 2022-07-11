package com.tienda.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cliente")
public class Cliente {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="nombre")
private String nombre;
@Column(name="apellidos")
private String apellidos;
@Column(name="email")
private String email;
public Cliente() {
}
public Cliente(String nombre, String apellidos, String email) {
super();
this.nombre = nombre;
this.apellidos = apellidos;
this.email = email;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
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
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
@Override
public String toString() {
return "Cliente [id=" + id + ", firstName=" + nombre + ", lastName=" + apellidos +
", email=" + email + "]";
}
}