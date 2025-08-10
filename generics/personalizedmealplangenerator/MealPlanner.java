package personalizedmealplangenerator;

class MealPlanner {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        System.out.println("Generated " + meal.getMealType().getMealType() + " meal plan.");
    }
}
