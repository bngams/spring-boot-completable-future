package com.techshard.future.dao.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Job {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(nullable=false)
    private Date createdAt;

    @Column(nullable=true)
    private Date doneAt;

    @NotNull
    @Column(nullable=false)
    private String status; // enum (RUNNING, DONE, ERROR...)

    public Job() {
        this.createdAt = new Date();
        this.status = "RUNNING"; // enum
    }
}
