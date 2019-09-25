package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "worker")
public class Worker {
    /**
     * 工作人员
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String workername;

    private String workernum;

    private String workerimg;

    @ManyToOne
    @JoinColumn(name = "departmentid")
    private String department;

}
