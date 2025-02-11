/*4. Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.*/
package com.generics.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

// Generic Meal Plan Manager
class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    // Add a meal to the plan
    public void addMeal(T meal) {
        meals.add(meal);
    }

    // Display all meals
    public void displayMeals() {
        for (T meal : meals) {
            meal.displayMeal();
        }
    }
}

