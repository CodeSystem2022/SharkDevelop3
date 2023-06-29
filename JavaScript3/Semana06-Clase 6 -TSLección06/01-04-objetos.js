let x = 10; //variable de tipo primitiva
console.log(x.length); //undefined

//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    
    //Metodos
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
    }

}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto);
console.log('Ejecutando con un objeto');
let persona2 = new Object(); //Crea un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '1233555645645';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //Acceso como array
console.log('Usamos el ciclo for-in');

//for
for(proriedad in persona){
    console.log(proriedad); //muestra el nombre de la propiedad
    console.log(proriedad[proriedad]); //muestra el contenido de la propiedad
}

console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud'; //cambio dinamico de valor de objeto
delete persona.apellida; //eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//Numero 1: es la mas sencilla, concatena el valor de cada propiedad
console.log('Formas de mostrar un objeto : FORMA 1');
console.log(persona.nombre+' '+persona.apellido);

//Numero 2: a traves del ciclo for in:
console.log('Formas de mostrar un objeto : FORMA 2');
for(nombreProdiedad in persona){
    console.log(persona[nombreProdiedad]);
}

//Numero 3: La funcion Object.values() regresa el objeto como un array
console.log('Formas de mostrar un objeto : FORMA 3');
let personaArray = object.values(persona);
console.log(personaArray);

//Numero 4: metodo JSON.stringify
console.log('Formas de mostrar un objeto : FORMA 4');
let personaString = JSON.stringify(persona);
console.log(personaString);