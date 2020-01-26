# Laboratorio 1

## ANDRES GUALDRON - NATALIA PALACIOS

# Dogs Race case

## Parte 1

1. Review the "concurrent cousins" program (in the folder part1), provided in the package edu.eci.arsw.primefinder. This is a program that calculates the prime numbers between two intervals, distributing their search among independent threads. For now, it has a single thread that seeks cousins ​​between 0 and 30,000,000. Run it, open the operating system process manager, and verify how many cores are used by it.

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/1.PNG)
Los cores utilizados con un solo hilo son 4, para el rango 0 a 30,000,000

2. Modify the program so that, instead of solving the problem with a single thread, do it with three, where each of these will make up the first part of the original problem. Check the operation again, and again check the use of the equipment cores.

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/2.PNG)
Los cores utilizados al ejecutar el programa con 3 hilos

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/3.PNG)
Codigo de implementacion para iniciar los 3 hilos

3. What you have been asked for is: you must modify the application so that when 5 seconds have elapsed since the execution started, all the threads are stopped and the number of primes ​​found so far is displayed. Then, you must wait for the user to press ENTER to resume their execution.

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/4.PNG)
en el metodo run del Thread agregamos el codigo necesario para poder pusar, continuar y suspender el thread

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/5.PNG)
los atributos agregados para poder manipular el Thread y saber cuando ha terminado su proceso

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/6.PNG)
los metodos agregados para manipular el Thread y saber cuando ha finalizado.

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/7.PNG)
creamos un ciclo el cual para cada cinco segundo los hilos y muestra los primos encontrados hasta ese momento

## Parte 2

