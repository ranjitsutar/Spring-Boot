package com.ranjit.SpringCore.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ranjit/SpringCore/expressionlanguage/congigurationexpressionLanguage.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);

		/*
		 * SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		 * Expression parseExpression =
		 * spelExpressionParser.parseExpression("#{50+12}");
		 * System.out.println(parseExpression.getValue());
		 */
	}

}
