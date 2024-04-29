package com.demo.rating.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingController {
	@GetMapping
	public ResponseEntity<?> health(){
		return ResponseEntity.ok("UP");
	}
}
