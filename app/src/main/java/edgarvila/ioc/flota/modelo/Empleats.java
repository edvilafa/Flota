package edgarvila.ioc.flota.modelo;

public class Empleats {


    String nom;
    String cognoms;
    String dni;
    String categoria;
    String contrasenya;
    int id_empresa;
    Boolean administrador;

    public Empleats() {
    }

    public Empleats(String nom, String cognoms, String dni, String categoria) {
        //this.id_empresa = id_empresa;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.categoria = categoria;
    }

    public Empleats(String nom, String contrasenya){
        this.nom = nom;
        this.contrasenya = contrasenya;

    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }



}
