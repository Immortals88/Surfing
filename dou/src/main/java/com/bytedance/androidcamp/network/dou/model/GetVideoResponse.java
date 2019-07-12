package com.bytedance.androidcamp.network.dou.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideoResponse {
    @SerializedName("success") boolean success;
    @SerializedName("feeds") List<Video> videos;

    public boolean isSuccess() {
        return success;
    }
    public List<Video>  getVideos(){
        return videos;
    }
}
