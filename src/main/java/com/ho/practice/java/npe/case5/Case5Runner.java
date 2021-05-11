package com.ho.practice.java.npe.case5;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Case5Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 함수에서 반환할 값이 없을 경우에 대해서 보자
        Computer computer = new Computer();
        
        String version;
        try {
            version = this.getVersion(computer);
        } catch (NoSuchElementException e) {
            version = "UNKNOWN";
        }

        log.info("USB Version is " + version);
    }

    private String getVersion(Computer computer) {
        Objects.requireNonNull(computer, "Computer cannot be null");
        
        return computer.getSoundcardAsOptional()
                          .flatMap(Soundcard::getUsbAsOptional)
                          .map(USB::getVersion)
                          // 명시적으로 값을 넘겨줄 수 있다면,
                        //   .orElse("UNKNOWN");
                        // 반환할 Element가 없다면, NoSuchElementException
                          .orElseThrow();
                        // 반환할 Element가 없다면, Specify Exception  
                        //   .orElseThrow(IllegalStateException::new);
    }
    
}
