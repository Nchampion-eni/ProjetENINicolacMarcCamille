package fr.eni.ecole.enchere.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.ecole.enchere.bo.Utilisateur;

public class UserJDBCImpl implements UtilisateurDAO {
	private static final String CONNECTION = "SELECT LOGIN, PASSWORD, first_name, last_name FROM USER_DEMO WHERE LOGIN = ? AND PASSWORD = ?;";

	@Override
	public Utilisateur find(String login, String password) throws BusinessException {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(CONNECTION);
			pstmt.setString(1, login);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Utilisateur u = new Utilisateur();
				u.setLogin(login);
				u.setPassword(password);
				u.setFirstName(rs.getString("first_name"));
				u.setLastName(rs.getString("last_name"));
				return u;
			} else {
				BusinessException businessException = new BusinessException();
				businessException.addError("Pseudo ou Mot de passe inconnu!");
				throw businessException;
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.addError("Pseudo ou Mot de passe inconnu!");
			throw businessException;
		}
	}

}
