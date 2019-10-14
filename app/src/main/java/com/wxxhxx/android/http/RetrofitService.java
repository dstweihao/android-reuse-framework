package com.wxxhxx.android.http;

import com.wxxhxx.android.bean.auth.LoginBean;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by weihao on 2017/12/25.
 */

public interface RetrofitService {


    //登录、注册、忘记密码、退出登录等等

    @FormUrlEncoded
    @POST("/v1/auth/login")
//    Observable<LoginBean> login(@Field("usename") String usename, @Field("password") String password);
    Observable<LoginBean> login(@FieldMap Map<String, String> map);


    // TODO: 2018/1/16 HomeAPI
    // 聚合：新闻头条
    //        http://v.juhe.cn/toutiao/index?type=top&key=APPKEY
    @GET("toutiao/index")
    Observable<TopBean> getTopDate(@Query("type") String type,
                                   @Query("key") String key);

    /*聚合：微信精选*/
//    pno 页数，默认1
//    ps 返回条数 默认20，最大50
//    http://v.juhe.cn/weixin/query?pno=1&ps=20&key=bc825580457c03c5da919f58f851ebb6
    @GET("weixin/query")
    Observable<WeChatBean> getJeHeWeChatData(@Query("pno") int pno,
                                             @Query("ps") int ps,
                                             @Query("key") String key);
    class TopBean {
    }

    class WeChatBean {
    }
}





