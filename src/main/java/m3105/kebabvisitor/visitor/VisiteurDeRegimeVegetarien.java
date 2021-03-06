package m3105.kebabvisitor.visitor;

import m3105.kebabvisitor.ingredients.Agneau;
import m3105.kebabvisitor.ingredients.Boeuf;
import m3105.kebabvisitor.ingredients.Crevette;
import m3105.kebabvisitor.ingredients.Fromage;
import m3105.kebabvisitor.ingredients.Oignon;
import m3105.kebabvisitor.ingredients.Pain;
import m3105.kebabvisitor.ingredients.Salade;
import m3105.kebabvisitor.ingredients.Sauce;
import m3105.kebabvisitor.ingredients.Thon;
import m3105.kebabvisitor.ingredients.Tomate;

public class VisiteurDeRegimeVegetarien implements VisiteurDeRegime {

	@Override
	public boolean visit(Agneau agneau) {
		return false;
	}

	@Override
	public boolean visit(Boeuf element) {
		return false;
	}

	@Override
	public boolean visit(Crevette element) {
		return false;
	}

	@Override
	public boolean visit(Fromage element) {
		return true;
	}

	@Override
	public boolean visit(Oignon element) {
		return true;
	}

	@Override
	public boolean visit(Pain element) {
		return true;
	}

	@Override
	public boolean visit(Salade element) {
		return true;
	}

	@Override
	public boolean visit(Sauce element) {
		return true;
	}

	@Override
	public boolean visit(Thon element) {
		return false;
	}

	@Override
	public boolean visit(Tomate element) {
		return true;
	}

}
