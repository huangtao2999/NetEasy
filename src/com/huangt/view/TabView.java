package com.huangt.view;

import android.content.Context;
import android.widget.TextView;

/** 
 * ��˵��  ''
 * @author : huangtao
 * @version ����ʱ�䣺2015��11��27�� ����2:22:41 
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
