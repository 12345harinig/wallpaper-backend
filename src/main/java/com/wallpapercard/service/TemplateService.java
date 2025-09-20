package com.wallpapercard.service;

// src/main/java/com/example/wallpaper/service/TemplateService.java


import com.wallpapercard.model.Template;
import com.wallpapercard.repository.TemplateRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TemplateService {
  private final TemplateRepository repo;

  public TemplateService(TemplateRepository repo) {
    this.repo = repo;
  }

  public List<Template> getByCategoryId(Integer categoryId) {
    return repo.findByCategoryId(categoryId);
  }
// in TemplateService
public Template getById(Integer id) {
  return repo.findById(id).orElse(null);
}
}
