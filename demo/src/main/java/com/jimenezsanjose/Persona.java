package com.jimenezsanjose;

/**
 * La clase Persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String mail;

    /**
     * Constructor con parametros
     * @param nombre      parametros nombre
     * @param apellidos   parametro apellidos
     * @param edad      parametro edad
     * @param mail      parametro email
     */
    public Persona(String nombre, String apellidos, int edad, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.mail = mail;
    }

    public static Persona factory(String cadena){
        if(cadena == null){
            throw new IllegalArgumentException("Argumentos inválidos");
        }
        String partes[] = cadena.split(",");
        if(partes.length != 4){
            throw new IllegalArgumentException("Argumentos inválidos");
        }

        try{
             int e = Integer.parseInt(partes[2]);
             return new Persona(partes[0], partes[1], e, partes[2]);
        }catch(Exception e){
            throw new IllegalArgumentException("Argumentos inválidos");
        }
    }

    /**
     * getter de nombre
     * @return el nombre de la persona
     */
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }


}
