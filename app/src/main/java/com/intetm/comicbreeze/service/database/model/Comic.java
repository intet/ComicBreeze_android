package com.intetm.comicbreeze.service.database.model;

import java.util.List;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Comic {

    @JsonIgnore
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "about", nullable = false)
    public String about;

    @Column(name = "url", nullable = false)
    public String url;

    @Column(name = "img_url", nullable = false)
    public String imgUrl;

    @Column(name = "page_count", nullable = false)
    public int pageCount;

    @JsonIgnore
    @Column(name = "expected_count", nullable = false)
    public int expectedCount;

    @JsonIgnore
    @OneToMany(mappedBy = "comic", fetch = FetchType.LAZY)
    public List<Page> pages;

    public Comic() {
    }

    public Comic(Long id) {
        this.id = id;
    }
}
