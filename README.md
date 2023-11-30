1.	Crea una clase llamada Trabajador con las siguientes características:
a.	Propiedades:(1p)
i.	nombre: el nombre del trabajador
ii.	ss: número de la seguridad social de hasta 11 cifras (no entra en un int)
iii.	puesto: puesto de trabajo que puede únicamente contener los valores: ANALISTA, PROGRAMADOR, BECARIO
iv.	sueldo: número entero
b.	Constructor con tres parámetros:
i.	nombre: asigna el nombre al trabajador
ii.	ss: comprueba si es válido el número de la ss. Si es válido lo guarda, si no, guarda un cero. (2p)
Número ss válido: Un número de la seguridad es válido si el módulo 97 de las 9 primeras es igual a las dos últimas. Suponemos que tiene al menos 11 cifras. Por ejemplo
 
Es conveniente crear un método privado esValidoSS(num) que valide el número de la ss. Si no eres capaz de implementar el algoritmo, lo puedes llamar en el constructor como si existiera 
iii.	puesto: Asigna el valor a puesto y en función del puesto, asigna el sueldo según lo siguiente: (1p)
1.	ANALISTA ->3000
2.	PROGRAMADOR->2000
3.	BECARIO ->1500
c.	Getter:
i.	Crea los getter para las propiedades de la clase (1p)
 

d.	Setter:
i.	Crea los setter para asignar los valores a las propiedades: nombre, ss y puesto. Tienen que cumplir las especificaciones de validación del constructor. (1p)
e.	Crea un método imprimirEmpleado que imprima por pantalla las propiedades del empleado. Puedes sobrecargar toString si lo deseas (0.5p)

f.	Crea un método llamado ascenderEmpleado(). Este método realizará lo siguiente: (1p)
•	Si es BECARIO pasara a ser PROGRAMADOR y cobrar el sueldo de PROGRAMADOR
•	Si es PROGRAMADOR pasará a ser ANALISTA y cobrar el sueldo de ANALISTA
•	Si es ANALISTA pasará a cobrar 200€ más hasta un máximo de 6000€
2.	Crea un programa (clase con main) que cree un empleado, muestre por pantalla sus datos, le suba el sueldo y muestre de nuevo sus datos (1p)

3.	Crea un método static que devuelva un string que representa una H mediante asteriscos. (1.5p)
a.	Le pasamos la altura. La altura  tiene que ser mayor de 5 e impar. Si no lo cumple devuelve la cadena “altura no válida”
b.	Por ejemplo: System.out.println(cadenaH(7)); imprime
 
