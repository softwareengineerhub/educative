package com.app03.concurr.ch07;



import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture cf = CompletableFuture.supplyAsync(new Supplier<Object>() {

            @Override
            public Object get() {
                return "step1";
            }
        }).thenApply(new Function<Object, Object>() {

            @Override
            public Object apply(Object o) {
                return o+"step2";
            }
        }).thenAccept(new Consumer<Object>() {

            @Override
            public void accept(Object o) {
                System.out.println("res="+o);
            }
        });
    }

}
