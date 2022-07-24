package br.com.alura.language.api.domain.repository;

import br.com.alura.language.api.domain.model.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Language, String> {
}
