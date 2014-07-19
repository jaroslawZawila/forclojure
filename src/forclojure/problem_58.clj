(ns forclojure.problem-58)

(defn ft [ & s]
  (let [[f & r] (reverse s)]
    (fn [& data] (reduce (fn [x1 x2] (x2 x1)) (apply f data) r))))

(= [3 2 1] ((ft rest reverse) [1 2 3 4]))
(= 5 ((ft (partial + 3) second) [1 2 3 4]))
(= true ((ft zero? #(mod % 8) +) 3 5 7 9))
(= "HELLO" ((ft #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
