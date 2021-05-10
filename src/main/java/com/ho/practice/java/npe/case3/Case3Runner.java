package com.ho.practice.java.npe.case3;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Case3Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // case2의 많은 분기문 해결
        Computer ct = new Computer();

        String version = ct.getSoundcardAsOptional()
                          .flatMap(Soundcard::getUsbAsOptional)
                          .map(USB::getVersion)
                          .orElse("UNKNOWN");
        log.info("USB Version is " + version);

        // but, 
        // String version = computer.getSoundcard().getUsb().getVersion();
        // 구문이 의미를 좀더 간결하고 명확하게 표현함
    }
    
}
