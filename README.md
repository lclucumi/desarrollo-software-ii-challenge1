<!-- Si cuentas con autorización para usar el logosímbolo oficial, guarda el archivo como assets/logo-univalle.png y descomenta la siguiente línea. -->
<!-- <img src="assets/logo-univalle.png" alt="Universidad del Valle" width="115"> -->

# 🎓 Universidad del Valle
### Desarrollo de Software II · Grupo 51

# 🚚 Challenge 1 — Sistema de domicilios

**Diseño de software · SOLID · Git · Pull Requests · Code Review**

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-Control%20de%20versiones-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-PR%20%2B%20Review-24292f?style=flat-square&logo=github&logoColor=white)
![Modalidad](https://img.shields.io/badge/Modalidad-Parejas-7C3AED?style=flat-square)

**Docente:** Luz Carime Lucumí Hernández  
**Fecha:** sábado 10 de octubre de 2026 · **Tiempo:** 90 minutos aproximadamente  
**Entrega:** enlace al Pull Request abierto

---

> [!IMPORTANT]
> **Este repositorio contiene el punto de partida, no la solución.** El sistema funciona, pero hay decisiones de diseño que podrían dificultar cambios futuros. Lean el enunciado entregado en clase antes de modificar código.

## 🧭 Ruta del Challenge

**Preparar entorno → Clonar → Ejecutar → Crear rama → Analizar → Refactorizar → Commit → Push → Pull Request → Code Review → Entregar.**

| Etapa | Qué deben lograr | Evidencia |
|---|---|---|
| 1. Preparación | Abrir el proyecto y ejecutarlo | Programa funcionando |
| 2. Diseño | Identificar y mejorar problemas reales | Cambios en Java |
| 3. Git | Trabajar sin modificar `main` | Rama y commits |
| 4. Colaboración | Explicar y revisar el cambio | PR y conversación de review |
| 5. Entrega | Compartir la solución | URL del PR abierto |

## 📁 Estructura inicial

```text
desarrollo-software-ii-challenge1/
├── README.md
├── .gitignore
└── src/
    ├── Main.java
    ├── Delivery.java
    └── DeliveryService.java
```

**Qué hace el programa:** simula una entrega, calcula su costo, asigna un transporte y muestra mensajes en consola. No utiliza base de datos ni servicios reales.

## 1. Antes de comenzar

### Paso 1 · Entren a GitHub

1. En el navegador, abran **https://github.com**.
2. Seleccionen **Sign in** e ingresen con su cuenta.
3. Verifiquen que pueden acceder al repositorio compartido por la docente.
4. Trabajen con el **número de pareja asignado en clase**.

> [!NOTE]
> Iniciar sesión en el navegador **no equivale necesariamente** a autenticar Git en la terminal. Si al hacer `push` se solicita autorización, completen el inicio de sesión que muestre Git o Visual Studio Code. **No compartan contraseñas ni tokens.**

### Paso 2 · Abran Visual Studio Code y la terminal

1. Abran **Visual Studio Code**.
2. En la barra superior, seleccionen **Terminal → New Terminal**.
3. Ejecuten:

```bash
git --version
```

Si utilizan IntelliJ IDEA, pueden utilizar la terminal integrada del IDE para ejecutar el mismo comando.

Si aparece una versión de Git, pueden continuar.

> [!IMPORTANT]
> Para este Challenge utilizaremos la opción **Run ▶️** del IDE para ejecutar Java.
> La terminal se utilizará principalmente para trabajar con Git.

### Paso 3 · Copien el enlace del repositorio

1. En GitHub, entren al repositorio de la actividad.
2. Hagan clic en el botón verde **Code**.
3. Seleccionen la pestaña **HTTPS**.
4. Copien la URL del repositorio.

La URL que utilizarán para este Challenge es:

```text
https://github.com/lclucumi/desarrollo-software-ii-challenge1.git
```

`USUARIO` es un ejemplo: **utilicen la URL real** que les compartió la docente.

### Paso 4 · Clonen el proyecto

En la terminal de VS Code, ubiquen una carpeta donde puedan guardar el proyecto. Luego ejecuten:

```bash
git clone https://github.com/lclucumi/desarrollo-software-ii-challenge1.git
```

Después ingresen a la carpeta:

```bash
cd desarrollo-software-ii-challenge1
```

Para abrir esa carpeta en VS Code pueden usar **File → Open Folder** y seleccionarla. Si `code .` funciona en su equipo, también pueden usarlo.

> [!TIP]
> Si Git indica que la carpeta ya existe, **no clonen repetidamente**: revisen primero si ya tienen el proyecto descargado.

## 2. Ejecuten el código inicial

### Paso 5 · Lean los archivos

En el panel **Explorer** de VS Code, abran la carpeta `src` y revisen, en este orden:

1. `Delivery.java`: datos de una entrega.
2. `DeliveryService.java`: lógica actual del sistema.
3. `Main.java`: punto de entrada del programa.

**Todavía no cambien nada.** Primero entiendan qué hace el código.

### Paso 6 · Compilen y ejecuten

En la terminal, desde la **raíz del repositorio** (la carpeta que contiene `src`):

**Windows (PowerShell):**

```powershell
javac src\*.java
java -cp src Main
```

**macOS o Linux:**

```bash
javac src/*.java
java -cp src Main
```

La salida esperada para el ejemplo inicial es:

```text
Delivery assigned to motorcycle
Saving delivery...
Notification sent. Cost: 15000.0
```

> [!NOTE]
> Si el programa no se ejecuta, comprueben que la terminal está ubicada en la carpeta del repositorio y que `javac --version` funciona. También pueden abrir `Main.java` y utilizar **Run** si VS Code tiene habilitado el soporte para Java.

## 3. Creen la rama de su pareja

### Paso 7 · Verifiquen dónde están

```bash
git status
git branch
```

Antes de modificar el proyecto, deben estar en la rama inicial `main`.

### Paso 8 · Creen una rama nueva

Utilicen el formato **`refactor/challenge1-parejaXX`**. Por ejemplo, para la pareja 03:

```bash
git switch -c refactor/challenge1-pareja03
```

Comprueben la rama activa:

```bash
git branch
```

Verán un asterisco `*` junto a su rama. **No trabajen directamente en `main`.**

## 4. Resuelvan el problema de diseño

### Paso 9 · Analicen antes de programar

Lean las necesidades del negocio en el enunciado entregado por la docente y conversen:

- ¿Qué cambios serían difíciles con el diseño actual?
- ¿Qué responsabilidades están mezcladas?
- ¿Qué detalles concretos conoce la lógica principal?
- ¿Qué mejoras tendrían un beneficio claro y cuáles agregarían complejidad innecesaria?

### Paso 10 · Refactoricen y vuelvan a ejecutar

Implementen una solución **pequeña, comprensible y justificada**. Ejecuten nuevamente el programa para comprobar que el comportamiento esperado sigue funcionando.

> [!WARNING]
> **No se evalúa quién crea más clases o interfaces.** No fuercen los cinco principios SOLID: expliquen por qué cada decisión aporta valor.

## 5. Registren y suban sus cambios

### Paso 11 · Revisen los archivos modificados

```bash
git status
```

### Paso 12 · Creen commits descriptivos

```bash
git add .
git commit -m "refactor delivery design"
```

Si hicieron varios cambios independientes, pueden crear **varios commits**. Prefieran mensajes concretos como `extract delivery cost calculation` o `add transport contract` en lugar de `final` o `cambios`.

> [!TIP]
> Si Git les solicita identificar al autor del commit, configuren su nombre y correo con `git config --global user.name "Su Nombre"` y `git config --global user.email "correo@example.com"`, usando sus datos reales. En equipos compartidos, eviten guardar credenciales personales de forma permanente.

### Paso 13 · Hagan `push`

Reemplacen `XX` por el número de su pareja:

```bash
git push -u origin refactor/challenge1-parejaXX
```

Si aparece un error de **permission denied** o **403**, no cambien la URL ni creen repositorios adicionales por su cuenta: avisen a la docente para revisar los permisos de colaboración.

## 6. Abran su Pull Request

### Paso 14 · Entren a GitHub

1. Actualicen la página del repositorio.
2. Si aparece **Compare & pull request**, selecciónenlo.
3. Si no aparece, entren a **Pull requests → New pull request**.
4. Verifiquen las ramas:

```text
base:    main
compare: refactor/challenge1-parejaXX
```

### Paso 15 · Completen el título y la descripción

**Título sugerido:**

```text
[Challenge 1] Refactoring de domicilios — Pareja XX
```

**Plantilla para la descripción:**

```markdown
## Integrantes
- Nombre completo — usuario de GitHub
- Nombre completo — usuario de GitHub

## Problemas identificados
- ...

## Cambios realizados
- ...

## Justificación técnica
- ...

## Conceptos de clase utilizados
- ...

## Posibles costos o trade-offs
- ...

## Verificación
- [ ] El proyecto compila.
- [ ] El programa sigue funcionando.
```

Hagan clic en **Create pull request**. **No lo fusionen (`merge`).**

## 7. Realicen Code Review en pareja

### Paso 16 · Revisen los cambios

1. Una persona asume el rol de **Author** y la otra el de **Reviewer**.
2. El Reviewer abre el PR y entra a **Files changed**.
3. Revisa una línea o decisión concreta y deja **al menos un comentario técnico**.
4. Puede usar **Start a review → Submit review** o publicar un comentario sobre una línea, según las opciones que GitHub muestre.

**Comentario poco útil:** “Todo bien”.

**Comentario útil:** “Esta clase todavía crea directamente una implementación concreta. ¿Podemos reducir ese acoplamiento? ¿Qué beneficio tendría en este caso?”.

### Paso 17 · Respondan al feedback

El Author responde al comentario. Si corresponde ajustar el código:

```bash
git add .
git commit -m "address review feedback"
git push
```

El commit nuevo aparecerá en el **mismo PR**. Si deciden no cambiar algo, expliquen por qué técnicamente.

> [!IMPORTANT]
> La entrega debe mostrar **una conversación real de revisión**, no solamente una aprobación sin argumentos.

## 8. Entrega final

**Cada pareja entrega únicamente la URL de su Pull Request abierto**, por el medio que indique la docente.

### Checklist

- [ ] El proyecto compila y se ejecuta.
- [ ] Trabajamos en nuestra propia rama.
- [ ] La solución responde a problemas concretos.
- [ ] Los commits tienen nombres comprensibles.
- [ ] El PR está dirigido a `main`.
- [ ] El PR identifica a ambos integrantes.
- [ ] La descripción justifica las decisiones.
- [ ] El Reviewer dejó un comentario técnico.
- [ ] El Author respondió y ajustó si correspondía.
- [ ] El PR **permanece abierto** (sin merge).
- [ ] Copiamos y entregamos el enlace.

---

<div align="center">

### 💡 La pregunta que guía el Challenge

**No empiecen preguntando qué principio SOLID deben aplicar.**  
**Empiecen preguntando: _¿qué cambio es difícil en este código y por qué?_**

---

**Universidad del Valle · Desarrollo de Software II · 2026-2**  
Material académico preparado por **Luz Carime Lucumí Hernández**.

</div>
