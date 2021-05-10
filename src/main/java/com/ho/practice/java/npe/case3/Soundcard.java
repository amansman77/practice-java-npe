package com.ho.practice.java.npe.case3;

import java.util.Optional;

import lombok.Getter;

@Getter
public class Soundcard {

    private USB usb;

    public Optional<USB> getUsbAsOptional() {
        return Optional.ofNullable(usb);
    }
    
}
