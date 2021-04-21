package co.icfes.aprovisionamiento.model.enums;

public enum EnumEstadoProceso {

	PROCESO_EN_VALIDACION(2L,"EV","En validación"),
	PROCESO_VALIDADO(3L,"VV","Validado"),
	PROCESO_VALIDADO_CON_ERRORES(4L,"VE","Validado con errores"),
	PROCESO_SIN_REGISTROS_PROCESAR(10L,"SR","Sin registros a procesar"),
	PROCESO_FINALIZADO(5L,"FN","Finalizado exitosamente"),
	PROCESO_FINALIZADO_ERRORES(8L,"FE","Finalizado con errores"),
	PROCESO_FALLIDO(6L,"FL","Fallido"),
	PROCESO_FALLIDO_CONEXION(11L,"FC","Fallido por conexión al FTP"),
	PROCESO_EN_CURSO(7L,"EN", "Proceso en curso")
	;
	
	private String nombre;	
	
	private Long codigo;
	
	private String descripcion;

	public static EnumEstadoProceso[] ENUM_VALUES = EnumEstadoProceso.values();

	private EnumEstadoProceso(Long codigo, String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}


	@Override
	public String toString() {
		return nombre.toString();
	}

	
	
	public static EnumEstadoProceso get(String nombre) {
		for (EnumEstadoProceso nom : EnumEstadoProceso.ENUM_VALUES) {
			if (nom.getNombre().equals(nombre)) {
				return nom;
			}
		}
		return null;
	}
	
	
	public static EnumEstadoProceso get(Long codigo) {
		for (EnumEstadoProceso nom : EnumEstadoProceso.ENUM_VALUES) {
			if (nom.getCodigo().equals(codigo)) {
				return nom;
			}
		}
		return null;
	}


	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public static EnumEstadoProceso getEnumEstadoProceso(Long estadoProceso){
		for (EnumEstadoProceso enumEstadoProceso : ENUM_VALUES) {
			if (Long.valueOf(estadoProceso)
					.compareTo(Long.valueOf(enumEstadoProceso.getCodigo())) == 0){
				return enumEstadoProceso;
			}
		}
		return null;		
	}
	
}
