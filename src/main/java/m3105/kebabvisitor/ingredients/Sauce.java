package m3105.kebabvisitor.ingredients;

import m3105.kebabvisitor.Kebab;
import m3105.kebabvisitor.visitor.VisiteurDeRegime;

public class Sauce extends Ingredient {

	public Sauce(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}

	@Override
	public boolean accept(VisiteurDeRegime visiteur) {
		return visiteur.visit(this);
	}

}
