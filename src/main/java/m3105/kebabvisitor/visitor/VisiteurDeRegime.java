package m3105.kebabvisitor.visitor;

import m3105.kebabvisitor.Assiette;
import m3105.kebabvisitor.ingredients.*;

public interface VisiteurDeRegime {

	boolean visit(Agneau agneau);
	boolean visit(Boeuf element);
	boolean visit(Crevette element);
	boolean visit(Fromage element);
	boolean visit(Oignon element);
	boolean visit(Pain element);
	boolean visit(Salade element);
	boolean visit(Sauce element);
	boolean visit(Thon element);
	boolean visit(Tomate element);
	boolean visit(Assiette element);
	
}
