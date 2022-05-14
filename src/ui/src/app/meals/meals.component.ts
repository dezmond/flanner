import { Component, OnInit } from '@angular/core';
import { Meal } from '../models/meal';
import { MealService} from '../meal.service';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-meals',
  templateUrl: './meals.component.html',
  styleUrls: ['./meals.component.css']
})
export class MealsComponent implements OnInit {


  selectedMeal?: Meal;
  oldMeal?: Meal;
  
  onSelect(meal: Meal): void {
    this.oldMeal = this.selectedMeal;
	this.selectedMeal = meal;
	this.messageService.add(`MealsComponent: Selected meal id=${meal.id}`);
  }

  meals: Meal[] = [];

  constructor(private mealService: MealService, private messageService: MessageService) { }
  
  getMeals(): void {
	this.mealService.getMeals()
      .subscribe(meals => this.meals = meals);
}

  ngOnInit(): void {
	this.getMeals();
  }

}
