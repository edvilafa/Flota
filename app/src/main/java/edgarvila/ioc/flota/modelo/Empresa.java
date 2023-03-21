package edgarvila.ioc.flota.modelo;

public class Empresa {

    int id_empresa;
    String nom;
    String ciutat;
    String direccio;
    String cif;

    public Empresa(int id_empresa, String nom, String ciutat, String direccio, String cif) {
        this.id_empresa = id_empresa;
        this.nom = nom;
        this.ciutat = ciutat;
        this.direccio = direccio;
        this.cif = cif;
    }



    public Empresa() {
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

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }




}

