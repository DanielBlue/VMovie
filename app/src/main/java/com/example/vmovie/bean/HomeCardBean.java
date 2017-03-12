package com.example.vmovie.bean;

import java.util.List;

/**
 * Created by 毛琦 on 2017/3/11.
 */

public class HomeCardBean {
    @Override
    public String toString() {
        return "HomeCardBean{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data.toString() +
                '}';
    }

    /**
     * status : 0
     * msg : OK
     * data : [{"postid":"51315","title":"耐克最新女性酷炫广告《真我》","wx_small_app_title":"耐克最新女性广告「This Is Us」","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c2c72fbd572_cut.jpeg","rating":"7.8","duration":"60","publish_time":"1489161960","like_num":"330","share_num":"321","cates":[{"cateid":"13","catename":"广告"}],"request_url":"http://app.vmoiver.com/51315?qingapp=app_new"},{"postid":"51286","title":"法国暖男喜当爹短片《风流债有主》","wx_small_app_title":"初次当爹 还请多多包涵！","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-08/58bf9f0f39fc3_cut.jpeg","rating":"7.2","duration":"861","publish_time":"1489161900","like_num":"137","share_num":"150","cates":[{"cateid":"17","catename":"剧情"}],"request_url":"http://app.vmoiver.com/51286?qingapp=app_new"},{"postid":"51309","title":"油管励志达人鼓舞人心短片《行所不行》","wx_small_app_title":"致所有新时代的内容创作者：行所不行","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c28b582b267_cut.jpeg","rating":"7.3","duration":"232","publish_time":"1489161840","like_num":"299","share_num":"260","cates":[{"cateid":"7","catename":"励志"}],"request_url":"http://app.vmoiver.com/51309?qingapp=app_new"},{"postid":"51292","title":"网友解锁全球城市发展记录片《城市的未来》","wx_small_app_title":"网友暴走全球 揭开通向未来城市之谜","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-08/58bfe5bb7438b_cut.jpeg","rating":"8.2","duration":"1092","publish_time":"1489161780","like_num":"159","share_num":"153","cates":[{"cateid":"24","catename":"纪录"}],"request_url":"http://app.vmoiver.com/51292?qingapp=app_new"},{"postid":"51311","title":"日本毕业季麦当劳招聘动画《未来的我》","wx_small_app_title":"现在前辈的样子 就是未来的我","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c2289e8c6a6_cut.jpeg","rating":"7.5","duration":"78","publish_time":"1489161720","like_num":"202","share_num":"153","cates":[{"cateid":"16","catename":"动画"}],"request_url":"http://app.vmoiver.com/51311?qingapp=app_new"},{"postid":"51307","title":"《速度与激情8》最新预告，汽车狂流汹涌！","wx_small_app_title":"「速度与激情8」最新预告 汽车狂流汹涌","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c215fd8d845_cut.jpeg","rating":"7.5","duration":"194","publish_time":"1489114800","like_num":"329","share_num":"1165","cates":[{"cateid":"43","catename":"预告"}],"request_url":"http://app.vmoiver.com/51307?qingapp=app_new"},{"postid":"51310","title":"终极之战一触即发！《权力的游戏》七月回归","wx_small_app_title":"终极之战一触即发！「权力的游戏」七月回归","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c21e708feed_cut.jpeg","rating":"7.0","duration":"90","publish_time":"1489113900","like_num":"223","share_num":"641","cates":[{"cateid":"43","catename":"预告"}],"request_url":"http://app.vmoiver.com/51310?qingapp=app_new"},{"postid":"51291","title":"腹黑小孩疯狂报复短片《我的生涯规划》","wx_small_app_title":"腹黑男孩布下的疯狂陷阱","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-09/58c1516d61a8c_cut.jpeg","rating":"7.9","duration":"466","publish_time":"1489075560","like_num":"553","share_num":"841","cates":[{"cateid":"17","catename":"剧情"}],"request_url":"http://app.vmoiver.com/51291?qingapp=app_new"},{"postid":"51269","title":"爱情哲思短片《遇见你离开你》","wx_small_app_title":"我遇见你 爱上你再离开你","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c213c69166f_cut.jpeg","rating":"7.5","duration":"279","publish_time":"1489075500","like_num":"406","share_num":"475","cates":[{"cateid":"12","catename":"爱情"}],"request_url":"http://app.vmoiver.com/51269?qingapp=app_new"},{"postid":"51295","title":"致敬经典酷炫广告《天生狂野》","wx_small_app_title":"真正狂野的人 到老也不会安分","pid":"1","app_fu_title":"","is_xpc":"0","is_promote":"0","is_xpc_zp":"0","is_xpc_cp":"0","is_xpc_fx":"0","is_album":"0","tags":"","recent_hot":"0","discussion":"0","image":"http://cs.vmoiver.com/Uploads/cover/2017-03-09/58c152b5da6ae_cut.jpeg","rating":"7.5","duration":"61","publish_time":"1489075440","like_num":"237","share_num":"284","cates":[{"cateid":"13","catename":"广告"}],"request_url":"http://app.vmoiver.com/51295?qingapp=app_new"}]
     */

    private String status;
    private String msg;
    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "postid='" + postid + '\'' +
                    ", title='" + title + '\'' +
                    ", wx_small_app_title='" + wx_small_app_title + '\'' +
                    ", pid='" + pid + '\'' +
                    ", app_fu_title='" + app_fu_title + '\'' +
                    ", is_xpc='" + is_xpc + '\'' +
                    ", is_promote='" + is_promote + '\'' +
                    ", is_xpc_zp='" + is_xpc_zp + '\'' +
                    ", is_xpc_cp='" + is_xpc_cp + '\'' +
                    ", is_xpc_fx='" + is_xpc_fx + '\'' +
                    ", is_album='" + is_album + '\'' +
                    ", tags='" + tags + '\'' +
                    ", recent_hot='" + recent_hot + '\'' +
                    ", discussion='" + discussion + '\'' +
                    ", image='" + image + '\'' +
                    ", rating='" + rating + '\'' +
                    ", duration='" + duration + '\'' +
                    ", publish_time='" + publish_time + '\'' +
                    ", like_num='" + like_num + '\'' +
                    ", share_num='" + share_num + '\'' +
                    ", request_url='" + request_url + '\'' +
                    ", cates=" + cates +
                    '}';
        }

        /**
         * postid : 51315
         * title : 耐克最新女性酷炫广告《真我》
         * wx_small_app_title : 耐克最新女性广告「This Is Us」
         * pid : 1
         * app_fu_title :
         * is_xpc : 0
         * is_promote : 0
         * is_xpc_zp : 0
         * is_xpc_cp : 0
         * is_xpc_fx : 0
         * is_album : 0
         * tags :
         * recent_hot : 0
         * discussion : 0
         * image : http://cs.vmoiver.com/Uploads/cover/2017-03-10/58c2c72fbd572_cut.jpeg
         * rating : 7.8
         * duration : 60
         * publish_time : 1489161960
         * like_num : 330
         * share_num : 321
         * cates : [{"cateid":"13","catename":"广告"}]
         * request_url : http://app.vmoiver.com/51315?qingapp=app_new
         */

        private String postid;
        private String title;
        private String wx_small_app_title;
        private String pid;
        private String app_fu_title;
        private String is_xpc;
        private String is_promote;
        private String is_xpc_zp;
        private String is_xpc_cp;
        private String is_xpc_fx;
        private String is_album;
        private String tags;
        private String recent_hot;
        private String discussion;
        private String image;
        private String rating;
        private String duration;
        private String publish_time;
        private String like_num;
        private String share_num;
        private String request_url;
        private List<CatesBean> cates;

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getWx_small_app_title() {
            return wx_small_app_title;
        }

        public void setWx_small_app_title(String wx_small_app_title) {
            this.wx_small_app_title = wx_small_app_title;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getApp_fu_title() {
            return app_fu_title;
        }

        public void setApp_fu_title(String app_fu_title) {
            this.app_fu_title = app_fu_title;
        }

        public String getIs_xpc() {
            return is_xpc;
        }

        public void setIs_xpc(String is_xpc) {
            this.is_xpc = is_xpc;
        }

        public String getIs_promote() {
            return is_promote;
        }

        public void setIs_promote(String is_promote) {
            this.is_promote = is_promote;
        }

        public String getIs_xpc_zp() {
            return is_xpc_zp;
        }

        public void setIs_xpc_zp(String is_xpc_zp) {
            this.is_xpc_zp = is_xpc_zp;
        }

        public String getIs_xpc_cp() {
            return is_xpc_cp;
        }

        public void setIs_xpc_cp(String is_xpc_cp) {
            this.is_xpc_cp = is_xpc_cp;
        }

        public String getIs_xpc_fx() {
            return is_xpc_fx;
        }

        public void setIs_xpc_fx(String is_xpc_fx) {
            this.is_xpc_fx = is_xpc_fx;
        }

        public String getIs_album() {
            return is_album;
        }

        public void setIs_album(String is_album) {
            this.is_album = is_album;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getRecent_hot() {
            return recent_hot;
        }

        public void setRecent_hot(String recent_hot) {
            this.recent_hot = recent_hot;
        }

        public String getDiscussion() {
            return discussion;
        }

        public void setDiscussion(String discussion) {
            this.discussion = discussion;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getPublish_time() {
            return publish_time;
        }

        public void setPublish_time(String publish_time) {
            this.publish_time = publish_time;
        }

        public String getLike_num() {
            return like_num;
        }

        public void setLike_num(String like_num) {
            this.like_num = like_num;
        }

        public String getShare_num() {
            return share_num;
        }

        public void setShare_num(String share_num) {
            this.share_num = share_num;
        }

        public String getRequest_url() {
            return request_url;
        }

        public void setRequest_url(String request_url) {
            this.request_url = request_url;
        }

        public List<CatesBean> getCates() {
            return cates;
        }

        public void setCates(List<CatesBean> cates) {
            this.cates = cates;
        }

        public static class CatesBean {
            /**
             * cateid : 13
             * catename : 广告
             */

            private String cateid;
            private String catename;

            public String getCateid() {
                return cateid;
            }

            public void setCateid(String cateid) {
                this.cateid = cateid;
            }

            public String getCatename() {
                return catename;
            }

            public void setCatename(String catename) {
                this.catename = catename;
            }
        }
    }
}
