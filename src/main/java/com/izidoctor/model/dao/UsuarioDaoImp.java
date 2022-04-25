package com.izidoctor.model.dao;

import com.izidoctor.model.bean.Usuario;
import com.izidoctor.util.ConnectionDB;
import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImp implements UsuarioDao {

    private ConnectionImpl connection = ConnectionDB.getConnection();

    /**
     * @param usuario
     * @return
     */
    @Override
    public int insert(Usuario usuario) {
        try {
            connection.setAutoCommit(false);
            String query = "INSERT INTO PERSONA (" +
                    "NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, MOVIL, CORREO, FECHANACIMIENTO, IDPAISNACIONALIDAD, nroDocumento, idTipoDocumento)" +
                    " VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement nuevaPersona = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            nuevaPersona.setString(1, usuario.getNombre().toUpperCase());
            nuevaPersona.setString(2, usuario.getApellidoPaterno().toUpperCase());
            nuevaPersona.setString(3, usuario.getApellidoMaterno().toUpperCase());
            nuevaPersona.setString(4, usuario.getCelular());
            nuevaPersona.setString(5, usuario.getCorreo());
            nuevaPersona.setDate(6, (Date) usuario.getFechaNacimieno());
            nuevaPersona.setInt(7, usuario.getIdPaisNacionalidad());
            nuevaPersona.setString(8, usuario.getNroDocumento());
            nuevaPersona.setInt(9, usuario.getIdTipoDocumento());
            nuevaPersona.executeUpdate();
            ResultSet idGenerado = nuevaPersona.getGeneratedKeys();
            nuevaPersona.getGeneratedKeys();
            idGenerado.next();
            int id = idGenerado.getInt(1);
            String insertUsuario = "INSERT INTO USUARIO (IDPERSONA, CONTRASENIA) VALUES (?,?)";
            PreparedStatement nuevoUsuario = connection.prepareStatement(insertUsuario);
            nuevoUsuario.setInt(1, id);
            nuevoUsuario.setString(2, usuario.getContrasenia());
            nuevoUsuario.executeUpdate();
            connection.commit();
            nuevoUsuario.close();
            connection.close();
            return 1;
        } catch (Exception e) {
            System.out.println("exception: " +e);
            try {
                connection.rollback();
                connection.close();
            } catch (SQLException ex) {
                System.out.println("sqlexception: " + ex);
                throw new RuntimeException(ex);
            }
            return 0;
        }
    }

    /**
     * @param usuario
     * @return
     */
    @Override
    public int update(Usuario usuario) {
        try {
            connection.setAutoCommit(false);
            String query = "UPDATE persona " +
                    "SET  nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, movil = ?, correo = ?, fechaNacimiento = ?, nroDocumento = ?, idTipoDocumento = ? " +
                    "WHERE idPersona = " + usuario.getIdUsuario();
            PreparedStatement updatePersona = connection.prepareStatement(query);
            updatePersona.setString(1, usuario.getNombre());
            updatePersona.setString(2, usuario.getApellidoPaterno());
            updatePersona.setString(3, usuario.getApellidoMaterno());
            updatePersona.setString(4, usuario.getCelular());
            updatePersona.setString(5, usuario.getCorreo());
            updatePersona.setDate(6, (Date) usuario.getFechaNacimieno());
            updatePersona.setString(7, usuario.getNroDocumento());
            updatePersona.setInt(8, usuario.getIdTipoDocumento());
            updatePersona.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error update usuario: " + e);
            return 0;
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int delete(int id) {
        return 0;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<Usuario> findById(int id) {
        try {
            String query = "SELECT * FROM usuario usu INNER JOIN persona p on p.idPersona = usu.idPersona WHERE usu.idPersona = " + id;
            PreparedStatement findUsuario = connection.prepareStatement(query);
            ResultSet dataUser = findUsuario.executeQuery();
            List<Usuario> lista = new ArrayList<>();
            while (dataUser.next()) {
                Usuario rowUsuario = new Usuario();
                rowUsuario.setIdUsuario(dataUser.getInt("idUsuario"));
                rowUsuario.setNombre(dataUser.getString("nombre"));
                rowUsuario.setApellidoPaterno(dataUser.getString("apellidoPaterno"));
                rowUsuario.setApellidoMaterno(dataUser.getString("apellidoMaterno"));
                rowUsuario.setCelular(dataUser.getString("movil"));
                rowUsuario.setCorreo(dataUser.getString("correo"));
                rowUsuario.setFechaNacimieno(dataUser.getDate("fechaNacimiento"));
                rowUsuario.setIdUsuario(dataUser.getInt("idPaisNacionalidad"));
                rowUsuario.setNroDocumento(dataUser.getString("nroDocumento"));
                rowUsuario.setIdTipoDocumento(dataUser.getInt("idTipoDocumento"));
                rowUsuario.setIndActivo(dataUser.getInt("indicadorActivo"));
                rowUsuario.setIndEliminado(dataUser.getInt("indicadorEliminado"));
                rowUsuario.setIntentosFallidos(dataUser.getInt("intentosFallidos"));
                lista.add(rowUsuario);
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Find id: " + e);
        }
        return null;
    }

    public static void main(String[] args) {
        /*Usuario usuario = new Usuario();
        usuario.setNombre("Angel");
        usuario.setApellidoPaterno("Diaz");
        usuario.setApellidoMaterno("Saravia");
        usuario.setContrasenia("123456");
        usuario.setCelular("997783239");
        usuario.setFechaNacimieno(new Date(122, 3, 11));
        usuario.setCorreo("vdiazd.2192@gmail.com");
        usuario.setIdPaisNacionalidad(1);
        usuario.setNroDocumento("72660612");
        usuario.setIdTipoDocumento(1);
        UsuarioDaoImp usuarioDao = new UsuarioDaoImp();
        int success = usuarioDao.insert(usuario);
        System.out.println(success);*/
        UsuarioDaoImp dao = new UsuarioDaoImp();
        List<Usuario> usuarios = dao.findById(5);
        System.out.println(usuarios);
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            System.out.println(usuario.getIdUsuario());
            System.out.println(usuario.getNombre());
            System.out.println(usuarios.get(i));
        }
    }
}
