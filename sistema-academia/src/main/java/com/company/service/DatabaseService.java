package com.company.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseService {

  private Connection connect() {
    Connection conn = null;

    try {
        String url = "jdbc:sqlite:/home/andreruxx/Desktop/java-application/sistema-academia/src/database/database";
        
        conn = DriverManager.getConnection(url);
        
        System.out.println("[*] Connection success.");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return conn;
  }

  public int disconnect(Connection conn) {
    try {
      conn.close();
      System.out.println("[*] Closing connection.");
      
      return 0;

    } catch (Exception e) {
      System.out.println(e.getMessage());
      return 1;
    }
  }

  public void inserirAluno(String nome, String cpf) {
    String sql = "INSERT INTO ALUNO(NOME,CPF) VALUES(?,?)";

    try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nome);
        pstmt.setString(2, cpf);
        pstmt.executeUpdate();
        System.out.println("[*] Success to save the student.");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
  }

  public void inserirProfessor(String nome) {
    String sql = "INSERT INTO PROFESSOR(NOME) VALUES(?)";

    try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nome);
        pstmt.executeUpdate();

        System.out.println("[*] Success to save the teacher.");

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
  }

  public void inserirExercicio(String nome, int series) {
    String sql = "INSERT INTO EXERCICIO(NOME,SERIES) VALUES(?,?)";

    try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nome);
        pstmt.setInt(2, series);
        pstmt.executeUpdate();

        System.out.println("[*] Success to save the exercise.");
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
  }
}
