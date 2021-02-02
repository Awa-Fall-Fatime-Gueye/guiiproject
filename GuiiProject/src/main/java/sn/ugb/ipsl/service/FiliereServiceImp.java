/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.dao.FiliereDaoImp;
import sn.ugb.ipsl.entite.Filiere;

/**
 *
 * @author user
 */
public class FiliereServiceImp implements IFiliereService{
      private final FiliereDaoImp filieredao=new FiliereDaoImp();
      
      
    @Override
    public List<Filiere> listeFilieres() {
       return filieredao.listeFiliere();
    }


    @Override
    public void add(String fil) {
       filieredao.add(fil);
    }

    @Override
    public void modifier(String nfil , String afil) {
        filieredao.modifier(nfil, afil);
    }

    @Override
    public void delete(String fil) {
       filieredao.delete(fil);
    }
    
}
