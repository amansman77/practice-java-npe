package com.ho.practice.java.npe.case4;

import org.springframework.lang.NonNull;

import lombok.Getter;

@Getter
public class Computer {

    @NonNull
    private String version;

    private Soundcard soundcard;

    public Computer(String version) {
        if (version == null) {
            throw new IllegalArgumentException("Version cannot be null");
        } else {
            this.version = version;
        }
    }

    public Computer(String version, Soundcard soundcard) {
        if (version == null) {
            throw new IllegalArgumentException("Version cannot be null");
        } else {
            this.version = version;
        }
        
        this.soundcard = soundcard;
    }

}