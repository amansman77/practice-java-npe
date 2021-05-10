package com.ho.practice.java.npe.case4;

import java.util.NoSuchElementException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Case4Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 컴퓨터에 사운드카드가 있을수도 있고 없을수도 있다.
        // 사운드카드에 USB가 있을수도 있고 없을수도 있다.
        // Soundcard soundcard = new Soundcard("1.0", new USB());
        // Computer computer = new Computer("1.0", soundcard);

        Computer computer = new Computer("1.0");
        
        // 컴퓨터가 가지고 있는 사운드카드의 USB 버전을 알고 싶다.
        String version;
        try {
            version = computer.getSoundcard().getUsb().getVersion();
        } catch (NullPointerException e) {
            version = "UNKNOWN";
        }

        // 사운드카드가 있으면 인스턴스가 있을 것이고, 없으면 NULL? 빈 인스턴스?

        log.info("USB Version is " + version);
    }
    
}
