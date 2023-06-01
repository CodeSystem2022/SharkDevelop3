
miFuncion(8, 2); //Esto se llama hoisting
function miFuncion(a, b){
    return a + b;
}
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//funcion anonima
let x = function(a, b){return a + b}; //obligatorio el ;
console.log( x (5, 6));


// Funciones de tipo self e invoking
(function(a, b){
    console.log('Ejecutando la función: '+ (a + b));
})(9, 6); 

console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length); 
}
miFuncionDos(5, 7, 3, 6);
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto); 

//Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);  //Asignamos el valor a una variable
console.log(resultado);

// Funcion de tipo expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]);  // muestra el parametro de: a
    console.log(arguments[1]);  // muestra el parametro de: b
    
    return a + b + arguments[2];
}
resultado = sumar(3,2,9);
console.log(resultado);

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; 
    }
    return suma;
}

let k = 10;
function cambiarValor(a){ //Paso por valor
    a =  20;
}

cambiarValor(k);
console.log(k);

//Paso por referencia
const persona = {
    nombre: 'Alejandra',
    apellido: 'Carballeira'
}
console.log(persona);
function cambiarValorObjeto(p1){
    p1.nombre = 'Lucas';
    p1.apellido = 'Gallo';
}

cambiarValorObjeto(persona);
console.log(persona);

/*parametros es los que da la funcion para poder ser llamada
argumentos es con los que se la invoca*/
