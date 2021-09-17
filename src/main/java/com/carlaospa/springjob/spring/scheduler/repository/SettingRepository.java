package com.carlaospa.springjob.spring.scheduler.repository;

import com.carlaospa.springjob.spring.scheduler.entity.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
}
