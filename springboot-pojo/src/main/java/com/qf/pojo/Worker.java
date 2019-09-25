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

    /**
     * 人员名称
     */
    private String workername;

    /**
     * 人员电话
     */
    private String phonenum;

    /**
     * 人员图片
     */
    private String workerimg;

    /**
     * 部门ID
     */
    @ManyToOne
    private String departmentid;

}
