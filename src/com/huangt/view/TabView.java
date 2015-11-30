package com.huangt.view;

import android.content.Context;
import android.widget.TextView;

/** 
 * 类说明  ''
 * @author : huangtao
 * @version 创建时间：2015年11月27日 下午2:22:41 
 */
public class TabView extends TextView{

	public int index;
	public TabView(Context context)
	{
		super(context);
	}
	public TabView(Context context, int index)
	{
		this(context);
		this.index = index;
	}
	

}
