package com.izidoctor.model.dao;
import com.izidoctor.model.bean.Usuario;

import java.util.List;

public interface UsuarioDao {

    public int insert(Usuario usuario);
    public int update(Usuario usuario);
    public int delete(int id);
    public List<Usuario> findById(int id);

}
