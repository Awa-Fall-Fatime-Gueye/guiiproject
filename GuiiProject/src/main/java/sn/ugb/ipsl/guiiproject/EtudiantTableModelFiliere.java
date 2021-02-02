/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.guiiproject;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sn.ugb.ipsl.entite.Etudiant;
import sn.ugb.ipsl.service.EtudiantServiceImp;

/**
 *
 * @author user
 */
public class EtudiantTableModelFiliere extends AbstractTableModel {

    private  final List<Etudiant> etudiant;

    public EtudiantTableModelFiliere(String fil) {
        EtudiantServiceImp etudiantService = new EtudiantServiceImp();
        etudiant = etudiantService.listEtudiant(fil);
    }

    @Override
    public int getRowCount() {
        return etudiant.size();

    }

    @Override
    public int getColumnCount() {
        return 6;
    }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex   ) {
         Etudiant e = etudiant.get(rowIndex);
            Object res = null;
            switch (columnIndex) {
                case 0:
                    res = e.getId();
                    break;
                case 1:
                    res = e.getPrenom();
                    break;

                case 2:
                    res = e.getNom();
                    break;

                case 3:
                    res = e.getDatenaiss();
                    break;
                case 4:
                    res = e.getNiveau();
                    break;
                case 5:
                    res = e.getFiliere();
                    break;
            }
            return res;

        }

    }
