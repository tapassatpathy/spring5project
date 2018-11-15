package com.tapas.basicSpring.spring5project.repositories;

import com.tapas.basicSpring.spring5project.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
