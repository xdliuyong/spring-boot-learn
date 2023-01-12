package top.snailclimb.db2.dao;

import org.apache.ibatis.annotations.*;
import top.snailclimb.bean.Book;
import top.snailclimb.bean.Task;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Mapper
@Qualifier("db2SqlSessionTemplate")
public interface TaskDao {

    List<Task> getAllTasks();
}
