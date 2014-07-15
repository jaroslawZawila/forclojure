(ns forclojure.problem-50)

(defn tf [col]
  (vals
    (reduce (fn [items item]
              (assoc items (type item) (conj (get items (type item) []) item))) {} col)))

(defn tf [col]
  (vals (group-by type col)))

(= (set (tf [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
(= (set (tf [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
(= (set (tf [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})
