// src/main/java/com/example/wallpaper/repository/CategoryRepository.java
package com.wallpapercard.repository;

import com.wallpapercard.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
  Optional<Category> findByName(String name);
}
