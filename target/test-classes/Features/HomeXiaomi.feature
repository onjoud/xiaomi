#Author: Onjoud
Feature: HomePage xiaomi

  Scenario: selectionner un menu de la page dacceuil
    Given utilisateur est sur la page dacceuil
    When utilisateur survole la souris sur le menu "Smart Home" et clique sur le submenu "Maison connectée"
    Then utilisateur est didiger vers la page "Maison Connectée"
