/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.guiiproject;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import sn.ugb.ipsl.entite.Filiere;
import sn.ugb.ipsl.service.FiliereServiceImp;

/**
 *
 * @author user
 */
public class FiliereTableModel extends AbstractTableModel {
    private final List<Filiere> filiere;

    public FiliereTableModel() {
    FiliereServiceImp f = new FiliereServiceImp();
    filiere=f.listeFilieres();
    }

    @Override
    public int getRowCount() {
       return filiere.size();
    }
   
    @Override
    public int getColumnCount() {
       return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Filiere e =filiere.get(rowIndex);
        Object res = null;
        res=e.getNomf();
        return res;
    }
    
    
}
