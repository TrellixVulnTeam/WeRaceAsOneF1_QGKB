import { Identifiers } from "@angular/compiler";

export interface Driver {
    id: number;
    nombre: string;
    pais: string;

    fotoPiloto: string;
    numPodios: Int16Array;
    numPuntos: Int16Array;
    numPoles: Int16Array;
    posicion: Int16Array;
}