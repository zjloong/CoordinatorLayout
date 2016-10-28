package com.heihei.hehe.coordinatorlayout.behavior;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

// 如果该Behavior只想给某种控件使用,可以通过泛型控制, 当然也可以不指定,那么任何控件都可以使用
public class MyBehavior<T> extends CoordinatorLayout.Behavior {

    // 构造方法必须要写,因为Behavior最终都是通过反射此构造方法初始化
    // 可以带有自定义属性
    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // 视图依赖(想想观察者模式),在这里可以指定具体的对象,也可以指定一个范围
    // 比如这里指定了,只观察 AppBarLayout 的变化
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof AppBarLayout;
    }

    /**
     * 依赖的对象发生了变化(观察者 onNext...),可以在这里做出相应的处理,比如位置改变,大小变化等
     * @param child      使用此 Behavior 的控件
     * @param dependency 观察的控件
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        return true;
    }

    /**************************以下是滑动事件的相关方法(无需声明依赖,不受依赖影响)*************************/

    /**
     * (嵌套)滚动事件开始前
     * 通过返回值表示要不要响应本次滑动,只有这里返回true,后面的响应方法才会执行
     * 比如这里,表示只响应垂直方向的滑动
     * @param child             自己
     * @param directTargetChild 发起滑动事件的控件
     * @param target
     */
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL;
    }

    /**
     * (嵌套)滚动事件开始后,滚动视图获得滚动事件前
     * @param dy        垂直方向滑动增量
     * @param consumed  长度为二 , 水平和垂直方向消耗掉的滚动
     */
    @Override
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dx, int dy, int[] consumed) {
        //dy大于0是向上滚动 小于0是向下滚动
    }

    /**
     * 滚动视图获得(嵌套)滚动事件后
     * @param dyConsumed     竖直方向上滑动被消耗了多少
     * @param dyUnconsumed   未消耗的
     */
    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        if (dyConsumed > 0 && dyUnconsumed == 0) {
            // 上滑
        }
        if (dyConsumed == 0 && dyUnconsumed > 0) {
            // 到边了, 还在上滑
        }
        if (dyConsumed < 0 && dyUnconsumed == 0) {
            // 下滑
        }
        if (dyConsumed == 0 && dyUnconsumed < 0) {
            // 到边了, 还在下滑
        }
    }

    // (嵌套)滚动事件结束后
    @Override
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target) {

    }

    // 快速滑动开始前
    @Override
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View child, View target, float velocityX, float velocityY) {
        return false;
    }

    // 快速滑动
    @Override
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View child, View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }
}
