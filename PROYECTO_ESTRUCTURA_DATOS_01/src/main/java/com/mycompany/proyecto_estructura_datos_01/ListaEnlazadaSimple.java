package com.mycompany.proyecto_estructura_datos_01;

public class ListaEnlazadaSimple {

    private Nodo head;

    private static class Nodo {

        Usuario usuario;
        Nodo siguiente;

        public Nodo(Usuario usuario) {
            this.usuario = usuario;
            this.siguiente = null;
        }
    }

    public void agregarUsuario(Usuario usuario) {
        Nodo nuevo = new Nodo(usuario);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public Usuario buscarUsuario(String correo, String contraseña) {
        Nodo temp = head;
        while (temp != null) {
            if (temp.usuario.getCorreo().equals(correo) && temp.usuario.getContraseña().equals(contraseña)) {
                return temp.usuario;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    public boolean inactivarUsuario(String correo) {
        Nodo temp = head;
        while (temp != null) {
            if (temp.usuario.getCorreo().equals(correo)) {
                temp.usuario.setEstado(false); // Se asume que existe un método setEstado en Usuario
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    public void mostrarUsuarios() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println("Nombre: " + temp.usuario.getNombre() + ", Correo: " + temp.usuario.getCorreo());
            temp = temp.siguiente;
        }
    }
}


