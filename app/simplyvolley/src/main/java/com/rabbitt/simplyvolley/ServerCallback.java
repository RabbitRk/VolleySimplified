package com.rabbitt.simplyvolley;

import org.json.JSONObject;

public interface ServerCallback {
    void onSuccess(String result);
    void onError(String result);
}
