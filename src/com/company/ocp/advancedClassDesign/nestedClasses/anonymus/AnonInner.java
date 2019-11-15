package com.company.ocp.advancedClassDesign.nestedClasses.anonymus;

public class AnonInner {

	abstract class SaleTodayOnly {
		abstract int dolarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			@Override
			int dolarsOff() {
				return 3;
			}
		};

		return basePrice - sale.dolarsOff();
	}
}

class AnnoInner2 {

	interface SaleTodayOnly2 {
		int dolarsOff();
	}

	public int addmission(int baseprice) {
		SaleTodayOnly2 sale = new SaleTodayOnly2() {
			@Override
			public int dolarsOff() {
				return 2;
			}
		};
		return baseprice - sale.dolarsOff();
	}
}

class AnnoInner3 {

	interface SaleTodayOnly3 {
		int dollarsOff();
	}

	public int pay() {
		return addmission(5, new SaleTodayOnly3() {
			@Override
			public int dollarsOff() {
				return 3;
			}
		});
	}
	public int addmission(int baseprice, SaleTodayOnly3 sale) {
		return baseprice - sale.dollarsOff();
	}
}
