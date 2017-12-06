package m3105.kebabvisitor.ingredients;

import m3105.kebabvisitor.Kebab;

public class Boeuf extends Ingredient {

	public Boeuf(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isVegetarien() {
		return false;
	}

	@Override
	public boolean isPescetarien() {
		return false;
	}
}
