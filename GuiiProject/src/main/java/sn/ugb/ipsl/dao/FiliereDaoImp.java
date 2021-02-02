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
import sn.ugb.ipsl.entite.Filiere;

/**
 *
 * @author user
 */
public class FiliereDaoImp implements IFiliereDao {

    @Override
    public  List<Filiere> listeFiliere() {
      String requete="select * from filiere";
       ResultSet list=null; 
       List<Filiere> list1 = new ArrayList();
        try {
            Statement st=DbUtils.getConnection().createStatement();
            list=st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (list.next()) {
                String nom = list.getString("nomF");
                list1.add(new Filiere(nom));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list1;
    }

    @Override
    public void delete(String fil) {
         try {
            Statement st=DbUtils.getConnection().createStatement();
            st.executeUpdate("delete from filiere where nomF='"+fil+"' ");
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void add(String fil) {
     
        String requete="insert into filiere (nomF) values ('"+fil+"')";
        try {
            Statement st=DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }

    @Override
    public void modifier(String nfil , String afil) {
        
        String requete="update filiere set nomF='"+nfil+"' where nomF='"+afil+"' ";
        try {
            Statement st=DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    
}
