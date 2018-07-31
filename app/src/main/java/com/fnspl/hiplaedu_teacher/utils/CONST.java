package com.fnspl.hiplaedu_teacher.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;

import com.fnspl.hiplaedu_teacher.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;

/**
 * Created by FNSPL on 9/8/2017.
 */

public class CONST {
    public static final String TOKEN = "token";
    public static final String SESSION_ID = "session_id";
    public static final String PROFILE_INFO = "profileInfo";
    public static final String CLASS_START = "classStart";
    public static final String LOGIN_FOR_FIRST_TIME = "loginForFirstTime";
    public static final String CURRENT_PERIOD = "currentPeriod";
    public static final String CLASS_STARTED = "classStarted";
    public static final String CLASS_ENDED = "classEnded";
    public static final String PHONE_NUMBER = "phoneNumber";
    public static final String CLASS_RUNNING = "classRunning";
    public static final String UPDATE_PROFILE = "updateProfile";
    public static final String NEXT_PERIOD = "nextClass" ;
    public static final String ZONE_ID = "zoneId";
    public static final String POINTY = "pointY";
    public static final String POINTX = "pointX";
    public static final int ATTENDANCE_ROOM_ID = 2;
    public static final String OTP = "otp";
    public static String NOTIFICATION_TYPE = "notificationType";
    public static final String IS_IN_CLASS = "isInClass";
    public static final int ROUTINE_FETCH_ID = 100;
    public static final int CLASS_START_ID = 101;
    public static final int CLASS_END_ID = 102;

    public static DisplayImageOptions ErrorWithLoaderRoundedCorner = new DisplayImageOptions.Builder()
            .showImageOnFail(R.drawable.no_profile_image)
            .showImageOnLoading(R.drawable.no_profile_image)
            .cacheInMemory(true)
            .cacheOnDisk(true)
            .considerExifParams(true)
            .imageScaleType(ImageScaleType.EXACTLY)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .displayer(new RoundedBitmapDisplayer(1000))
            .postProcessor(new BitmapProcessor() {
                @Override
                public Bitmap process(Bitmap bmp) {

                    int dimension = getSquareCropDimensionForBitmap(bmp);
                    bmp = ThumbnailUtils.extractThumbnail(bmp, dimension, dimension);
                    return bmp;
                }
            })
            .build();

    public static DisplayImageOptions ErrorWithLoaderNormalCorner = new DisplayImageOptions.Builder()
            .resetViewBeforeLoading(true)
            .showImageOnFail(R.mipmap.ic_launcher_round)
            .showImageOnLoading(R.mipmap.ic_launcher_round)
            .cacheInMemory(true)
            .cacheOnDisk(true)
            .displayer(new RoundedBitmapDisplayer(2))
            .postProcessor(new BitmapProcessor() {
                @Override
                public Bitmap process(Bitmap bmp) {

                    int dimension = getSquareCropDimensionForBitmap(bmp);
                    bmp = ThumbnailUtils.extractThumbnail(bmp, dimension, dimension);
                    return bmp;
                }
            })
            .considerExifParams(true)
            .imageScaleType(ImageScaleType.EXACTLY)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .build();
    public static boolean isNotified=false;
    public static boolean isNotified1=false;

    public static int getSquareCropDimensionForBitmap(Bitmap bitmap) {
        //use the smallest dimension of the image to crop to
        return Math.min(bitmap.getWidth(), bitmap.getHeight());
    }
}
