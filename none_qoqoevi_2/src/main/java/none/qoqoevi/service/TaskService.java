package none.qoqoevi.service;

import none.qoqoevi.dto.task.*;

public interface TaskService {
    GetTasksOutput getTasks(GetTasksInput getTasksInput);
    AddTaskOutput addTask(AddTaskInput addTaskInput);
    GetTaskOutput getTask(GetTaskInput getTaskInput);
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}