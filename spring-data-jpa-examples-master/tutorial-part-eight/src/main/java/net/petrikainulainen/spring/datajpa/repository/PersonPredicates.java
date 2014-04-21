package net.petrikainulainen.spring.datajpa.repository;

import com.mysema.query.types.Predicate;
import net.petrikainulainen.spring.datajpa.model.QPerson;

/**
 * A class which is used to create Querydsl predicates.
 * @author vominhtung
 */
public class PersonPredicates {

    public static Predicate lastNameIsLike(final String searchTerm) {
        QPerson person = QPerson.person;
        return person.lastName.startsWithIgnoreCase(searchTerm);
    }
}
