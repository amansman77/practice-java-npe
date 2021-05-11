package com.ho.practice.java.npe.case5;

import java.util.Optional;

import org.springframework.lang.NonNull;

import lombok.Getter;

@Getter
public class Computer {

    @NonNull
    private String version;

    private Soundcard soundcard;

    public Optional<Soundcard> getSoundcardAsOptional() {
        return Optional.ofNullable(soundcard);
    }

}