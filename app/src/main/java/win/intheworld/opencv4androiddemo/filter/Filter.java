package win.intheworld.opencv4androiddemo.filter;

import org.opencv.core.Mat;

/**
 * Created by swliu on 2018/2/8.
 * Email: swliu@cam2cloud.com
 */

public interface Filter {

    void apply(Mat input, Mat output);
}
