package unife.biblioteca.biblioteca_provinciale.model.dao;

import unife.biblioteca.biblioteca_provinciale.model.dao.mySQLJDBCImpl.MySQLJDBCDAOFactory;
import unife.biblioteca.biblioteca_provinciale.model.dao.CookieImpl.CookieDAOFactory;

import java.util.Map;

public abstract class DAOFactory {

  // List of DAO types supported by the factory
  public static final String MYSQLJDBCIMPL = "MySQLJDBCImpl";
  public static final String COOKIEIMPL= "CookieImpl";

  public abstract void beginTransaction();
  public abstract void commitTransaction();
  public abstract void rollbackTransaction();
  public abstract void closeTransaction();
  
  public abstract UserDAO getUserDAO();


  public static DAOFactory getDAOFactory(String whichFactory,Map factoryParameters) {

    if (whichFactory.equals(MYSQLJDBCIMPL)) {
      return new MySQLJDBCDAOFactory(factoryParameters);
    } else if (whichFactory.equals(COOKIEIMPL)) {
      return new CookieDAOFactory(factoryParameters);
    } else {
      return null;
    }
  }
}

