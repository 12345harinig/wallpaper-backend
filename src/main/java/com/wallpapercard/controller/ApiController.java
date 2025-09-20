package com.wallpapercard.controller;

// src/main/java/com/example/wallpaper/controller/ApiController.java


import com.wallpapercard.model.Category;
import com.wallpapercard.model.Template;
import com.wallpapercard.service.CategoryService;
import com.wallpapercard.service.TemplateService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // allow your React app
public class ApiController {

  private final CategoryService categoryService;
  private final TemplateService templateService;

  public ApiController(CategoryService categoryService, TemplateService templateService) {
    this.categoryService = categoryService;
    this.templateService = templateService;
  }

  @GetMapping("/categories")
  public List<Category> getCategories() {
    return categoryService.getAll();
  }

  @GetMapping("/categories/{id}/templates")
  public List<Template> getTemplatesByCategory(@PathVariable Integer id) {
    return templateService.getByCategoryId(id);
  }

  // optional: get single template
  @GetMapping("/templates/{id}")
  public Template getTemplate(@PathVariable Integer id) {
    return templateService.getById(id);
  }
}
