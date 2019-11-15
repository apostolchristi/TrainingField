package com.company.ocp.advancedClassDesign.nestedClasses.innerClasses;

public class A {

	private int x = 10;

	private class B {
		private int x =20;

		private class C {
			private int x = 30;
			public void AllTheX() {
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
			}
		}
	}

	public static void main(String[] args) {

		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.AllTheX();

	}
}

class CaseOfThePrivateInterfcae {
	private interface Secret {
		void shh();
	}

	class DontTell implements Secret {
		@Override
		public void shh() {

		}
	}
}
