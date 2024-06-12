package com.example.ufro.services;

import org.springframework.stereotype.Service;

import com.example.ufro.repositories.CharactersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharactersService {
    
    private final CharactersRepository charactersRepository;


}
