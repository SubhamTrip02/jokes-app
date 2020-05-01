package com.subham.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceimpl implements JokeService {


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceimpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
