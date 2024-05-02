package com.dao;

import com.entity.JingfeishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingfeishenqingView;

/**
 * 经费申请审核 Dao 接口
 *
 * @author 
 */
public interface JingfeishenqingDao extends BaseMapper<JingfeishenqingEntity> {

   List<JingfeishenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
