# PSP

**<a href=#Clases>1. Clases</a>**  
----
**<a href=#Objeto>2. Objeto</a>**  
----
**<a href=#Sobrecarga>3. Sobrecarga de métodos</a>**  
----
**<a href=#Herencia>4. Herencia</a>**  
----
**<a href=#Polimorfismo>5. Polimorfismo</a>**  
----
**<a href=#Interface>6. Interface</a>**  
----

<dl>
  <a name=Clases><dt>1. Clases</dt></a>
  <dd>Las clases en Java son básicamente una plantilla que sirve para crear un objeto. Si imaginásemos las clases en el mundo en el que vivimos, podríamos decir que la clase “persona” es una plantilla sobre cómo debe ser un ser humano. Todos y cada uno de nosotros, los seres humanos, somos objetos de la clase “persona“, ya que todos somos personas. La clase “persona” contiene la definición de un ser humano, mientras que cada ser humano es una instancia u objeto de dicha clase.</dd>
</dl>

```java
  public class MiClase{
   ...
  }
```

<dl>
  <a name=Objeto><dt>2. Objeto</dt></a>
  <dd>Un objeto es una unidad dentro de un programa de computadores que consta de un estado y de un comportamiento, que a su vez constan respectivamente de datos almacenados y de tareas realizables durante el tiempo de ejecución. Un objeto puede ser creado instanciando una clase, como ocurre en la programación orientada a objetos, o mediante escritura directa de código y la replicación de otros objetos, como ocurre en la programación basada en prototipos.</dd>
</dl>



<dl>
  <a name=Sobrecarga><dt>3. Sobrecarga de métodos</dt></a>
  <dd>La sobrecarga de métodos es la creación de varios métodos con el mismo nombre pero con diferente lista de tipos de parámetros. Java utiliza el número y tipo de parámetros para seleccionar cuál definición de método ejecutar. </dd>
</dl>

```java
int calculaSuma(int x, int y, int z){
    ...
}
int calculaSuma(int x, int y, int z){
    ...
}
```
En este ejemplo tenemos dos metodos con el mismo nombre que aceptan los mismos tipos de datos, en este caso cuando llamemos al metodo el sistema no sabra a qual de los dos metodos estamos llamando, al tener los nombre y los datos que acepta iguales.
<dl>
  <a name=Herencia><dt>4. Herencia</dt></a>
  <dd>La herencia es una propiedad que permite la declaración de nuevas clases a partir de otras ya existentes. Esto proporciona una de las ventajas principales de la Programación Orientada a Objetos: la reutilización de código previamente desarrollado ya que permite a una clase más específica incorporar la estructura y comportamiento de una clase más general.</dd>
</dl>

### Clase Padre

```java
public class SeleccionFutbol
{

	protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;

	// constructor, getter y setter

	public void Concentrarse() {
		...
	}

	public void Viajar() {
		...
	}
}
```
### Clases Hijas

```java
 public class Futbolista extends SeleccionFutbol
{
	private int dorsal;
	private String demarcacion;

        public Futbolista() {
		super();
	}

	// getter y setter

	public void jugarPartido() {
		...
	}

	public void entrenar() {
		...
	}
}
```

```java
public class Entrenador extends SeleccionFutbol
{

	private String idFederacion;

        public Entrenador() {
		super();
	}

	// getter y setter

	public void dirigirPartido() {
		...	
	}

	public void dirigirEntreno() {
		...
	}
}
```

```java
public class Masajista extends SeleccionFutbol
{

	private String Titulacion;
	private int aniosExperiencia;

        public Masajista() {
		super();
	}

	// getter y setter

	public void darMasaje() {
		...
	}
}
```
<dl>
  <a name=Polimorfismo><dt>5. Polimorfismo</dt></a>
  <dd>El polimorfismo es la habilidad de una función, método, variable u objeto de poseer varias formas distintas. Podríamos decir que un mismo identificador comparte varios significados diferentes.

El propósito del polimorfismo es implementar un estilo de programación llamado envío de mensajes en el que los objetos interactúan entre ellos mediante estos mensajes, que no son más que llamadas a distintas funciones.</dd>
<dt>&nbsp;&nbsp;&nbsp;&nbsp;5.1. Polimorfismo de asignacion</dt>
<dd>El polimorfismo de asignación es el que está más relacionado con el enlace dinámico.
En java, una misma variable referenciada (Clases, interfaces…) puede hacer referencia a más de un tipo de Clase. El conjunto de las que pueden ser referenciadas está restringido por la herencia o la implementación.</dd>


```java
abstract class vehiculo
{
    abstract public void iniciar();
}
class Coche extends Vehiculo
{
    @Override
    public void iniciar()
    {
    }
}
```


<dt>&nbsp;&nbsp;&nbsp;&nbsp;5.2. Polimorfismo Puro</dt>
<dd>El polimorfismo puro se usa para nombrar a una función o método que puede recibir varios tipos de argumentos en tiempo de ejecución. Esto no lo debemos confundir con la sobrecarga, que es otro tipo de polimorfismo en tiempo de compilación.</dd>


```java
class PolimorfismoPuroTest
{
    public function funcionPolimorfica(Comprable ob)
    {
        // La función acepta cualquier "comprable", es decir, cualquier objeto que implemente esa interfaz
        // El tipo de objeto se determina en tiempo de ejecución. En nuestros ejemplos, puede ser una casa o coche.
    }
}
```


<dt>&nbsp;&nbsp;&nbsp;&nbsp;5.3. Polimorfismo de sobrecarga</dt>
<dd>En el polimorfismo de sobrecarga, dos o más funciones comparten el mismo identificador, pero distinta lista de argumentos.</dd>


```java
public final class String
    implements java.io.Serializable, Comparable, CharSequence 
{
    ...

    public static String valueOf(Object obj) 
    {
        return (obj == null) ? "null" : obj.toString();
    }

    public static String valueOf(char data[]) 
    {
        return new String(data);
    }

    public static String valueOf(char data[], int offset, int count) 
    {
        return new String(data, offset, count);
    }

    ...
}
```


</dl>


<dl>
  <a name=Interface><dt>6. Interface</dt></a>
  <dd>Los interfaces proporcionan un mecanismo para abstraer los métodos a un nivel superior, lo que permite simular la herencia múltiple de otros lenguajes.
Un interfaz sublima el concepto de clase abstracta hasta su grado más alto. Un interfaz podrá verse simplemente como una forma, es como un molde, solamente permite declarar nombres de métodos, listas de argumentos, tipos de retorno y adicionalmente miembros datos.</dd>
	
	
```java
public interface Figura { 

float PI = 3.1416f;   // Por defecto public static  final. La f final indica que el número es float

float area();   // Por defecto abstract public

} //Cierre de la interface
```
	
	
</dl>  
