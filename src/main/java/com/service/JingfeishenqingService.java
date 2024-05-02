package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingfeishenqingEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 经费申请审核 服务类
 */
public interface JingfeishenqingService extends IService<JingfeishenqingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}