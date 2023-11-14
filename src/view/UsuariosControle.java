/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
=======

>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
/**
 *
 * @author u05682855140
 */
public class UsuariosControle extends AbstractTableModel {
<<<<<<< HEAD
<<<<<<< HEAD

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public GasUsuarios getbean(int linha) {
        return (GasUsuarios) lista.get(linha);

    }

    @Override
    public int getRowCount() {
        return lista.size();
=======
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }

    public GasUsuarios getbean(int linha){
    return (GasUsuarios) lista.get(linha);
        
    }
    
    
    @Override
    public int getRowCount() {
       return lista.size();
<<<<<<< HEAD
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GasUsuarios gasUsuarios = (GasUsuarios) lista.get(rowIndex);
<<<<<<< HEAD
<<<<<<< HEAD
        if (columnIndex == 0) {
            return gasUsuarios.getGasIdusuarios();
        }
        if (columnIndex == 1) {
            return gasUsuarios.getGasNome();
        }
        if (columnIndex == 2) {
            return gasUsuarios.getGasApelido();
        }
        if (columnIndex == 3) {
            return gasUsuarios.getGasAtivo();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "Ativo";
        }
        return "";
=======
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
         if(columnIndex == 0){
           return gasUsuarios.getGasIdusuarios();
       } 
         if(columnIndex == 1){
           return gasUsuarios.getGasNome();
       } 
         if(columnIndex == 2){
           return gasUsuarios.getGasApelido();
       } 
         if(columnIndex == 3){
           return gasUsuarios.getGasCpf();
       } 
         
           return "";
    }
    
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == 0){
           return "ID";
       } 
       if(columnIndex == 1){
           return "Nome";
       } 
       if(columnIndex == 2){
           return "Apelido";
       } 
       if(columnIndex == 3){
           return "Cpf";
       } 
       return "";
<<<<<<< HEAD
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
=======
>>>>>>> 73bfd72e5a9a447735fa1425ee65e26daf609117
    }
}
