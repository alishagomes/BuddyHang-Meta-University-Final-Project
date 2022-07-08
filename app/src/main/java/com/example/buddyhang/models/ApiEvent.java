package com.example.buddyhang.models;

public class ApiEvent {

    private String name;
    private String url;

    public ApiEvent() {
    }

    public ApiEvent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
