package com.itheima.service;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {

    List<Brand> selectAll();

    void add(Brand brand);

    void deleteByIds(int[] ids);
}
