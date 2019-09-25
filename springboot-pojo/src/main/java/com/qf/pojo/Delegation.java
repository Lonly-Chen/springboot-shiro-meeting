package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "delegation")
public class Delegation {
    /**
     * 代表团
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 代表团名称
     */
    private String delegationname;

    /**
     * 代表团地区
     */
    private String area;



}
