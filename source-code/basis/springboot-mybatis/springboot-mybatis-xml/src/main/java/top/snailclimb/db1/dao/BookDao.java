package top.snailclimb.db1.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Qualifier;
import top.snailclimb.bean.Book;

import java.util.List;

/*
建立对象到数据库表结构的映射
 */

@Qualifier("db1SqlSessionTemplate")
public interface BookDao {
    @Insert("INSERT INTO book(name, author) VALUES (#{name}, #{author})")
    int addBook(Book book);
    @Delete("DELETE FROM book WHERE id=#{id}")
    int deleteBookById(Integer id);
    @Update("UPDATE book set name=#{name}, author=#{author} WHERE id=#{id}")
    int updateBookById(Book book);
    @Select("SELECT * FROM book WHERE id=#{id}")
    Book getBookById(Integer id);
    @Select("SELECT * FROM book")
    List<Book> getAllBooks();

}
