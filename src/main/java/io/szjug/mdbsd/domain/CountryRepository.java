package io.szjug.mdbsd.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Paul on 1/20/2016.
 */
public interface CountryRepository extends MongoRepository<Country, String> {
}
