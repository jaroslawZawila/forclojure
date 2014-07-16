(ns forclojure.problem-67)

(defn ft [n]
  (take n
        (remove
          (fn [x]
            (some #(= 0 (rem x %)) (range 2 (inc (Math/round (Math/sqrt x))))))
          (iterate inc 2))))

(= (ft 2) [2 3])
(= (ft 5) [2 3 5 7 11])
(= (last (ft 100)) 541)