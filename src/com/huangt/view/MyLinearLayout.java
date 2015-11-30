package com.huangt.view;

import android.content.Context;
import android.widget.LinearLayout;

/** 
 * 类说明  ''
 * @author : huangtao
 * @version 创建时间：2015年11月27日 下午2:21:16 
 */
public class MyLinearLayout extends LinearLayout{

	public MyLinearLayout(Context context)
	{
		super(context);
		setWillNotDraw(false);
	}

}
