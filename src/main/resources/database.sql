-- Create user FOODSERVICEV1
CREATE USER FOODSERVICEV2 IDENTIFIED BY 123456;

-- Assign all permissions to the user
GRANT ALL PRIVILEGES TO FOODSERVICEV2;

-- Create table Food and add some data
CREATE TABLE FOOD (
	Id VARCHAR2(200) PRIMARY KEY,
	Restaurant_Username VARCHAR2(100),
	Name NVARCHAR2(200),
	Price NUMBER,
	Image_Link VARCHAR2(2000)
);

SELECT * FROM FOOD

INSERT ALL
    INTO FOOD ( Id, Restaurant_Username, Name, Price, Image_Link )
		VALUES (
			'b170bcaa-8008-4889-aa8c-886950a2ce22', 'luckrestaurant', 'Cơm Gà Xối mỡ', 25000,
			'https://cdn.cet.edu.vn/wp-content/uploads/2020/04/cach-lam-com-chien-ga-xoi-mo.jpg'
		)
	INTO FOOD ( Id, Restaurant_Username, Name, Price, Image_Link )
		VALUES (
			'45a06734-7c63-4dae-bf9e-5fa674926da2', 'luckrestaurant', 'Cơm Sườn', 25000,
			'https://comtamtuonghan.vn/wp-content/uploads/2020/09/com-tam-suon-nuong-tang-1.png'
		)
SELECT 1 FROM DUAL;