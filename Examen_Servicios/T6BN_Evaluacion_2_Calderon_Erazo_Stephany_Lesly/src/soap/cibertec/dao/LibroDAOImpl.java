package soap.cibertec.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import soap.cibertec.entidad.Libro;
import soap.cibertec.interfaces.LibroDAO;
import soap.cibertec.utils.MysqlDBConexion;
public class LibroDAOImpl implements LibroDAO{
	@Override
	public int saveLibro(Libro bean){
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_saveLibro(?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getTitulo());
			cstm.setDouble(2,bean.getPrecio());
			cstm.setInt(3,bean.getCantidad());
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public List<Libro> listAllLibro( int can) {
		List<Libro> lista=new ArrayList<Libro>();
		Libro bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_listAllLibro(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1, can);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Libro();
				bean.setCodigo(rs.getInt(1));
				bean.setTitulo(rs.getString(2));
				bean.setPrecio(rs.getDouble(3));
				bean.setCantidad(rs.getInt(4));
				lista.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

}


