package Data.Mysql;

import Data.ConnectionMysql;
import Data.IDataBaseEstudiante;
import Model.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MysqlEstudianteImp implements IDataBaseEstudiante {

    @Override
    public void save(Estudiante model) {
        String sql = "insert into estudiantes values(default, ?, ?, ?, ?)";
        Connection conn = null;
        try {
            conn = ConnectionMysql.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, model.getCi());
            statement.setString(2, model.getNombre());
            statement.setString(3, model.getApellido());
            statement.setString(4, model.getTelefono());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Estudiante> getAll() {
        return Collections.emptyList();
    }

    @Override
    public Estudiante getByCode(String code) {
        return null;
    }

    @Override
    public List<Estudiante> getByTipo(String tipoEstduiante) {
        return null;
    }
}
