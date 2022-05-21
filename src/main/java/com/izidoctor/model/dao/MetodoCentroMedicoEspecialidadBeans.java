package com.izidoctor.model.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import com.izidoctor.model.bean.CentroMedicoEspecialidadBeans;
import com.izidoctor.util.ConnectionDB;


@Named(value = "metodoCentroMedicoEspecialidadBeans")
@RequestScoped
public class MetodoCentroMedicoEspecialidadBeans {

    @Inject
    private CentroMedicoEspecialidadBeans cme;
    private ArrayList<SelectItem> cmbCME = null;
    
    
    public MetodoCentroMedicoEspecialidadBeans() {
    }
    //public ArrayList<CentroMedicoBeans> getListaCentroMedico()  {
    public ArrayList<SelectItem> getCmbCME()  {
        if (cmbCME == null){
            cmbCME = new ArrayList<>();
            //ArrayList<CentroMedicoBeans> data=new ArrayList<>();
           //ArrayList<SelectItem> data=new ArrayList<>();
            ConnectionDB cn=new ConnectionDB();
            try {
                Statement sql=cn.getConnection().createStatement();
                ResultSet rs=(ResultSet) sql.executeQuery("Select idEspecialidad, nombre, idCentroMedicoSucursal from especialidadsucursal");
                while(rs.next()){
                    //CentroMedicoBeans u=new CentroMedicoBeans(rs.getInt(1),rs.getString(2),                
                    SelectItem u=new SelectItem(rs.getInt(1),rs.getString(2));                
                    cmbCME.add(u);
                }                      
            }catch(Exception e){ 

            }            
        }
        return cmbCME;
    }
}
