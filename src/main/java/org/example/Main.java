package org.example;

public class Main {
    public static void main(String[] args) {

        Medico alcides = new Medico("Alcides Thiago", "Cardiologista");
        Medico wilismar = new Medico("Wilismar Passos", "Neurologista");

        Paciente p1 = new Paciente("Pedro Morais","000", 30, "0000");
        Paciente p2 = new Paciente("Fabio Vieira","111", 25, "1111");
        Paciente p3 = new Paciente("Carlos Silva","222", 19, "2222");
        Paciente p4 = new Paciente("Gabriela Novaes","333", 36, "3333");
        Paciente p5 = new Paciente("Cinthia","444", 46, "3333");

        Agenda agenda1 = new Agenda(alcides);
        agenda1.setData("22/10/2024");
        agenda1.adicionar(p1);
        agenda1.adicionar(p4);
        agenda1.imprimirListaPacientes();

        System.out.println("----------------------------");

        Agenda agenda2 = new Agenda(wilismar);
        agenda2.setData("22/10/2024");
        agenda2.adicionar(p2);
        agenda2.adicionar(p2);
        agenda2.adicionar(p5);
        agenda2.imprimirListaPacientes();

        agenda2.remover("111");
        agenda2.imprimirListaPacientes();
    }
}