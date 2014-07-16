(ns forclojure.problem-67)

;need a seq wich contains prime numbers
(defn ft [x]
  (take x (filter number?
                  (map #(fn [n]
                         (when-not (= 1 n)
                           (if (= 1 (count (filter #(fn [r] (= 0 r)) (map #(fn [s] (rem n s)) (range 1 (+ 1 (Math/round (Math/sqrt n))))))))
                             n false)))
                       (range)))))




(defn ft [n]
  (when-not (= 1 n)
    (if (= 1 (count (filter #(= 0 %) (map #(rem n %) (range 1 (+ 1 (Math/round (Math/sqrt n))))))))
      n false)))

(take 100 (filter number? (map #(ft %) (range))))

(ft 11)


(= (ft 2) [2 3])
(= (ft 5) [2 3 5 7 11])
(= (last (ft 100)) 541)