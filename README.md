# Ejercicio_Tres
Ejercicio Tres

## Etapa 01.  Descripción del Problema.
Se requiere un programa en Java para determinar cuál es el número más pequeño, cuál es el número más grande y cuál es el número intermedio de los tres ingresados.

## Etapa 02. Definición de la Solución.
~~~
- DATOS DE ENTRADA
 Definir variables para los tres números a ordenar.
 int a, b, c

- PROCESO
 Solicitar los números a ordenar
 Solicitar número a
 Solicitar número b
 Solicitar número c
 
 Condiciones
 
 Si a>b y a>c entonces el número mayor es a
 Si b>a y b>c entonces el número mayor es b
 Si c>a y c>b entonves el número maypr es c 
 
 Ahora dentro de cada condición se evaluara cual es el número intermedio y cual es el número más pequeño
 Si a>b y a>c entonces el número mayor es a
    si b>c entonces el número intermedio es b y el número menor es c 
    si no el número intermedio es c y el número menor es b 
    
 Si b>a y b>c entonces el número mayor es b
    si a>c entonces el número intermedio es a y el número menor es c
    si no el número intermedio es c y el número menor es a 
    
 Si c>a y c>b entonves el número maypr es c 
    si a>b entonces el número intermedio es a y el número menor es b
    si no el número intermedio es b y el número menor es a 
 

- SALIDA

+------------------------------------+   
| Ingrese los tres números a ordenar |
+------------------------------------+
| Número Uno:  5                     |
+------------------------------------+
| Número Dos:   4                    |
+------------------------------------+
| Número Tres:   9                   |
+------------------------------------+

+------------------------------------+
| Resultado |
+------------------------------------+
| Número Mayor:   9                  |
+------------------------------------+
| Número Intermedio:   5             |
+------------------------------------+
| Número Menor:  4                   |
+------------------------------------+
~~~

Etapa 03. Diseño de la Solución

![](https://github.com/EmanuelQuirino99/Ejercicio_Ordenar_Numeros_03/blob/master/NumerosOrdenados.png)
