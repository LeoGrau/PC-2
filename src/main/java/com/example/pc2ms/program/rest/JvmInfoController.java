package com.example.pc2ms.program.rest;

import com.example.pc2ms.program.model.JvmData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/info")
public class JvmInfoController {

    @GetMapping("/availability")
    public void checkAvailability() {
        // Este endpoint solo responde con el estado HTTP, no tiene cuerpo de respuesta
    }

    @GetMapping("/jvm-data")
    public JvmData getJvmData() {
        long start = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        File cDrive = new File("C:");

        JvmData jvmData = new JvmData();
        jvmData.setCpus(runtime.availableProcessors());
        jvmData.setMaxMemory(runtime.maxMemory() / 1024 / 1024);
        jvmData.setTotalMemory(runtime.totalMemory() / 1024 / 1024);
        jvmData.setFreeMemory(runtime.freeMemory() / 1024 / 1024);

        double elapsedTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - start);
        jvmData.setElapsedTime(elapsedTime);

        jvmData.setTotalSpace(cDrive.getTotalSpace() / 1e9); // Convertir a GB
        jvmData.setFreeSpace(cDrive.getFreeSpace() / 1e9); // Convertir a GB

        return jvmData;
    }
}