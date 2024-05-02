package com.entity.vo;

import com.entity.JingfeishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 经费申请审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingfeishenqing")
public class JingfeishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
