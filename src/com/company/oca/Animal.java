package com.company.oca;

public abstract class Animal {

	public abstract int getAge();
}

abstract class Lion extends Animal {



    public abstract int name2();

    public static void main(String[] args) {


    }

}

class Tiger extends Lion {

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int name2() {
        return 0;
    }
}

