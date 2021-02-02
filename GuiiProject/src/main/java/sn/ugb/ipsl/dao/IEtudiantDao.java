/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.dao;

import java.util.List;
import sn.ugb.ipsl.entite.Etudiant;


/**
 *
 * @author user
 */
public interface IEtudiantDao {
     public List<Etudiant> listeEtudiant();
     public void add(Etudiant e);
     public  List<Etudiant> listeEtudiant (String fil);
     public  List<Etudiant> listeEtudiant(String niveau , String fil);
    
}
