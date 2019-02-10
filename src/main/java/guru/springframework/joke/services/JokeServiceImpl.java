package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes norrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes norrisQuotes) {
        this.norrisQuotes = norrisQuotes;
    }

    @Override
    public String getJoke() {
        return norrisQuotes.getRandomQuote();
    }
}
