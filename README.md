
# **INFORME DE INVESTIGACION**


LOGO CARRERA


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Janelly Dayanna Chacha Vélez 
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

![alt text](image.png)


### **Explicación resumida**

El tiempo de ejecución no depende del tamaño de los datos. 
Siempre se ejecuta en la misma cantidad de pasos.

---

## **2.2 Complejidad O(n) – Lineal**

### **Archivo:** `ComplejidadLineal.java`

### **Código del ejemplo**

![alt text](image-1.png)


### **Explicación resumida**

El tiempo de ejecución crece proporcionalmente al número de elementos. 
Si hay 10 elementos, se hacen 10 operaciones.

---

## **2.3 Complejidad O(n^2) – Cuadratica**

### **Archivo:** `ComplejidadCuadratica.java`

### **Código del ejemplo**

![alt text](image-2.png)


### **Explicación resumida**

Cada elemento se compara con todos los demás.
Si hay n elementos, se hacen n × n operaciones.

---

## **2.4 Complejidad O(log n) – Logartimica**

### **Archivo:** `ComplejidadLogaritmica.java`

### **Código del ejemplo**

![alt text](image-3.png)


### **Explicación resumida**

El conjunto se divide a la mitad en cada paso,
reduciendo drásticamente el número de operaciones.
Ideal para datos ordenados.

---

## **2.5 Complejidad O(n log n) – Lineal-Logaritmica**

### **Archivo:** `ComplejidadNlogN.java`

### **Código del ejemplo**

![alt text](image-4.png)


### **Explicación resumida**

*(Aquí el estudiante explica por qué es O(1))*

---



# **Conclusiones**

* ### Conclusion Janelly Dayanna Chacha Vélez
Durante la práctica pude comprobar que las complejidades más costosas son las cuadráticas, como O(n²), porque incrementan el número de operaciones de forma muy rápida y hacen que el programa se vuelva lento cuando la entrada crece. Del análisis aprendí a identificar cómo cambia el tiempo de ejecución dependiendo del tipo de algoritmo y que no basta con que un código funcione: también debe ser eficiente. Algo que realmente me sorprendió fue ver que pequeñas modificaciones en el código afectan notablemente su complejidad. Esta experiencia me ayudó a comprender mejor por qué es tan importante estudiar la teoría antes de implementar una solución.
* ### Conclusion Kelly Valeria Guamán León
En esta práctica entendí que la complejidad más costosa es aquella que crece de manera exponencial o cuadrática, ya que su rendimiento se deteriora con rapidez cuando aumentan los datos a procesar. El análisis me permitió aprender a comparar algoritmos y a reconocer cuáles son más adecuados según el problema. Me sorprendió mucho que algunos algoritmos que parecen simples tengan un comportamiento poco eficiente cuando se prueban con entradas grandes. En general, la práctica me permitió conectar la teoría de complejidad con ejemplos reales en Java y valorar la importancia de escribir código que no solo sea correcto, sino también escalable.

---

