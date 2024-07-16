package unife.biblioteca.biblioteca_provinciale.model.dao.mySQLJDBCImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import unife.biblioteca.biblioteca_provinciale.model.mo.User;
import unife.biblioteca.biblioteca_provinciale.model.dao.UserDAO;


public class UserDAOMySQLJDBCImpl implements UserDAO {

  private final String COUNTER_ID = "userId";  
  Connection conn;

  public User create(
          Integer userId,
          String email,
          String password,
          String nomeBatt,
          String cognome,
          String codFiscale,
          String numeTelefono,
          String indirizzo,
          String luogoNascita,
          java.sql.Date dataNascita,
          boolean statoAccount,
          boolean notificheAttive) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public UserDAOMySQLJDBCImpl(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void create(Integer userId,
                     String email,
                     String password,
                     String nomeBatt,
                     String cognome,
                     String codFiscale,
                     String numeTelefono,
                     String indirizzo,
                     String luogoNascita,
                     java.sql.Date dataNascita) {
    PreparedStatement ps;
    User user = null;

    try {

      String sql
              = "INSERT INTO utente "
              + "(COD_FISCALE, PASSWORD, EMAIL, N_TELEFONO, INDIRIZZO, LUOGO_NASCITA, DATA_NASCITA, NOME_BATT, COGNOME)"
              + " VALUES "
              + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";

      ps = conn.prepareStatement(sql);
      ps.setString(1, codFiscale);
      ps.setString(2, password);
      ps.setString(3, email);
      ps.setString(4, numeTelefono);
      ps.setString(5, indirizzo);
      ps.setString(6, luogoNascita);
      ps.setDate(7, dataNascita);
      ps.setString(8, nomeBatt);
      ps.setString(9, cognome);

      int p = ps.executeUpdate();

      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
 }

  public void registra(
          Integer userId,
          Integer bibliotecaId,
          Integer bibliotecarioId){

    PreparedStatement ps;
    User user = null;

    try {

      String sql
              = "INSERT INTO viene_registrato_a "
              + "(ID_UTENTE_REGISTRATO, ID_BIBLIOTECA, ID_BIBLIOTECARIO_REGISTRA)"
              + " VALUES "
              + "(?, ?, ?)";

      ps = conn.prepareStatement(sql);
      ps.setInt(1, userId);
      ps.setInt(2, bibliotecaId);
      ps.setInt(3, bibliotecarioId);

      int p = ps.executeUpdate();

      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void delete(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  @Override
  public void update(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void blocca(User user) {
    PreparedStatement ps;

    try {

      String sql
              = "UPDATE utente"
              + "SET STATO_ACCOUNT = 0"
              + "WHERE ID_UTENTE = ?";

      ps = conn.prepareStatement(sql);
      ps.setInt(1, user.getUserId());

      int p = ps.executeUpdate();

      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void sblocca(User user) {
    PreparedStatement ps;

    try {

      String sql
              = "UPDATE utente"
              + "SET STATO_ACCOUNT = 1"
              + "WHERE ID_UTENTE = ?";

      ps = conn.prepareStatement(sql);
      ps.setInt(1, user.getUserId());

      int p = ps.executeUpdate();

      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public User findLoggedUser() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public User findByUserId(Long userId) {

    PreparedStatement ps;
    User user = null;

    try {

      String sql
              = " SELECT * "
              + " FROM utente "
              + " WHERE "
              + " ID_UTENTE = ?";

      ps = conn.prepareStatement(sql);
      ps.setLong(1, userId);

      ResultSet resultSet = ps.executeQuery();

      if (resultSet.next()) {
        user = read(resultSet);
      }
      resultSet.close();
      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return user;

  }

  @Override
  public User findByEmail(String email) {

    PreparedStatement ps;
    User user = null;

    try {

      String sql
              = " SELECT * "
              + " FROM utente "
              + " WHERE EMAIL = ?";

      ps = conn.prepareStatement(sql);
      ps.setString(1, email);

      ResultSet resultSet = ps.executeQuery();

      if (resultSet.next()) {
        user = read(resultSet);
      }
      resultSet.close();
      ps.close();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return user;

  }  
  
  User read(ResultSet rs) {
    
    User user = new User();
    try {
      user.setUserId(rs.getInt("ID_UTENTE"));
    } catch (SQLException sqle) {
    }
    try {
      user.setEmail(rs.getString("EMAIL"));
    } catch (SQLException sqle) {
    }
    try {
      user.setPassword(rs.getString("PASSWORD"));
    } catch (SQLException sqle) {
    }
    try {
      user.setNomeBatt(rs.getString("NOME_BATT"));
    } catch (SQLException sqle) {
    }
    try {
      user.setCognome(rs.getString("COGNOME"));
    } catch (SQLException sqle) {
    }
    try {
      user.setCodFiscale(rs.getString("COD_FISCALE"));
    } catch (SQLException sqle) {
    }
    try {
      user.setNumTelefono(rs.getString("N_TELEFONO"));
    } catch (SQLException sqle) {
    }
    try {
      user.setIndirizzo(rs.getString("INDIRIZZO"));
    } catch (SQLException sqle) {
    }
    try {
      user.setLuogoNascita(rs.getString("LUOGO_NASCITA"));
    } catch (SQLException sqle) {
    }
    try {
      user.setDataNascita(rs.getDate("DATA_NASCITA"));
    } catch (SQLException sqle) {
    }
    try {
      Integer s = (Integer)rs.getInt("STATO_ACCOUNT");
      user.setStatoAccount(s.equals(1));
    } catch (SQLException sqle) {
    }
    try {
      Integer s = (Integer)rs.getInt("NOTIFICHE_ATTIVE");
      user.setNotificheAttive(s.equals(1));
    } catch (SQLException sqle) {
    }
    return user;
  }

}
