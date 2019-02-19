INSERT INTO banks (id, name)
VALUES (1, 'Tinkoff'),
       (2, 'AkBars'),
       (3, 'Megafon');

INSERT INTO cards (id, name, bank_id)
VALUES (1, 'Tinkoff Black',1),
       (2, 'Tinkoff Black Edition',1),
       (3, 'ALL Airlines',1),
       (4, 'Tinkoff Drive',1),
       (1, 'Emotion', 2),
       (2, 'Generation', 2),
       (3, 'Evolution', 2),
       (4, 'Premium', 2),
       (1, 'Virtual card', 3),
       (2, 'MegaFon Gold', 3),
       (3, 'MegaFon Standard', 3);

INSERT INTO category (id, name, mcc)
VALUES
       (1,'Airline tickets',3000),
       (2,'Auto services',5511),
       (3,'Movie',7829),
       (4,'Entertainment',7911),
       (5,'Restaurants',5811),
       (6,'Supermarkets',5297),
       (7,'Gas station',5172),
       (8,'Flowers',5193),
       (9,'Clothes',5094);

INSERT INTO cards_category(card_id, bank_id, category_id)
VALUES
       (1, 1, 1),
       (1, 1, 2),
       (1, 1, 3),
       (1, 1, 4),
       (2, 1, 2),
       (2, 1, 5),
       (2, 1, 6),
       (3, 1, 1),
       (3, 1, 5),
       (4, 1, 2),
       (4, 1, 7),
       (4, 1, 1),
       (1, 2, 1),
       (1, 2, 3),
       (1, 2, 2),
       (2, 2, 1),
       (2, 2, 2),
       (2, 2, 4),
       (3, 2, 2),
       (3, 2, 7),
       (3, 2, 8),
       (4, 2, 1),
       (4, 2, 2),
       (4, 2, 3),
       (4, 2, 4),
       (4, 2, 5),
       (4, 2, 6),
       (4, 2, 7),
       (1, 3, 9),
       (1, 3, 8),
       (1, 3, 7),
       (2, 3, 5),
       (2, 3, 6),
       (3, 3, 4),
       (3, 3, 2),
       (3, 3, 6),
       (3, 3, 9),
       (3, 3, 7);

INSERT INTO places(id, mcc, name, category_id)
VALUES
       ( 1,3000, 'Aeroflot', 1 ),
       ( 2,3000, 'S7', 1 ),
       ( 3,3000, 'RUSSIA', 1 ),
       ( 4,3000, 'Utair', 1 ),
       ( 1,5511, 'Exist', 2 ),
       ( 2,5511, 'Autodoc', 2 );

