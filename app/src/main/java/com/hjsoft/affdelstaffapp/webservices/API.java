package com.hjsoft.affdelstaffapp.webservices;

import com.google.gson.JsonObject;
import com.hjsoft.affdelstaffapp.model.Pojo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by hjsoft on 23/11/16.
 */
public interface API {

    @POST("Login/Checklogin")
    Call<Pojo> sendLoginDetails(@Body JsonObject v);

    @POST("ChangePassword/Updatepassword")
    Call<Pojo> changePassword(@Body JsonObject v);

    @POST("IMEI/UpdateIMEI")
    Call<Pojo> updateIMEI(@Body JsonObject v);


}
