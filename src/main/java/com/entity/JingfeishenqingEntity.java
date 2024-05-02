package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 经费申请审核
 *
 * @author 
 * @email
 */
@TableName("jingfeishenqing")
public class JingfeishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingfeishenqingEntity() {

	}

	public JingfeishenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 科研
     */
    @TableField(value = "keyanxiangmu_id")

    private Integer keyanxiangmuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请经费数量
     */
    @TableField(value = "jingfeishenqing_shuliang")

    private Double jingfeishenqingShuliang;


    /**
     * 申请原因
     */
    @TableField(value = "shenqingyuanyin_text")

    private String shenqingyuanyinText;


    /**
     * 审核结果
     */
    @TableField(value = "jingfeishenqing_yesno_types")

    private Integer jingfeishenqingYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "shenheyijian_text")

    private String shenheyijianText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：科研
	 */
    public Integer getKeyanxiangmuId() {
        return keyanxiangmuId;
    }


    /**
	 * 获取：科研
	 */

    public void setKeyanxiangmuId(Integer keyanxiangmuId) {
        this.keyanxiangmuId = keyanxiangmuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请经费数量
	 */
    public Double getJingfeishenqingShuliang() {
        return jingfeishenqingShuliang;
    }


    /**
	 * 获取：申请经费数量
	 */

    public void setJingfeishenqingShuliang(Double jingfeishenqingShuliang) {
        this.jingfeishenqingShuliang = jingfeishenqingShuliang;
    }
    /**
	 * 设置：申请原因
	 */
    public String getShenqingyuanyinText() {
        return shenqingyuanyinText;
    }


    /**
	 * 获取：申请原因
	 */

    public void setShenqingyuanyinText(String shenqingyuanyinText) {
        this.shenqingyuanyinText = shenqingyuanyinText;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getJingfeishenqingYesnoTypes() {
        return jingfeishenqingYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setJingfeishenqingYesnoTypes(Integer jingfeishenqingYesnoTypes) {
        this.jingfeishenqingYesnoTypes = jingfeishenqingYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getShenheyijianText() {
        return shenheyijianText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setShenheyijianText(String shenheyijianText) {
        this.shenheyijianText = shenheyijianText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jingfeishenqing{" +
            "id=" + id +
            ", keyanxiangmuId=" + keyanxiangmuId +
            ", yonghuId=" + yonghuId +
            ", jingfeishenqingShuliang=" + jingfeishenqingShuliang +
            ", shenqingyuanyinText=" + shenqingyuanyinText +
            ", jingfeishenqingYesnoTypes=" + jingfeishenqingYesnoTypes +
            ", shenheyijianText=" + shenheyijianText +
            ", createTime=" + createTime +
        "}";
    }
}
