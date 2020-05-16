# IndevelUpTest
App Android para prueba técnica de IndevelUp. Ejemplo de consumo de API. Arquitectura limpia con Kotlin


### Preguntas de la prueba
1. En qué consiste el principio de responsabilidad única? Cuál es su propósito?
* Consiste en la premisa de que un objeto debe realizar una única cosa.
Su propósito es proteger el código frente a los cambios, limitar responsabilidades de clases y
la cantidad de métodos públicos y líneas que tengan dichas clases.

2. Qué características tiene, según su opinión, un “buen” código o código limpio?
* Android provee estándares y guías a seguir para desarrollar aplicaciones eficientes, organizadas, 
desacopladas, limpias, robustas.

Principalmente se emplea una correcta división de capas modularizando de la siguiente manera:
1-APP: Contiene lo referido a la visual o presentación del proyecto.
Normalmente encontraremos todos los recursos gráficos junto con un patrón de diseño como MVP o MVVM.

2-DATA: Aquí se disponen las fuentes de datos, el acceso a los mismos, la implementación de repositorios,
el uso de base de datos locales, el consumo de APIs, manejo de preferencias.

3-DOMAIN: Funciona de intermediario entre la comunicación de las APP y DATA. Contiene las reglas de 
negocio, las reglas acciones disponibles que APP puede usar.