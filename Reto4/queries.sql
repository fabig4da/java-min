-- 1 --

SELECT w.amount+SUM(p.amount_pocket) as "suma total" FROM user u 
                        JOIN wallet w ON w.user_id = u.id 
                        JOIN pocket p ON p.user_id = u.id 
                        where u.id = 0;

-- 3 --
SELECT p.id, p.amount_pocket as "total bolsillos" FROM user u 
                        JOIN pocket p ON p.user_id = u.id 
                        where u.id = 0;

SELECT w.id, w.amount, t.`name` as "transaction" , w.`timestamp` FROM user u 
                        JOIN wallet wl ON u.id = wl.user_id 
                        JOIN wallet_log w ON wl.id = w.wallet_id
                        JOIN transaction_type t ON w.transaction_type_id = t.id
                        WHERE u.id = 0
                        LIMIT 20 OFFSET 0 ;

SELECT pl.id, pl.amount, t.`name` as "transaction" , pl.`timestamp` FROM user u 
                        JOIN pocket p ON u.id = p.user_id 
                        JOIN pocket_log pl ON p.id = pl.pocket_id
                        JOIN transaction_type t ON pl.transaction_type_id = t.id
                        WHERE p.id = 0;

SELECT u.name, w.amount+SUM(p.amount_pocket) as "total" FROM user u 
                        JOIN wallet w ON w.user_id = u.id 
                        JOIN pocket p ON p.user_id = u.id 