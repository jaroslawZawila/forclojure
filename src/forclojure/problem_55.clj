(ns forclojure.problem-55)

(defn ft [col]
  (reduce
    (fn [count item]
      (if (map? count)
        (assoc count item (inc (get count item 0)))
        (-> (assoc {} count 1)
            (assoc item (if (= count item) 2 1)))))
    col))


(ft [1 1 2 3 2 1 1])

(= (ft [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
(= (ft [:b :a :b :a :b]) {:a 2, :b 3})
(= (ft '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
