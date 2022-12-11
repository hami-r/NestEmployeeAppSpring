package com.nest.nestemployeeapp_backend.dao;

import com.nest.nestemployeeapp_backend.model.TaskModel;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<TaskModel,Integer> {
}
