package com.marcoacas.demoMarco1.models;

import javax.persistence.*;
//import java.sql.Date;
import java.util.Date;

@Entity //ORM esta en fucnión e para definir que es una tabla
@Table(name = "Producto") //Aqui se define como se llama la tabla a relacionar
public class Product {


    /*Variables con todito y su linkeo con la DB de ConsultaFit*/
    @Id //Con esta notación se define el PrimaryKey
    @GeneratedValue(strategy = GenerationType.AUTO)//Para el autoincremento
    @Column(name="Id_Producto")
    private Integer idProducto;
    @Column(name="archivo")
    private String rutaImagenProducto;
    @Column(name="Categoría") //Se escribe para mapear directamente con las columnas de SQL
    private String categoriaProducto;
    @Column(name="color")
    private Integer cantidadProducto;
    @Column(name="descrip")
    private String descripcionProducto;
    @Column(name="marca")
    private String marcaProducto;
    @Column(name="nombre")
    private String nombreProducto;
    @Column(name="precio")
    private Integer precioProducto;
    @Column(name="talla")
    private Integer tallaProducto;



    //Getters & Setters
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getRutaImagenProducto() {
        return rutaImagenProducto;
    }

    public void setRutaImagenProducto(String rutaImagenProducto) {
        this.rutaImagenProducto = rutaImagenProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getTallaProducto() {
        return tallaProducto;
    }

    public void setTallaProducto(Integer tallaProducto) {
        this.tallaProducto = tallaProducto;
    }
}
