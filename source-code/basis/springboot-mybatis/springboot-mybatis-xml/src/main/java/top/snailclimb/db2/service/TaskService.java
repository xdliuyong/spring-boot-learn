package top.snailclimb.db2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.snailclimb.bean.Book;
import top.snailclimb.bean.Task;
import top.snailclimb.db2.dao.TaskDao;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskDao taskDao;
    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }
}
