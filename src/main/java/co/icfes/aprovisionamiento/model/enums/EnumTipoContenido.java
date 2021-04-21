package co.icfes.aprovisionamiento.model.enums;


public enum EnumTipoContenido {

	QTI("QTI"),
	HTML("HTML");

	public static EnumTipoContenido[] ENUM_VALUES = EnumTipoContenido.values();
		
	private String	nombre;
	
	EnumTipoContenido (String nombre){
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
