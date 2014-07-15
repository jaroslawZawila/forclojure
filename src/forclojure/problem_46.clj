(ns forclojure.problem-46)

(defn ft [fun]
  (fn [& args]
    (apply fun (reverse args))))

(= 3 ((ft nth) 2 [1 2 3 4 5]))
(= true ((ft >) 7 8))
(= 4 ((ft quot) 2 8))
(= [1 2 3] ((ft take) [1 2 3 4 5] 3))
