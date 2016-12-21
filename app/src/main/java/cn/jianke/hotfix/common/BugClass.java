package cn.jianke.hotfix.common;

/**
 * @className: BugClass
 * @classDescription: bug类
 * @author: leibing
 * @createTime: 2016/12/21
 */
public class BugClass {
    // 测试全局变量
    private int a = 1;
    // 测试全局静态变量
    private static String c = "修复后";

    /**
     * 获取整型全局变量a
     * @author leibing
     * @createTime 2016/12/21
     * @lastModify 2016/12/21
     * @param
     * @return
     */
    public int getA(){
        return a;
    }

    /**
     * 测试方法
     * @author leibing
     * @createTime 2016/12/21
     * @lastModify 2016/12/21
     * @param
     * @return
     */
    public String getB(){
        String b = "bug已修复";
        return b;
    }

    /**
     * 测试全局静态变量
     * @author leibing
     * @createTime 2016/12/21
     * @lastModify 2016/12/21
     * @param
     * @return
     */
    public String getC(){
        return c;
    }

    /**
     * 测试方法(多态，更改参数)
     * @author leibing
     * @createTime 2016/12/21
     * @lastModify 2016/12/21
     * @param
     * @return
     */
    public String getD(String d){
        return d;
    }
}
