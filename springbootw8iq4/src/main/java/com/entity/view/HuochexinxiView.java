package com.entity.view;

import com.entity.HuochexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 火车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-01 10:36:03
 */
@TableName("huochexinxi")
public class HuochexinxiView  extends HuochexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuochexinxiView(){
	}
 
 	public HuochexinxiView(HuochexinxiEntity huochexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, huochexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
