package unife.biblioteca.biblioteca_provinciale.model.dao.CookieImpl;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import unife.biblioteca.biblioteca_provinciale.model.dao.UserDAO;
import unife.biblioteca.biblioteca_provinciale.model.mo.User;


public class UserDAOCookieImpl implements UserDAO {

  HttpServletRequest request;
  HttpServletResponse response;

  public UserDAOCookieImpl(HttpServletRequest request, HttpServletResponse response) {
    this.request = request;
    this.response = response;
  }

  @Override
  public User create(Integer userId,
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

    User loggedUser = new User();
    loggedUser.setUserId(userId);
    loggedUser.setEmail(email);
    loggedUser.setNomeBatt(nomeBatt);
    loggedUser.setCognome(cognome);
    loggedUser.setCodFiscale(codFiscale);
    loggedUser.setNumTelefono(numeTelefono);
    loggedUser.setIndirizzo(indirizzo);
    loggedUser.setLuogoNascita(luogoNascita);
    loggedUser.setDataNascita(dataNascita);
    loggedUser.setStatoAccount(statoAccount);
    loggedUser.setNotificheAttive(notificheAttive);

    Cookie cookie;
    cookie = new Cookie("loggedUser", encode(loggedUser));
    cookie.setPath("/");
    response.addCookie(cookie);

    return loggedUser;

  }

  @Override
  public void create(
          Integer userId,
          String email,
          String password,
          String nomeBatt,
          String cognome,
          String codFiscale,
          String numeTelefono,
          String indirizzo,
          String luogoNascita,
          java.sql.Date dataNascita){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  @Override
  public void update(User loggedUser) {

    Cookie cookie;
    cookie = new Cookie("loggedUser", encode(loggedUser));
    cookie.setPath("/");
    response.addCookie(cookie);

  }

  @Override
  public void delete(User loggedUser) {

    Cookie cookie;
    cookie = new Cookie("loggedUser", "");
    cookie.setMaxAge(0);
    cookie.setPath("/");
    response.addCookie(cookie);

  }

  @Override
  public User findLoggedUser() {

    Cookie[] cookies = request.getCookies();
    User loggedUser = null;

    if (cookies != null) {
      for (int i = 0; i < cookies.length && loggedUser == null; i++) {
        if (cookies[i].getName().equals("loggedUser")) {
          loggedUser = decode(cookies[i].getValue());
        }
      }
    }

    return loggedUser;

  }

  @Override
  public User findByUserId(Long userId) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public User findByEmail(String email) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  private String encode(User loggedUser) {

    String encodedLoggedUser;
    encodedLoggedUser = loggedUser.getUserId() + "#" + loggedUser.getNomeBatt() + "#" + loggedUser.getCognome();
    return encodedLoggedUser;

  }

  private User decode(String encodedLoggedUser) {

    User loggedUser = new User();
    
    String[] values = encodedLoggedUser.split("#");

    loggedUser.setUserId(Integer.parseInt(values[0]));
    loggedUser.setNomeBatt(values[1]);
    loggedUser.setCognome(values[2]);

    return loggedUser;
    
  }

  @Override
  public void registra(
          Integer userId,
          Integer bibliotecaId,
          Integer bibliotecarioId) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void blocca(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void sblocca(User user) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}

