package dezmond.flanner.service;

import java.util.List;

import org.springframework.stereotype.Component;
import dezmond.flanner.model.Meal;
import dezmond.flanner.repository.IMealRepository;

@Component
public class MealService {

    private IMealRepository mealRepository;

    public MealService(IMealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> getMeals() {
        return mealRepository.findAll();
    }

    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

}
