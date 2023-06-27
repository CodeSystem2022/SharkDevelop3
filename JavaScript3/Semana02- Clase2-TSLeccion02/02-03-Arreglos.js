//Creacion de Array o Arreglos
//let autos = new Array('Ferrari', 'Renault', 'BMW'); esta es la sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//Recorremos los elementos de un arreglo
console.log(autos[0]); //acceso manual x indice
console.log(autos[2]);

//acceso mediante ciclo
for(let i = 0; i < autos.length; i++){
    console.log(i+ ' : ' +autos[i]);
}

//Modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1])

//Agregamos nuevos valores al arreglo
autos.push('Audi'); //push agrega al final
console.log(autos)

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche'; //tbm agrega al final
console.log(autos);

//Terecera forma de agregar elelmentos teniendo CUIDADO
//Este error va a asignar un espacio de memoria que no esta siendo utilizado. Ocupa memoria innecesariamente.
autos[6] = 'Renault'; //saltamos un indice y quedo vacio el indice 5
console.log(autos);
console.log(autos[5]); // aqui se puede ver

//Como preguntar si es un Array o Arreglo
console.log(Array.isArray(autos)) ;//Devuelve un booleano


console.log(autos instanceof Array); //Preguntamos si la variable es una instancia de la clase Array
