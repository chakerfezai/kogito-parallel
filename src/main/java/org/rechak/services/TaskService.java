package org.rechak.services;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.logging.Log;

@ApplicationScoped
public class TaskService {

    public void printTaskName(String name) throws InterruptedException {
        Log.info("Start task : " + name + " at Time : " + LocalDateTime.now());
        Thread.sleep(10000L);
        Log.info("End task : " + name + " at Time : " + LocalDateTime.now());

    }

    public void printTaskName1(String name) throws InterruptedException {
        Log.info("Start task : " + name + " at Time : " + LocalDateTime.now());
        Thread.sleep(10000L);
        Log.info("End task : " + name + " at Time : " + LocalDateTime.now());
    }

    public void printTaskName2(String name) throws InterruptedException {
        Log.info("Start task : " + name + " at Time : " + LocalDateTime.now());
        Thread.sleep(10000L);
        Log.info("End task : " + name + " at Time : " + LocalDateTime.now());
    }

    public void printTaskName3(String name) throws InterruptedException {
        Log.info("Start task : " + name + " at Time : " + LocalDateTime.now());
        Thread.sleep(10000L);
        Log.info("End task : " + name + " at Time : " + LocalDateTime.now());
    }

}
