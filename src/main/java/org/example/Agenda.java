package org.example;

import java.util.ArrayList;

public class Agenda {
    private String data;
    private ArrayList<Paciente> pacientes;
    private Medico medico;

    public Agenda(Medico medico){
        pacientes = new ArrayList<Paciente>();
        data = "";
        this.medico = medico;

    }

    public void adicionar(Paciente paciente){
        pacientes.add(paciente);
    }

    public void remover(String cpf){
        for(Paciente paciente : pacientes){
            if(paciente.getCpf().equals(cpf)){
                System.out.println(paciente.getNome()+" removido com sucesso");
                pacientes.remove(paciente);
                pacientes.size();
            }
        }
    }

    public void pesquisar(String cpf){
        for(int i=0; i<pacientes.size(); i++){
            if(pacientes.get(i).getCpf().equals(cpf)){
                System.out.println(pacientes.get(i).getNome());
                System.out.println(pacientes.get(i).getTelefone());
                System.out.println(pacientes.get(i).getIdade());
                i=pacientes.size();
            }
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
