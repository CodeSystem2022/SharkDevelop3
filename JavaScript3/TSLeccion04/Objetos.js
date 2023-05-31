let x = 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');
//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function() {
		return this.nombre +' '+this.apellido;
    }
}

console.log('Nombre: '+persona.nombre);
console.log('Apellido: '+persona.apellido);
console.log('Email: '+persona.email);
console.log('Edad:'+persona.edad +' años');
console.log(persona);
console.log(persona.nombreCompleto);
console.log('Ejecutando con un objeto');
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '2388777888';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto')
console.log(persona['apellido']); //Accedemos como si fuera un arreglo
console.log('Eliminamos un error');
//for in y accedemos al objeto como si fuera un arreglo
for (propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

persona.apellida = 'Betancud'; //Cambiamos dinamincamente un valor del objeto
delete persona.apellida; //Eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//Numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido);

//Número 2: A través del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2');
for (nombrePropiedad in persona){
  console.log(persona[nombrePropiedad]);
}

//Número 3: La función Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);


//Número 4: Utilizaremos el método JSON.stringfy
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);


































