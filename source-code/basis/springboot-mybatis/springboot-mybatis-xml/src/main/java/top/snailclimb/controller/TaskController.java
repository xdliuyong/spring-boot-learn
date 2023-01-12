package top.snailclimb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.snailclimb.bean.Book;
import top.snailclimb.bean.Task;
import top.snailclimb.db2.service.TaskService;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public  ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }
}
