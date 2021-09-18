package com.carlaospa.springjob.spring.scheduler.jobs;

import com.carlaospa.springjob.spring.scheduler.entity.Setting;
import com.carlaospa.springjob.spring.scheduler.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JobsTwo {

    @Autowired
    private SettingRepository settingRepository;

    @Scheduled(cron = "*/3 * * * * *")
    public void execute() {
        Setting setting = new Setting(Boolean.FALSE, new Date());
        settingRepository.save(setting);
        System.out.println("Job two -> " + settingRepository.findById(setting.getId()).get().toString());
    }
}
