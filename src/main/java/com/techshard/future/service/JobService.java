package com.techshard.future.service;

import com.techshard.future.dao.entity.Job;
import com.techshard.future.dao.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepo;

    public Job createJob() {
        return this.jobRepo.save(new Job());
    }
}
