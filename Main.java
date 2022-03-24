package DesignPatterns;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();

        singleton1.setImprimeDocumento("imprimindo");
        singleton1.setRemoveDocumento("removendo");
        singleton1.setRemoveTodosDocumento("removendo ALL");
        singleton2.setImprimeDocumento("imprimindo novamente");
        singleton2.setRemoveDocumento("removendo novamente");
        singleton2.setRemoveTodosDocumento("removendo novamente ALL");
        singleton3.setImprimeDocumento("imprindo de novo");
        singleton3.setRemoveDocumento("removendo novamente");
        singleton3.setRemoveTodosDocumento("removendo novamente ALL");

        System.out.println(singleton1.getImprimeDocumento());
        System.out.println(singleton2.getRemoveDocumento());
        System.out.println(singleton3.getRemoveTodosDocumento());
    }
}
