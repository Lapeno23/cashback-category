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
       (1,'Авиабилеты',3000),
       (2,'Авиабилеты',3001),
       (3,'Авиабилеты',3002),
       (4,'Авиабилеты',3003),
       (5,'Авиабилеты',3004),
       (6,'Авиабилеты',3004);

INSERT INTO cards_category(card_id, bank_id, category_id)
VALUES
       (1, 1, 1),
       (2, 1, 1),
       (1, 2, 1),
       (3, 1, 1),
       (3, 1, 2),
       (3, 1, 3),
       (3, 1, 4);

INSERT INTO places(id, mcc, name, category_id)
VALUES ( 1,3000, 'Aeroflot', 1 )

