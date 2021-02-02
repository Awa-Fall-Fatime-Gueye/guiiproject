/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.ugb.ipsl.entite.Etudiant;

/**
 *
 * @author user
 */
public class EtudiantDaoImp implements IEtudiantDao {

    public EtudiantDaoImp() {
    }
    
    

    @Override
    public List<Etudiant> listeEtudiant() {
        String requete = "select * from etudiant";
        ResultSet list = null;
        List<Etudiant> list1 = new ArrayList<>();
        try {
            Statement st = DbUtils.getConnection().createStatement();
            list = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (list.next()) {
                int id = list.getInt("Id");
                String prenom = list.getString("prenom");
                String nom = list.getString("nom");
                String datenaiss = list.getString("datenaissance");
                String niveau = list.getString("niveau");
                String filiere = list.getString("filiere");
                
                list1.add(new Etudiant(id, prenom, nom, datenaiss, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list1;
    }

    @Override
    public void add(Etudiant e) {
        int id = e.getId();
        String prenom = e.getPrenom();
        String nom = e.getNom();
        String datenaiss = e.getDatenaiss();
        String niveau = e.getNiveau();
        String filiere = e.getFiliere();
        String requete = "insert into etudiant (ID , PRENOM,NOM,DATENAISSANCE,NIVEAU,filiere) values (" + id + ", '" + prenom + "','" + nom + "' ,'" + datenaiss + "','" + niveau + "' , '" + filiere + "' )";
        try {
            Statement st = DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Etudiant> listeEtudiant(String fil) {
        String requete ="select * from etudiant where filiere='"+fil+"'";
        ResultSet lst = null;
        List<Etudiant> fi=new ArrayList<>();
        try{
            Statement st = DbUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        }catch(Exception ex){
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE , null , ex);
        }
         try {
            while (lst.next()) {
                int id = lst.getInt("Id");
                String prenom = lst.getString("prenom");
                String nom = lst.getString("nom");
                String datenaiss = lst.getString("datenaissance");
                String niveau = lst.getString("niveau");
                String filiere = lst.getString("filiere");
                
                fi.add(new Etudiant(id, prenom, nom, datenaiss, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fi;
         
        }

    

    @Override
    public List<Etudiant> listeEtudiant(String niveau, String fil) {
String requete = "select * from etudiant where filiere='"+fil+"' and niveau='"+niveau+"'";
        ResultSet lst = null;
        List<Etudiant> fii=new ArrayList<>();
        try{
            Statement st = DbUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        }catch(Exception ex){
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE , null , ex);
        }
         try {
            while (lst.next()) {
                int id = lst.getInt("Id");
                String prenom = lst.getString("prenom");
                String nom = lst.getString("nom");
                String datenaiss = lst.getString("datenaissance");
                String Niveau = lst.getString("niveau");
                String filiere = lst.getString("filiere");
                
                fii.add(new Etudiant(id, prenom, nom, datenaiss, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fii;
         
    
        }
}
