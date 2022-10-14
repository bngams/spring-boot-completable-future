package com.techshard.future.dao.repository;

import com.techshard.future.dao.entity.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
}
