package com.wallpapercard.service;

// src/main/java/com/example/wallpaper/service/CategoryService.java


import com.wallpapercard.model.Category;
import com.wallpapercard.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {
  private final CategoryRepository repo;

  public CategoryService(CategoryRepository repo) {
    this.repo = repo;
  }

  public List<Category> getAll() {
    return repo.findAll();
  }

  public Category getById(Integer id) {
    return repo.findById(id).orElse(null);
  }
}
