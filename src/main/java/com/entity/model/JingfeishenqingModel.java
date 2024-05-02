package com.entity.model;

import com.entity.JingfeishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 经费申请审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingfeishenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 科研
     */
    private Integer keyanxiangmuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请经费数量
     */
    private Double jingfeishenqingShuliang;


    /**
     * 申请原因
     */
    private String shenqingyuanyinText;


    /**
     * 审核结果
     */
    private Integer jingfeishenqingYesnoTypes;


    /**
     * 审核意见
     */
    private String shenheyijianText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：科研
	 */
    public Integer getKeyanxiangmuId() {
        return keyanxiangmuId;
    }


    /**
	 * 设置：科研
	 */
    public void setKeyanxiangmuId(Integer keyanxiangmuId) {
        this.keyanxiangmuId = keyanxiangmuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请经费数量
	 */
    public Double getJingfeishenqingShuliang() {
        return jingfeishenqingShuliang;
    }


    /**
	 * 设置：申请经费数量
	 */
    public void setJingfeishenqingShuliang(Double jingfeishenqingShuliang) {
        this.jingfeishenqingShuliang = jingfeishenqingShuliang;
    }
    /**
	 * 获取：申请原因
	 */
    public String getShenqingyuanyinText() {
        return shenqingyuanyinText;
    }


    /**
	 * 设置：申请原因
	 */
    public void setShenqingyuanyinText(String shenqingyuanyinText) {
        this.shenqingyuanyinText = shenqingyuanyinText;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getJingfeishenqingYesnoTypes() {
        return jingfeishenqingYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setJingfeishenqingYesnoTypes(Integer jingfeishenqingYesnoTypes) {
        this.jingfeishenqingYesnoTypes = jingfeishenqingYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getShenheyijianText() {
        return shenheyijianText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setShenheyijianText(String shenheyijianText) {
        this.shenheyijianText = shenheyijianText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
