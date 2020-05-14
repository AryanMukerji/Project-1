package studataapp;

public interface Finance {
	// write a method that return the base rate
	default double totalfees() {
		return 10000;
	}
}

