package com.jadyer.seed.simcoder;

import com.jadyer.seed.simcoder.helper.GenerateHelper;

public class SimcoderRun {
    public static final String PACKGET_PREFIX = "com.jadyer.seed.mpp";
    public static final String DB_ADDRESS = "127.0.0.1:3306";
    public static final String DB_NAME = "ifs";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "xuanyu";

    public static void main(String[] args){
        //GenerateHelper.generate("mpp", "t_mpp_user_info");
        GenerateHelper.generate("mpp");
    }
}