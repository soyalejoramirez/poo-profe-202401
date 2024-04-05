package com.alejandro.eps.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EPS {
    private static final byte CAPACIDAD = 100;

    private String nombre;
    private List<Paciente> pacientes;

    public EPS(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<Paciente>();
    }

    public boolean afiliarPaciente(long cedula, String nombre) {
        boolean afiliado = false;

        if (this.pacientes.size() < CAPACIDAD) {
            Paciente paciente = this.buscarPaciente(cedula);

            if (paciente == null) {
                this.pacientes.add(new Paciente(nombre, cedula));
                afiliado = true;
            } else {
                System.out.println("El paciente ya existe");
            }
        } else {
            System.out.println("La EPS está llena.");
        }

        return afiliado;
    }

    public void sacarPaciente(long cedula) {
        boolean elimino = this.pacientes.removeIf(p -> p.getCedula() == cedula);

        if (!elimino) {
            System.out.println("El paciente con la cedula " + cedula + " no puede ser eliminado.");
        }
    }

    public Paciente buscarPaciente(long cedula) {
        return this.pacientes.stream()
                .filter(p -> p.getCedula() == cedula)
                .findFirst()
                .orElse(null);
    }

    public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad) {
        List<Paciente> pacientesConEnfermedad = null;

        for (Paciente paciente : this.pacientes) {
            for (Enfermedad enf : paciente.getEnfermedades()) {
                if (enf.getNombre().equalsIgnoreCase(enfermedad)) {
                    pacientesConEnfermedad.add(paciente);
                }
            }
        }

        return pacientesConEnfermedad;
    }

    public List<Paciente> buscarPacientesSinEnfermedades() {
        return this.pacientes.stream()
                .filter(p -> p.getEnfermedades().isEmpty())
                .toList();
    }

    public void ordenarPacientesPorNombre() {
        this.pacientes.sort(Comparator.comparing(Paciente::getNombre));
    }
}
