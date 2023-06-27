let x = 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');
//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ES',
    get lang(){
      return this.idioma.toUpperCase(); //convierte las minusculas en mayusculas
    },
    set lang(lang){
      this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function() {
      return this.nombre +' '+this.apellido;
    },
    get nombreEdad(){
      return "El nombre es: "+this.nombre +', Edad: '+ this.edad;
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

console.log('Comenzamos a utilizar el metodo get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el metodo get y set para idioma')
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
}

let padre = new Persona3('Gabriel','Valdes','email@gmail.com');
padre.nombre = 'Luis';
console.log(padre);

let madre = new Persona3('Laura', 'Contreras', 'lcontrera@gmail.com');
console.log('madre');

//Diferentes formas de crear objetos
//caso nro 1
let miObjeto = new Object();
//caso nro 2
let miObjeto2 = {}; //Esta opcion es breve y recomendada

//caso String 1
let miCadena1 = new String('Hola');
//caso String2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con numeros
let niNumero = new Number(1); //Es farmal no recomendada
//caso nro2
let niMumero2 = 1;

//caso boolean 1
let miBoolean1 = new Boolean(false); //formal
//caso boolean 2
let miBoolean2 = false; //Sintaxis recondada

//caso Arreglos 1
let miArreglo1 = new Array(); //formal
//caso Arreglos 2
let miArreglo2 = []; //Sintaxis recomendad

//caso function 1
let miFuncion1 = new function(){}; //Todo lo despues de new ws considerado objeto
//caso function 2
let miFunction2 = function(){}; //Notacion simplificada y recomndada

//Uso del prototype
Persona3.prototype.telefono = '2618383832';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5492618383832';
console.log(madre.telefono);

//Uso de call (nos va permitir llamar un metodo que esta definido en otro objeto, desde otro objeto)
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = { 
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '5492618383834'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ingeniero', '254626416'));

//Método Apply (nos permite llamar un método que no se encuentra definido,en otro objeto)
let arreglo = ['Ing.', '5492618383834'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));


























































