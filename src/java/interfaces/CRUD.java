
package interfaces;

import java.util.List;
import modelo.rol;


public interface CRUD {
    public List listar();
    public rol list(int id);
    public boolean add(rol rol);
        public boolean editar(rol rol);
            public boolean eliminar(int id);


}
