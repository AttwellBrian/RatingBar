package com.brianattwell.widget;

import android.content.Context;
import android.util.AttributeSet;

public class RatingBar extends android.widget.RatingBar {

    public RatingBar(Context context) {
        this(context, null);
    }


    public RatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RatingBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RatingBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int width = getIndeterminateDrawable().getIntrinsicWidth() * 5 + getPaddingLeft() +
                getPaddingRight();
        final int height = getIndeterminateDrawable().getIntrinsicHeight() + getPaddingTop()
                + getPaddingBottom();
        setMeasuredDimension(width, height);
    }
}