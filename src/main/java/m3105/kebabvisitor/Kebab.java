package m3105.kebabvisitor;

import java.util.List;

import m3105.kebabvisitor.ingredients.Ingredient;
import m3105.kebabvisitor.visitor.VisiteurDeRegime;
import m3105.kebabvisitor.visitor.VisiteurDeRegimeVegetarien;

public abstract class Kebab {

	public abstract List<Ingredient> getIngredients();

	public abstract boolean isPescetarien();

	public boolean isVegetarien() {
		VisiteurDeRegime visiteur = new VisiteurDeRegimeVegetarien();

		for (Ingredient ingredient : this.getIngredients()) {
			if (!ingredient.accept(visiteur))
				return false;
		}

		return true;
	}
}
