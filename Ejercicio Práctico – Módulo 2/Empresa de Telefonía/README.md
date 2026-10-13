# 📱 Sistema de Facturación Telefónica


## 📋 DESCRIPCIÓN

**Sistema de Facturación Telefónica** es una aplicación de consola desarrollada en Java que simula la gestión de facturación para una empresa de telecomunicaciones. El sistema permite crear clientes, asignarles planes telefónicos y generar facturas detalladas basadas en su consumo real.

Este proyecto fue desarrollado como práctica de **Programación Orientada a Objetos (POO)** y demuestra conceptos fundamentales como encapsulamiento, relaciones entre clases y métodos de negocio.

---

## ✨ CARACTERÍSTICAS

### 🔷 **Clase Plan**
- Almacena minutos incluidos, datos (GB) y precio mensual
- Getters para acceder a los atributos
- Método para mostrar información del plan

### 🔷 **Clase Cliente**
- Nombre y número telefónico
- Referencia a un objeto Plan (relación "tiene un")
- Método para mostrar datos del cliente y su plan

### 🔷 **Clase Factura**
- Registra consumo real (minutos y datos usados)
- Calcula automáticamente cargos extras por exceso:
  - **Minutos extra:** $0.10 por minuto adicional
  - **Datos extra:** $2.50 por GB adicional
- Método que genera factura detallada mostrando:
  - Datos del cliente
  - Plan base contratado
  - Consumo real
  - Cargos extras (si aplican)
  - Total a pagar

---

## 🚀 CÓMO EJECUTAR

### **Requisitos Previos**
- Java JDK 8 o superior instalado
- Terminal / Símbolo del sistema

### **Pasos de Ejecución**

1. **Compilar todos los archivos:**
   ```bash
   javac Plan.java Cliente.java Factura.java EmpresaTelefonia.java
2. **Ejecutar el programa:**
    ```bash
   java EmpresaTelefonia
   ```

---

## 👨‍💻 Autor 
**Luis Ernesto Vargas**

**Estudiante Desarrollo de Software**

**Institucion:** Intituto Tecnologico de las Americas - ITLA**