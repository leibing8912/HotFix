package cn.jianke.hotfix.module.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cn.jianke.hotfix.R;
import cn.jianke.hotfix.common.BugClass;

/**
 * @className: MainActivity
 * @classDescription: bug测试页面
 * @author: leibing
 * @createTime: 2016/12/21
 */
public class MainActivity extends AppCompatActivity {
    // bug测试类实例
    private BugClass mBugClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化bug测试类
        mBugClass = new BugClass();
        // 测试全局变量
        System.out.println("ccccc 测试全局a = " + mBugClass.getA());
        // 测试全局静态变量
        System.out.println("ccccc 测试全局c = " + mBugClass.getC());
        // 测试方法
        System.out.println("ccccc 测试方法 = " + mBugClass.getB());
        // 测试方法（多态，更改参数）
        System.out.println("ccccc 测试方法（多态） = " + mBugClass.getD("多态"));
    }
}
