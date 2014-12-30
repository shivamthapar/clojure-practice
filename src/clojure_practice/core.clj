(ns clojure-practice.core)

(defn equals-5? [n]
  (= 5 n))

(defn mult-3-5 "Find the sum of all the multiples of 3 or 5 below 1000." 
  []
  (reduce + (filter (fn [x] (or (zero? (mod x 3)) (zero? (mod x 5)))) (range 1000)))
)
