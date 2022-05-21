package com.izidoctor.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import com.izidoctor.model.bean.CentroMedicoSucursalBeans;

import com.izidoctor.util.ConnectionDB;


@Named(value = "metodoCentroMedicoSucursalBeans")
@Dependent
public class MetodoCentroMedicoSucursalBeans {

   
    @Inject
    private CentroMedicoSucursalBeans cenms;    
    private ArrayList<SelectItem> cmbCMS = null;
    public MetodoCentroMedicoSucursalBeans() {
    }

    //public ArrayList<CentroMedicoBeans> getListaCentroMedico()  {
    public ArrayList<SelectItem> getCmbCM()  {
        if (cmbCMS == null){
            cmbCMS = new ArrayList<>();
            //ArrayList<CentroMedicoBeans> data=new ArrayList<>();
           //ArrayList<SelectItem> data=new ArrayList<>();
            ConnectionDB cn=new ConnectionDB();
            try {
                Statement sql=cn.getConnection().createStatement();
                ResultSet rs=(ResultSet) sql.executeQuery("Select idCentroMedicoSucursal, referencia, idcentromedico from centromedicosucursal");
                while(rs.next()){
                    //CentroMedicoBeans u=new CentroMedicoBeans(rs.getInt(1),rs.getString(2),                
                    SelectItem u=new SelectItem(rs.getInt(1),rs.getString(2));                
                    cmbCMS.add(u);
                }      
                
            }catch(Exception e){ 

            }

            
        }
        return cmbCMS;
    }
}
