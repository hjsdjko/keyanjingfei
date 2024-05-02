package com.entity.view;

import com.entity.JingfeishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 经费申请审核
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jingfeishenqing")
public class JingfeishenqingView extends JingfeishenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核结果的值
		*/
		private String jingfeishenqingYesnoValue;



		//级联表 keyanxiangmu
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
				* 科研类型的值
				*/
				private String keyanxiangmuValue;
			/**
			* 科研预算
			*/
			private Double keyanxiangmuYusuan;
			/**
			* 附件
			*/
			private String keyanxiangmuFile;
			/**
			* 审核结果
			*/
			private Integer keyanxiangmuYesnoTypes;
				/**
				* 审核结果的值
				*/
				private String keyanxiangmuYesnoValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JingfeishenqingView() {

	}

	public JingfeishenqingView(JingfeishenqingEntity jingfeishenqingEntity) {
		try {
			BeanUtils.copyProperties(this, jingfeishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核结果的值
			*/
			public String getJingfeishenqingYesnoValue() {
				return jingfeishenqingYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setJingfeishenqingYesnoValue(String jingfeishenqingYesnoValue) {
				this.jingfeishenqingYesnoValue = jingfeishenqingYesnoValue;
			}










				//级联表的get和set keyanxiangmu
					/**
					* 获取： 科研编号
					*/
					public String getKeyanxiangmuUuidNumber() {
						return keyanxiangmuUuidNumber;
					}
					/**
					* 设置： 科研编号
					*/
					public void setKeyanxiangmuUuidNumber(String keyanxiangmuUuidNumber) {
						this.keyanxiangmuUuidNumber = keyanxiangmuUuidNumber;
					}
					/**
					* 获取： 科研名称
					*/
					public String getKeyanxiangmuName() {
						return keyanxiangmuName;
					}
					/**
					* 设置： 科研名称
					*/
					public void setKeyanxiangmuName(String keyanxiangmuName) {
						this.keyanxiangmuName = keyanxiangmuName;
					}
					/**
					* 获取： 科研类型
					*/
					public Integer getKeyanxiangmuTypes() {
						return keyanxiangmuTypes;
					}
					/**
					* 设置： 科研类型
					*/
					public void setKeyanxiangmuTypes(Integer keyanxiangmuTypes) {
						this.keyanxiangmuTypes = keyanxiangmuTypes;
					}


						/**
						* 获取： 科研类型的值
						*/
						public String getKeyanxiangmuValue() {
							return keyanxiangmuValue;
						}
						/**
						* 设置： 科研类型的值
						*/
						public void setKeyanxiangmuValue(String keyanxiangmuValue) {
							this.keyanxiangmuValue = keyanxiangmuValue;
						}
					/**
					* 获取： 科研预算
					*/
					public Double getKeyanxiangmuYusuan() {
						return keyanxiangmuYusuan;
					}
					/**
					* 设置： 科研预算
					*/
					public void setKeyanxiangmuYusuan(Double keyanxiangmuYusuan) {
						this.keyanxiangmuYusuan = keyanxiangmuYusuan;
					}
					/**
					* 获取： 附件
					*/
					public String getKeyanxiangmuFile() {
						return keyanxiangmuFile;
					}
					/**
					* 设置： 附件
					*/
					public void setKeyanxiangmuFile(String keyanxiangmuFile) {
						this.keyanxiangmuFile = keyanxiangmuFile;
					}
					/**
					* 获取： 审核结果
					*/
					public Integer getKeyanxiangmuYesnoTypes() {
						return keyanxiangmuYesnoTypes;
					}
					/**
					* 设置： 审核结果
					*/
					public void setKeyanxiangmuYesnoTypes(Integer keyanxiangmuYesnoTypes) {
						this.keyanxiangmuYesnoTypes = keyanxiangmuYesnoTypes;
					}


						/**
						* 获取： 审核结果的值
						*/
						public String getKeyanxiangmuYesnoValue() {
							return keyanxiangmuYesnoValue;
						}
						/**
						* 设置： 审核结果的值
						*/
						public void setKeyanxiangmuYesnoValue(String keyanxiangmuYesnoValue) {
							this.keyanxiangmuYesnoValue = keyanxiangmuYesnoValue;
						}
					/**
					* 获取： 审核意见
					*/
					public String getShenheyijianText() {
						return shenheyijianText;
					}
					/**
					* 设置： 审核意见
					*/
					public void setShenheyijianText(String shenheyijianText) {
						this.shenheyijianText = shenheyijianText;
					}
					/**
					* 获取： 资料详情
					*/
					public String getKeyanxiangmuContent() {
						return keyanxiangmuContent;
					}
					/**
					* 设置： 资料详情
					*/
					public void setKeyanxiangmuContent(String keyanxiangmuContent) {
						this.keyanxiangmuContent = keyanxiangmuContent;
					}
					/**
					* 获取： 假删
					*/
					public Integer getKeyanxiangmuDelete() {
						return keyanxiangmuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setKeyanxiangmuDelete(Integer keyanxiangmuDelete) {
						this.keyanxiangmuDelete = keyanxiangmuDelete;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
