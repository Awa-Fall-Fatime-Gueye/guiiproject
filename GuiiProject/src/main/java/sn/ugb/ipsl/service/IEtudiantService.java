/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.entite.Etudiant;

/**
 *
 * @author user
 */
public interface IEtudiantService {

    public List<Etudiant> listeEtudiant();

    public void add(Etudiant etu);

    public void add(List<Etudiant> etudiants);

    public List<Etudiant> listEtudiant(String fil);

    public List<Etudiant> listEtudiant(String niveau, String fil);

}
