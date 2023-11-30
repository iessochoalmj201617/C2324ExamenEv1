public class Trabajador {
    //Constantes correspondientes a los sueldos
    public static final int SUELDO_ANALISTA = 3000;
    public static final int SUELDO_PROGRAMADOR = 2000;
    public static final int SUELDO_BECARIO = 1500;
    public static final int MAX_SUELDO_ANALISTA = 6000;
    public static final int INCREMENTO_SUELDO_ANALISTA = 200;
    //*********Propiedades de la clase*************
    String nombre="";
    long ss=0L;
    int sueldo=0;
    TipoTrabajador puesto;

    //getter && setter
    public String getNombre() {
        return nombre;
    }

    public Long getSs() {
        return ss;
    }

    public int getSueldo() {
        return sueldo;
    }

    public TipoTrabajador getPuesto() {
        return puesto;
    }
//**************setter*************
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSs(long ss) {
        if(esValido(ss))
            this.ss = ss;
        else
            ss=0L;
    }

    public void setPuesto(TipoTrabajador puesto) {
        this.puesto = puesto;
        //asignamos el sueldo en función de su puesto
        sueldo=switch (puesto){
            case ANALISTA -> SUELDO_ANALISTA;
            case PROGRAMADOR -> SUELDO_PROGRAMADOR;
            default -> SUELDO_BECARIO;
        };
    }

    /**
     * valida si un número de la seguridad es correcto
     * @param ss: número de 11 cifras
     * @return true si es correcto false si no lo es
     */
    private boolean esValido(long ss){
        long num = ss/100;
        long codValidacion=ss%100;

        return (num%97)==codValidacion;

    }

    /**
     * Constructor
     * Los setter se encargan de cumplir las especificaciones del problema
     * @param nombre
     * @param ss
     * @param puesto
     */
    public Trabajador(String nombre, long ss, TipoTrabajador puesto) {
        this.setNombre(nombre);
        this.setSs(ss);
        this.setPuesto(puesto);
    }

    @Override
    public String toString() {
        String empleadoString;

        empleadoString="Nombre: "+nombre+"\n"+
                        "Puesto: "+puesto+"\n"+
                        "Número SS:"+ss+"\n"+
                        "Sueldo: "+sueldo;
        return empleadoString;
    }
    public void imprimirEmpleado(){
        System.out.println(this.toString());
    }
    public void ascenderEmpleado(){
        if(puesto==TipoTrabajador.BECARIO)
            setPuesto(TipoTrabajador.PROGRAMADOR);
        else if(puesto==TipoTrabajador.PROGRAMADOR)
            setPuesto(TipoTrabajador.ANALISTA);
        else {
            int sueldoTemp= INCREMENTO_SUELDO_ANALISTA;
            sueldoTemp+=sueldo;
            //si no supera los 6000 lo asignamos
            if(sueldoTemp< MAX_SUELDO_ANALISTA)
                sueldo=sueldoTemp;
            else
                sueldo=MAX_SUELDO_ANALISTA;
        }

    }
}
