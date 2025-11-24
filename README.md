
# **INFORME DE INVESTIGACION**

![alt text](assets/ups-icc.png)

### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Janelly Dayanna Chacha Vélez - https://github.com/Dayanna-01
- Kelly Valeria Guaman León 

# Objetivos:

* Familiarizar a los estudiantes con los conceptos básicos de la teoría de la complejidad.
* Investigar, analizar y exponer conceptos fundamentales relacionados con la eficiencia algorítmica, centrándose en la teoría de la complejidad, el análisis de algoritmos y la notación Big O.
* Crear un proyecto Java que incluya ejemplos prácticos de diferentes notaciones de complejidad ($O(1)$, $O(n)$, $O(n^2)$, $O(\log n)$, $O(n \log n)$, etc.).
* Documentar la investigación teórica completa y el análisis de los propios ejemplos en código en el informe (`README.md`).

# Marco Teórico: 


## **1. Teoría de la Complejidad**

### 1.1 Definición general
La Teoría de la Complejidad Computacional es una rama de la informática teórica que estudia los recursos (principalmente tiempo y **espacio/memoria**) necesarios para resolver problemas. Su objetivo principal es clasificar los problemas computacionales según su dificultad inherente, independientemente del hardware o lenguaje de programación específico. Esta teoría permite diferenciar entre problemas fáciles(resolubles en tiempo polinomial, Clase P) y problemas difíciles (Clase NP).

### 1.2 Importancia en la resolución de problemas
La eficiencia se mide por los recursos consumidos por un algoritmo en función del **tamaño de la entrada** ($N$).

### 1.3 Eficiencia de algoritmos

* Coste temporal
Cantidad de tiempo que se demora en ejecutar un algoritmo para completar su ejecución.

* Coste espacial
Cantidad de memoria utilizada para resolver un problema.Basado en la cantidad de elementos de entrada que recibe.

### 1.4 Factores de tiempo de ejecución

### Factores Propios (Intrínsecos)
Son inherentes al diseño del algoritmo:
* **Lógica y operaciones:** La cantidad de operaciones básicas realizadas.
* **Tamaño de la Entrada ($N$):** La variable principal de la que depende la complejidad.

### Factores Circunstanciales (Extrínsecos)
Son variables externas al algoritmo:
* **Hardware:** Velocidad del procesador y memoria disponible.
* **Software:** Lenguaje de programación, calidad del compilador y sistema operativo.

### Análisis Teórico
* Determina la eficiencia **antes de la implementación**.
* Consiste en **contar el número de operaciones** en función de $N$.
* Se expresa con la **Notación Big O** ($\mathcal{O}$) y es **independiente del hardware**.

### Análisis Experimental
* Determina la eficiencia **midiendo el tiempo real** en un sistema específico.
* Se ejecuta el código con varias entradas ($N$) y se registra el tiempo.
* Es **dependiente del entorno** (hardware y software).

### 1.5 Notación de Complejidad

La **Notación de Complejidad** es el lenguaje formal utilizado para clasificar la eficiencia de un algoritmo, centrándose en cómo escala su tiempo de ejecución en función del tamaño de la entrada ($N$).

***

#### **Big O ($\mathcal{O}$)**

* **Definición:** Big O describe el **límite superior** del tiempo de ejecución de un algoritmo. Representa la **tasa de crecimiento máxima** que el algoritmo alcanzará.
* **Función:** Si un algoritmo es $\mathcal{O}(f(N))$, significa que su tiempo de ejecución nunca será peor que una constante multiplicada por $f(N)$ para valores de $N$ suficientemente grandes.
* **Importancia:** Es la notación más utilizada porque proporciona una **garantía de rendimiento**, estableciendo el tiempo máximo que el sistema debe esperar.

#### **Mejor Caso ($\Omega$)**

* **Definición:** El Mejor Caso describe el **tiempo mínimo** que un algoritmo puede tardar en ejecutarse. Es el escenario más optimista.
* **Notación:** Se formaliza con la notación **Big Omega ($\Omega$)**.
* **Ejemplo:** En una búsqueda, el mejor caso ocurre cuando el elemento buscado se encuentra en la **primera posición** de la estructura de datos.

#### **Peor Caso ($\mathcal{O}$)**

* **Definición:** El Peor Caso describe el **tiempo máximo** que un algoritmo puede tardar en ejecutarse. Es el escenario más desfavorable para la entrada.
* **Notación:** Se formaliza con la notación **Big O ($\mathcal{O}$)**.
* **Ejemplo:** En una búsqueda, el peor caso ocurre cuando el elemento buscado **no existe** o está en la **última posición** de la lista.

#### **Caso Promedio ($\Theta$)**

* **Definición:** El Caso Promedio describe el **tiempo de ejecución esperado** del algoritmo. Es un análisis probabilístico que considera el promedio de los tiempos de ejecución para todas las posibles entradas de tamaño $N$.
* **Relevancia:** Aunque es el más difícil de calcular, ofrece la estimación más **realista** del rendimiento típico de un algoritmo en la práctica.

#### **Big O ($\mathcal{O}$), Big Omega ($\Omega$), Big Theta ($\Theta$)**

Estas tres notaciones definen formalmente los tres límites asintóticos esenciales para el análisis de algoritmos.

| Notación | Nombre | Límite que Define | Aplicación al Rendimiento |
| :---: | :--- | :---: | :--- |
| **$\mathcal{O}$** | **Big O (Ómicron)** | **Superior** | Define el **Peor Caso**. El tiempo de ejecución no crecerá más rápido que este límite. |
| **$\Omega$** | **Big Omega** | **Inferior** | Define el **Mejor Caso**. El tiempo de ejecución no puede ser más rápido que este límite. |
| **$\Theta$** | **Big Theta** | **Ajustado (Exacto)** | Define el **Caso Promedio**. El tiempo de ejecución está acotado tanto por arriba ($\mathcal{O}$) como por abajo ($\Omega$) por la misma función. |

---

## **2. Ejemplos de Complejidad en Java**

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(1)");
    int x = 10;
    int y = 5;
    int suma = x + y;
}
```

### **Explicación resumida**

*(Aquí el estudiante explica por qué es O(1))*

---
**PARA CADA COMPLEJIDAD, REPETIR LA ESTRUCTURA ANTERIOR**


# **Conclusiones**

* ### Conclusion Janelly Dayanna Chacha Vélez
A lo largo de la práctica, observé que las complejidades cuadráticas (como O(n²)) son las más costosas, ya que aumentan el número de operaciones con rapidez y ralentizan el programa cuando la entrada se expande. A partir del análisis, comprendí que el tiempo de ejecución varía en función del algoritmo y que un código no solo tiene que funcionar, sino también ser eficaz. Me sorprendió mucho ver cómo cambios menores en el código impactan significativamente su complejidad. Esta experiencia me permitió entender por qué es tan relevante estudiar la teoría antes de poner en marcha una solución.

* ### Conclusion Kelly Valeria Guamán León
Comprendí en este ejercicio que la complejidad más cara es la que se expande cuadrática o exponencialmente, porque su desempeño se deteriora rápidamente cuando los datos a procesar crecen. La evaluación me brindó la oportunidad de aprender a comparar algoritmos y distinguir cuáles son más apropiados según el problema. Me sorprendió bastante que ciertos algoritmos que parecen sencillos muestren una eficiencia baja al ser probados con entradas grandes. En términos generales, la práctica me facilitó enlazar ejemplos concretos en Java con la teoría de complejidad y apreciar lo importante que es redactar código escalable además de correcto.

---

