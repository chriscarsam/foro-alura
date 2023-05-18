package org.sam.foro.api.domain.topico;

public record DatosListadoTopicos(Long id,String titulo, String mensaje, String status, String fechaCreacion) {
    public DatosListadoTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getStatus().toString(), topico.getFechaCreacion().toString());
    }
}
