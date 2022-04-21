package ar.unq.po2.tp3;

public class ej4y5 {

	String a = "abc";
	String s = a;
	String t;
}	


/* EJERCICIO 4 STRINGS
 
 s.length();  -> Devuelve 3
 t.length(); -> Devuelve error porq la variable t no esta inicializada.
 1 + a; -> Devuelve "1abc"
 a.toUpperCase(); -> Devuelve "ABC"
 "Libertad".indexOf("r"); -> Devuelve 4.
 "Universidad".lastIndexOf('i'); -> Devuelve 7.
 "Quilmes".substring(2,4); -> Devuelve "il"
 (a.length() + a).startsWith("a"); -> Devuelve False.
 s == a; -> Devuelve True.
 a.substring(1,3).equals("bc") -> Devuelve True. 
 
*/

/*EJERCICIO 5 TIPOS PRIMITIVOS
¿Qué son los tipos de datos primitivos?
Un tipo primitivo es predefinido por el lenguaje y tiene como nombre una palabra reservada.

¿Cuál es la diferencia entre un int y un Integer?
Los wrappers, como Integer, son útiles cuando necesitamos usar nuestra variable en colecciones o queremos dejar algún atributo opcional con un valor nulo. Los tipos primitivos son excelentes para cuando no queremos nulos y para operaciones matemáticas, ya que ocupan poco espacio en la memoria, mejorando el rendimiento de su aplicación. Integer ademas funciona como un objeto y provee una serie de metodos que puede aplicar. En cambio int no.

¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se
define una de tipo Integer? Haga la prueba en Eclipse.

int devuelve 0 como valor predeterminado.
Integer devuelve null.

*/