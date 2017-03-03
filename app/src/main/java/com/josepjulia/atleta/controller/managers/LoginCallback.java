package com.josepjulia.atleta.controller.managers;

import com.josepjulia.atleta.model.UserToken;

public interface LoginCallback {
    void onSuccess(UserToken userToken);
    void onFailure(Throwable t);
}
