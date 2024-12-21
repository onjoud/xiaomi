#Author : Onjoud

Feature: maison connectee

Scenario: effectuer le tri et cliquer sur un produit 

Given utilisateur est sur la page maison connecte

When utilisateur effectuer un tri " Tri par popularité" et cliquer sur un produit "Mi Camera 2K Magnetic Mount"

Then utilisateur est dirigee ver la page de produit "Mi Camera 2K Magnetic Mount"
