package com.google.smartcity.ui.tabnews;

import android.app.Activity;

import com.google.smartcity.base.BaseTabDetailPager;
import com.google.smartcity.http.RequestUrl;

/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：SmartCity
 * Package_Name：com.google.smartcity
 * Version：1.0
 * time：2016/2/16 10:06
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class TabCarNews extends BaseTabDetailPager {

    public TabCarNews(Activity activity) {
        super(activity);
    }

    @Override
    public String getNewsUrl(int index) {
        return RequestUrl.getCarNewsUrl(index);
    }

    @Override
    public String getNewsId() {
        return RequestUrl.CarId;
    }

}
