package com.josepjulia.atleta.controller.managers;

import com.josepjulia.atleta.model.Atleta;

import java.util.List;


public interface AtletaCallback {
    void onSuccess(List<Atleta> playerList);
    void onSucces();

    void onFailure(Throwable t);
}
