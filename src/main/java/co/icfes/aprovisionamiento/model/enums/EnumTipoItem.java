package co.icfes.aprovisionamiento.model.enums;


public enum EnumTipoItem {

	SINGLE("single","I_" ,null) ,
	GRID("grid","G_C_", null),
	CONTEXT("context","C_", null) ,
	OPEN("open","I_",null),
	STOP("stop","D_", null),
	ING_P2("ing_p2","P2_C_","ItemInglesP2.vm"),
	ING_P4("ing_p4","P4_C_", "ItemInglesP4.vm"),
	ING_P7("ing_p7","P7_C","ItemInglesP4.vm"),
	INSOR("insor","IN_", "ItemINSOR.vm");

	public static EnumTipoItem[] ENUM_VALUES = EnumTipoItem.values();
	private String	nombre;
	private String	nombrePlantilla;
	private String	prefijo;
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
	
	EnumTipoItem (String abreviacion,String prefijo, String nombrePlantilla){
		this.nombre = abreviacion;
		this.nombrePlantilla=nombrePlantilla;
		this.prefijo=prefijo;
	}
	/**
	 * @return the nombrePlantilla
	 */
	public String getNombrePlantilla() {
		return nombrePlantilla;
	}
	/**
	 * @param nombrePlantilla the nombrePlantilla to set
	 */
	public void setNombrePlantilla(String nombrePlantilla) {
		this.nombrePlantilla = nombrePlantilla;
	}
	/**
	 * @return the prefijo
	 */
	public String getPrefijo() {
		return prefijo;
	}
	/**
	 * @param prefijo the prefijo to set
	 */
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	
	/**
	 * Método que se encarga de retornar el enum.
	 */
	public static EnumTipoItem getEnumTipoItem(String nombre) {
		EnumTipoItem enumTipo=null;
		
		for(int i=0; i<ENUM_VALUES.length; i++) {
			if(nombre.equals(ENUM_VALUES[i].getNombre())) {
				enumTipo = ENUM_VALUES[i];
			}
		}
		return enumTipo;
	}

	
	
}
