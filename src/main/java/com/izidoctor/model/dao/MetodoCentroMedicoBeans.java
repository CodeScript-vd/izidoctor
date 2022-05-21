package com.izidoctor.model.dao;

import com.izidoctor.model.bean.CentroMedicoBeans;
import com.izidoctor.util.ConnectionDB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import javax.inject.Inject;

@Named(value = "metodoCentroMedicoBeans")
@RequestScoped
public class MetodoCentroMedicoBeans {
    

    @Inject
    private CentroMedicoBeans cenm;    
    private ArrayList<SelectItem> cmbCM = null;
    public MetodoCentroMedicoBeans() {
    }

    //public ArrayList<CentroMedicoBeans> getListaCentroMedico()  {
    public ArrayList<SelectItem> getCmbCM()  {
        if (cmbCM == null){
            cmbCM = new ArrayList<>();
            //ArrayList<CentroMedicoBeans> data=new ArrayList<>();
           //ArrayList<SelectItem> data=new ArrayList<>();
            ConnectionDB cn=new ConnectionDB();
            try {
                Statement sql=cn.getConnection().createStatement();
                ResultSet rs=(ResultSet) sql.executeQuery("SELECT idCentroMedico,nombre,indicadorActivo FROM centromedico");
                while(rs.next()){
                    //CentroMedicoBeans u=new CentroMedicoBeans(rs.getInt(1),rs.getString(2),                
                    SelectItem u=new SelectItem(rs.getInt(1),rs.getString(2));                
                    cmbCM.add(u);
                }      
                
            }catch(Exception e){ 

            }

            
        }
        return cmbCM;
    }
}
