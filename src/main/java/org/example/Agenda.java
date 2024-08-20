package org.example;

import java.util.ArrayList;

public class Agenda {
    private String data;
    private ArrayList<Paciente> pacientes;

    public Agenda(){
        pacientes = new ArrayList<Paciente>();
    }

    public void adicionar(Paciente paciente){
        pacientes.add(paciente);
    }

    public void remover(String cpf){
        for(Paciente paciente : pacientes){
            if(paciente.getCpf().equals(cpf)){
                System.out.println(paciente.getNome()+" removido com sucesso");
                pacientes.remove(paciente);
            }
        }
    }
}
