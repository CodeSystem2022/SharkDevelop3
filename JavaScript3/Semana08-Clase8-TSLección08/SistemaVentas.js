class Producto{

    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
        get idProducto(){
            return this._idProducto;
        }
    
        get nombre(){
            return this._nombre;
        }
    
        get precio(){
            return this._precio;
        }
    
        set nombre(nombre){
            this._nombre = nombre;
        }
    
        set precio(precio){
            this._precio = precio;
        }
    
        toString(){ //Template Literals: Nos permite insertar codigo dinamicamente
            return `idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
        }
    } //Fin de la clase producto

    class Orden{
        static contadorOrdenes = 0;
    
        //Simula una constante
        static getMAX_PRODUCTOS() { 
            return 5 ; 
        }
    
        constructor(){
            this._idOrden = ++Orden.contadorOrdenes;
            this._productos = [];
            this._contadorProductosAgregados = 0;
        }
    
        get _idOrden(){return this._idOrden;}
    
        agregarProducto(producto){
            if(this._productos.length < Orden.getMAX_PRODUCTOS()){
                this._productos.push(producto); //Tenemos dos tipos de sintaxis: -> primera sintaxis
                //this._productos[this._contadorProductosAgregados++] = producto; -> segunda sintaxis
            }
            else{
                console.log('No se pueden agregar mas productos')
            }
        } //Fin del método agregarProducto      
    }//Fin de la clase Orden


let producto1 = new Producto('Pantalon', 200);
let producto2 = new Producto('Camisa', 150);
console.log(producto1.toString());
console.log(producto2.toString());
