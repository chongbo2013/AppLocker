package com.noahmob.AppLocker.upgrade;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.InputDeviceCompat;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import com.google.android.exoplayer.extractor.ts.PsExtractor;
import com.google.android.exoplayer.util.MimeTypes;

public class OptimConst {
    public static final String ACTION_LAUNCH_APPMAN_FROM_EXAM = "action_launch_appman_exam";
    public static final int BIGFILE_DELETED = 2;
    public static final int BIGFILE_DELETING = 1;
    public static final float DENSITY_SCALE_HDPI = 1.5f;
    public static final float DENSITY_SCALE_MDPI = 1.0f;
    public static final float DENSITY_SCALE_XHDPI = 2.0f;
    public static final float DENSITY_SCALE_XXHDPI = 3.0f;
    public static final String DOWNLOAD_APK_DIR = "/com.noahapp.nshare/";
    public static final String INSTALLED_APK = "installed_apk";
    public static final String INSTALLED_APK_COUNT = "installed_apk_count";
    public static final String INSTALLED_APK_SIZE = "installed_apk_size";
    public static final String INSTALLED_APP_COUNT = "installed_app_count";
    public static final String INSTALLED_APP_SIZE = "installed_app_size";
    public static final int LARGEFILE_STATE_DEFAULT = 0;
    public static final String LENOVO_MODE = "Lenovo P780";
    public static final int MAX_PRIORITY = Integer.MAX_VALUE;
    public static final String[][] MIME_MapTable;
    public static final int MSG_ID_ADVANCED_SCAN = 24;
    public static final int MSG_ID_APPSIZE_CALCULATED = 33;
    public static final int MSG_ID_BATTERY_PERCENT = 19;
    public static final int MSG_ID_DATACHAGED = 17;
    public static final int MSG_ID_DECREASE_EXTERNAL_SPACE = 16;
    public static final int MSG_ID_DECREASE_INTERNAL_SPACE = 15;
    public static final int MSG_ID_DELETE_COMPLETED = 9;
    public static final int MSG_ID_FIND_BIGFILES = 23;
    public static final int MSG_ID_FIND_USELESS_APK = 22;
    public static final int MSG_ID_FINISH_DELETE = 8;
    public static final int MSG_ID_FINISH_DELETE_SPECFILE = 12;
    public static final int MSG_ID_FLY_ANIMATION = 29;
    public static final int MSG_ID_FORCE_CLOSE = 34;
    public static final int MSG_ID_INCREASE_EXTERNAL_SPACE = 14;
    public static final int MSG_ID_INCREASE_INTERNAL_SPACE = 13;
    public static final int MSG_ID_KILL_RUNNING_APP = 32;
    public static final int MSG_ID_LOADING_STATE = 21;
    public static final int MSG_ID_MEMORY_PERCENT = 18;
    public static final int MSG_ID_NOTIFY_DATA_CHANGED = 31;
    public static final int MSG_ID_SCAN_APK_COMPLETED = 20;
    public static final int MSG_ID_SCAN_COMPLETED = 6;
    public static final int MSG_ID_SCAN_PATH = 1;
    public static final int MSG_ID_START_DELETE = 7;
    public static final int MSG_ID_START_DELETE_SPECFILE = 11;
    private static final int MSG_ID_START_INDEX = 0;
    public static final int MSG_ID_START_LOAD_DATA = 30;
    public static final int MSG_ID_UPDATE_APK = 26;
    public static final int MSG_ID_UPDATE_APP = 27;
    public static final int MSG_ID_UPDATE_APPCACHE = 2;
    public static final int MSG_ID_UPDATE_BATTERY = 28;
    public static final int MSG_ID_UPDATE_EMPTYFOLDERS = 5;
    public static final int MSG_ID_UPDATE_LARGEFILE = 10;
    public static final int MSG_ID_UPDATE_LOG = 3;
    public static final int MSG_ID_UPDATE_PROCESSCLEEAN = 25;
    public static final int MSG_ID_UPDATE_TEMP = 4;
    public static final int MSG_START_DELETE_BIGFILE = 13;
    public static final int MSG_START_INIT_DATA = 9;
    public static final int MSG_START_SCAN = 10;
    public static final int MSG_START_SCAN_BIGFILE = 12;
    public static final String NOT_INSTALLED_APK = "uninstalled_apk";
    public static final String OPTIMDOCTOR_PACKAGENAME = "com.noahapp.nshare";
    public static final int SD_COUNT_MAX = 4;
    public static final int SD_MOUNT_ONE = 1;
    public static final int SD_MOUNT_TWO = 2;
    public static final int SD_MOUNT_ZERO = 0;
    public static final String SUMSUNG_MODE = "GT-I9500";
    public static final String TAG = "OP";
    public static final int VERSION_CODE_GINGERBREAD = 9;
    public static final int VERSION_CODE_JELLY_BEAN = 16;
    public static final int VERSION_CODE_JELLY_BEAN_MR1 = 17;
    public static final int VERSION_CODE_JELLY_BEAN_MR2 = 18;
    public static final int VERSION_CODE_KIT_KAT = 19;

    static {
        String[][] r0 = new String[414][];
        r0[0] = new String[]{"3gp", MimeTypes.VIDEO_H263};
        r0[1] = new String[]{"aab", "application/x-authoware-bin"};
        r0[2] = new String[]{"aam", "application/x-authoware-map"};
        r0[3] = new String[]{"aas", "application/x-authoware-seg"};
        r0[4] = new String[]{"ai", "application/postscript"};
        r0[5] = new String[]{"aif", "audio/x-aiff"};
        r0[6] = new String[]{"aifc", "audio/x-aiff"};
        r0[7] = new String[]{"aiff", "audio/x-aiff"};
        r0[8] = new String[]{"als", "audio/X-Alpha5"};
        r0[9] = new String[]{"amc", "application/x-mpeg"};
        r0[10] = new String[]{"ani", "application/octet-stream"};
        r0[11] = new String[]{"apk", "application/vnd.android.package-archive"};
        r0[12] = new String[]{"asc", "text/plain"};
        r0[13] = new String[]{"asd", "application/astound"};
        r0[14] = new String[]{"asf", "video/x-ms-asf"};
        r0[15] = new String[]{"asn", "application/astound"};
        r0[16] = new String[]{"asp", "application/x-asap"};
        r0[17] = new String[]{"asx", "video/x-ms-asf"};
        r0[18] = new String[]{"au", "audio/basic"};
        r0[19] = new String[]{"avb", "application/octet-stream"};
        r0[20] = new String[]{"avi", "video/x-msvideo"};
        r0[21] = new String[]{"awb", MimeTypes.AUDIO_AMR_WB};
        r0[22] = new String[]{"flv", "video/x-flv"};
        r0[23] = new String[]{"bcpio", "application/x-bcpio"};
        r0[24] = new String[]{"bin", "application/octet-stream"};
        r0[25] = new String[]{"bld", "application/bld"};
        r0[26] = new String[]{"bld2", "application/bld2"};
        r0[27] = new String[]{"bmp", "image/bmp"};
        r0[28] = new String[]{"bpk", "application/octet-stream"};
        r0[29] = new String[]{"bz2", "application/x-bzip2"};
        r0[30] = new String[]{"c", "text/x-csrc"};
        r0[31] = new String[]{"cpp", "text/x-c++src"};
        r0[32] = new String[]{"cal", "image/x-cals"};
        r0[33] = new String[]{"ccn", "application/x-cnc"};
        r0[34] = new String[]{"cco", "application/x-cocoa"};
        r0[35] = new String[]{"cdf", "application/x-netcdf"};
        r0[36] = new String[]{"cgi", "magnus-internal/cgi"};
        r0[37] = new String[]{"chat", "application/x-chat"};
        r0[38] = new String[]{"class", "application/octet-stream"};
        r0[39] = new String[]{"clp", "application/x-msclip"};
        r0[40] = new String[]{"cmx", "application/x-cmx"};
        r0[41] = new String[]{"co", "application/x-cult3d-object"};
        r0[42] = new String[]{"cod", "image/cis-cod"};
        r0[43] = new String[]{"cpio", "application/x-cpio"};
        r0[44] = new String[]{"cpt", "application/mac-compactpro"};
        r0[45] = new String[]{"crd", "application/x-mscardfile"};
        r0[46] = new String[]{"csh", "application/x-csh"};
        r0[47] = new String[]{"csm", "chemical/x-csml"};
        r0[48] = new String[]{"csml", "chemical/x-csml"};
        r0[49] = new String[]{"css", "text/css"};
        r0[50] = new String[]{"cur", "application/octet-stream"};
        r0[51] = new String[]{"dcm", "x-lml/x-evm"};
        r0[52] = new String[]{"dcr", "application/x-director"};
        r0[53] = new String[]{"dcx", "image/x-dcx"};
        r0[54] = new String[]{"dhtml", "text/html"};
        r0[55] = new String[]{"dir", "application/x-director"};
        r0[56] = new String[]{"dll", "application/octet-stream"};
        r0[57] = new String[]{"dmg", "application/octet-stream"};
        r0[58] = new String[]{"dms", "application/octet-stream"};
        r0[59] = new String[]{"doc", "application/msword"};
        r0[60] = new String[]{"dot", "application/x-dot"};
        r0[61] = new String[]{"dvi", "application/x-dvi"};
        r0[62] = new String[]{"dwf", "drawing/x-dwf"};
        r0[63] = new String[]{"dwg", "application/x-autocad"};
        r0[64] = new String[]{"dxf", "application/x-autocad"};
        r0[65] = new String[]{"dxr", "application/x-director"};
        r0[66] = new String[]{"ebk", "application/x-expandedbook"};
        r0[67] = new String[]{"emb", "chemical/x-embl-dl-nucleotide"};
        r0[68] = new String[]{"embl", "chemical/x-embl-dl-nucleotide"};
        r0[69] = new String[]{"eps", "application/postscript"};
        r0[70] = new String[]{"eri", "image/x-eri"};
        r0[71] = new String[]{"es", "audio/echospeech"};
        r0[72] = new String[]{"esl", "audio/echospeech"};
        r0[73] = new String[]{"etc", "application/x-earthtime"};
        r0[74] = new String[]{"etx", "text/x-setext"};
        r0[75] = new String[]{"evm", "x-lml/x-evm"};
        r0[76] = new String[]{"evy", "application/x-envoy"};
        r0[77] = new String[]{"exe", "application/octet-stream"};
        r0[78] = new String[]{"fh4", "image/x-freehand"};
        r0[79] = new String[]{"fh5", "image/x-freehand"};
        r0[80] = new String[]{"fhc", "image/x-freehand"};
        r0[81] = new String[]{"fif", "image/fif"};
        r0[82] = new String[]{"fm", "application/x-maker"};
        r0[83] = new String[]{"fpx", "image/x-fpx"};
        r0[84] = new String[]{"fvi", "video/isivideo"};
        r0[85] = new String[]{"gau", "chemical/x-gaussian-input"};
        r0[86] = new String[]{"gca", "application/x-gca-compressed"};
        r0[87] = new String[]{"gdb", "x-lml/x-gdb"};
        r0[88] = new String[]{"gif", "image/gif"};
        r0[89] = new String[]{"gps", "application/x-gps"};
        r0[90] = new String[]{"gtar", "application/x-gtar"};
        r0[91] = new String[]{"gz", "application/x-gzip"};
        r0[92] = new String[]{"h", "text/x-chdr"};
        r0[93] = new String[]{"hdf", "application/x-hdf"};
        r0[94] = new String[]{"hdm", "text/x-hdml"};
        r0[95] = new String[]{"hdml", "text/x-hdml"};
        r0[96] = new String[]{"hlp", "application/winhlp"};
        r0[97] = new String[]{"hqx", "application/mac-binhex40"};
        r0[98] = new String[]{"htm", "text/html"};
        r0[99] = new String[]{"html", "text/html"};
        r0[100] = new String[]{"hts", "text/html"};
        r0[101] = new String[]{"ice", "x-conference/x-cooltalk"};
        r0[102] = new String[]{"ico", "application/octet-stream"};
        r0[103] = new String[]{"ief", "image/ief"};
        r0[104] = new String[]{"ifm", "image/gif"};
        r0[105] = new String[]{"ifs", "image/ifs"};
        r0[106] = new String[]{"imy", "audio/melody"};
        r0[107] = new String[]{"ins", "application/x-NET-Install"};
        r0[108] = new String[]{"ips", "application/x-ipscript"};
        r0[109] = new String[]{"ipx", "application/x-ipix"};
        r0[110] = new String[]{"it", "audio/x-mod"};
        r0[111] = new String[]{"itz", "audio/x-mod"};
        r0[112] = new String[]{"ivr", "i-world/i-vrml"};
        r0[113] = new String[]{"j2k", "image/j2k"};
        r0[114] = new String[]{"jad", "text/vnd.sun.j2me.app-descriptor"};
        r0[115] = new String[]{"jam", "application/x-jam"};
        r0[116] = new String[]{"java", "application/x-java"};
        r0[117] = new String[]{"jar", "application/java-archive"};
        r0[118] = new String[]{"jnlp", "application/x-java-jnlp-file"};
        r0[119] = new String[]{"jpe", "image/jpeg"};
        r0[120] = new String[]{"jpeg", "image/jpeg"};
        r0[121] = new String[]{"jpg", "image/jpeg"};
        r0[122] = new String[]{"jpz", "image/jpeg"};
        r0[123] = new String[]{"js", "application/x-javascript"};
        r0[124] = new String[]{"jwc", "application/jwc"};
        r0[125] = new String[]{"kjx", "application/x-kjx"};
        r0[TransportMediator.KEYCODE_MEDIA_PLAY] = new String[]{"lak", "x-lml/x-lak"};
        r0[TransportMediator.KEYCODE_MEDIA_PAUSE] = new String[]{"latex", "application/x-latex"};
        r0[128] = new String[]{"lcc", "application/fastman"};
        r0[129] = new String[]{"lcl", "application/x-digitalloca"};
        r0[TransportMediator.KEYCODE_MEDIA_RECORD] = new String[]{"lcr", "application/x-digitalloca"};
        r0[131] = new String[]{"lgh", "application/lgh"};
        r0[132] = new String[]{"lha", "application/octet-stream"};
        r0[133] = new String[]{"lml", "x-lml/x-lml"};
        r0[134] = new String[]{"lmlpack", "x-lml/x-lmlpack"};
        r0[135] = new String[]{"lsf", "video/x-ms-asf"};
        r0[136] = new String[]{"lsx", "video/x-ms-asf"};
        r0[137] = new String[]{"lzh", "application/x-lzh"};
        r0[138] = new String[]{"m13", "application/x-msmediaview"};
        r0[139] = new String[]{"m14", "application/x-msmediaview"};
        r0[140] = new String[]{"m15", "audio/x-mod"};
        r0[141] = new String[]{"m3u", "audio/x-mpegurl"};
        r0[142] = new String[]{"m3url", "audio/x-mpegurl"};
        r0[143] = new String[]{"ma1", "audio/ma1"};
        r0[144] = new String[]{"ma2", "audio/ma2"};
        r0[145] = new String[]{"ma3", "audio/ma3"};
        r0[146] = new String[]{"ma5", "audio/ma5"};
        r0[147] = new String[]{"man", "application/x-troff-man"};
        r0[148] = new String[]{"map", "magnus-internal/imagemap"};
        r0[149] = new String[]{"mbd", "application/mbedlet"};
        r0[150] = new String[]{"mct", "application/x-mascot"};
        r0[151] = new String[]{"mdb", "application/x-msaccess"};
        r0[152] = new String[]{"mdz", "audio/x-mod"};
        r0[153] = new String[]{"me", "application/x-troff-me"};
        r0[154] = new String[]{"mel", "text/x-vmel"};
        r0[155] = new String[]{"mi", "application/x-mif"};
        r0[156] = new String[]{"mid", "audio/midi"};
        r0[157] = new String[]{"midi", "audio/midi"};
        r0[158] = new String[]{"mif", "application/x-mif"};
        r0[159] = new String[]{"mil", "image/x-cals"};
        r0[160] = new String[]{"mio", "audio/x-mio"};
        r0[161] = new String[]{"mmf", "application/x-skt-lbs"};
        r0[162] = new String[]{"mng", "video/x-mng"};
        r0[163] = new String[]{"mny", "application/x-msmoney"};
        r0[164] = new String[]{"moc", "application/x-mocha"};
        r0[165] = new String[]{"mocha", "application/x-mocha"};
        r0[166] = new String[]{"mod", "audio/x-mod"};
        r0[167] = new String[]{"mof", "application/x-yumekara"};
        r0[168] = new String[]{"mol", "chemical/x-mdl-molfile"};
        r0[169] = new String[]{"mop", "chemical/x-mopac-input"};
        r0[170] = new String[]{"mov", "video/quicktime"};
        r0[171] = new String[]{"movie", "video/x-sgi-movie"};
        r0[172] = new String[]{"mp2", "audio/x-mpeg"};
        r0[173] = new String[]{"mp3", "audio/x-mpeg"};
        r0[174] = new String[]{"mp4", MimeTypes.VIDEO_MP4};
        r0[175] = new String[]{"mpc", "application/vnd.mpohun.certificate"};
        r0[176] = new String[]{"mpe", "video/mpeg"};
        r0[177] = new String[]{"mpeg", "video/mpeg"};
        r0[178] = new String[]{"mpg", "video/mpeg"};
        r0[179] = new String[]{"mpg4", MimeTypes.VIDEO_MP4};
        r0[180] = new String[]{"mpga", MimeTypes.AUDIO_MPEG};
        r0[181] = new String[]{"mpn", "application/vnd.mophun.application"};
        r0[182] = new String[]{"mpp", "application/vnd.ms-project"};
        r0[183] = new String[]{"mps", "application/x-mapserver"};
        r0[184] = new String[]{"mrl", "text/x-mrml"};
        r0[185] = new String[]{"mrm", "application/x-mrm"};
        r0[186] = new String[]{"ms", "application/x-troff-ms"};
        r0[187] = new String[]{"mts", "application/metastream"};
        r0[188] = new String[]{"mtx", "application/metastream"};
//        r0[PsExtractor.PRIVATE_STREAM_1] = new String[]{"mtz", "application/metastream"};
        r0[189] = new String[]{"mtz", "application/metastream"};
//        r0[FacebookRequestErrorClassification.EC_INVALID_TOKEN] = new String[]{"mzv", "application/metastream"};
        r0[190] = new String[]{"mzv", "application/metastream"};
        r0[191] = new String[]{"nar", "application/zip"};
//        r0[PsExtractor.AUDIO_STREAM] = new String[]{"nbmp", "image/nbmp"};
        r0[192] = new String[]{"nbmp", "image/nbmp"};
        r0[193] = new String[]{"nc", "application/x-netcdf"};
        r0[194] = new String[]{"ndb", "x-lml/x-ndb"};
        r0[195] = new String[]{"ndwn", "application/ndwn"};
        r0[196] = new String[]{"nif", "application/x-nif"};
        r0[197] = new String[]{"nmz", "application/x-scream"};
        r0[198] = new String[]{"nokia-op-logo", "image/vnd.nok-oplogo-color"};
        r0[199] = new String[]{"npx", "application/x-netfpx"};
        r0[200] = new String[]{"nsnd", "audio/nsnd"};
        r0[201] = new String[]{"nva", "application/x-neva1"};
        r0[202] = new String[]{"oda", "application/oda"};
        r0[203] = new String[]{"oom", "application/x-AtlasMate-Plugin"};
        r0[204] = new String[]{"pac", "audio/x-pac"};
        r0[205] = new String[]{"pae", "audio/x-epac"};
        r0[206] = new String[]{"pan", "application/x-pan"};
        r0[207] = new String[]{"pbm", "image/x-portable-bitmap"};
        r0[208] = new String[]{"pcx", "image/x-pcx"};
        r0[209] = new String[]{"pda", "image/x-pda"};
        r0[210] = new String[]{"pdb", "chemical/x-pdb"};
        r0[211] = new String[]{"pdf", "application/pdf"};
        r0[212] = new String[]{"pfr", "application/font-tdpfr"};
        r0[213] = new String[]{"pgm", "image/x-portable-graymap"};
        r0[214] = new String[]{"pict", "image/x-pict"};
        r0[215] = new String[]{"pm", "application/x-perl"};
        r0[216] = new String[]{"pmd", "application/x-pmd"};
        r0[217] = new String[]{"png", "image/png"};
        r0[218] = new String[]{"pnm", "image/x-portable-anymap"};
        r0[219] = new String[]{"pnz", "image/png"};
        r0[220] = new String[]{"pot", "application/vnd.ms-powerpoint"};
        r0[221] = new String[]{"ppm", "image/x-portable-pixmap"};
        r0[222] = new String[]{"pps", "application/vnd.ms-powerpoint"};
        r0[223] = new String[]{"ppt", "application/vnd.ms-powerpoint"};
        r0[224] = new String[]{"pqf", "application/x-cprplayer"};
        r0[225] = new String[]{"pqi", "application/cprplayer"};
        r0[226] = new String[]{"prc", "application/x-prc"};
        r0[227] = new String[]{"proxy", "application/x-ns-proxy-autoconfig"};
        r0[228] = new String[]{"ps", "application/postscript"};
        r0[229] = new String[]{"ptlk", "application/listenup"};
        r0[230] = new String[]{"pub", "application/x-mspublisher"};
        r0[231] = new String[]{"pvx", "video/x-pv-pvx"};
        r0[232] = new String[]{"qcp", "audio/vnd.qcelp"};
        r0[233] = new String[]{"qt", "video/quicktime"};
        r0[234] = new String[]{"qti", "image/x-quicktime"};
        r0[235] = new String[]{"qtif", "image/x-quicktime"};
        r0[236] = new String[]{"r3t", "text/vnd.rn-realtext3d"};
        r0[237] = new String[]{"ra", "audio/x-pn-realaudio"};
        r0[238] = new String[]{"ram", "audio/x-pn-realaudio"};
        r0[239] = new String[]{"rar", "application/x-rar-compressed"};
        r0[PsExtractor.VIDEO_STREAM_MASK] = new String[]{"ras", "image/x-cmu-raster"};
        r0[241] = new String[]{"rdf", "application/rdf+xml"};
        r0[242] = new String[]{"rf", "image/vnd.rn-realflash"};
        r0[243] = new String[]{"rgb", "image/x-rgb"};
        r0[244] = new String[]{"rlf", "application/x-richlink"};
        r0[245] = new String[]{"rm", "video/x-pn-realaudio"};
        r0[246] = new String[]{"rmf", "video/x-rmf"};
        r0[247] = new String[]{"rmm", "audio/x-pn-realaudio"};
        r0[248] = new String[]{"rmvb", "video/x-pn-realaudio"};
        r0[249] = new String[]{"rnx", "application/vnd.rn-realplayer"};
        r0[Callback.DEFAULT_SWIPE_ANIMATION_DURATION] = new String[]{"roff", "application/x-troff"};
        r0[251] = new String[]{"rp", "image/vnd.rn-realpix"};
        r0[252] = new String[]{"rpm", "audio/x-pn-realaudio-plugin"};
        r0[253] = new String[]{"rt", "text/vnd.rn-realtext"};
        r0[254] = new String[]{"rte", "x-lml/x-gps"};
        r0[255] = new String[]{"rtf", "application/rtf"};
        r0[256] = new String[]{"rtg", "application/metastream"};
        r0[InputDeviceCompat.SOURCE_KEYBOARD] = new String[]{"rtx", "text/richtext"};
        r0[258] = new String[]{"rv", "video/vnd.rn-realvideo"};
        r0[259] = new String[]{"rwc", "application/x-rogerwilco"};
        r0[260] = new String[]{"s3m", "audio/x-mod"};
        r0[261] = new String[]{"s3z", "audio/x-mod"};
        r0[262] = new String[]{"sca", "application/x-supercard"};
        r0[263] = new String[]{"scd", "application/x-msschedule"};
        r0[264] = new String[]{"sdf", "application/e-score"};
        r0[265] = new String[]{"sea", "application/x-stuffit"};
        r0[266] = new String[]{"sgm", "text/x-sgml"};
        r0[267] = new String[]{"sgml", "text/x-sgml"};
        r0[268] = new String[]{"sh", "application/x-sh"};
        r0[269] = new String[]{"shar", "application/x-shar"};
        r0[270] = new String[]{"shtml", "magnus-internal/parsed-html"};
        r0[271] = new String[]{"shw", "application/presentations"};
        r0[272] = new String[]{"si6", "image/si6"};
        r0[273] = new String[]{"si7", "image/vnd.stiwap.sis"};
        r0[274] = new String[]{"si9", "image/vnd.lgtwap.sis"};
        r0[275] = new String[]{"sis", "application/vnd.symbian.install"};
        r0[276] = new String[]{"sit", "application/x-stuffit"};
        r0[277] = new String[]{"skd", "application/x-Koan"};
        r0[278] = new String[]{"skm", "application/x-Koan"};
        r0[279] = new String[]{"skp", "application/x-Koan"};
        r0[280] = new String[]{"skt", "application/x-Koan"};
        r0[281] = new String[]{"slc", "application/x-salsa"};
        r0[282] = new String[]{"smd", "audio/x-smd"};
        r0[283] = new String[]{"smi", "application/smil"};
        r0[284] = new String[]{"smil", "application/smil"};
        r0[285] = new String[]{"smp", "application/studiom"};
        r0[286] = new String[]{"smz", "audio/x-smd"};
        r0[287] = new String[]{"snd", "audio/basic"};
        r0[288] = new String[]{"spc", "text/x-speech"};
        r0[289] = new String[]{"spl", "application/futuresplash"};
        r0[290] = new String[]{"spr", "application/x-sprite"};
        r0[291] = new String[]{"sprite", "application/x-sprite"};
        r0[292] = new String[]{"spt", "application/x-spt"};
        r0[293] = new String[]{"src", "application/x-wais-source"};
        r0[294] = new String[]{"stk", "application/hyperstudio"};
        r0[295] = new String[]{"stm", "audio/x-mod"};
        r0[296] = new String[]{"sv4cpio", "application/x-sv4cpio"};
        r0[297] = new String[]{"sv4crc", "application/x-sv4crc"};
        r0[298] = new String[]{"svf", "image/vnd"};
        r0[299] = new String[]{"svg", "image/svg-xml"};
        r0[300] = new String[]{"svh", "image/svh"};
        r0[301] = new String[]{"svr", "x-world/x-svr"};
        r0[302] = new String[]{"swf", "application/x-shockwave-flash"};
        r0[303] = new String[]{"swfl", "application/x-shockwave-flash"};
        r0[304] = new String[]{"t", "application/x-troff"};
        r0[305] = new String[]{"tad", "application/octet-stream"};
        r0[306] = new String[]{"talk", "text/x-speech"};
        r0[307] = new String[]{"tar", "application/x-tar"};
        r0[308] = new String[]{"taz", "application/x-tar"};
        r0[309] = new String[]{"tbp", "application/x-timbuktu"};
        r0[310] = new String[]{"tbt", "application/x-timbuktu"};
        r0[311] = new String[]{"tcl", "application/x-tcl"};
        r0[312] = new String[]{"tex", "application/x-tex"};
        r0[313] = new String[]{"texi", "application/x-texinfo"};
        r0[314] = new String[]{"texinfo", "application/x-texinfo"};
        r0[315] = new String[]{"tgz", "application/x-tar"};
        r0[316] = new String[]{"thm", "application/vnd.eri.thm"};
        r0[317] = new String[]{"tif", "image/tiff"};
        r0[318] = new String[]{"tiff", "image/tiff"};
        r0[319] = new String[]{"tki", "application/x-tkined"};
        r0[320] = new String[]{"tkined", "application/x-tkined"};
        r0[321] = new String[]{"toc", "application/toc"};
        r0[322] = new String[]{"toy", "image/toy"};
        r0[323] = new String[]{"tr", "application/x-troff"};
        r0[324] = new String[]{"trk", "x-lml/x-gps"};
        r0[325] = new String[]{"trm", "application/x-msterminal"};
        r0[326] = new String[]{"tsi", "audio/tsplayer"};
        r0[327] = new String[]{"tsp", "application/dsptype"};
        r0[328] = new String[]{"tsv", "text/tab-separated-values"};
        r0[329] = new String[]{"tsv", "text/tab-separated-values"};
        r0[330] = new String[]{"ttf", "application/octet-stream"};
        r0[331] = new String[]{"ttz", "application/t-time"};
        r0[332] = new String[]{"txt", "text/plain"};
        r0[333] = new String[]{"ult", "audio/x-mod"};
        r0[334] = new String[]{"ustar", "application/x-ustar"};
        r0[335] = new String[]{"uu", "application/x-uuencode"};
        r0[336] = new String[]{"uue", "application/x-uuencode"};
        r0[337] = new String[]{"vcd", "application/x-cdlink"};
        r0[338] = new String[]{"vcf", "text/x-vcard"};
        r0[339] = new String[]{"vdo", "video/vdo"};
        r0[340] = new String[]{"vib", "audio/vib"};
//        r0[FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS] = new String[]{"viv", "video/vivo"};
        r0[341] = new String[]{"viv", "video/vivo"};
        r0[342] = new String[]{"vivo", "video/vivo"};
        r0[343] = new String[]{"vmd", "application/vocaltec-media-desc"};
        r0[344] = new String[]{"vmf", "application/vocaltec-media-file"};
        r0[345] = new String[]{"vmi", "application/x-dreamcast-vms-info"};
        r0[346] = new String[]{"vms", "application/x-dreamcast-vms"};
        r0[347] = new String[]{"vox", "audio/voxware"};
        r0[348] = new String[]{"vqe", "audio/x-twinvq-plugin"};
        r0[349] = new String[]{"vqf", "audio/x-twinvq"};
        r0[350] = new String[]{"vql", "audio/x-twinvq"};
        r0[351] = new String[]{"vre", "x-world/x-vream"};
        r0[352] = new String[]{"vrml", "x-world/x-vrml"};
        r0[353] = new String[]{"vrt", "x-world/x-vrt"};
        r0[354] = new String[]{"vrw", "x-world/x-vream"};
        r0[355] = new String[]{"vts", "workbook/formulaone"};
        r0[356] = new String[]{"wav", "audio/x-wav"};
        r0[357] = new String[]{"wax", "audio/x-ms-wax"};
        r0[358] = new String[]{"wbmp", "image/vnd.wap.wbmp"};
//        r0[359] = new String[]{AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, "application/vnd.xara"};
        r0[359] = new String[]{"ad_analytics", "application/vnd.xara"};
        r0[360] = new String[]{"wi", "image/wavelet"};
        r0[361] = new String[]{"wis", "application/x-InstallShield"};
        r0[362] = new String[]{"wm", "video/x-ms-wm"};
        r0[363] = new String[]{"wma", "audio/x-ms-wma"};
        r0[364] = new String[]{"wmd", "application/x-ms-wmd"};
        r0[365] = new String[]{"wmf", "application/x-msmetafile"};
        r0[366] = new String[]{"wml", "text/vnd.wap.wml"};
        r0[367] = new String[]{"wmlc", "application/vnd.wap.wmlc"};
        r0[368] = new String[]{"wmls", "text/vnd.wap.wmlscript"};
        r0[369] = new String[]{"wmlsc", "application/vnd.wap.wmlscriptc"};
        r0[370] = new String[]{"wmlscript", "text/vnd.wap.wmlscript"};
        r0[371] = new String[]{"wmv", "video/x-ms-wmv"};
        r0[372] = new String[]{"wmx", "video/x-ms-wmx"};
        r0[373] = new String[]{"wmz", "application/x-ms-wmz"};
        r0[374] = new String[]{"wpng", "image/x-up-wpng"};
        r0[375] = new String[]{"wpt", "x-lml/x-gps"};
        r0[376] = new String[]{"wri", "application/x-mswrite"};
        r0[377] = new String[]{"wrl", "x-world/x-vrml"};
        r0[378] = new String[]{"wrz", "x-world/x-vrml"};
        r0[379] = new String[]{"ws", "text/vnd.wap.wmlscript"};
        r0[380] = new String[]{"wsc", "application/vnd.wap.wmlscriptc"};
        r0[381] = new String[]{"wv", "video/wavelet"};
        r0[382] = new String[]{"wvx", "video/x-ms-wvx"};
        r0[383] = new String[]{"wxl", "application/x-wxl"};
        r0[384] = new String[]{"x-gzip", "application/x-gzip"};
        r0[385] = new String[]{"xar", "application/vnd.xara"};
        r0[386] = new String[]{"xbm", "image/x-xbitmap"};
        r0[387] = new String[]{"xdm", "application/x-xdma"};
        r0[388] = new String[]{"xdma", "application/x-xdma"};
        r0[389] = new String[]{"xdw", "application/vnd.fujixerox.docuworks"};
        r0[390] = new String[]{"xht", "application/xhtml+xml"};
        r0[391] = new String[]{"xhtm", "application/xhtml+xml"};
        r0[392] = new String[]{"xhtml", "application/xhtml+xml"};
        r0[393] = new String[]{"xla", "application/vnd.ms-excel"};
        r0[394] = new String[]{"xlc", "application/vnd.ms-excel"};
        r0[395] = new String[]{"xll", "application/x-excel"};
        r0[396] = new String[]{"xlm", "application/vnd.ms-excel"};
        r0[397] = new String[]{"xls", "application/vnd.ms-excel"};
        r0[398] = new String[]{"xlt", "application/vnd.ms-excel"};
        r0[399] = new String[]{"xlw", "application/vnd.ms-excel"};
        r0[400] = new String[]{"xm", "audio/x-mod"};
        r0[401] = new String[]{"xml", "text/xml"};
        r0[402] = new String[]{"xmz", "audio/x-mod"};
        r0[403] = new String[]{"xpi", "application/x-xpinstall"};
        r0[404] = new String[]{"xpm", "image/x-xpixmap"};
        r0[405] = new String[]{"xsit", "text/xml"};
        r0[406] = new String[]{"xsl", "text/xml"};
        r0[407] = new String[]{"xul", "text/xul"};
        r0[408] = new String[]{"xwd", "image/x-xwindowdump"};
        r0[409] = new String[]{"xyz", "chemical/x-pdb"};
        r0[410] = new String[]{"yz1", "application/x-yz1"};
        r0[411] = new String[]{"z", "application/x-compress"};
        r0[412] = new String[]{"zac", "application/x-zaurus-zac"};
        r0[413] = new String[]{"zip", "application/zip "};
        MIME_MapTable = r0;
    }

    public static String getMIMEType(String name) {
        String type = "*/*";
        if (name.lastIndexOf(".") < 0) {
            return type;
        }
        String end = name.substring(name.lastIndexOf(".") + 1, name.length()).toLowerCase();
        if (end.equals("")) {
            return type;
        }
        for (int i = 0; i < MIME_MapTable.length; i++) {
            if (end.equals(MIME_MapTable[i][0])) {
                type = MIME_MapTable[i][1];
            }
        }
        return type;
    }

    public static String getSuffixByFileName(String name) {
        if (TextUtils.isEmpty(name)) {
            return "";
        }
        if (name.lastIndexOf(".") < 0) {
            return "";
        }
        return name.substring(name.lastIndexOf(".") + 1, name.length()).toLowerCase();
    }
}
