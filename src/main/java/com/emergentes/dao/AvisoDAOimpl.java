
package com.emergentes.dao;

import com.emergentes.utiles.ConexionDB;
import com.emergentes.modelo.Aviso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author illim
 */
public class AvisoDAOimpl extends ConexionDB implements AvisoDAO {

    @Override
    public void insert(Aviso aviso) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into Aviso (nombre,apellido,seminario,fecha) value(?,?,?,?)");
            ps.setString(1, aviso.getNombre());
            ps.setString(2, aviso.getApellido());
            ps.setString(3, aviso.getSeminario());
             ps.setString(3, aviso.getFecha());
            ps.executeUpdate();
        } catch (Exception e) {
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void update(Aviso aviso) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("update Aviso set nombre = ?, apellido = ?, seminario=?, fecha=?, where id = ?");
            ps.setString(1, aviso.getNombre());
            ps.setString(2, aviso.getApellido());
            ps.setString(3, aviso.getSeminario());
            ps.setString(4, aviso.getFecha());
            ps.setInt(5, aviso.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("delete from Aviso where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Aviso getById(int id) throws Exception {
        Aviso avi = new Aviso();
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("select * from Aviso  where id = ? limit 1");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                avi.setId(rs.getInt("id"));
                avi.setNombre(rs.getString("nombre"));
                avi.setApellido(rs.getString("apellido"));
                avi.setSeminario(rs.getString("seminario"));
                avi.setSeminario(rs.getString("fecha"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return avi;
    }

    @Override
    public List<Aviso> getAll() throws Exception {
        List<Aviso> lista = null;

        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("select * from Aviso");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Aviso>();
            while (rs.next()) {
                Aviso avi = new Aviso();
                avi.setId(rs.getInt("id"));
                avi.setNombre(rs.getString("nombre"));
                avi.setApellido(rs.getString("apellido"));
                 avi.setSeminario(rs.getString("seminario"));
                avi.setSeminario(rs.getString("fecha"));
                
                lista.add(avi);
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
        } finally {
            this.desconectar();
        }
        return lista;

    }

}
