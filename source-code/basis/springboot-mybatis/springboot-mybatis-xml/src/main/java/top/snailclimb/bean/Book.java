package top.snailclimb.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
/*
定义数据对象
 */
public class Book {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
    private String name;
    private String author;
    @JsonIgnore
    private Float price ;

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public Date getPublicationDate() {
        return publicationDate;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", publicationDate=" + publicationDate +
            '}';
    }
}
