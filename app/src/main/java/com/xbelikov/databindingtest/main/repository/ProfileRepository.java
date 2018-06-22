package com.xbelikov.databindingtest.main.repository;

import com.xbelikov.databindingtest.main.model.entity.Profile;

/**
 * Репозиторий - это класс, в котором определено каким образом
 * мы достанем информацию. В данном случае мы иммитируем получение профиля
 * по идентификатору пользователя
 */
public class ProfileRepository {
    public Profile findByUserId(int userId) {
        Profile profile = new Profile();

        profile.setId(userId);
        profile.setUserId(userId);
        profile.setFirstName("Vasya");
        profile.setLastName("Petrov");

        return profile;
    }
}
