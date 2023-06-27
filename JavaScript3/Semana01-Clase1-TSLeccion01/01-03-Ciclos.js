/*//Ejercicio 1
//Calcular ñla suma de los n primeros numeros

let n = 5
let resultado = 0

for (var i = 0; i < n; i++) {
	resultado += (n-i)
}

console.log(resultado)
*/

/*//Ejercicio 2
//calcular independientemente numeros pares e impares entre 1 y 50

i = 0
resultado_impares = 0, resultado_pares = 0
while(i<=50){
	if (i%2 == 0) {
		resultado_pares += i
	}else{
		resultado_impares += i
	}
	i++
}
console.log("resultado_impares: " +resultado_impares)
console.log("resultado_pares: " +resultado_pares)*/

/*//Ejercicio 3
//Leer 10 números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros

let positivos = 0, negativos = 0, zeros = 0, numero = [0,5,-2,4,-5,-3,0,0,2,89];
for (var i = 0; i < 10; i++){
	if (numero[i] == 0){
		zeros += 1;
	}else if (numero[i] < 0){
		negativos += 1;
	}else{
		positivos += 1;
	}
}
console.log(
	"positivos:"+positivos+
	"\nnegativos:"+negativos+
	"\nneutros:"+zeros
	);*/

/*//Ejercicio 4
//Realizar un algoritmo para calcular la calificación promedio
// y la calificación más baja de todo el grupo 

let notas = [10,10,9,9,8.9,7,6.5,6.3,4,1];
let nota_mas_baja=10,promedio=0,i=0;
while (i<10){
	promedio += notas[i];
	if(notas[i]<nota_mas_baja){
		nota_mas_baja=notas[i];
	}
	i++;
}
promedio = promedio/10;
console.log('promedio ='+promedio+'\n nota mas baja ='+nota_mas_baja)*/

/*//Ejercicio 5
//Calcular el factorial de un número mayor o igual a 0

let y=1,x = 5;
if(x!=0){
	for (var i = x; i > 0; i--) {
		y *= i;
	}
}else{
	y=1;
}
console.log('factorial='+y);*/

/*//Ejercicio 6
//Calcular la siguiente sumatoria de los “N” elementos: 
let lista = [10, 3, 278, 44], resultado=0;
for (var i=0;lista.length >i;i++){
	resultado += lista[i];
}
console.log(resultado);*/

/*//Ejercicio 7
//Ingresar “N” enteros, visualizar la suma de los números pares de la lista, 
//cuántos números pares existen y cuál es el promedio de los números impares

let enteros = [13,53,2,56,73,2,43,6,2], i = 0, pares = 0, impares = 0, resultado_pares =0,promedio_impares=0;
while(enteros.length > i){
	if (enteros[i]%2==0){
		resultado_pares += enteros[i];
		pares ++;
	}else{
		impares++;
		promedio_impares+=enteros[i];
	}
	
	i++;
}

promedio_impares= promedio_impares/impares;
console.log("promedio_impares="+promedio_impares+
	"\npares="+pares+
	"\nsuma pares="+resultado_pares);*/

/*//Ejercicio 8
//Dada las horas trabajadas de 5 personas y la tarifa de pago 
//calcular el salario, y la sumatoria de todos los salarios. 

let horas = [72,72,70,86,80], salarios = [500,550,500,670,800],i=0,total=[0,0,0,0,0];
while ( 5>i){
	total[i]=horas[i]*salarios[i]
	i++;
}
console.log(total);*/

/*//Ejercicio 9
//Ingresar “N” números, calcular el máximo y mínimo de ellos
let numeros = [10,100,1,1000], n_mayor=-999999999, n_menor=9999999999;
for (var i = numeros.length - 1; i >= 0; i--) {
	if (numeros[i]>n_mayor){
		n_mayor = numeros[i];
	}else if(n_menor>numeros[i]){
		n_menor = numeros[i];
	}
}
console.log(n_mayor+'</>'+n_menor);*/

/*//Ejercicio 10
//Imprimir la serie de los “N” términos de la serie de Fibonacci
let n=19;
let x=1,y=0,z=0;
if(z!=n){
	console.log(1)
}

while(n!=z){
	console.log(x+y);
	if (z%2==0){
		y=x+y;
	}else{
		x=y+x;
	}
	z++;
}*/
