<div align="center">

<img src="https://images.unsplash.com/photo-1555066931-4365d14bab8c?auto=format&fit=crop&w=1200&h=320&q=80" width="100%" alt="Software Engineering Banner" />

# ☕ Programación 1: Fundamentos de Java
### Instituto Tecnológico de Las Américas (ITLA)

<br/>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/JDK-17%2B-007396?style=for-the-badge&logo=java&logoColor=white" alt="JDK" />
  <img src="https://img.shields.io/badge/Matrícula-2025--1071-00b4d8?style=for-the-badge" alt="Matrícula" />
  <img src="https://img.shields.io/badge/Status-Completado-success?style=for-the-badge" alt="Status" />
</p>

> Repositorio académico con los 26 programas prácticos del módulo Fundamentos de Java.

---

</div>

## 📌 Ficha Técnica

| Atributo | Detalle |
| :--- | :--- |
| Institución | Instituto Tecnológico de Las Américas (ITLA) |
| Asignatura | Programación 1 |
| Docente | Jesús Quezada |
| Estudiante | Luis Ernesto Vargas De Jesus |
| Matrícula | 2025-1071 |
| Entorno de Desarrollo | Java SE Development Kit (JDK 17+) |

---

## 🎯 Objetivo Académico

Implementar de forma práctica las estructuras esenciales de la programación orientada a objetos y algorítmica en Java, abarcando desde sintaxis elemental y estructuras de control hasta modularización, prevención de errores en tiempo de ejecución y tratamiento de colecciones de datos contiguos.

---

## 📂 Módulos del Repositorio

<details open>
<summary><b>1. Estructura Básica y Fundamentos</b></summary>
<br>

- `MiPrimerPrograma.java` — Declaración del método de entrada main y emisión estándar a consola.
- `EstructuraBasica.java` — Uso de tipos de datos primitivos, memoria, operadores y operaciones de nómina.

</details>

<details>
<summary><b>2. Estructuras de Control Condicional (If - Else)</b></summary>
<br>

- `SistemaCalificaciones.java` — Mapeo de evaluaciones cualitativas por tramos numéricos con else if.
- `SistemaDescuentos.java` — Implementación de reglas de negocio para acumulación escalonada de beneficios.
- `OperadorTernario.java` — Asignaciones compactas e inline para simplificación de bifurcaciones simples.

</details>

<details>
<summary><b>3. Control de Flujo con Switch</b></summary>
<br>

- `MenuRestaurante.java` — Gestión de selecciones discretas con cláusulas de escape break y caso default.
- `DiasLaborales.java` — Agrupación de casos continuos para reutilización de instrucciones.
- `SwitchModerno.java` — Implementación de expresiones switch (Java 14+) con sintaxis lambda -> y yield.

</details>

<details>
<summary><b>4. Iteración y Bucles Determinados (For)</b></summary>
<br>

- `TablaMultiplicar.java` — Construcción de sucesiones matemáticas mediante iteraciones controladas.
- `NominaMensual.java` — Procesamiento coordinado de vectores y cómputo de acumuladores financieros.
- `MatrizAsientos.java` — Bucles anidados orientados al dibujo y mapeo de cuadrículas bidimensionales.
- `IncrementosPersonalizados.java` — Manejo del contador de avance con saltos no lineales y cuentas regresivas.

</details>

<details>
<summary><b>5. Recorrido Simplificado (Foreach)</b></summary>
<br>

- `InventarioProductos.java` — Iteración limpia de vectores sin el uso de índices explícitos.
- `AnalisisVentas.java` — Algoritmos para obtención de valores extremos (máximos y mínimos) y promedios.
- `ProcesamientoEmpleados.java` — Extracción y transformación de cadenas de texto durante el ciclo de lectura.

</details>

<details>
<summary><b>6. Bucles Condicionados (While / Do-While)</b></summary>
<br>

- `SistemaLogin.java` — Autenticación con control estricto de intentos de acceso.
- `CajeroAutomatico.java` — Menú transaccional persistente gobernado por banderas de finalización.
- `ValidacionEdad.java` — Bucle do-while para asegurar la entrada obligatoria de datos válidos.

</details>

<details>
<summary><b>7. Modularización y Métodos</b></summary>
<br>

- `CalculadoraEmpresarial.java` — Métodos estáticos con paso de argumentos y retorno de valores calculados.
- `GestionProductos.java` — Arquitectura modular interconectando subprocesos de negocio (stock, IVA y descuentos).

</details>

<details>
<summary><b>8. Control de Excepciones (Try - Catch - Finally)</b></summary>
<br>

- `DivisionSegura.java` — Tratamiento de ArithmeticException para evitar el cierre inesperado del programa.
- `ValidacionDatosEmpresariales.java` — Creación de reglas de entrada con lanzamiento explícito mediante throw.

</details>

<details>
<summary><b>9. Arreglos y Matrices</b></summary>
<br>

- `SistemaInventario.java` — Arreglos paralelos con salida tabular alineada mediante printf.
- `AnalisisTemperaturas.java` — Evaluación de tendencias y desviaciones respecto a una media calculada.
- `MatrizCalificaciones.java` — Tratamiento de tablas bidimensionales y cálculo de medias por renglón y columna.
- `OperacionesArreglos.java` — Utilidades nativas de la librería java.util.Arrays (búsqueda, copia, orden e inversión).

</details>

---

## 💻 Entorno y Ejecución

Asegúrate de contar con el Java Development Kit (JDK 17+) debidamente configurado en tus variables de entorno.

### Compilar y Ejecutar un Programa

Abre una terminal en el directorio raíz del proyecto y ejecuta los siguientes comandos según el archivo deseado:

```bash
# 1. Compilación del código fuente
javac NombreDelPrograma.java

# 2. Ejecución del programa compilado
java NombreDelPrograma
