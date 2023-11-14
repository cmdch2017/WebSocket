package org.example.websocket;


import cn.hutool.json.JSONObject;


public class WebSocketMessage {
    private Integer code;

    private JSONObject bodyMessage;

    private String msg;

    private String token;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public JSONObject getBodyMessage() {
        return bodyMessage;
    }

    public void setBodyMessage(JSONObject bodyMessage) {
        this.bodyMessage = bodyMessage;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
