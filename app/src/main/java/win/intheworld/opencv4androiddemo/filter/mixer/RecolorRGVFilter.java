package win.intheworld.opencv4androiddemo.filter.mixer;

import org.opencv.core.Core;
import org.opencv.core.Mat;

import java.util.ArrayList;

import win.intheworld.opencv4androiddemo.filter.Filter;


public class RecolorRGVFilter implements Filter {
    
    private final ArrayList<Mat> mChannels = new ArrayList<Mat>(4);
    
    @Override
    public void apply(final Mat src, final Mat dst) {
        Core.split(src, mChannels);
        
        final Mat r = mChannels.get(0);
        final Mat g = mChannels.get(1);
        final Mat b = mChannels.get(2);
        
        // dst.b = min(dst.r, dst.g, dst.b)
        Core.min(b, r, b);
        Core.min(b, g, b);
        
        Core.merge(mChannels, dst);
    }
}
