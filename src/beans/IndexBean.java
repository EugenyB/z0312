package beans;

import dao.GenreDAO;
import tables.Genre;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class IndexBean implements Serializable {
    @EJB
    private
    GenreDAO genreDAO;

    public List<Genre> getGenres() {
        return genreDAO.findAll();
    }
}
