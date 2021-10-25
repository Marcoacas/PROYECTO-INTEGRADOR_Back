package com.marcoacas.demoMarco1.models;


import javax.persistence.*;
import java.util.Date;

@Entity //ORM esta en fucnión e para definir que es una tabla
@Table(name = "cliente")
public class Client {

    @Id //Con esta notación se define el PrimaryKey
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliente;
    @Column(name="Nombre") //Aqui se define su relacion directa con el SQL
    private String nombreCliente;
    @Column(name="Fecha_Registro") //Aqui se define su relacion directa con el SQL
    private Date fechaRegistroCliente;
    @Column(name="Correo") //Aqui se define su relacion directa con el SQL
    private String correoCliente;
    @Column(name="Contraseña") //Aqui se define su relacion directa con el SQL
    private String contrasenaCliente;
    @Column(name="Dirección") //Aqui se define su relacion directa con el SQL
    private String direccionCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaRegistroCliente() {
        return fechaRegistroCliente;
    }

    public void setFechaRegistroCliente(Date fechaRegistroCliente) {
        this.fechaRegistroCliente = fechaRegistroCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getContrasenaCliente() {
        return contrasenaCliente;
    }

    public void setContrasenaCliente(String contrasenaCliente) {
        this.contrasenaCliente = contrasenaCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
