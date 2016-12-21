package cn.jianke.hotfix.module;

import android.app.Application;
import com.taobao.hotfix.HotFixManager;
import com.taobao.hotfix.PatchLoadStatusListener;
import com.taobao.hotfix.util.PatchStatusCode;
import cn.jianke.hotfix.BuildConfig;

/**
 * @className:
 * @classDescription:
 * @author: leibing
 * @createTime: 2016/12/21
 */
public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        // init HotFix
        HotFixManager.getInstance().setContext(this)
                .setAppVersion(BuildConfig.VERSION_NAME)
                .setAppId("83318-1")
                .setAesKey("1234567891234567")
                .setSupportHotpatch(true)
                .setEnableDebug(false)
                .setPatchLoadStatusStub(new PatchLoadStatusListener() {
                    @Override
                    public void onload(final int mode, final int code, final String info, final int handlePatchVersion) {
                        System.out.println("dddddddddddddddd code = " + code);
                        // 补丁加载回调通知
                        if (code == PatchStatusCode.CODE_SUCCESS_LOAD) {
                            // TODO: 10/24/16 表明补丁加载成功
                            System.out.println("dddddddddddddddddddd 补丁加载成功");
                        } else if (code == PatchStatusCode.CODE_ERROR_NEEDRESTART) {
                            // TODO: 10/24/16 表明新补丁生效需要重启. 业务方可自行实现逻辑, 提示用户或者强制重启, 建议: 用户可以监听进入后台事件, 然后应用自杀
                            System.out.println("dddddddddddddddddddd 新补丁生效需要重启");
                        } else if (code == PatchStatusCode.CODE_ERROR_INNERENGINEFAIL) {
                            // 内部引擎加载异常, 推荐此时清空本地补丁, 但是不清空本地版本号, 防止失败补丁重复加载
                            HotFixManager.getInstance().cleanPatches(false);
                            System.out.println("dddddddddddddddddddd 推荐此时清空本地补丁");
                        } else {
                            // TODO: 10/25/16 其它错误信息, 查看PatchStatusCode类说明
                            System.out.println("dddddddddddddddddddd 其它错误信息");
                        }
                    }
                }).initialize();
    }
}
