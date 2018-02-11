package win.intheworld.opencv4androiddemo.filter.ar;


import win.intheworld.opencv4androiddemo.filter.Filter;

/**
 * Created by liushuwei on 2018/2/10.
 */

public interface ARFilter extends Filter {
    public float[] getGLPose();
}
