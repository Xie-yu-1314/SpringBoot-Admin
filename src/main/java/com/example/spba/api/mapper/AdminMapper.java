package com.example.spba.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.spba.api.domain.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface AdminMapper extends BaseMapper<Admin>
{
    public Page<HashMap> getList(Page page, @Param("params") HashMap params);
    public HashMap getInfo(HashMap params);
    public List<HashMap> getRoleAdminAll(Integer roleId);
}