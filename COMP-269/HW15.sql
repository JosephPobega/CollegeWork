#Joseph Pobega
#HW15
#Tuesday

use my_guitar_shop;


#1

DELIMITER //
CREATE PROCEDURE insert_category (IN categoryName VARCHAR(255))
BEGIN
  INSERT INTO Categories (category_name) VALUES (categoryName);
END//
DELIMITER ;
CALL insert_category('Guitar');
CALL insert_category('New Category');
DELETE FROM Categories WHERE category_id = LAST_INSERT_ID();



#2
-- Create the function
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
