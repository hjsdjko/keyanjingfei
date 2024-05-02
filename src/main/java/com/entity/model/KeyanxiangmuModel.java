package com.entity.model;

import com.entity.KeyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 科研项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KeyanxiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 科研编号
     */
    private String keyanxiangmuUuidNumber;


    /**
     * 科研名称
     */
    private String keyanxiangmuName;


    /**
     * 科研类型
     */
    private Integer keyanxiangmuTypes;


    /**
     * 科研预算
     */
    private Double keyanxiangmuYusuan;


    /**
     * 附件
     */
    private String keyanxiangmuFile;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核结果
     */
    private Integer keyanxiangmuYesnoTypes;


    /**
     * 审核意见
     */
    private String shenheyijianText;


    /**
     * 资料详情
     */
    private String keyanxiangmuContent;


    /**
     * 假删
     */
    private Integer keyanxiangmuDelete;


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
	 * 获取：科研编号
	 */
    public String getKeyanxiangmuUuidNumber() {
        return keyanxiangmuUuidNumber;
    }


    /**
	 * 设置：科研编号
	 */
    public void setKeyanxiangmuUuidNumber(String keyanxiangmuUuidNumber) {
        this.keyanxiangmuUuidNumber = keyanxiangmuUuidNumber;
    }
    /**
	 * 获取：科研名称
	 */
    public String getKeyanxiangmuName() {
        return keyanxiangmuName;
    }


    /**
	 * 设置：科研名称
	 */
    public void setKeyanxiangmuName(String keyanxiangmuName) {
        this.keyanxiangmuName = keyanxiangmuName;
    }
    /**
	 * 获取：科研类型
	 */
    public Integer getKeyanxiangmuTypes() {
        return keyanxiangmuTypes;
    }


    /**
	 * 设置：科研类型
	 */
    public void setKeyanxiangmuTypes(Integer keyanxiangmuTypes) {
        this.keyanxiangmuTypes = keyanxiangmuTypes;
    }
    /**
	 * 获取：科研预算
	 */
    public Double getKeyanxiangmuYusuan() {
        return keyanxiangmuYusuan;
    }


    /**
	 * 设置：科研预算
	 */
    public void setKeyanxiangmuYusuan(Double keyanxiangmuYusuan) {
        this.keyanxiangmuYusuan = keyanxiangmuYusuan;
    }
    /**
	 * 获取：附件
	 */
    public String getKeyanxiangmuFile() {
        return keyanxiangmuFile;
    }


    /**
	 * 设置：附件
	 */
    public void setKeyanxiangmuFile(String keyanxiangmuFile) {
        this.keyanxiangmuFile = keyanxiangmuFile;
    }
    /**
	 * 获取：开始时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：开始时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
	 * 获取：审核结果
	 */
    public Integer getKeyanxiangmuYesnoTypes() {
        return keyanxiangmuYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setKeyanxiangmuYesnoTypes(Integer keyanxiangmuYesnoTypes) {
        this.keyanxiangmuYesnoTypes = keyanxiangmuYesnoTypes;
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
	 * 获取：资料详情
	 */
    public String getKeyanxiangmuContent() {
        return keyanxiangmuContent;
    }


    /**
	 * 设置：资料详情
	 */
    public void setKeyanxiangmuContent(String keyanxiangmuContent) {
        this.keyanxiangmuContent = keyanxiangmuContent;
    }
    /**
	 * 获取：假删
	 */
    public Integer getKeyanxiangmuDelete() {
        return keyanxiangmuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setKeyanxiangmuDelete(Integer keyanxiangmuDelete) {
        this.keyanxiangmuDelete = keyanxiangmuDelete;
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
