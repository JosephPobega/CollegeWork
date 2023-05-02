#Joseph Pobega
#HW16
#Tuesday

use my_guitar_shop;

#1
CREATE TRIGGER products_before_insert
BEFORE INSERT ON Products
FOR EACH ROW
BEGIN
  IF NEW.date_added IS NULL THEN
    SET NEW.date_added = CURDATE();
    END IF;
END;



#2
DELIMITER //
CREATE FUNCTION discount_price (itemId INT)
RETURNS DECIMAL(10,2)
BEGIN
  DECLARE itemPrice DECIMAL(10,2);
  DECLARE discountAmount DECIMAL(10,2);
  DECLARE discountPrice DECIMAL(10,2);

  SELECT item_price, discount_amount INTO itemPrice, discountAmount
  FROM Order_Items WHERE item_id = itemId;

  SET discountPrice = itemPrice - discountAmount;

  RETURN discountPrice;
END//

DELIMITER ;
SELECT item_id, item_price, discount_amount, discount_price(item_id)
FROM Order_Items;
