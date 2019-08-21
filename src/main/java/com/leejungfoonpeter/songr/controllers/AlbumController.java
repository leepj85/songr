package com.leejungfoonpeter.songr.controllers;

import com.leejungfoonpeter.songr.models.AlbumRepository;
import com.leejungfoonpeter.songr.models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
//        Album anAlbum = new Album("Love In The Future", "John Legend", 20, 67, "https://upload.wikimedia.org/wikipedia/en/6/64/John_Legend_Love_in_the_Future.jpg");
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageURL) {
        Album anAlbum = new Album(title, artist, songCount, length, imageURL);
        albumRepository.save(anAlbum);
        return new RedirectView("/albums");
    }
}

//    String title;
//    String artist;
//    int songCount;
//    int length;
//    String imageURL;
