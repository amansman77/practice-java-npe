package com.ho.practice.java.npe.case4;

import org.springframework.lang.NonNull;

import lombok.Getter;

@Getter
public class Soundcard {

    @NonNull
    private String version;
    
    private USB usb;
    
    public Soundcard(String version, USB usb) {
        if (version == null) {
            throw new IllegalArgumentException("Version cannot be null");
        } else {
            this.version = version;
        }
        
        this.usb = usb;
    }

}
