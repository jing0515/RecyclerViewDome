package com.bawei.lvwenjing.recyclerviewdome;

import java.util.List;

/**
 * Created by lenovo-pc on 2017/5/23.
 */

public class Bean {

    /**
     * ret_code : 200
     * ret_msg : ok
     * list : [{"date":"444","id":4,"pic":"http://p3.pstatp.com/list/190x124/1dc900048479b4bd9d6a","title":" \n空调原来要这么用才省电，后悔知道太晚，浪费不少钱！","type":1},{"date":"5555","id":5,"pic":"http://p3.pstatp.com/large/22c70005e93dcaf6bfa8|http://p1.pstatp.com/list/190x124/22b400060773190f7816","title":" \n袁世凯临终前，在传位名单上写下三个人的名字，众人看了敬佩不已","type":2},{"date":"6666","id":6,"pic":"http://p3.pstatp.com/list/190x124/216d001357929b02f476","title":" \n张爱朋首回应白百何绯闻事件，短短二句话，白百何后悔看错了吧！","type":1},{"date":"111","id":10,"pic":"http://p3.pstatp.com/list/190x124/22c6000628d79850e6d7","title":"号称中国关系最硬的人，奶奶是慈禧，大伯是光绪，哥哥是宣统！","type":1},{"date":"222","id":11,"pic":"http://p3.pstatp.com/list/190x124/22ca00011911b0a8061c","title":" \n\u201c二婚女和剩女，我该娶哪个啊？求救！\u201d","type":1}]
     */

    private int ret_code;
    private String ret_msg;
    private List<ListBean> list;

    public int getRet_code() {
        return ret_code;
    }

    public void setRet_code(int ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * date : 444
         * id : 4
         * pic : http://p3.pstatp.com/list/190x124/1dc900048479b4bd9d6a
         * title :
         空调原来要这么用才省电，后悔知道太晚，浪费不少钱！
         * type : 1
         */

        private String date;
        private int id;
        private String pic;
        private String title;
        private int type;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
