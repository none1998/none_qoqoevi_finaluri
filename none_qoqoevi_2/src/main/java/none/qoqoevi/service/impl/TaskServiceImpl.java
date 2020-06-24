package none.qoqoevi.service.impl;

import none.qoqoevi.dto.task.*;
import none.qoqoevi.model.Task;
import none.qoqoevi.repository.TaskRepository;
import none.qoqoevi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {

        List<TaskDTO> postDTOList = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setCountry(task.getCountry());
            postDTOList.add(taskDTO);
        }

        GetTasksOutput getTasksOutput = new GetTasksOutput();
        getTasksOutput.setTasks(postDTOList);
        return getTasksOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setCountry(addTaskInput.getCountry());
        taskRepository.save(task);

        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("დაემატა");
        return addTaskOutput;
    }
    @Override
    public GetTaskOutput getTask(GetTaskInput getTaskInput) {
        Task task = taskRepository.getOne(getTaskInput.getId());

        GetTaskOutput getTaskOutput = new GetTaskOutput();
        getTaskOutput.setTitle(task.getTitle());


        return getTaskOutput;
    }
    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepository.getOne(deleteTaskInput.getId());
        taskRepository.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("წაიშალა");
        return deleteTaskOutput;
    }
}
