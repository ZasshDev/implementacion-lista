# implementacion-lista

# Estructura de Datos: Lista Genérica Doblemente Ligada

Este repositorio contiene una implementación robusta de una **Lista Doblemente Ligada** en Java, diseñada bajo los estándares de calidad de la ingeniería de software. El proyecto demuestra el uso de programación genérica, encapsulamiento y gestión eficiente de punteros.

## 🎯 Objetivos de Ingeniería de Software

El código ha sido evaluado y cumple con las siguientes características:

* **Correcto:** La lógica de punteros asegura que la integridad de la lista se mantenga en cada operación de inserción y búsqueda.
* **Eficiente:** La inserción al final se realiza en tiempo constante $O(1)$ gracias al puntero `rabo`.
* **Mantenible:** Estructura modular con separación clara entre la unidad de datos (`Nodo`) y la lógica de control (`Lista`).
* **Reutilizable:** Mediante el uso de genéricos `<T>`, la lista es compatible con cualquier tipo de dato u objeto.
* **Testeable:** Métodos independientes que facilitan la implementación de pruebas unitarias (Unit Testing).
* **Confiable:** Control de estados para listas vacías y manejo seguro de referencias.
* **Portátil:** Código escrito en Java estándar, ejecutable en cualquier entorno con JVM.

---

## 💻 Guía de Ejecución Local

Para probar este proyecto en tu entorno local, sigue estos pasos:

### 1. Clonar el repositorio
```bash
git clone [https://github.com/TuUsuario/nombre-del-repo.git](https://github.com/TuUsuario/nombre-del-repo.git)
cd nombre-del-repo
