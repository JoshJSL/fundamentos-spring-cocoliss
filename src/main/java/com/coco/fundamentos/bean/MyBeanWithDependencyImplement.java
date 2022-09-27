package com.coco.fundamentos.bean;


public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void print() {
        int numero=1;

        System.out.println(myOperation.sum(numero));

        System.out.println("Hola desde la impl de bean con dependencia");

    }
}
