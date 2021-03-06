package com.sanitation.app;

public class Constants {
    private Constants() {
    }

    private static final String LOCAL_HOST = "192.168.1.84";
    private static final String LOCAL_HOST_PORT = ":3000";
    public static final String METEOR_SERVER_SOCKET = "ws://" + LOCAL_HOST + LOCAL_HOST_PORT + "/websocket";
    public static final String METEOR_LOCATION_ENDPOINT = "http://" + LOCAL_HOST + LOCAL_HOST_PORT + "/api/location";

    public static final String[] DEPARTMENT = {"一所", "二所", "三所", "四所", "五所", "六所"};
    public static final String[] ONLINE_STATUS = {"只显示在线", "所有人员"};

    public static final String[] SIGN_TYPES = {"签到","签退"};

    public class SearchHin {
        private static final String SEARCH_NOTICE = "搜索通知";
        private static final String SEARCH_STAFF = "搜索员工";
    }

    public class SignInAndOut {
        public static final int SUPERVISOR_SIGN_IN = 1;
        public static final int SUPERVISOR_SIGN_OUT = 1;
        public static final int CLEANER_SIGN_IN = 1;
        public static final int CLEANER_SIGN_OUT = 1;
    }

    public class SignType {
        public static final String SIGN_IN = "签到";
        public static final String SIGN_OUT = "签退";
    }

    public class StaffRole {
        public static final String SUPERVISOR = "巡查员";
        public static final String CLEANER = "扫保人员";
    }

    public class MongoCollection {
        public static final String NOTICE = "notices";
        public static final String RELATED_STAFF = "relatedStaff";
        public static final String STAFF = "staffs";
        public static final String SIGN = "signInOut";

        public static final String EVENT = "events";
        public static final String EVENT_TYPE = "event_types";
    }

}
