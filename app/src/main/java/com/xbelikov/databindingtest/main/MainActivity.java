package com.xbelikov.databindingtest.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.xbelikov.databindingtest.R;
import com.xbelikov.databindingtest.databinding.ActivityMainBinding;
import com.xbelikov.databindingtest.main.model.entity.Profile;
import com.xbelikov.databindingtest.main.model.entity.User;
import com.xbelikov.databindingtest.main.repository.ProfileRepository;
import com.xbelikov.databindingtest.main.repository.UserRepository;

public class MainActivity extends AppCompatActivity {
    User user;
    Profile profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Создаём объекты, которые откуда-то достают наши модели (в данном случае генерируют)
        UserRepository uRepo = new UserRepository();
        ProfileRepository pRepo = new ProfileRepository();

        //Достаём модели
        int userId = (int) (Math.random() + 10.0);
        this.user = uRepo.findById(userId);
        this.profile = pRepo.findByUserId(userId);

        //Создаём объкт для связки
        //ActivityMainBinding сгенерирован сборщиком по нашему activity_main.xml,
        //поэтому мы его не описываем, в нём уже есть метод для добавления user и profile
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(this.user);
        binding.setProfile(this.profile);
    }
}
