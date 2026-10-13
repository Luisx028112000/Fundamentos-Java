# 🚗 Sistema de Vehículos

## 📋 DESCRIPCIÓN

**Sistema de Vehículos** es una aplicación de consola desarrollada en Java que demuestra el concepto de **SOBRECARGA (Overloading)** en Programación Orientada a Objetos. El sistema permite crear vehículos y calcular costos de mantenimiento utilizando múltiples versiones de constructores y métodos.

Este proyecto fue desarrollado como práctica académica para entender cómo un mismo método o constructor puede comportarse de manera diferente según los parámetros que recibe.


## ✨ CARACTERÍSTICAS

### 🚗 **Clase Vehiculo**

#### **Constructores Sobrecargados (3 versiones):**
- `Vehiculo()` - Constructor básico con valores por defecto
- `Vehiculo(String placa)` - Constructor solo con placa
- `Vehiculo(String placa, String marca, String modelo)` - Constructor completo

#### **Métodos Sobrecargados calcularMantenimiento():**
- `calcularMantenimiento(int km)` - Calcula costo solo por kilometraje ($0.05 por km)
- `calcularMantenimiento(int km, String tipoServicio)` - Calcula costo por km + tipo de servicio
  - **Básico:** +$20
  - **Completo:** +$50
  - **Premium:** +$120

### 📊 **Funcionalidades**
- ✅ Creación de vehículos con diferentes niveles de información
- ✅ Cálculo de mantenimiento con distintos niveles de detalle
- ✅ Visualización de información del vehículo
- ✅ Demostración práctica de sobrecarga de métodos y constructores


## 🚀 CÓMO EJECUTAR

### **Requisitos Previos**
- Java JDK 8 o superior instalado
- Terminal / Símbolo del sistema

### **Pasos de Ejecución**

1. **Compilar los archivos:**
   ```bash
   javac Vehiculo.java SistemaVehiculos.java
2. Ejecutar el programa:
   ```bash
   java SistemaVehiculos
   ```


## 👨‍💻 Autor 
**Luis Ernesto Vargas**

**Estudiante Desarrollo de Software**

**Institucion:** Instituto Tecnológico de las Americas - ITLA

