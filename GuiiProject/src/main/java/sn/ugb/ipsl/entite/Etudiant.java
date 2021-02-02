/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.entite;

/**
 *
 * @author user
 */
public class Etudiant {
    int Id;
    String prenom;
    String nom;
     String datenaiss;
     String niveau;
      String filiere;

    public Etudiant() {
    }
      

    public Etudiant(int Id, String prenom, String nom, String niveau, String datenaiss, String filiere) {
        this.Id = Id;
        this.prenom = prenom;
        this.nom = nom;
        this.datenaiss = datenaiss;
        this.niveau = niveau;
        this.filiere = filiere;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(String datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    
}
