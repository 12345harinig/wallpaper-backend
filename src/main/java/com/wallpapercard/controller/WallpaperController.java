package com.wallpapercard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WallpaperController {

    // Test API
    @GetMapping("/")
    public String home() {
        return "Wallpaper Backend is running 🚀";
    }

    // API to get motivational wallpapers
    @GetMapping("/api/wallpapers")
    public List<String> getWallpapers() {
        return List.of(
            "/assets/motivation1.png",
            "/assets/motivation2.png"
            // Add more wallpapers as needed
        );
    }
}
