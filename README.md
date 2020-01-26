# Laboratorio 1

## ANDRES GUALDRON - NATALIA PALACIOS

# Dogs Race case

1. Review the "concurrent cousins" program (in the folder part1), provided in the package edu.eci.arsw.primefinder. This is a program that calculates the prime numbers between two intervals, distributing their search among independent threads. For now, it has a single thread that seeks cousins ​​between 0 and 30,000,000. Run it, open the operating system process manager, and verify how many cores are used by it.

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/1.PNG)
Los cores utilizados con un solo hilo son 4, para el rango 0 a 30,000,000

2. Modify the program so that, instead of solving the problem with a single thread, do it with three, where each of these will make up the first part of the original problem. Check the operation again, and again check the use of the equipment cores.

