package win.intheworld.opencv4androiddemo.filter.ar;

import win.intheworld.opencv4androiddemo.filter.NoneFilter;

/**
 * Created by liushuwei on 2018/2/10.
 */

public class NoneARFilter extends NoneFilter implements ARFilter {

    @Override
    public float[] getGLPose() {
        return null;
    }
}
