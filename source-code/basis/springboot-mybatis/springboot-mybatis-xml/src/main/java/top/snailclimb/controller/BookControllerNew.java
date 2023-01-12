package top.snailclimb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.snailclimb.bean.Book;
import top.snailclimb.db1.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/new")
public class BookControllerNew {
    @Autowired
    private BookService bookService;
    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        int i = bookService.addBook(book);
        System.out.println("插入成功" + i);
        return ResponseEntity.ok("插入成功");
    }

    @DeleteMapping("/book/{id}")
    public int deleteBookById(@PathVariable("id") int id) {
        int deleteId = bookService.deleteBookById(id);
        System.out.println("删除成功" + deleteId);
        return deleteId;
    }

    @PutMapping("/book")
    public ResponseEntity<Integer> UpdateBook(@RequestBody Book book) {
        int updateId = bookService.updateBook(book);
        System.out.println("更新成功" + updateId);
        return ResponseEntity.ok(updateId);
    }
    @GetMapping("/book")
    public  ResponseEntity<Book> getBookById(@RequestParam("id") int id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/books")
    public  ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }
}
