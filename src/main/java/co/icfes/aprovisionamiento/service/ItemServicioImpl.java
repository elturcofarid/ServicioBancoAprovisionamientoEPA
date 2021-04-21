package co.icfes.aprovisionamiento.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.icfes.aprovisionamiento.mapper.MapperItemImpl;
import co.icfes.aprovisionamiento.model.dto.FilterItemDTO;
import co.icfes.aprovisionamiento.model.dto.ItemDTO;
import co.icfes.aprovisionamiento.model.dto.ItemMovilDTO;
import co.icfes.aprovisionamiento.model.entity.Item;
import co.icfes.aprovisionamiento.repository.ItemContenidoRepository;
import co.icfes.aprovisionamiento.repository.ItemRepository;

@Service
public class ItemServicioImpl implements ItemService{

	private ItemRepository repository;
	
	@Autowired
	private ItemContenidoRepository repositoryContenido;
	
	private MapperItemImpl mapperItem = new MapperItemImpl();
	
	public ItemServicioImpl(ItemRepository repository  ) {
		this.repository = repository;
		
	}
	
	public ItemMovilDTO getItemContentMovil(Long idItem)  {
		ItemMovilDTO itemMovilContenido = null;
		System.out.println(repositoryContenido.findByIdItem(idItem));
		return new ItemMovilDTO();
	}
	

/*
	public Item guardarItem(ItemDTO itemDTO, String USUARIO) throws Exception {
		Item itemGuardo = null;
		try {
			if (itemDTO != null && itemDTO.getIdentificadorArmado() != null) {
				itemDTO.setFechaCreacion(new Date());
				itemDTO.setUsuarioCreacion(USUARIO);
				itemDTO.setEstado(EnumEstado.ACTIVO.getCodigo());
				itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo());
				itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo());

				List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
				params.add(ParametroQuery.crearParametro("identificadorArmado", itemDTO.getIdentificadorArmado()));
				final List<Item> items = jpa.consultarPorCriteria(Item.class, params);
				Item item = null;
				if (items != null && !items.isEmpty()) {
					item = items.get(0);
				}

				if (item != null && item.getIdItem() != null) {
					itemDTO.setIdItem(item.getIdItem());
					itemDTO.setFechaModificacion(new Date());
					itemDTO.setUsuarioModificacion(itemDTO.getUsuarioCreacion());
					itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo());
					itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo());
					itemDTO.setObservacionesValidacion(null);
					itemDTO.setObservacionesValidacionMovil(null);
					changueItemState(itemDTO);
					itemGuardo = new Item();
					itemGuardo.setIdItem(itemDTO.getIdItem());
				} else {
					itemDTO.setFechaModificacion(new Date());
					itemDTO.setUsuarioModificacion(USUARIO);
					itemGuardo = jpa.guardarEntidad(itemDTO.convertirEntity(itemDTO), true);
				}
			}
		} catch (Exception e) {
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- guardarItem: "
					+ e.getMessage());

			throw e;
		}
		return itemGuardo;
	}

	
	public boolean guardarContenidoItem(ItemContenidoDTO itemContenidoDTO) throws Exception {
		Boolean realizoOperacion = false;
		try {

			List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro("idItem", itemContenidoDTO.getIdItem()));

			final List<ItemContenido> itemContenidos = jpa.consultarPorCriteria(ItemContenido.class, params);
			if (itemContenidos != null && !itemContenidos.isEmpty()) {
				for (ItemContenido itemContenido2 : itemContenidos) {
					if (itemContenido2.getIdItem() != null
							&& itemContenido2.getTipoContenido().equals(EnumTipoContenido.QTI.getNombre())) {
						itemContenidoDTO.setIdItemContenido(itemContenido2.getIdItemContenido());
						itemContenidoDTO.setFechaModificacion(new Date());
						itemContenidoDTO.setUsuarioModificacion(itemContenidoDTO.getUsuarioCreacion());
						itemContenidoDTO.setEstado(0L);
						itemContenidoDTO.setValorCampo(encriptarContenido(itemContenidoDTO.getValorCampo()));

						List<ParametroQuery<?>> parameters = new ArrayList<ParametroQuery<?>>();
						parameters.add(ParametroQuery.crearParametro(1, itemContenidoDTO.getEstado()));
						parameters.add(ParametroQuery.crearParametro(2, itemContenidoDTO.getFechaModificacion()));
						parameters.add(ParametroQuery.crearParametro(3, itemContenidoDTO.getUsuarioModificacion()));
						parameters.add(ParametroQuery.crearParametro(4, itemContenidoDTO.getValorCampo()));
						parameters.add(ParametroQuery.crearParametro(5, itemContenidoDTO.getIdItemContenido()));

						this.jpa.actualizarPorNamedQuery(ItemContenido.ACTUALIZAR_ITEM_CONT_CARGUE, parameters);

						realizoOperacion = true;
					} else if (itemContenido2.getIdItem() != null
							&& itemContenido2.getTipoContenido().equals(EnumTipoContenido.HTML.getNombre())) {
						jpa.eliminarEntidad(itemContenido2.getIdItemContenido(), ItemContenido.class);
					}
				}
			} else {
				itemContenidoDTO.setValorCampo(encriptarContenido(itemContenidoDTO.getValorCampo()));
				jpa.guardarEntidad(itemContenidoDTO.convertirEntity(itemContenidoDTO));
				realizoOperacion = true;
			}

		} catch (Exception e) {
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- guardarContenidoItem: "
					+ e.getMessage());

			throw e;
		}
		return realizoOperacion;
	}


	public List<ItemContenidoDTO> consultarItemAProcesarQTI(ItemContenidoDTO itemContenidoBus) throws Exception {

		ArrayList<ItemContenidoDTO> listaItemContenidoDTO = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, itemContenidoBus.getTipoContenido()));
			params.add(ParametroQuery.crearParametro(2, itemContenidoBus.getEstado()));

			List<Object[]> itemsList = this.jpa.consultarPorNamedQuery(ItemContenido.QUERY_ITEM_QTI_PROCESAR, params);
			if (itemsList != null) {
				listaItemContenidoDTO = new ArrayList<ItemContenidoDTO>();
				ItemContenidoDTO itemContenidoDTO = null;
				for (Object[] ob : itemsList) {

					itemContenidoDTO = new ItemContenidoDTO();
					itemContenidoDTO.setIdItemContenido(Long.valueOf(((Number) ob[0]).longValue()));
					itemContenidoDTO.setIdItem(Long.valueOf(((Number) ob[1]).longValue()));
					itemContenidoDTO.setTipoContenido((String) ob[2]);
					itemContenidoDTO.setFechaCreacion((Date) ob[3]);
					itemContenidoDTO.setUsuarioCreacion((String) ob[4]);
					String contenidoItem = desencriptarContenido((String) ob[5]);
					itemContenidoDTO.setValorCampo(contenidoItem);
					itemContenidoDTO.setTipoRespuesta((String) ob[6]);
					itemContenidoDTO.setIdentificadorArmado((String) ob[7]);
					listaItemContenidoDTO.add(itemContenidoDTO);

				}
			}
		} catch (Exception e) {
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- getItemProcesarQTI: "
					+ e.getMessage());

			throw e;
		}
		return listaItemContenidoDTO;
	}


	public Integer consultarNumeroItemAProcesarQTI(ItemContenidoDTO itemContenidoBus) throws Exception {

		Integer numeroItem = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, itemContenidoBus.getTipoContenido()));
			params.add(ParametroQuery.crearParametro(2, itemContenidoBus.getEstado()));

			Number numero = this.jpa.consultarPorNamedQueryUniqueResult(ItemContenido.QUERY_CONTEO_ITEM_PROCESAR,
					params);

			if (numero != null && numero.intValue() > 0) {
				numeroItem = numero.intValue();
			}

		} catch (Exception e) {
			logger.error(
					"Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarNumeroItemAProcesarQTI: "
							+ e.getMessage());

			throw e;
		}
		return numeroItem;
	}

	public Boolean actualizarEstadoContenidoItem(ItemContenidoDTO itemContenido) {
		Boolean realizoOperacion = false;
		try {

			List<ParametroQuery<?>> parameters = new ArrayList<ParametroQuery<?>>();
			parameters.add(ParametroQuery.crearParametro(1, itemContenido.getEstado()));
			parameters.add(ParametroQuery.crearParametro(2, itemContenido.getIdItemContenido()));

			this.jpa.actualizarPorNamedQuery(ItemContenido.ACTUALIZAR_ESTADO_ITEM_CONT, parameters);
			realizoOperacion = true;
		} catch (co.gov.icfes.aprovisionamientoe.excepciones.SistemaExcepcion e) {
			e.printStackTrace();
		}
		return realizoOperacion;
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public Map<String, ItemContenidoDTO> consultarBolsaItems(Boolean isMovil) throws Exception {
		Map<String, ItemContenidoDTO> listaItemBolsa = null;
		List<Object[]> itemsList = null;
		try {
			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, EnumTipoContenido.HTML.getNombre()));
			params.add(ParametroQuery.crearParametro(2, 1));
			params.add(ParametroQuery.crearParametro(3, EnumEstadoCargueItem.VERIFICADO.getCodigo()));

			if (isMovil) {
				params.add(ParametroQuery.crearParametro(4, EnumEstadoCargueItem.VERIFICADO.getCodigo()));
				itemsList = this.jpa.consultarPorNamedQuery(ItemContenido.ITEMS_VALIDADOS_WEB_MOVIL, params);
			} else {
				itemsList = this.jpa.consultarPorNamedQuery(ItemContenido.QUERY_ITEM_BOLSA, params);
			}

			if (itemsList != null) {
				listaItemBolsa = new HashMap<String, ItemContenidoDTO>();
				ItemContenidoDTO itemContenidoDTO = null;

				for (Object[] ob : itemsList) {
					itemContenidoDTO = new ItemContenidoDTO();
					itemContenidoDTO.setIdItem(Long.valueOf(((Number) ob[0]).longValue()));
					itemContenidoDTO.setTipoRespuesta((String) ob[1]);
					String contenidoItem = desencriptarContenido((String) ob[2]);
					itemContenidoDTO.setValorCampo(contenidoItem);
					itemContenidoDTO.setRecursosItem((String) ob[4]);
					if (((String) ob[3]) != null) {
						itemContenidoDTO.setIdentificadorArmado(((String) ob[3]).toLowerCase());
						listaItemBolsa.put(itemContenidoDTO.getIdentificadorArmado(), itemContenidoDTO);
					}
					if (isMovil) {
						if (((String) ob[5]) != null) {
							itemContenidoDTO.setValorCampoMovil((String) ob[5]);
						}
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarBolsaItems: "
					+ e.getMessage());

			throw e;
		}
		return listaItemBolsa;
	}

	public Integer consultarNumeroCombosAProcesar(Long idAplicacion) throws Exception {

		Integer numeroItem = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, idAplicacion));

			final Number numero = this.jpa.consultarPorNamedQueryUniqueResult(Combo.QUERY_NUMERO_COMBOS_ARMADO, params);

			if (numero != null && numero.intValue() > 0) {
				numeroItem = numero.intValue();
			}

		} catch (Exception e) {
			logger.error(
					"Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarNumeroCombosAProcesar: "
							+ e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return numeroItem;
	}
*/
	/**
	 * Metodo que consulta la bolsa de items transformador
	 * 
	 * @param itemContenido objeto con los criterios de la busqueda
	 * @return List<ItemContenidoDTO> lista de contenidos para procesar
	 */
	public List<ItemDTO> consultarBolsaItemsTransformados(FilterItemDTO filterItemDTO) {
		
			List<ItemDTO> listaItemBolsa = new ArrayList<ItemDTO>();
			List<Item> items = (List<Item>) repository.findAll();
			for(Item item : items) {
				listaItemBolsa.add(mapperItem.toDto(item));
			}

		return listaItemBolsa;
	}
			
			/*
			if (filterItemDTO.getEstadoItem() != null && filterItemDTO.getEstadoItem().trim() != "") {
				ps.setString(contadorParametros + 1, filterItemDTO.getEstadoItem());
				contadorParametros++;
			}
			if (filterItemDTO.getIdItemArmado() != null && filterItemDTO.getIdItemArmado().trim() != "") {
				ps.setString(contadorParametros + 1, filterItemDTO.getIdItemArmado());
				contadorParametros++;
			}

			if (filterItemDTO.getEstadoItemMovil() != null && filterItemDTO.getEstadoItemMovil().trim() != "") {
				ps.setString(contadorParametros + 1, filterItemDTO.getEstadoItemMovil());
				contadorParametros++;
			}

			if (filterItemDTO.getFechaFin() != null && filterItemDTO.getFechaInicio() != null) {
				fechaInicio = DateUtils.addDays(filterItemDTO.getFechaInicio(), 1);
				fechaFin = DateUtils.addDays(filterItemDTO.getFechaFin(), 1);
				ps.setDate(contadorParametros + 1, new java.sql.Date(fechaInicio.getTime()));
				contadorParametros++;
				ps.setDate(contadorParametros + 1, new java.sql.Date(fechaFin.getTime()));
			} else if (filterItemDTO.getFechaInicio() != null) {
				fechaInicio = DateUtils.addDays(filterItemDTO.getFechaInicio(), 1);
				ps.setDate(contadorParametros + 1, new java.sql.Date(fechaInicio.getTime()));
			} else if (filterItemDTO.getFechaFin() != null) {
				fechaFin = DateUtils.addDays(filterItemDTO.getFechaFin(), 1);
				ps.setDate(contadorParametros + 1, new java.sql.Date(fechaFin.getTime()));
			}
*/
			/*
			ItemDTO itemDTO = null;
			
			rs = ps.executeQuery();
			while (rs.next()) {
				itemDTO = new ItemDTO();
				itemDTO.setIdItem(rs.getLong("ID"));
				itemDTO.setIdentificadorArmado(rs.getString("IDARMADO"));
				String estado = rs.getString("ESTADO");
				if (estado != null) {
					if (estado.equals(EnumEstadoCargueItem.RECHAZADO.getCodigo())) {
						itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.RECHAZADO.getNombre());
					} else if (estado.equals(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo())) {
						itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.NO_VERIFICADO.getNombre());
					} else if (estado.equals(EnumEstadoCargueItem.VERIFICADO.getCodigo())) {
						itemDTO.setEstadoCargueItem(EnumEstadoCargueItem.VERIFICADO.getNombre());
					}
				}

				itemDTO.setFechaCargueFormateada(rs.getString("FECHA"));
				itemDTO.setObservacionesValidacion(rs.getString("OBSERVACIONES"));
				itemDTO.setRecursosItem(rs.getString("RECURSOS"));
				itemDTO.setUsuarioModificacion(rs.getString("USUARIO"));
				String estadoMovil = rs.getString("ESTADOCARGUEMOVIL");
				if (estadoMovil != null) {
					if (estadoMovil.equals(EnumEstadoCargueItem.RECHAZADO.getCodigo())) {
						itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.RECHAZADO.getNombre());
					} else if (estadoMovil.equals(EnumEstadoCargueItem.NO_VERIFICADO.getCodigo())) {
						itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.NO_VERIFICADO.getNombre());
					} else if (estadoMovil.equals(EnumEstadoCargueItem.VERIFICADO.getCodigo())) {
						itemDTO.setEstadoCargueItemMovil(EnumEstadoCargueItem.VERIFICADO.getNombre());
					}
				}
				itemDTO.setObservacionesValidacionMovil(rs.getString("OBSERVACIONESMOVIL"));
				listaItemBolsa.add(itemDTO);
			}*/

			
		

	
	/*
	private String armarConsultaItemsBolsa(FilterItemDTO filterItemDTO) {

		final String consultaItemBase = " SELECT IT.APIT_ID  AS ID, " + "IT.APIT_IDARMADO  AS IDARMADO,"
				+ " IT.APIT_ESTADOCARGUE  AS ESTADO," + "IT.FECHAMODIFICACION AS FECHA ,"
				+ "IT.APIT_OBSERVACIONES AS OBSERVACIONES," + "IT.APIT_RECURSOS AS RECURSOS,"
				+ "IT.APIT_ESTADOCARGUEMOVIL AS ESTADOCARGUEMOVIL,"
				+ "IT.APIT_OBSERVACIONESMOVIL AS OBSERVACIONESMOVIL," + " USUA.USUA_NOMBREUSUARIO AS USUARIO "
				+ "FROM APROV_ITEM IT,  APROV_ITEMCONTENIDO CT, MISIONAL.USUA_USUARIO USUA "
				+ "	WHERE IT.APIT_ID=CT.APIT_ID AND APIC_ESTADO = '1' " + "AND CT.APIC_TIPO='HTML'"
				+ " AND IT.USUARIOMODIFICACION   =to_char(USUA.USUA_ID)";

		StringBuilder consultaItemFiltro = new StringBuilder();

		if (filterItemDTO.getEstadoItem() != null && filterItemDTO.getEstadoItem().trim() != "") {
			consultaItemFiltro.append("  AND IT.APIT_ESTADOCARGUE=? ");
		}
		if (filterItemDTO.getIdItemArmado() != null && filterItemDTO.getIdItemArmado().trim() != "") {
			consultaItemFiltro.append("  AND IT.APIT_IDARMADO=?  ");
		}
		if (filterItemDTO.getEstadoItemMovil() != null && filterItemDTO.getEstadoItemMovil().trim() != "") {
			consultaItemFiltro.append(" AND IT.APIT_ESTADOCARGUEMOVIL=? ");
		}
		if (filterItemDTO.getFechaFin() != null && filterItemDTO.getFechaInicio() != null) {
			consultaItemFiltro.append(
					" AND ( TO_CHAR(IT.FECHAMODIFICACION,'yyyy/mm/dd') >=TO_CHAR(?,'yyyy/mm/dd')  AND  TO_CHAR(IT.FECHAMODIFICACION,'yyyy/mm/dd')<= TO_CHAR(?,'yyyy/mm/dd') )");

		} else if (filterItemDTO.getFechaInicio() != null) {
			consultaItemFiltro.append("  AND  TO_CHAR(IT.FECHAMODIFICACION,'yyyy/mm/dd')>=TO_CHAR(?,'yyyy/mm/dd') ");

		} else if (filterItemDTO.getFechaFin() != null) {
			consultaItemFiltro.append("  AND  TO_CHAR(IT.FECHAMODIFICACION,'yyyy/mm/dd')<=TO_CHAR(?,'yyyy/mm/dd')  ");
		}
		return consultaItemBase + consultaItemFiltro.toString();
	}

	public ItemContenidoDTO queryItemContent(Long idItem, ParametroConfiguracionDTO parametroConfImagenesAprov,
			ParametroConfiguracionDTO parametroConfImagenesPlexi) throws Exception {
		ItemContenidoDTO itemContenidoDTO = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, idItem));
			params.add(ParametroQuery.crearParametro(2, EnumTipoContenido.HTML.getNombre()));

			Object[] itemContenido = this.jpa.consultarPorNamedQueryUniqueResult(ItemContenido.QUERY_ITEM_CONTENIDO,
					params);
			if (itemContenido != null) {
				itemContenidoDTO = new ItemContenidoDTO();
				itemContenidoDTO.setIdItemContenido(Long.valueOf(((Number) itemContenido[0]).longValue()));
				itemContenidoDTO.setIdItem(Long.valueOf(((Number) itemContenido[1]).longValue()));
				itemContenidoDTO.setTipoContenido((String) itemContenido[2]);
				itemContenidoDTO.setFechaCreacion((Date) itemContenido[3]);
				itemContenidoDTO.setUsuarioCreacion((String) itemContenido[4]);
				if (parametroConfImagenesAprov != null && parametroConfImagenesPlexi != null) {
					String cadenaHTML = desencriptarContenido((String) itemContenido[5]);
					if (cadenaHTML != null) {
						if (cadenaHTML.contains(parametroConfImagenesPlexi.getValor())) {
							cadenaHTML = cadenaHTML.replace(parametroConfImagenesPlexi.getValor(),
									parametroConfImagenesAprov.getValor());
						}
						itemContenidoDTO.setValorCampo(cadenaHTML);
					}
				}
				itemContenidoDTO.setTipoRespuesta((String) itemContenido[6]);
				itemContenidoDTO.setIdentificadorArmado((String) itemContenido[7]);
			}

		} catch (Exception e) {
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- queryContentItem: "
					+ e.getMessage());

			throw e;
		}
		return itemContenidoDTO;
	}*/


	public Boolean changueItemState(ItemDTO itemDTO) throws Exception {
		Boolean realizoOperacion = null;
		try {			
			realizoOperacion = true;			
			repository.save(mapperItem.convertirEntity(itemDTO));

		} catch (Exception e) {
//			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- changueItemState: "
//					+ e.getMessage());

			throw e;
		}
		return realizoOperacion;
	}
	
	/*

	public ItemContenidoDTO consultarBolsaItemPorIdentItemArmado(String cadenaIdsArmados) throws Exception {
		ItemContenidoDTO itemContenidoDTO = null;
		try {
			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, EnumTipoContenido.HTML.getNombre()));
			params.add(ParametroQuery.crearParametro(2, 1));
			params.add(ParametroQuery.crearParametro(3, cadenaIdsArmados));

			Object[] item = this.jpa.consultarPorNamedQueryUniqueResult(Item.QUERY_ITEM_BOLSA_X_IDARMADO, params);

			if (item != null) {
				itemContenidoDTO = new ItemContenidoDTO();
				itemContenidoDTO.setIdItem(Long.valueOf(((Number) item[0]).longValue()));
				itemContenidoDTO.setTipoRespuesta((String) item[1]);
				itemContenidoDTO.setValorCampo((String) item[2]);
				if (((String) item[3]) != null) {
					itemContenidoDTO.setIdentificadorArmado(((String) item[3]).toLowerCase());

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarBolsaItems: "
					+ e.getMessage());

			throw e;
		}
		return itemContenidoDTO;
	}

	public List<ItemPlxDTO> consultarItemsAsociadosContexto(String cadenaContexto, Long aplicacion) throws Exception {
		List<ItemPlxDTO> listaItemPlx = null;
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			String query = "SELECT D.ITEM_ID AS ITEM_ID, D.ITEM_NUMERO AS ITEM_NUMERO, D.FECHACREACION AS FECHACREACION, D.USUARIOCREACION AS  USUARIOCREACION, D.ITEM_TIPO AS ITEM_TIPO, APROVARMADO.CONTEXTO AS CONTEXTO , APROVARMADO.INSTRUCCION AS INSTRUCCION , APROVARMADO.ORDEN_ITEM AS ORDEN, D.ITEM_MOVIL AS ITEM_MOVIL FROM APROV_PLXCOMBOCUADS B, APROV_PLXCUADERNILLOS A, APROV_PLXCOMBOS C, APROV_PLXCUADITEM E, APROV_PLXITEMS D, "
					+ " APROVARMADO WHERE A.CUAD_ID = B.CUAD_ID AND C.COMB_ID   = B.COMB_ID AND D.ITEM_ID   = E.ITEM_ID AND A.CUAD_ID   = E.CUAD_ID "
					+ " AND APROVARMADO.CUADERNILLO = A.CUAD_CUADERNILLO AND APROVARMADO.CMBO_DESCRIPCION = C.COMB_NOMBRE AND APROVARMADO.ITEM_CODIGOICFES = D.ITEM_NUMERO "
					+ " AND APROVARMADO.APLI_ID = " + aplicacion
					+ " AND APROVARMADO.APRO_ESTADO = 'A' AND APROVARMADO.CONTEXTO IN (" + cadenaContexto + ")";

			conn = jpa.getManager().unwrap(Connection.class);

			ps = conn.prepareStatement(query);

			ItemPlxDTO itemPlxDTO = null;
			listaItemPlx = new ArrayList<ItemPlxDTO>();
			rs = ps.executeQuery();
			while (rs.next()) {

				itemPlxDTO = new ItemPlxDTO();
				itemPlxDTO.setIdItemPlx(rs.getLong("ITEM_ID"));
				if (rs.getString("ITEM_NUMERO") != null) {
					itemPlxDTO.setCodigoItemIcfes(rs.getString("ITEM_NUMERO"));
				}
				itemPlxDTO.setFechaCreacion(rs.getDate("FECHACREACION"));
				itemPlxDTO.setUsuarioCreacion(rs.getString("USUARIOCREACION"));
				itemPlxDTO.setTipo(rs.getString("ITEM_TIPO"));

				if (rs.getString("CONTEXTO") != null) {
					itemPlxDTO.setItemCodigoContexto(rs.getString("CONTEXTO"));

				}
				itemPlxDTO.setInstruccion(rs.getString("INSTRUCCION"));
				itemPlxDTO.setCuaItemOrden(rs.getLong("ORDEN"));
				if (rs.getString("ITEM_MOVIL") != null) {
					// ItemMovilDTO itemMovil =
					// JSONUtils.deserializarObjeto(desencriptarContenido(rs.getString("ITEM_MOVIL")),
					// ItemMovilDTO.class);
					itemPlxDTO.setContenidoMovil(rs.getString("ITEM_MOVIL"));
				}
				listaItemPlx.add(itemPlxDTO);

			}

		} catch (SQLException e) {
			throw new SQLException(e.getMessage());

		} catch (Exception e) {
			throw new SistemaExcepcion(e.getMessage());

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null)
					ps.close();

			} catch (SQLException se) {
				throw new SistemaExcepcion("Error cerrando el Statement  " + se.getMessage());
			}
		}

		return listaItemPlx;
	}

	public Integer consultarNumRegRechazadosPreInstalacion(Long idAplicacion) throws Exception {

		Integer numeroItem = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, idAplicacion));
			params.add(ParametroQuery.crearParametro(2, "A"));
			params.add(ParametroQuery.crearParametro(3, EnumEstadoCargueItem.RECHAZADO.getCodigo()));

			Number numero = this.jpa.consultarPorNamedQueryUniqueResult(ItemPLX.CONTEO_ITEMS_RECHAZADOS_PREINSTALACION,
					params);

			if (numero != null && numero.intValue() > 0) {
				numeroItem = numero.intValue();
			}

		} catch (Exception e) {
			logger.error(
					"Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarNumRegRechazadosPreInstalacion: "
							+ e.getMessage());

			throw e;
		}
		return numeroItem;
	}

	public Map<String, Long> consultarCombosPreInstalacionAplicacion(Long idAplicacion) throws Exception {
		Map<String, Long> mapaCombosApp = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, idAplicacion));
			params.add(ParametroQuery.crearParametro(2, "A"));

			List<Object[]> combosList = this.jpa.consultarPorNamedQuery(ItemPLX.QUERY_COMBOS_PREINSTALACION_APLICACION,
					params);

			if (combosList != null) {
				mapaCombosApp = new HashMap<String, Long>();
				for (Object[] ob : combosList) {
					Long idCombo = Long.valueOf(((Number) ob[0]).longValue());
					String nombreCombo = (String) ob[1];
					mapaCombosApp.put(nombreCombo, idCombo);

				}
			}
		} catch (Exception e) {
			logger.error(
					"Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarNumRegPreInstalacionAplicacion: "
							+ e.getMessage());

			throw e;
		}
		return mapaCombosApp;
	}

	public ParametroConfiguracionDTO consultarParametroConfiguracion(String nombreParametro) {
		ParametroConfiguracionDTO parametro = null;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro("nombre", nombreParametro));

			final ParametroConfiguracion parametroConsulta = jpa
					.consultarPorCriteriaUniqueResult(ParametroConfiguracion.class, params);

			if (parametroConsulta != null) {
				parametro = new ParametroConfiguracionDTO(parametroConsulta);
			}

		} catch (Exception e) {
			logger.error(
					"Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- consultarParametroConfiguracion: "
							+ e.getMessage());
		}
		return parametro;
	}

	public String encriptarContenido(String contenido) throws Exception {
		String encryptedMssg = "";
		final AESUtils aesUtil = new AESUtils();

		if (keyStore == null) {
			cargarLlaves();
		}

		encryptedMssg = aesUtil.encriptarContenido(contenido, keyStore, keytPass, alias);

		return encryptedMssg;
	}

	public String desencriptarContenido(String contenido) throws Exception {
		String dencryptedMssg = "";
		final AESUtils aesUtil = new AESUtils();

		if (keyStore == null) {
			cargarLlaves();
		}

		dencryptedMssg = aesUtil.desencriptarContenido(contenido, keyStore, keytPass, alias);

		return dencryptedMssg;
	}

	public int depurarItemsNoProcesados() throws Exception {
		int numeroReg = 0;
		try {

			final List<ParametroQuery<?>> params = new ArrayList<ParametroQuery<?>>();
			params.add(ParametroQuery.crearParametro(1, EnumTipoContenido.QTI.getNombre()));
			params.add(ParametroQuery.crearParametro(2, 0));

			numeroReg = this.jpa.eliminarPorNamedQuery(Item.DELETE_ITEM_NO_PROCESADOS, params);

		} catch (Exception e) {
			logger.error(
					"Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- depurarItemsNoProcesados: "
							+ e.getMessage());

			throw e;
		}
		return numeroReg;
	}

	private void cargarLlaves() {
		keyStore = consultarParametroConfiguracion(EnumParametroConfiguracion.KEYSTORE.getNombre()).getValor();
		keytPass = consultarParametroConfiguracion(EnumParametroConfiguracion.KEYPASS.getNombre()).getValor();
		alias = consultarParametroConfiguracion(EnumParametroConfiguracion.ALIAS.getNombre()).getValor();
	}

	

	public Boolean changueMovilState(ItemDTO itemDTO) throws Exception {
		Boolean realizoOperacion = null;
		try {
			List<ParametroQuery<?>> parameters = new ArrayList<ParametroQuery<?>>();
			parameters.add(ParametroQuery.crearParametro(1, itemDTO.getEstadoCargueItemMovil()));
			parameters.add(ParametroQuery.crearParametro(2, new Date()));
			parameters.add(ParametroQuery.crearParametro(3, itemDTO.getUsuarioModificacion()));
			parameters.add(ParametroQuery.crearParametro(4, itemDTO.getObservacionesValidacionMovil()));
			parameters.add(ParametroQuery.crearParametro(5, itemDTO.getRecursosItem()));
			parameters.add(ParametroQuery.crearParametro(6, itemDTO.getIdItem()));
			this.jpa.actualizarPorNamedQuery(Item.ACTUALIZAR_ESTADO_MOVIL, parameters);
			realizoOperacion = true;

		} catch (Exception e) {
			logger.error("Error Aplicacion Aprovisionamiento Prueba Electronica - ItemServicio- changueItemState: "
					+ e.getMessage());

			throw e;
		}
		return realizoOperacion;
	}
	*/
}
