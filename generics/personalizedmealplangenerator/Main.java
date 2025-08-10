package personalizedmealplangenerator;

public class Main {
	    public static void main(String[] args) {
	        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
	        MealPlanner.generateMealPlan(veganMeal);
	        
	        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
	        MealPlanner.generateMealPlan(ketoMeal);
	    }
	}