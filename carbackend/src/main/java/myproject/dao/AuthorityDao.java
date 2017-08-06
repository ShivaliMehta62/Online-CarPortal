package myproject.dao;

import java.util.List;

import myproject.model.Authorities;


public interface AuthorityDao {

	public boolean addAuthority(Authorities a);
	public boolean updateAuthority(Authorities a);
	public boolean deleteAuthority(Authorities a);
	List<Authorities> getAllAuthorities();
	Authorities getAuhtoritiesById(String authid);
}
