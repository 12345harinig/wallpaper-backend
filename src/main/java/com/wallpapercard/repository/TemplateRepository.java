package com.wallpapercard.repository;

// src/main/java/com/example/wallpaper/repository/TemplateRepository.java


import com.wallpapercard.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TemplateRepository extends JpaRepository<Template, Integer> {
  List<Template> findByCategoryId(Integer categoryId);
}
