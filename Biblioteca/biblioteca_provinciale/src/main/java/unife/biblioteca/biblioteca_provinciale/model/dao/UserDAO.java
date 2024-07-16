package unife.biblioteca.biblioteca_provinciale.model.dao;

import unife.biblioteca.biblioteca_provinciale.model.mo.User;

public interface UserDAO {

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
          boolean notificheAttive);

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
          java.sql.Date dataNascita);

  public void registra(
          Integer userId,
          Integer bibliotecaId,
          Integer bibliotecarioId);

  public void update(User user);

  public void delete(User user);

  public void blocca(User user);

  public void sblocca(User user);

  public User findLoggedUser();

  public User findByUserId(Long userId);
  
  public User findByEmail(String email);

}
