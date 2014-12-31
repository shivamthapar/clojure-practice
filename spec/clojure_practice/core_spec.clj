(ns clojure-practice.core-spec
  (:require [speclj.core :refer :all]
            [clojure-practice.core :refer :all]))

(describe "truthiness"
  (it "tests if true-or-false returns true"
    (should (equals-5? 5))))

(describe "Euler Prob 1"
  (it "tests if sum of all multiples of 3 or 5 below 1000 == 233168"
    (should (= (mult-3-5 1000) 233168))))

(describe "Euler Prob 2"
  (it "tests if sum of even fibonacci numbers <=4000000 is 4613732"
      (should (= (even-fib 4000000) 4613732))))

(run-specs)
