# PlusWars 🚀

**PlusWars** es una aplicación de consola hecha en **Java** para consultar información de películas del universo **Star Wars**, usando la [SWAPI](https://swapi.dev/).  
Fue desarrollada para practicar conceptos de **Programación Orientada a Objetos (POO)**, consumo de **APIs REST**, parseo de **JSON con GSON**, buenas prácticas y versionado con **Git**.

---

## 📚 Tabla de Contenido

- [📌 Descripción](#-descripción)
- [⚙️ Tecnologías](#️-tecnologías)
- [🗂️ Estructura del Proyecto](#️-estructura-del-proyecto)
- [🚀 Cómo Ejecutar](#-cómo-ejecutar)
- [📈 Qué Aprendí](#-qué-aprendí)
- [🤝 Feedback Bienvenido](#-feedback-bienvenido)
- [📝 Autor](#-autor)

---

## 📌 Descripción

✨ **¿Qué hace PlusWars?**

- Muestra un menú interactivo para elegir una película de Star Wars.
- Construye dinámicamente la URL de consulta a SWAPI.
- Realiza la petición HTTP y parsea la respuesta JSON a objetos Java.
- Muestra al usuario solo la información relevante.
- Permite hacer múltiples consultas en bucle.
- Guarda todas las búsquedas realizadas en un archivo **`Historial_Busquedas.json`** como log.

---

## ⚙️ Tecnologías

- ☕ **Java 21**
- 🌐 **SWAPI** (Star Wars API)
- 🔗 **HttpClient**
- 📦 **GSON** para parsear JSON
- 🧹 **Git & GitHub** para versionado
- 🛠️ **IntelliJ IDEA** como IDE principal

---

## 🗂️ Estructura del Proyecto

```plaintext
dev.sneyki.pluswars/
├── Main.java           # 🎬 Punto de entrada: menú principal y bucle de consultas
├── services/
│   └── SwapiService    # 🌐 Construcción de URL y consulta HTTP
├── models/
│   └── Films.java      # 🎥 Clase modelo de películas
├── utils/
│   ├── JsonParserUtil  # 🗂️ Parseo JSON a objeto
│   └── JsonWriterUtil  # 💾 Guardado del historial en JSON
└── libs/               # 📦 Librería externa: gson-2.13.1.jar
```
---

## 🚀 Cómo ejecutar

### ⚙️ Requisitos previos

- Java JDK 17+ instalado
- Clonar este repositorio o descargar el `.jar` desde la carpeta `release/`

---

### 🖥️ Ejecución desde IntelliJ IDEA

1. Abre el proyecto en IntelliJ.
2. Ejecuta la clase `Main.java`.
3. Sigue las instrucciones en consola para hacer tus búsquedas de Star Wars.

---

### 🗄️ Ejecución con `.jar`

Si tienes el archivo `PlusWars.jar` (ubicado en carpeta release):

```bash
# Navega a la carpeta donde está tu archivo .jar
cd ruta/a/tu/proyecto

# Ejecuta con:
java -jar PlusWars.jar
```

---

## 📈 Qué Aprendí

- ✅ Construcción de URL dinámicas para consumir APIs.
- ✅ Uso de HttpClient en Java para peticiones GET.
- ✅ Transformar JSON a objetos con GSON.
- ✅ Manejo de POO: clases modelo, servicios y utilidades.
- ✅ Crear un bucle de interacción y guardar historial en archivos locales.
- ✅ Buenas prácticas: nombres de paquetes, gitignore, organización modular.

---

## 🤝 Feedback Bienvenido

Este proyecto es parte de mi portafolio en crecimiento como desarrollador Java Junior 🚀
Estoy abierto a sugerencias, feedback, tips y cualquier colaboración que ayude a mejorar mi código y habilidades.

---

## 📝 Autor

Edwing Herrera - "Sneyki"

🔗 [LinkedIn](https://www.linkedin.com/in/edwing-idar-herrera-orozco/)

💻 [GitHub](https://github.com/Sneyki01?tab=repositories)

📧 ¡Conectemos!

¡Que la fuerza te acompañe! ⚔️✨
