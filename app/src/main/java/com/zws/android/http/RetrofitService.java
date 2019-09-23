package com.zws.android.http;
import com.zws.android.bean.home.ConstellationBean;
import com.zws.android.bean.home.JWeChatBean;
import com.zws.android.bean.home.TopBean;
import com.zws.android.bean.home.WeChatBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by weihao on 2017/12/25.
 */

public interface RetrofitService {
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

}





