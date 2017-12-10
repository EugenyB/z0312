package beans;

import dao.AuthorDAO;
import dao.GenreDAO;
import tables.Author;
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
    private GenreDAO genreDAO;

    @EJB
    private AuthorDAO authorDAO;
    private Author currentAuthor;
    private Genre currentGenre;

    public List<Genre> getGenres() {
        return genreDAO.findAll();
    }

    public List<Author> getAuthors() {
        return authorDAO.findAll();
    }

    public void showBooks(Author author) {
        currentAuthor = author;
    }

    public void showBooksByGenre(Genre genre) {
        currentGenre = genre;
    }

    public void hideBooksByAuthor() {
        currentAuthor = null;
    }

    public void hideBooksByGenre() {
        currentGenre = null;
    }

    public Author getCurrentAuthor() {
        return currentAuthor;
    }

    public Genre getCurrentGenre() {
        return currentGenre;
    }
}
