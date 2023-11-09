package com.example.pc2ms.program.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JvmData {
    private int cpus;
    private long maxMemory;
    private long totalMemory;
    private long freeMemory;
    private double elapsedTime;
    private double totalSpace;
    private double freeSpace;
}
