package edu.elp.SISGAP.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Inheritance (strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    @Column (name = "idpersona")
    private Long idpersona;

    @Column (name = "nombre", length = 50, nullable = false)
    private  String nombre;

    @Column (name = "apellido", length = 100, nullable = false)
    private  String apellido;

    @Column (name = "edad", length = 10)
    private  String edad;

    private String sexo;
    private String dni;
    private String direccion;
    private String telefono;

    @Column (name = "fecha_nacimiento")
    private Date fechaNacimeinto;

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimeinto() {
        return fechaNacimeinto;
    }

    public void setFechaNacimeinto(Date fechaNacimeinto) {
        this.fechaNacimeinto = fechaNacimeinto;
    }

    public Persona(String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimeinto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimeinto = fechaNacimeinto;
    }
}
