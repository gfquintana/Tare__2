package usuario;


public class FuncionesUsuario {

     Usuario u = new Usuario();
    public double Impuestos(){
   
    double impuestos=0;
    int edad= u.getEdad();
    if((edad>18 && edad<=30) || (edad>65)){
        impuestos=2000;
    }
    else if(edad>30 && edad<=65){
        impuestos=7000;
    }
    else if(edad<18){
        impuestos=0;
    }
    int hijos=u.getCantHijos();
    double descontar= hijos*(0.03);
    
    if(descontar<=0.05){
        impuestos=impuestos-descontar;
    }
    else{
        impuestos=impuestos-0.05;
    }
return impuestos;
}
    
   public void agregarSaldo(int saldo){
        u.getSaldo()+=saldo;
    }
    
}
