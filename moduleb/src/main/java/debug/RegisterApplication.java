package debug;

import android.app.Application;
import android.util.Log;

/**
 * @Author: quyunshuo
 * @Time: 2019/4/7 23:32
 * @see:
 * @Company:
 * @Description: 功能描述
 */
public class RegisterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("RegisterApplication", "onCreate: RegisterApplication");
    }
}
