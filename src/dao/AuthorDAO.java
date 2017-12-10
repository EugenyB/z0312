package dao;

import tables.Author;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AuthorDAO {
    @PersistenceContext
    EntityManager em;


    public List<Author> findAll() {
        return em.createNamedQuery("Author.FindAll", Author.class).getResultList();
    }
}
