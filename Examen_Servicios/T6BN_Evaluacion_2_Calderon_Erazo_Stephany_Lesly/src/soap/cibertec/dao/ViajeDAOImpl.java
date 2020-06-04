package soap.cibertec.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import soap.cibertec.entidad.Viaje;
import soap.cibertec.interfaces.ViajeDAO;
import soap.cibertec.utils.MysqlDBConexion;

public class ViajeDAOImpl implements ViajeDAO{
	@Override
	public int saveViaje(Viaje bean){
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_saveLibro(?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,bean.getIdViaje());
			cstm.setString(2,bean.getConductor());
			cstm.setString(3,bean.getPlaca());
			cstm.setInt(4,bean.getCanBoletos());
			cstm.setDouble(5,bean.getPrecio());
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
	public List<Viaje> listAllViaje( double pre) {
		List<Viaje> lista=new ArrayList<Viaje>();
		Viaje bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call sp_listAllViaje(?)";
			cstm=cn.prepareCall(sql);
			cstm.setDouble(1, pre);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Viaje();
				bean.setIdViaje(rs.getInt(1));
				bean.setConductor(rs.getString(2));
				bean.setPlaca(rs.getString(3));
				bean.setCanBoletos(rs.getInt(4));
				bean.setPrecio(rs.getDouble(5));
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
