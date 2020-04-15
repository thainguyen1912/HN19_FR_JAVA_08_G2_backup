CREATE DATABASE demo

GO
USE demo

GO
CREATE SCHEMA LongNV35

GO
INSERT INTO LongNV35.role_entity(code, name) VALUES('ADMIN', 'ADMIN');
INSERT INTO LongNV35.role_entity(code, name) VALUES('VinhNV', 'FA Manager');
INSERT INTO LongNV35.role_entity(code, name) VALUES('DieuNT1', 'Delivery Manager');
INSERT INTO LongNV35.role_entity(code, name) VALUES('LinhND33', 'Class Andmin');
INSERT INTO LongNV35.role_entity(code, name) VALUES('QuangAnh', 'FA Rec');
INSERT INTO LongNV35.role_entity(code, name) VALUES('HuongLT20', 'System Admin');
INSERT INTO LongNV35.role_entity(code, name) VALUES('LongNV35', 'Trainer');

GO
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('VinhNV', '123456', 'Nguyen Van Vinh');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('DieuNT1', '123456', 'Nguyen Thi Dieu');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('LinhND33', '123456', 'Nguyen Dieu Linh');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('QuangAnh', '123456', 'Quang Anh');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('HuongLT20', '123456', 'Lam Thi Huong');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('ADMIN', '123456', 'Nguyen Van Vinh');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('ADMIN', '123456', 'Nguyen Thi Dieu');
INSERT INTO LongNV35.user_entity([user_name], [password], full_name)
VALUES('LongNV35', '123456', 'Nguyen Van Long');


GO
INSERT INTO dbo.user_role([user_id], role_id) VALUES(1, 2);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(2, 3);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(3, 4);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(4, 5);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(5, 6);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(6, 1);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(7, 1);
INSERT INTO dbo.user_role([user_id], role_id) VALUES(8, 7);


SELECT * FROM LongNV35.user_entity
SELECT * FROM LongNV35.role_entity
SELECT * FROM dbo.user_role