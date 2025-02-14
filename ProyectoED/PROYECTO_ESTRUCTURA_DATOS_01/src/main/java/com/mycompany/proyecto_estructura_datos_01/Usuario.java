package com.mycompany.proyecto_estructura_datos_01;

public class Usuario {
    
    private String nombre;
    private String cedula;
    private String codigo;
    private int edad;
    private String correo;
    private String contraseña;
    public int autonumerico = 100000;

    public Usuario(String nombre, String cedula, int edad, String correo, String contraseña) {
        this.nombre = null;
        this.cedula = null;
        this.codigo = "CRC-"+autonumerico;
        this.edad = 0;
        this.correo = null;
        this.contraseña = null;
        autonumerico++;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
