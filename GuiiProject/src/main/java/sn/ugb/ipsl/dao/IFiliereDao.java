/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.dao;

import java.util.List;
import sn.ugb.ipsl.entite.Filiere;

/**
 *
 * @author user
 */
public interface IFiliereDao {

    public List<Filiere> listeFiliere();

    public void delete(String fil);

    public void add( String fil);

    public void modifier(String afil , String nfil );
}
