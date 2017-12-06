package m3105.kebabvisitor;

import java.util.List;

import m3105.kebabvisitor.ingredients.Ingredient;

public interface Kebab {
	List<Ingredient> getIngredients();
	boolean isVegetarien();
	boolean isPescetarien();
}
