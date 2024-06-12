package com.example.ufro.services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.ufro.models.Book;
import com.example.ufro.repositories.BookRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAll() throws Exception {
        try {
            return bookRepository.findAll();
        } catch (Exception e){
            throw new Exception("Error fetching books: " + e.getMessage());
        }
    }

    public Book getBookByID(Long ID) throws Exception {
        return bookRepository.findById(ID).orElseThrow(
            () -> new Exception("This book doesn't exist!"));
    }

    public void deleteBookByID(Long ID) throws Exception {
        if (!bookRepository.existsById(ID)) {
            throw new Exception("This book doesn't exist!");
        }
        bookRepository.deleteById(ID);
    }

    public Book createBook(Book bookToCreate) throws Exception {
        return bookRepository.save(bookToCreate);
    }

    public Book updateBook(Book bookDetails) throws Exception {
        Book bookToUpdate = bookRepository.findById(bookDetails.getId())
            .orElseThrow(() -> new Exception("This book doesn't exist!"));

            bookToUpdate.setTitle(bookDetails.getTitle());
            bookToUpdate.setAuthor(bookDetails.getAuthor());
            bookToUpdate.setDescription(bookDetails.getDescription());
            bookToUpdate.setPublishDate(bookDetails.getPublishDate());

            return bookRepository.save(bookToUpdate);
    }

    
    
}