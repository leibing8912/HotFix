package cn.jianke.hotfix.module;


/**
 * @className: InstructionClass
 * @classDescription: 说明类
 * @author: leibing
 * @createTime: 2016/12/21
 */
public class InstructionClass {
    // 版本 com.taobao.android:alisdk-hotfix:1.4.0
    /**
     * 暂时不支持新增方法, 新增字段, 但是支持新增类, 所以需要新增方法/字段可以通过新增类来实现
     不支持资源修复, so修复
     三星note3,S4,S5的5.0设备以及X86设备不支持（点击查看具体支持的机型）
     参数包括long,double,float基本类型的方法不能被patch, 不包括基本类型封装类Long,Double,Float
     被反射调用的非静态方法不能被patch
     参数超过8的方法不能被patch
     构造方法不能被patch
     使用注解的方法视情况而定是否支持被patch(详细说明参考Demo工程BaseBug.md文件中关于注解的说明）
     泛型参数的方法如果patch存在兼容性问题
     在打包的时候偶尔会存在两次打包内部类的名字不一致问题，这种情况会导致打AndFix打包失败，暂时无解
     我们建议不要通过GooglePlay发布带热修复SDK的APP，存在政策风险
     暂不支持android7.0
     */
}
