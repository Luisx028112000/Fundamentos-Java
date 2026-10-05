# Programación 1: Fundamentos de Java

> Repositorio académico con la implementación de ejercicios prácticos correspondientes al módulo de Fundamentos del lenguaje Java[cite: 1].

| Metadato | Detalle |
| :--- | :--- |
| Institución | Instituto Tecnológico de Las Américas (ITLA) |
| Asignatura | Programación 1[cite: 1] |
| Docente| Jesús Quezada[cite: 1] |
| Estudiante | Luis Ernesto Vargas De Jesus |
| Entorno| Java SE Development Kit (JDK) 17+[cite: 66] |

---

## 🎯 Alcance del Proyecto

Consolidar las bases del paradigma estructurado y de objetos en Java mediante la implementación de 26 programas prácticos divididos en 9 ejes temáticos[cite: 1, 66]: sintaxis elemental, control de flujo condicional, estructuras repetitivas, modularización con métodos, robustez ante fallos y estructuras de almacenamiento contiguo[cite: 4, 9, 23, 45, 50, 55, 66].

---

## 📂 Índice de Programas

### 01. Estructura Básica
* `MiPrimerPrograma.java`: Estructura del método `main` y flujo de salida en consola[cite: 3].
* `EstructuraBasica.java`: Tipos primitivos, variables y operadores aritméticos elementales[cite: 4, 7].

### 02. Control Condicional (If - Else)
* `SistemaCalificaciones.java`: Evaluación encadenada de rangos numéricos con `else if`[cite: 10].
* `SistemaDescuentos.java`: Lógica de acumulación de descuentos comerciales por criterios combinados[cite: 12].
* `OperadorTernario.java`: Asignaciones condicionales compactas de una sola línea[cite: 14].

### 03. Estructura Switch
* `MenuRestaurante.java`: Evaluación discreta con control de flujo mediante `break` y `default`[cite: 16, 17].
* `DiasLaborales.java`: Agrupación de casos continuos con ejecución compartida[cite: 19].
* `SwitchModerno.java`: Sintaxis moderna (Java 14+) con expresiones lambda (`->`) y palabra reservada `yield`[cite: 21].

### 04. Ciclos For
* `TablaMultiplicar.java`: Generación de series aritméticas con contadores finitos[cite: 23].
* `NominaMensual.java`: Procesamiento secuencial y acumulación de totales de nómina[cite: 25].
* `MatrizAsientos.java`: Bucles anidados para la generación de cuadrículas bidimensionales[cite: 27].
* `IncrementosPersonalizados.java`: Modificación del paso de conteo y secuencias regresivas[cite: 29].

### 05. Ciclos Foreach
* `InventarioProductos.java`: Recorrido directo de colecciones sin puntero de índice[cite: 31, 32].
* `AnalisisVentas.java`: Extracción de métricas estadísticas (máximos, mínimos y medias anuales)[cite: 34].
* `ProcesamientoEmpleados.java`: Manipulación y extracción de cadenas de caracteres en bucles[cite: 36].

### 06. Ciclos While y Do-While
* `SistemaLogin.java`: Control de acceso repetitivo con límite finito de intentos de fallo[cite: 39].
* `CajeroAutomatico.java`: Menú transaccional persistente controlado por estado de salida[cite: 41].
* `ValidacionEdad.java`: Bloque `do-while` para asegurar validación previa de entradas de usuario[cite: 38, 43].

### 07. Modularización (Métodos)
* `CalculadoraEmpresarial.java`: Funciones estáticas con paso de parámetros y retornos calculados[cite: 45, 46].
* `GestionProductos.java`: Interconexión de múltiples métodos funcionales para un flujo comercial[cite: 48].

### 08. Manejo de Excepciones (Try - Catch)
* `DivisionSegura.java`: Captura de `ArithmeticException` para evitar el colapso de la aplicación[cite: 50, 51].
* `ValidacionDatosEmpresariales.java`: Disparo de excepciones personalizadas mediante `throw` y captura controlada[cite: 53].

### 09. Arreglos y Matrices
* `SistemaInventario.java`: Gestión de arreglos paralelos con tabulación formateada vía `printf`[cite: 56].
* `AnalisisTemperaturas.java`: Cálculo estadístico sobre arreglos unidimensionales y comparación frente al promedio[cite: 58].
* `MatrizCalificaciones.java`: Almacenamiento en matrices bidimensionales y cálculo de medias por filas y columnas[cite: 60].
* `OperacionesArreglos.java`: Métodos de la clase `java.util.Arrays` (búsqueda binaria, ordenamiento, inversión y llenado)[cite: 62].

---

## ⚙️ Instrucciones de Ejecución

Para compilar y ejecutar cualquier clase directamente desde la terminal del sistema[cite: 1, 66]:

```bash
# Compilación del archivo fuente
javac NombreDelArchivo.java

# Ejecución del bytecode generado
java NombreDelArchivo
