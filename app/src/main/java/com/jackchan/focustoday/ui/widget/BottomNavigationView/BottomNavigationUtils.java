package com.jackchan.focustoday.ui.widget.BottomNavigationView;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/jackchan1999
 * CSDN博客： http://blog.csdn.net/axi295309066
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
public class BottomNavigationUtils {

    static void changeImageColorFilter(final ImageView image, int fromColor, int toColor) {
        ValueAnimator imageColorChangeAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), fromColor, toColor);
        imageColorChangeAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                image.setColorFilter((Integer) animator.getAnimatedValue());
            }
        });
        imageColorChangeAnimation.setDuration(150);
        imageColorChangeAnimation.start();
    }

    static void changeViewBackgroundColor(final View view, int fromColor, int toColor) {
        ValueAnimator imageColorChangeAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), fromColor, toColor);
        imageColorChangeAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                view.setBackgroundColor((Integer) animator.getAnimatedValue());
            }
        });
        imageColorChangeAnimation.setDuration(150);
        imageColorChangeAnimation.start();
    }

    static void changeViewTopPadding(final View view, int fromPadding, int toPadding) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromPadding, toPadding);
        animator.setDuration(150);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedValue = (float) valueAnimator.getAnimatedValue();
                view.setPadding(view.getPaddingLeft(),
                        (int) animatedValue,
                        view.getPaddingRight(),
                        view.getPaddingBottom());
            }
        });
        animator.start();
    }

    static void changeRightPadding(final View view, int fromPadding, int toPadding) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromPadding, toPadding);
        animator.setDuration(150);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedValue = (float) valueAnimator.getAnimatedValue();
                view.setPadding(view.getPaddingLeft(),
                        view.getPaddingTop(),
                        (int) animatedValue,
                        view.getPaddingBottom());
            }
        });
        animator.start();
    }

    static void changeViewLeftPadding(final View view, int fromMargin, int toMargin) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromMargin, toMargin);
        animator.setDuration(3000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedValue = (float) valueAnimator.getAnimatedValue();
                view.setPadding((int) animatedValue,
                        view.getPaddingTop(),
                        view.getPaddingRight(),
                        view.getPaddingBottom());
                view.requestLayout();

            }
        });
        animator.start();
    }

    static void changeTextSize(final TextView textView, float from, float to) {
        ValueAnimator textSizeChangeAnimator = ValueAnimator.ofFloat(from, to);
        textSizeChangeAnimator.setDuration(150);
        textSizeChangeAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, (float) valueAnimator.getAnimatedValue());
            }
        });
        textSizeChangeAnimator.start();
    }

    static void changeTextColor(final TextView textView, int fromColor, int toColor) {
        ValueAnimator changeTextColorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), fromColor, toColor);
        changeTextColorAnimation.setDuration(150);
        changeTextColorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                textView.setTextColor((Integer) animator.getAnimatedValue());
            }
        });
        changeTextColorAnimation.start();
    }

    static int getActionbarSize(Context context) {
        int actionbarSize = -1;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            actionbarSize = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return actionbarSize;
    }

    public static int pxToDp(int px, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int dp = Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return dp;
    }
}
