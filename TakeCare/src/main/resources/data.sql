
INSERT INTO Pharmacies (id, pharmacy_Name, address, email, phone_Number, description, password, url, pharmacien_Titulaire,
                       numero_Ordre, numero_Agrement)
VALUES (1, 'pharmacietest', '1.rue du test', 'test@test.com', '047854525', 'description de test', 'test', 'url.test',
        'titulaireTest', 'ordreTest', 'agrementTest');
INSERT INTO Pharmacies (id, pharmacy_Name, address, email, phone_Number, description, password, url, pharmacien_Titulaire,
                       numero_Ordre, numero_Agrement)
VALUES (2, 'pharmacietest2',null , 'test@test.com',null , 'description de test', 'test', 'url.test',null , 'ordreTest',
        'agrementTest');






SELECT *
from Pharmacies;