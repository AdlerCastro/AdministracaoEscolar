package Interface;

import java.sql.SQLException;

public interface InterfaceDAO {
    
    public void salvarDAO(Object... valor);
    public void excluirDAO(Object... valor);
    public void consultarDAO(Object... valor) throws SQLException;
    
}
