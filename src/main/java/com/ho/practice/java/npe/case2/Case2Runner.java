package com.ho.practice.java.npe.case2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Case2Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // case1의 NPE 해결
        Computer computer = new Computer();
        String version = "UNKNOWN";
        if(computer != null){
            Soundcard soundcard = computer.getSoundcard();
            if(soundcard != null){
                USB usb = soundcard.getUsb();
                if(usb != null){
                    version = usb.getVersion();
                }
            }
        }
        log.info("USB Version is " + version);

        // but, null 확인을 위해 많은 분기문이 추가됨
    }
    
}
