package com.ho.practice.java.npe.case5;

import org.springframework.lang.NonNull;

import lombok.Getter;

@Getter
public class USB {

    @NonNull
    private String version;

    public USB(String version) {
        if (version == null) {
            throw new IllegalArgumentException("Version cannot be null");
        } else {
            this.version = version;
        }
    }

}
