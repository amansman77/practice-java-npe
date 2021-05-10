package com.ho.practice.java.npe.case1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import lombok.extern.slf4j.Slf4j;

// @Component
@Slf4j
public class Case1Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // NPE 발생
        Computer computer = new Computer();
        String version = computer.getSoundcard().getUsb().getVersion();
        log.info("USB Version is " + version);
    }
    
}
