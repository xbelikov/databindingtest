package com.xbelikov.databindingtest.main.repository;

import com.xbelikov.databindingtest.main.model.entity.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Репозиторий - это класс, в котором определено каким образом
 * мы достанем информацию. В данном случае мы иммитируем получение пользователя
 * по идентификатору
 */
public class UserRepository {
    public User findById(int id) {
        User user = new User();

        String login = "vasya98_superman";
        String password = "qwerty";

        user.setId(id);
        user.setLogin(login);
        user.setPassword(md5(password));

        return user;
    }

    private String md5(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
