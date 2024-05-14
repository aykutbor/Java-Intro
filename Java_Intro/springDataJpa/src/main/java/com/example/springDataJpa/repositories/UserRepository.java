package com.example.springDataJpa.repositories;

import com.example.springDataJpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    //Structure of Derived Query Methods in Spring
    List<User> findByName(String name);

    List<User> findTop3ByAge();

    //Equality Condition Keywords
    List<User> findByNameIs(String name);

    List<User> findByNameEquals(String name);

    List<User> findByNameIsNot(String name);

    List<User> findByNameIsNull();

    List<User> findByNameIsNotNull();

    List<User> findByActiveTrue();

    List<User> findByActiveFalse();

    //Similarity Condition Keywords
    List<User> findByNameStartingWith(String prefix);

    List<User> findByNameEndingWith(String suffix);

    List<User> findByNameContaining(String infix);

    List<User> findByNameLike(String likePattern);

    String likePattern = "a%b%c";
    //userRepository.findByNameLike(likePattern);

    //Comparison Condition Keywords
    List<User> findByAgeLessThan(Integer age);

    List<User> findByAgeLessThanEqual(Integer age);

    List<User> findByAgeGreaterThan(Integer age);

    List<User> findByAgeGreaterThanEqual(Integer age);

    List<User> findByAgeBetween(Integer startAge, Integer endAge);

    List<User> findByAgeIn(Collection<Integer> ages);

    List<User> findByBirthDateAfter(ZonedDateTime birthDate);

    List<User> findByBirthDateBefore(ZonedDateTime birthDate);

    //Multiple Condition Expressions
    List<User> findByNameOrAge(String name, Integer age);

    List<User> findByNameOrAgeAndActive(String name, Integer age, boolean active);

    //Sorting the Results
    List<User> findByNameOrderByName(String name);

    List<User> findByNameOrderByNameAsc(String name);

    List<User> findByNameOrderByNameDesc(String name);

    //findOne vs findById in a CrudRepository
    //Example
    //User user = userRepository.findOne(1);
    //User user = userRepository.findById(1);

}
