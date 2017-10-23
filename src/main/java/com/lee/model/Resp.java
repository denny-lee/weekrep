package com.lee.model;

public class Resp {
    private Boolean success;
    private String desc;

    public Resp(Boolean success, String desc) {
        this.success = success;
        this.desc = desc;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
