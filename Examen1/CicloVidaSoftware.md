# Actividades del desarrollo del software
- Análisis y planificación
- Diseño
- Implementación
- Pruebas
- Documentación
- Despliegue
- Entrenamiento y soporte
- Mantenimiento

# Modelos de desarrollo de softare
- Modelo de cascada
- Modelo de prototipos
- Modelos evolutivos
    - Modelo itertativo e incremental
    - Modelo en espiral
    - Modelo ágil

# Modelo en cascada
- Tienen un orden
- Recorrer todas las etapas en caso de cambios

|Ventajas|Desventajas|
|---|---|
|Fácil de comprender, planificar y seguir|Necesario conocer todos los requisitos desde el inicio|
|Producto de calidad|Difícil volver atrás si hay errores en una etapa|
|Equipo con experiencia|Producto no disponible para su uso hasta que esté terminado|

Recomendado cuando:
- Se han hecho proyectos similares
- Requisitosd estables y bien comprendidos
- No son necesarias versiones intermedias

# Modelo de prototipos
- Construcción de un prototipo básico rápido
- Representación de aquello que será visible para el cliente o usuario final

|Ventajas|Desventajas|
|---|---|
|El cliente conoce los objetivos generales del software, pero no los requisitos detallados de entrada, procesamiento o salida|El cliente se crea expectaticas|
|Se puede reutilizar parte del código|Suele ser necesario reconstruir todo para la versión final|
|El prototipo ayuda a definir los requisitos|

# Modelos evolutivos

## Iterativo e incremental
basado en varios ciclos en cascada realimentados aplicados repetidamente. Entrega el sofware en pequeños incrementos, y cada incremento se construye sobre aquel anterior. 
Se usa cuando
- Los usuarios no saben muy bien lo que necesitan
- En el desarrollo, los procesos y características tienden a cambiar

### Etapas
1. Etapa de inicializacion
    - Crear producto para que el usuario interaccione y pueda retroalimentar el proceso
    - Muestra aspectos claves del problema
    - Se crea una lista de todas las tareas que necesitan ser realizadas
2. Etapa de iteración
    - Rediseño e implementación de una tarea de la lista

#### Desarr
|Ventajas desarr. incremental| Ventajas desarr. iterativo|Desventajas|
|---|---|---|
|Los clientes no tienen que esperar a que termine el proyecto|Productos con menos probabilidad de fallar|Difícil estimar esfuerzo y coste|
|Se entrega primero lo más importante|Permite entregar partes operativas muy pronto| Se tiene el riesgo de no acabar nunca|
|Los clientes nutilizan los incrementos iniciales como prototipos|Se obtiene experiencia con cada iteración|Requiere un cliente involucrado en el curso del proyecto|
|No es necesario conocer todos los requisitos al comienzo|Permite separar la complejidad del proyecto|Programa más vulnerable debido a la falta de robustez|
|Las entregas facilitan la realimentación de los próximos incrementos||Creación de sistemas demasiado simples bajo los ojos del cliente|

Se recomienda cuando
- se estan probando nuevas tecnologías
- no se tienen claros los requisitos del diseño o se prevén grandes cambios 

## Modelo en espiral
Combina el modelo en cascada y el modelo iterativo
En cada ciclo se desarrolla una parte del mismo, y cuando este se termina se produce una versión incremental del software con respecto al ciclo anterior.
Cada ciclo tiene 4 fases:
1. Determinar objetivos
2. Análisis de riesgos
3. Desarrollar y probar
4. Planificación

|Ventajas|Desventajas|
|---|---|
|No es necesario conocer todos los requisitos|Es difícil evaluar los riesgos|
|Análisis de riesgos en todas las etapas|El coste del proyecto avanza según avanzan las iteracciones|
|Reduce riesgos del proyecto|El éxito depende de la fase de análisis de riesgos|
|Incorpora objetivos de calidad||

Se recomienda cuando
- Proyectos con grandes cambios y de gran tamaño
- Proyectos donde es importante el factor de riesgo

## Modelo ágil
- Están basados en el desarrollo iterativo e incremental
- Apuesta por un punto de vista mas ligero y centrado en las personas en vez de los procesos
- Utilizan la retroalimentación en vez de la planifiación
- Esta se canaliza por medio de pruebas periódicas y frecuentes versiones de software

|Ventajas|Desventajas|
|---|---|
|Rápida respuesta a cambios|Se corre el riesgo de no ejecutar bien el desarrollo|
|Intervención del cliente en el proceso|Necesario contar con experiencia|
|Entregas del producto a intervalos|Falta de documentación|
|Eliminación de tareas innecesarias|Soluciones erróneas en etapas largas|

Algunas metodologías ágiles son:
- **Scrum**
- Lean Software Development (LSD)
- Kanban

