(ns forclojure.problem-59)

(defn ft [& fs]
  (fn [& data] (map #(apply % data) fs)))

((ft + max min) 2 3 5 1 6 4)

(= [21 6 1] ((ft + max min) 2 3 5 1 6 4))
(= ["HELLO" 5] ((ft #(.toUpperCase %) count) "hello"))
(= [2 6 4] ((ft :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))
