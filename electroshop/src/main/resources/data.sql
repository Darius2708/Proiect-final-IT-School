DELETE FROM produs;
DELETE FROM categorie;

INSERT INTO categorie (id, nume) VALUES
(1, 'Cabluri'),
(2, 'Prize');

INSERT INTO produs (nume, descriere, pret, stoc, brand, imagine_url, categorie_id) VALUES
('Cablu electric 3x2.5mm', 'Cablu pentru instalații electrice', 3.99, 100, 'Schrack', 'https://via.placeholder.com/150', 1),
('Priză modulară', 'Priză dublă modulară Gewiss', 28.00, 50, 'Gewiss', 'https://via.placeholder.com/150', 2);
