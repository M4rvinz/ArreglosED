package fes.aragon.modelo;

public class agregar {
    public int indice;
    public void insertar(int valor, int[] a) {
if(!validarLongitud(a)){
    a[indice]=valor;
    indice++;
}
    }
private boolean validarLongitud(int[]a){
boolean limite=false;
if(indice==a.length){
    limite=true;
}
    return limite;
}


}
