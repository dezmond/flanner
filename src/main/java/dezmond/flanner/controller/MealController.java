package dezmond.flanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dezmond.flanner.model.Meal;
import dezmond.flanner.service.MealService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class MealController {

    @Autowired
    MealService mealService;

    @GetMapping(path = "/meals")
    public ResponseEntity<?> listMeals() {
        log.info("MealController:  list meals");
        List<Meal> resource = mealService.getMeals();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = "/meal")
    public ResponseEntity<?> saveUser(@RequestBody Meal meal) {
        log.info("MealController:  list meals");
        Meal resource = mealService.saveMeal(meal);
        return ResponseEntity.ok(resource);
    }
}
