# Laboratorio 1

## ANDRES GUALDRON - NATALIA PALACIOS

# Dogs Race case

## Parte 1

1. Review the "concurrent cousins" program (in the folder part1), provided in the package edu.eci.arsw.primefinder. This is a program that calculates the prime numbers between two intervals, distributing their search among independent threads. For now, it has a single thread that seeks cousins ​​between 0 and 30,000,000. Run it, open the operating system process manager, and verify how many cores are used by it.

Los cores utilizados con un solo hilo son 4, para el rango 0 a 30,000,000.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/1.PNG)

2. Modify the program so that, instead of solving the problem with a single thread, do it with three, where each of these will make up the first part of the original problem. Check the operation again, and again check the use of the equipment cores.

Los cores utilizados al ejecutar el programa con 3 hilos.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/2.PNG)

Codigo de implementacion para iniciar los 3 hilos.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/3.PNG)

3. What you have been asked for is: you must modify the application so that when 5 seconds have elapsed since the execution started, all the threads are stopped and the number of primes ​​found so far is displayed. Then, you must wait for the user to press ENTER to resume their execution.

En el metodo run del Thread agregamos el codigo necesario para poder pusar, continuar y suspender el thread.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/4.PNG)

Los atributos agregados para poder manipular el Thread y saber cuando ha terminado su proceso.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/5.PNG)

Los metodos agregados para manipular el Thread y saber cuando ha finalizado.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/6.PNG)

Creamos un ciclo el cual para cada cinco segundo los hilos y muestra los primos encontrados hasta ese momento.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte1/img/7.PNG)

## Parte 3

1. Fix the application so that the results notice is shown only when the execution of all the ‘greyhound’ threads is finished. For this keep in mind:
  - The action of starting the race and showing the results is carried out from line 38 of MainCanodromo.
  - The join() method of the Thread class can be used to synchronize the thread that starts the race, with the completion of the 1   greyhound threads.

Se agregó el .join()
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte2/img/1.PNG)

2. Once the initial problem has been corrected, run the application several times, and identify the inconsistencies in the results of the same by seeing the ‘ranking’ shown on the console (sometimes valid results could appear, but in other cases such inconsistencies may occur). From this, identify the critical regions of the program.
3. Use a synchronization mechanism to ensure that these critical regions only access one thread at a time. Verify the results.

Se cambió el entero de la última posición por un entero atómica y de esta manera aseguramos que otros hilos no puedan modificarla al mismo tiempo y así evitamos los posibles errores en el resultado.

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte2/img/2.PNG)

![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte2/img/3.PNG)

4- Implement the pause and continue functionalities. With these, when "Stop" is clicked, all the threads of the greyhounds should fall asleep, and when "Continue" is clicked they should wake up and continue with the race. Design a solution that allows you to do this using the synchronization mechanisms with the Locks primitives provided by the language (wait and notifyAll).

Se hizo uso del .wait() y del notifyAll() para pausar y reanudar los hilos. También se creó una variable atómica booleana para poder saber cuándo dar la orden a los hilos.
![](https://raw.githubusercontent.com/AndresFelipeGualdron/DogsRace/master/parte2/img/4.PNG)
