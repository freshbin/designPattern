package com.freshbin.pattern.visitor.example.mode;

public abstract class Element {
	abstract public void Accept(Visitor visitor);
}
