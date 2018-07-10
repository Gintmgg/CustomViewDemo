package com.example.test.customviewdemos.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.test.customviewdemos.R;

/**
 * Created by zhangchunpeng on 2018/7/10.
 */

public class MyRect extends View {
    public MyRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyRect);

        int color = ta.getColor(R.styleable.MyRect_rect_color, 0xffff0000);
        setBackgroundColor(color);

        ta.recycle();
    }

    public MyRect(Context context){
        super(context);
    }
}
