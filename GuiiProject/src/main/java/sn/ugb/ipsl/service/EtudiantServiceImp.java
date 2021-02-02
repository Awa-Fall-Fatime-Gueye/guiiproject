/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.dao.EtudiantDaoImp;
import sn.ugb.ipsl.entite.Etudiant;

/**
 *
 * @author user
 */
public class EtudiantServiceImp  implements IEtudiantService{
     private final EtudiantDaoImp etudiantdao=new EtudiantDaoImp();


    @Override
    public List<Etudiant> listeEtudiant() {
        return etudiantdao.listeEtudiant();
    }

    @Override
    public void add(Etudiant etu) {
     etudiantdao.add(etu);
    }

   @Override
    public void add(List<Etudiant> etudiants) {
    for(Etudiant etudiant :etudiants){
        etudiantdao.add(etudiant);
    }
    }

    @Override
    public List<Etudiant> listEtudiant(String fil) {
       return etudiantdao.listeEtudiant(fil);
       
    }

    @Override
    public List<Etudiant> listEtudiant(String niveau, String fil) {
        return etudiantdao.listeEtudiant(niveau , fil);
    }

  
}
