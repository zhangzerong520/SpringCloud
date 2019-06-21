package com.sise.springcloud.dao;


import com.sise.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName DeptDao
 * @Description TODO
 * @Author zzr
 * @Date 2019/6/20 17:53
 * @Version 1.0
 **/
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
