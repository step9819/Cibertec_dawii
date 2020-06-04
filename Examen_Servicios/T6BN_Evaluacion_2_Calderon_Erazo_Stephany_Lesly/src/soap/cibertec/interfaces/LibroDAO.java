package soap.cibertec.interfaces;
import java.util.List;
import soap.cibertec.entidad.Libro;
public interface LibroDAO {
	
	public int saveLibro(Libro bean);
	
	public List<Libro> listAllLibro( int can);
}


