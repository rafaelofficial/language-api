package br.com.alura.language.api.domain.controller;

import br.com.alura.language.api.domain.model.Language;
import br.com.alura.language.api.domain.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages")
    public List<Language> getLanguages() {
        return repository.findAll();
    }

    @PostMapping("/languages")
    public Language createLanguage(@RequestBody Language language) {
        return repository.save(language);
    }
}
