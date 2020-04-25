package com.byted.chapter5;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // todo 添加api
    // https://www.wanandroid.com/user/register
    //方法：POST
    //	username,password,repassword

    //需要补全URL,post的数据只有三条username,password,repassword
    @FormUrlEncoded
    @POST("user/register")//补全URL,在baseUrl后面加上“user/register”
    Call<UserResponse> registerAccount(
            @Field("username") String username,
            @Field("password") String password,
            @Field("repassword") String repassword
    );
}
