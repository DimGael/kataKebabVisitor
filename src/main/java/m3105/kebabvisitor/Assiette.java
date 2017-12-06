package m3105.kebabvisitor;

import java.util.LinkedList;
import java.util.List;

import m3105.kebabvisitor.ingredients.Ingredient;

public class Assiette extends Kebab {
	
	@Override
	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}
	
	@Override
	public boolean isPescetarien() {
		return true;
	}

}
