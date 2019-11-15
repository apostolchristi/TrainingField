package com.company.ocp.functionalProgramming;

import java.util.Optional;

public class Optional_ {

	public static void main(String[] args) throws Throwable {

		Optional<Double> opt = average(90);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}

		Optional o = (opt == null) ? Optional.empty() : Optional.of(opt.get());
		System.out.println(o.get());

		Optional o2 = Optional.ofNullable(opt.get());
		System.out.println(o2);

		o.ifPresent(System.out::println);
		o.orElse(Double.NaN);
		o.orElseGet(Math::random);
		o.orElseThrow(IllegalStateException::new);

	}

	public static Optional<Double> average(int... scores) {
		if(scores.length == 0) {
			return Optional.empty();
		}
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}

		return Optional.of(new Double(sum / scores.length));
	}
}
