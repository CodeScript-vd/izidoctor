package com.izidoctor.model.dao;

import com.izidoctor.model.bean.CentroMedicoBeans;
import com.izidoctor.util.ConnectionDB;
import java.sql.PreparedStatement;
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
    @Inject
    private MetodoCentroMedicoSucursalBeans metodoCentroMedicoSucursalBeans;
    
    private ArrayList<SelectItem> cmbCM = null;
    private int idCentroMedico = 0;

    public MetodoCentroMedicoSucursalBeans getMetodoCentroMedicoSucursalBeans() {
        return metodoCentroMedicoSucursalBeans;
    }

    public void setMetodoCentroMedicoSucursalBeans(MetodoCentroMedicoSucursalBeans metodoCentroMedicoSucursalBeans) {
        this.metodoCentroMedicoSucursalBeans = metodoCentroMedicoSucursalBeans;
    }
       
    public MetodoCentroMedicoBeans() {
    }
    public ArrayList<CentroMedicoBeans> getCentroMedicoAll(){
            ArrayList<CentroMedicoBeans> lst = new ArrayList<CentroMedicoBeans>();
            ConnectionDB cn=new ConnectionDB();
            try {
                Statement sql=cn.getConnection().createStatement();
                ResultSet rs=(ResultSet) sql.executeQuery("SELECT idCentroMedico,nombre,indicadorActivo FROM centromedico");
                while(rs.next()){
                    CentroMedicoBeans cmb= new CentroMedicoBeans();
                    cmb.setIdCentroMedico(rs.getInt(1));
                    cmb.setNombre(rs.getString(2));
                    cmb.setIndicadorActivo(rs.getInt(3));
                    
                    lst.add(cmb);
                }      
                
            }catch(Exception e){ 

            }

        return lst;
    }
    
    
    public ArrayList<SelectItem> getComboCM()  {
        if (cmbCM == null){
            cmbCM = new ArrayList<>();
            
            for (CentroMedicoBeans centroMedicoBeans : getCentroMedicoAll()) {
                SelectItem u=new SelectItem(centroMedicoBeans.getIdCentroMedico(),centroMedicoBeans.getNombre());
                cmbCM.add(u);
            }            
            
        }
        return cmbCM;
    }

    public void obtenerCentroMedico(){
         try {
                metodoCentroMedicoSucursalBeans.getCargaCMS(idCentroMedico);
            
            } catch (Exception e) {
                System.out.println("no llego "+idCentroMedico);
            }
    }

    public int getIdCentroMedico() {
        return idCentroMedico;
    }

    public void setIdCentroMedico(int idCentroMedico) {
        this.idCentroMedico = idCentroMedico;
    }
    
    public ArrayList<SelectItem> getCmbCM() {
        return cmbCM;
    }

    public void setCmbCM(ArrayList<SelectItem> cmbCM) {
        this.cmbCM = cmbCM;
    }  
    
    public void insertar(){
        ConnectionDB cn=new ConnectionDB();
        try{
            PreparedStatement psta=cn.getConnection().
                    prepareStatement("insert into centromedico values(?,?,?)");
            psta.setInt(1,cenm.getIdCentroMedico());
            psta.setString(2,cenm.getNombre());
            psta.setInt(3,cenm.getIndicadorActivo());
       
            psta.executeUpdate();
        }catch(Exception e){}
    
    
    }
    public void eliminar(){
        ConnectionDB cn=new ConnectionDB();
        try{
            PreparedStatement psta=cn.getConnection().
                    prepareStatement("delete from centromedico where idCentroMedico=?");
            psta.setInt(1,cenm.getIdCentroMedico());            
            psta.executeUpdate();
        }catch(Exception e){}
    
    
    }
    
}
