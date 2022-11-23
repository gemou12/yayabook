package com.example.yaya.book.controller;


import com.example.yaya.book.dao.NovelsRepository;
import com.example.yaya.book.model.Novels;
import com.example.yaya.book.service.NovelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("Novels")
public class NovelsController {
    @Autowired
    private NovelsService novelsService;
    public NovelsController(NovelsService novelsService) {
        this.novelsService = novelsService;
    }

    @PostMapping
    public Novels create(@RequestBody Novels book) {
        return novelsService.insertNovelsData(book);
    }

    @GetMapping
    public Collection<Novels> read() {
        return novelsService.getAllNovelsInformation();
    }

    @GetMapping(path = "{_id}")
    public Novels readQueryUsingId(@PathVariable("_id") String id) {
        return novelsService.getNovelsInformationUsingId(id);
    }

    @PutMapping(path = "/update/{_id}")
    public void update(@PathVariable String _id, @RequestBody Novels book ) {
        novelsService.updateNovelsUsingId(_id, book);
    }

    @DeleteMapping(path = "/delete/{_id}")
    public void delete(@PathVariable("_id") String id){
        novelsService.deleteNovelsUsingId(id);
    }
    @GetMapping("/name/{page}/{novelName}")
    @ResponseBody
    public Collection<Novels> findByNovelNameLike(@PathVariable("page") int page, @PathVariable("novelName") String novelName) {
        return novelsService.findByNovelNameLike(page,10,novelName);
    }


}
