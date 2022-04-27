package com.example.spba.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.spba.api.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface RoleMapper extends BaseMapper<Role>
{
    List<Role> getAll(HashMap params);
    Page<HashMap> getList(Page page, @Param("params") HashMap params);
}