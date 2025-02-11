/*4. Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.*/
package com.generics.mealplangenerator;


public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        // Creating meal plans for different categories
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(new VegetarianMeal("Salad"));
        vegetarianPlan.addMeal(new VegetarianMeal("Rice & Vegetables"));

        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(new VeganMeal("Fruit Bowl"));
        veganPlan.addMeal(new VeganMeal("Veggie Soup"));

        Meal<KetoMeal> ketoPlan = new Meal<>();
        ketoPlan.addMeal(new KetoMeal("Egg & Bacon"));
        ketoPlan.addMeal(new KetoMeal("Chicken Salad"));

        Meal<HighProteinMeal> highProteinPlan = new Meal<>();
        highProteinPlan.addMeal(new HighProteinMeal("Grilled Chicken"));
        highProteinPlan.addMeal(new HighProteinMeal("Omelet"));

        // Displaying meal plans
        System.out.println("=== Vegetarian Meal Plan ===");
        vegetarianPlan.displayMeals();

        System.out.println("\n=== Vegan Meal Plan ===");
        veganPlan.displayMeals();

        System.out.println("\n=== Keto Meal Plan ===");
        ketoPlan.displayMeals();

        System.out.println("\n=== High-Protein Meal Plan ===");
        highProteinPlan.displayMeals();

        // Generating personalized meals
        System.out.println("\n=== Generating Personalized Meals ===");
        MealUtility.generateMeal(new VegetarianMeal("Mixed Vegetables"));
        MealUtility.generateMeal(new KetoMeal("Steak"));
        MealUtility.generateMeal(new VeganMeal("Smoothie"));
        MealUtility.generateMeal(new HighProteinMeal("Fish & Rice"));
    }
}
