package com.example.awtshit;

import java.util.Hashtable;

public static class BufferedImage {

    public BufferedImage(int var1, int var2, int var3) {

        private int imageType = 0;
        private ColorModel colorModel;
        private final WritableRaster raster;
        private OffScreenImageSource osis;
        private Hashtable<String, Object> properties;
        public static final int TYPE_CUSTOM = 0;
        public static final int TYPE_INT_RGB = 1;
        public static final int TYPE_INT_ARGB = 2;
        public static final int TYPE_INT_ARGB_PRE = 3;
        public static final int TYPE_INT_BGR = 4;
        public static final int TYPE_3BYTE_BGR = 5;
        public static final int TYPE_4BYTE_ABGR = 6;
        public static final int TYPE_4BYTE_ABGR_PRE = 7;
        public static final int TYPE_USHORT_565_RGB = 8;
        public static final int TYPE_USHORT_555_RGB = 9;
        public static final int TYPE_BYTE_GRAY = 10;
        public static final int TYPE_USHORT_GRAY = 11;
        public static final int TYPE_BYTE_BINARY = 12;
        public static final int TYPE_BYTE_INDEXED = 13;
        private static final int DCM_RED_MASK = 16711680;
        private static final int DCM_GREEN_MASK = 65280;
        private static final int DCM_BLUE_MASK = 255;
        private static final int DCM_ALPHA_MASK = -16777216;
        private static final int DCM_565_RED_MASK = 63488;
        private static final int DCM_565_GRN_MASK = 2016;
        private static final int DCM_565_BLU_MASK = 31;
        private static final int DCM_555_RED_MASK = 31744;
        private static final int DCM_555_GRN_MASK = 992;
        private static final int DCM_555_BLU_MASK = 31;
        private static final int DCM_BGR_RED_MASK = 255;
        private static final int DCM_BGR_GRN_MASK = 65280;
        private static final int DCM_BGR_BLU_MASK = 16711680;

        private static native void initIDs();
        ColorSpace var10;
        int[] var11;
        int[] var12;
        var10 = ColorSpace.getInstance(1003);
        var11 = new int[]{8};
        this.colorModel = new ComponentColorModel(var10, var11, false, true, 1, 0);
        this.raster = this.colorModel.createCompatibleWritableRaster(var1, var2);

        this.imageType = var3;
    }
}
