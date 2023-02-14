package abstractFactory.practice;


public class FactoryPasaje {

    public static IPasaje make (String type){
        IPasaje pasaje;

        switch (type.toLowerCase()){
            case "solidario":
                PasajeSolidario tmp = new PasajeSolidario();
                Avion avion = new Avion();
                avion.setCapacidad("1 tonelada");
                avion.setMarca("abc");
                avion.setModelo("modelo M");
                avion.setNumAsientos(100);
                tmp.setAvion(avion);
                Pais origen = new Pais();
                origen.setAeropuerto("ar1");
                origen.setCiudad("LP");
                origen.setNombre("NA");
                tmp.setOrigen(origen);
                Pais destino = new Pais();
                destino.setAeropuerto("ar2");
                destino.setCiudad("CBBA");
                destino.setNombre("NA1");
                tmp.setDestino(destino);
                tmp.setCostoPasaje("100bs");
                tmp.setDescuento("10%");
                tmp.setNumAsiento("5b");
                tmp.setNumeroVuelo("LP608");
                tmp.setMotivoDescuento("promo");
                pasaje = tmp;
                break;
            case "infante":
                PasajeInfantes tmp1 = new PasajeInfantes();
                Avion avion1 = new Avion();
                avion1.setCapacidad("1 tonelada");
                avion1.setMarca("abc");
                avion1.setModelo("modelo M");
                avion1.setNumAsientos(100);
                tmp1.setAvion(avion1);
                Pais origen1 = new Pais();
                origen1.setAeropuerto("ar1");
                origen1.setCiudad("LP");
                origen1.setNombre("NA");
                tmp1.setOrigen(origen1);
                Pais destino1 = new Pais();
                destino1.setAeropuerto("ar2");
                destino1.setCiudad("CBBA");
                destino1.setNombre("NA1");
                tmp1.setDestino(destino1);
                tmp1.setNumAsiento("5b");
                tmp1.setNumeroVuelo("LP608");
                tmp1.setCostoEspecial("30bs");
                pasaje = tmp1;
                break;
            case "standart":
                PasajeStandart tmp2 = new PasajeStandart();
                Avion avion2 = new Avion();
                avion2.setCapacidad("1 tonelada");
                avion2.setMarca("abc");
                avion2.setModelo("modelo M");
                avion2.setNumAsientos(100);
                tmp2.setAvion(avion2);
                Pais origen2 = new Pais();
                origen2.setAeropuerto("ar1");
                origen2.setCiudad("LP");
                origen2.setNombre("NA");
                tmp2.setOrigen(origen2);
                Pais destino2 = new Pais();
                destino2.setAeropuerto("ar2");
                destino2.setCiudad("CBBA");
                destino2.setNombre("NA1");
                tmp2.setDestino(destino2);
                tmp2.setNumAsiento("5b");
                tmp2.setNumeroVuelo("LP608");
                tmp2.setCostoPasaje("60bs");
                pasaje = tmp2;
                break;
            default:
                pasaje = null;
                break;
        }
       return pasaje;
    }

}



