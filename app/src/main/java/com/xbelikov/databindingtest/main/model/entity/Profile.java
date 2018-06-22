package com.xbelikov.databindingtest.main.model.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.InverseMethod;
import android.databinding.ObservableField;

import com.xbelikov.databindingtest.BR;

/**
 * Профиль - сущность, которая отражает запись в
 * таблице Profiles БД или в другом хранилище
 */
public class Profile extends BaseObservable {
    private int id;
    private int userId;
    private String firstName;
    private String lastName;

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
        notifyPropertyChanged(BR.userId);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
