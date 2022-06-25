# Patrones de diseño

Los patrones de diseño son una técnica para resolver un problema que es común o que se repite constantemente
en el desarrollo de software. Con ellos nos evitamos tener que solucionar el mismo problema de distintas maneras.

Los patrones de diseño están dividos en 3 tipos:
* Creacionales
* Estructurales
* Comportamiento

# Creacionales

* Singleton: <br>
Este patrón tiene la particularidad de que sólo puede haber una instancia de una clase. Es decir,
una clase no podrá ser instanciada más de una vez.

* Factory: <br>
Este patrón crea una jeraquia de clases de forma transparente, es decir se pueden unificar varias clases diferentes.

* Builder: <br>
Este patrón nos permite crear objetos complejos y/o grandes paso a paso y de una manera más facil

* Prototype: <br>
Este patrón es utilizado para clonar clases y/o objetos, es decir, se genera uno nuevo a partir de uno ya existente.

# Estructurales
* Decorator: <br>
Este patrón añade a una clase ya existente una y/o varias funcionalidades sin modificar la clase.

* Adapter: <br>
Este patrón es utilizado para hacer que las clases existentes funcionen con otras si modificar su código. Se utiliza un
adaptador por cada cosa que se quiera adaptar.

* Facade: <br>
Este patrón lo que nos permite es esconder el código complejo que pueda tener una clase en un método que sólo lo tengamos
que llamar ya sea con parámetros o sin ellos, normalmente su uso se ve en los controladores ya que sólo hacemos el llamado a
un método dentro del service.

