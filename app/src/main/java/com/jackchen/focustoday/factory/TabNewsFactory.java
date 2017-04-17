package com.jackchen.focustoday.factory;

import android.app.Activity;
import android.support.v4.util.ArrayMap;

import com.jackchen.focustoday.base.BaseTabDetailPager;
import com.jackchen.focustoday.ui.tabnews.TabAmusementNews;
import com.jackchen.focustoday.ui.tabnews.TabBBSNews;
import com.jackchen.focustoday.ui.tabnews.TabBlizzardNews;
import com.jackchen.focustoday.ui.tabnews.TabBlogNews;
import com.jackchen.focustoday.ui.tabnews.TabCBANews;
import com.jackchen.focustoday.ui.tabnews.TabCarNews;
import com.jackchen.focustoday.ui.tabnews.TabDigitalNews;
import com.jackchen.focustoday.ui.tabnews.TabEducationNews;
import com.jackchen.focustoday.ui.tabnews.TabEmotionNews;
import com.jackchen.focustoday.ui.tabnews.TabFMNews;
import com.jackchen.focustoday.ui.tabnews.TabFamilyNews;
import com.jackchen.focustoday.ui.tabnews.TabFashionNews;
import com.jackchen.focustoday.ui.tabnews.TabFinanceNews;
import com.jackchen.focustoday.ui.tabnews.TabFootballNews;
import com.jackchen.focustoday.ui.tabnews.TabFunnyNews;
import com.jackchen.focustoday.ui.tabnews.TabGameNews;
import com.jackchen.focustoday.ui.tabnews.TabHomeNews;
import com.jackchen.focustoday.ui.tabnews.TabHouseNews;
import com.jackchen.focustoday.ui.tabnews.TabJourneyNews;
import com.jackchen.focustoday.ui.tabnews.TabLotteryNews;
import com.jackchen.focustoday.ui.tabnews.TabMilitaryNews;
import com.jackchen.focustoday.ui.tabnews.TabMobileNews;
import com.jackchen.focustoday.ui.tabnews.TabMovieNews;
import com.jackchen.focustoday.ui.tabnews.TabNBANews;
import com.jackchen.focustoday.ui.tabnews.TabPhoneNews;
import com.jackchen.focustoday.ui.tabnews.TabSelectionNews;
import com.jackchen.focustoday.ui.tabnews.TabSocietyNews;
import com.jackchen.focustoday.ui.tabnews.TabSportNews;
import com.jackchen.focustoday.ui.tabnews.TabTechnologyNews;
import com.jackchen.focustoday.ui.tabnews.TabTopNews;

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
 * Package_Name：com.jackchen.focustoday
 * Version：1.0
 * time：2016/2/16 10:06
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class TabNewsFactory {

    private static ArrayMap<String, BaseTabDetailPager> tabNewsPage = new ArrayMap<>();

    public static BaseTabDetailPager getTabNewsPage(String channelname, Activity activity) {

        BaseTabDetailPager baseTabDetailPager = tabNewsPage.get(channelname);
        if (baseTabDetailPager != null) {
            return baseTabDetailPager;
        }

        switch (channelname) {
            case "头条":
                baseTabDetailPager = new TabTopNews(activity);
                break;
            case "足球":
                baseTabDetailPager = new TabFootballNews(activity);
                break;
            case "娱乐":
                baseTabDetailPager = new TabAmusementNews(activity);
                break;
            case "体育":
                baseTabDetailPager = new TabSportNews(activity);
                break;
            case "财经":
                baseTabDetailPager = new TabFinanceNews(activity);
                break;
            case "科技":
                baseTabDetailPager = new TabTechnologyNews(activity);
                break;
            case "电影":
                baseTabDetailPager = new TabMovieNews(activity);
                break;
            case "NBA":
                baseTabDetailPager = new TabNBANews(activity);
                break;
            case "数码":
                baseTabDetailPager = new TabDigitalNews(activity);
                break;
            case "移动":
                baseTabDetailPager = new TabMobileNews(activity);
                break;
            case "彩票":
                baseTabDetailPager = new TabLotteryNews(activity);
                break;
            case "教育":
                baseTabDetailPager = new TabEducationNews(activity);
                break;
            case "论坛":
                baseTabDetailPager = new TabBBSNews(activity);
                break;
            case "亲子":
                baseTabDetailPager = new TabFamilyNews(activity);
                break;
            case "CBA":
                baseTabDetailPager = new TabCBANews(activity);
                break;
            case "笑话":
                baseTabDetailPager = new TabFunnyNews(activity);
                break;
            case "汽车":
                baseTabDetailPager = new TabCarNews(activity);
                break;
            case "时尚":
                baseTabDetailPager = new TabFashionNews(activity);
                break;
            case "北京":
                baseTabDetailPager = new TabFamilyNews(activity);
                break;
            case "军事":
                baseTabDetailPager = new TabMilitaryNews(activity);
                break;
            case "房产":
                baseTabDetailPager = new TabHouseNews(activity);
                break;
            case "游戏":
                baseTabDetailPager = new TabGameNews(activity);
                break;
            case "精选":
                baseTabDetailPager = new TabSelectionNews(activity);
                break;
            case "电台":
                baseTabDetailPager = new TabFMNews(activity);
                break;
            case "情感":
                baseTabDetailPager = new TabEmotionNews(activity);
                break;
            case "旅游":
                baseTabDetailPager = new TabJourneyNews(activity);
                break;
            case "手机":
                baseTabDetailPager = new TabPhoneNews(activity);
                break;
            case "博客":
                baseTabDetailPager = new TabBlogNews(activity);
                break;
            case "社会":
                baseTabDetailPager = new TabSocietyNews(activity);
                break;
            case "家居":
                baseTabDetailPager = new TabHomeNews(activity);
                break;
            case "暴雪":
                baseTabDetailPager = new TabBlizzardNews(activity);
                break;
        }

        tabNewsPage.put(channelname, baseTabDetailPager);
        return baseTabDetailPager;
    }
}