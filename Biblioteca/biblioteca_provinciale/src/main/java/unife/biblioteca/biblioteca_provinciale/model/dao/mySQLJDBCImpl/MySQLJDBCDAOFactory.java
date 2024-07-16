package unife.biblioteca.biblioteca_provinciale.model.dao.mySQLJDBCImpl;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import unife.biblioteca.biblioteca_provinciale.services.config.Configuration;

import unife.biblioteca.biblioteca_provinciale.model.dao.DAOFactory;
import unife.biblioteca.biblioteca_provinciale.model.dao.UserDAO;


public class MySQLJDBCDAOFactory extends DAOFactory {

  private Map factoryParameters;

  private Connection connection;

  public MySQLJDBCDAOFactory(Map factoryParameters) {
    this.factoryParameters=factoryParameters;
  }

  @Override
  public void beginTransaction() {

    try {
      Class.forName(Configuration.DATABASE_DRIVER);
      this.connection = DriverManager.getConnection(Configuration.DATABASE_URL);
      this.connection.setAutoCommit(false);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

  @Override
  public void commitTransaction() {
    try {
      this.connection.commit();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void rollbackTransaction() {

    try {
      this.connection.rollback();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

  @Override
  public void closeTransaction() {
    try {
      this.connection.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public UserDAO getUserDAO() {
    return new UserDAOMySQLJDBCImpl(connection);
  }

}