package com.xbelikov.databindingtest.main.model.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.InverseMethod;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;

import com.xbelikov.databindingtest.BR;

/**
 * Профиль - сущность, которая отражает запись в
 * таблице Users БД или в другом хранилище
 */
public class User extends BaseObservable {
    private int id;
    private String login;
    private String password;

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        notifyPropertyChanged(BR.login);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
