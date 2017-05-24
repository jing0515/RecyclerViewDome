package com.bawei.lvwenjing.recyclerviewdome.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lenovo-pc on 2017/5/21.
 */

public class Utils {
    public static String getInput(InputStream is) {
        try {
            ByteArrayOutputStream boa = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            int len = 0;
            while ((len = is.read(buff)) != -1) {
                boa.write(buff, 0, len);
            }
            return boa.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
