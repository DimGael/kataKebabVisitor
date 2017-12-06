package m3105.kebabvisitor;

import java.util.LinkedList;
import java.util.List;

import m3105.kebabvisitor.ingredients.Ingredient;
import m3105.kebabvisitor.visitor.VisiteurDeRegime;

public class Assiette implements Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}
	
	public boolean accept(VisiteurDeRegime visiteur) {
		return visiteur.visit(this);
	}

}
