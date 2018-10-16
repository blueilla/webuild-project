INSERT INTO user VALUES
  (1, 'tamas@user.hu', 'Kiss', 'Tamas'),
  (2, 'peter@user.hu', 'Nagy', 'Peter'),
  (3, 'aladar@user.hu', 'Kozep', 'Aladar');


INSERT INTO company VALUES
  (1, 'Fotex', 'photo', 'fotex@photo.com', true),
  (2, 'Piramis', 'magasepito', 'piramis@photo.com', true),
  (3, 'DogCare', 'dog daycare', 'Dogcare@photo.com', true);


INSERT INTO phone_number VALUES
  (1, '06204325678', 1),
  (2, '06204345778', 2),
  (3, '06204377678', 3),
  (4, '06204329678', 2),
  (5, '06204432678', 1);

INSERT INTO user_company VALUES
  (1, 3),
  (1, 2),
  (2, 3),
  (3, 3),
  (3, 1);
