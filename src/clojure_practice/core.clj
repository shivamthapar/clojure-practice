(ns clojure-practice.core)

(defn equals-5? [n]
  (= 5 n))

(defn mult-3-5 "Find the sum of all the multiples of 3 or 5 below 1000." 
  [a]
  (reduce + (filter (fn [x] (or (zero? (mod x 3)) (zero? (mod x 5)))) (range a)))
)
(defn even-fib "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
  [max]
  (reduce + 
          (filter even? 
               (take-while (fn [x] (<= x max)) 
                  (map first 
                       (iterate (fn [[x y]] [y (+ x y)]) [0 1])))))
)
