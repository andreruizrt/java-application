package com.company;

import com.company.service.DatabaseService;

public class App {
    public static void main( String[] args ) {
        DatabaseService databaseService = new DatabaseService();
        databaseService.inserirAluno("Aluno1", "000.000.000-00");
    }
}
