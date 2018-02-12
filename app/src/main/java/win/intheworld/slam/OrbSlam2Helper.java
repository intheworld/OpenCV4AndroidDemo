package win.intheworld.slam;

/**
 * Created by swliu on 2018/2/12.
 * Email: swliu@cam2cloud.com
 */

public class OrbSlam2Helper {


    public static native void initSystemWithParameters(String VOCPath, String calibrationPath);

    public static native int[] startCurrentORB(double curTimeStamp, int[] data, int w, int h);

    public static native int[] startCurrentORBForCamera(double curTimeStamp, long addr, int w, int h);

    public static native void glesInit();

    public static native void glesRender();

    public static native void glesResize();

}
