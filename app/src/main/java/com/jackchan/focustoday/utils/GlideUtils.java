package com.jackchan.focustoday.utils;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jackchan.focustoday.R;

/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/jackchan1999
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：SmartCity
 * Package_Name：com.jackchan.focustoday
 * Version：1.0
 * time：2016/2/16 10:06
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class GlideUtils {
    public static void display(Context context, String url, ImageView iv){
        Glide.with(context)
                .load(url)
                .placeholder(new ColorDrawable(context.getResources().getColor(R.color.placeholder)))
                .error(new ColorDrawable(context.getResources().getColor(R.color.error)))
                .into(iv);
    }
}
