(ns clojure-practice.core-spec
  (:require [speclj.core :refer :all]
            [clojure-practice.core :refer :all]))

(describe "truthiness"
  (it "tests if true-or-false returns true"
    (should (equals-5? 5))))

(run-specs)
