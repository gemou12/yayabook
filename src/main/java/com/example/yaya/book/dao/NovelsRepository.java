package com.example.yaya.book.dao;

import com.example.yaya.book.model.Novels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface NovelsRepository extends MongoRepository<Novels, String> {
    public Novels findByNovelId(String novelId);

//    @Query(value="{'novelName':?0}",fields="{'novelName':1}")
    public Page<Novels> findByNovelNameLike(String name, Pageable pageable);
}
