package top.snailclimb.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/*
定义数据对象
 */
public class Task {
    private String title;
    private Integer id;

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
