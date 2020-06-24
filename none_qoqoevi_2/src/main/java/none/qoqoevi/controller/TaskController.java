package none.qoqoevi.controller;

import none.qoqoevi.dto.task.*;
import none.qoqoevi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("getTasks")
    public GetTasksOutput getTasks(@RequestBody GetTasksInput getTasksInput) {
       return taskService.getTasks(getTasksInput);
    }

    @PostMapping("addTask")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("getTask")
    public GetTaskOutput getTask(@RequestBody GetTaskInput getTaskInput) {
        return taskService.getTask(getTaskInput);
    }

    @PostMapping("deleteTask")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }
}
