package de.upb.se.profcalculator;

public class AddOperation {
	public Value l, r;
	public AddOperation(Value l, Value r) {
		this.l = l;
		this.r = r;
	}
	public String returnAStringRepresentionOfTheExpression() {
		return l.toString() + " + " + r.toString();
	}
	public int evaluatetheexpressiontoanintegervalue() {
		return l.getValue() + r.getValue();
	}
	public String computeAnEquationRepresentingTheExpressionAndItsValue() {
		return returnAStringRepresentionOfTheExpression() + " = " + evaluatetheexpressiontoanintegervalue();
	}
}