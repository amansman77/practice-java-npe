package com.ho.practice.java.npe.case5;

import java.util.Optional;

import org.springframework.lang.NonNull;

import lombok.Getter;

@Getter
public class Soundcard {

    @NonNull
    private String version;
    
    private USB usb;
    
    public Optional<USB> getUsbAsOptional() {
        return Optional.ofNullable(usb);
    }

}
