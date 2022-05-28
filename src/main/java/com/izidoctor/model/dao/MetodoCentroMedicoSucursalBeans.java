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
    @Inject
    private MetodoCentroMedicoEspecialidadBeans metodoCentroMedicoEspecialidadBeans;
    private ArrayList<SelectItem> cmbCMS = null;
    private int idCentroMedicoSucursal = 0;


    
    public MetodoCentroMedicoSucursalBeans() {
    }

    //public ArrayList<CentroMedicoBeans> getListaCentroMedico()  {
    public void getCargaCMS(int idCentroMedico)  {
        if (cmbCMS == null){
            cmbCMS = new ArrayList<>();
          
            for (CentroMedicoSucursalBeans centroMedicoSucursalBeans : getSucursalxCentroMedico(idCentroMedico)) {
                SelectItem u=new SelectItem(centroMedicoSucursalBeans.getIdCentroMedicoSucursal(),centroMedicoSucursalBeans.getReferencia());
                cmbCMS.add(u);
            }     
        }        
    }
   
    public ArrayList<CentroMedicoSucursalBeans> getCentroSucursalAll(){
            ArrayList<CentroMedicoSucursalBeans> lst = new ArrayList<CentroMedicoSucursalBeans>();
            ConnectionDB cn=new ConnectionDB();
            try {
                Statement sql=cn.getConnection().createStatement();
                ResultSet rs=(ResultSet) sql.executeQuery("SELECT idCentroMedicoSucursal, referencia, idcentromedico from centromedicosucursal");
                while(rs.next()){
                    CentroMedicoSucursalBeans cmbs= new CentroMedicoSucursalBeans();
                    cmbs.setIdCentroMedicoSucursal(rs.getInt(1));
                    cmbs.setReferencia(rs.getString(2));
                    cmbs.setIndicadorActivo(rs.getInt(3));
                    
                    lst.add(cmbs);
                }      
                
            }catch(Exception e){ 

            }

        return lst;
    }
    
    public ArrayList<CentroMedicoSucursalBeans> getSucursalxCentroMedico(int idCentroMedico)  {
        
            ArrayList<CentroMedicoSucursalBeans> lst = new ArrayList<CentroMedicoSucursalBeans>();
            ConnectionDB cn=new ConnectionDB();
            try {
                Statement sql=cn.getConnection().createStatement();
                String consulta = "Select idCentroMedicoSucursal, referencia, idcentromedico from centromedicosucursal where idcentromedico = "+idCentroMedico;
                ResultSet rs=(ResultSet) sql.executeQuery(consulta);
                while(rs.next()){
                    CentroMedicoSucursalBeans cmbs= new CentroMedicoSucursalBeans();
                    cmbs.setIdCentroMedicoSucursal(rs.getInt(1));
                    cmbs.setReferencia(rs.getString(2));
                    cmbs.setIndicadorActivo(rs.getInt(3));
                    
                    lst.add(cmbs);
                }      
                
            }catch(Exception e){ 
                System.out.println(e.getMessage());
            }

        return lst;
            
           
    }
    
    public void obtenerCentroMedicoSucursal(){
         try {
                metodoCentroMedicoEspecialidadBeans.getCmbCME(idCentroMedicoSucursal);
                System.out.println("Entra CentroMedicoSucursal "+idCentroMedicoSucursal);
            } catch (Exception e) {
                System.out.println("no llego Especialidad "+idCentroMedicoSucursal);
            }
    }
    public ArrayList<SelectItem> getCmbCMS() {
        return cmbCMS;
    }

    public void setCmbCMS(ArrayList<SelectItem> cmbCMS) {
        this.cmbCMS = cmbCMS;
    }
    
        public MetodoCentroMedicoEspecialidadBeans getMetodoCentroMedicoEspecialidadBeans() {
        return metodoCentroMedicoEspecialidadBeans;
    }

    public void setMetodoCentroMedicoEspecialidadBeans(MetodoCentroMedicoEspecialidadBeans metodoCentroMedicoEspecialidadBeans) {
        this.metodoCentroMedicoEspecialidadBeans = metodoCentroMedicoEspecialidadBeans;
    }

    public int getIdCentroMedicoSucursal() {
        return idCentroMedicoSucursal;
    }

    public void setIdCentroMedicoSucursal(int idCentroMedicoSucursal) {
        this.idCentroMedicoSucursal = idCentroMedicoSucursal;
    }
    
}
