(ns recipes-strings)

; copied from the internet and adapted
(defn split-digits [n]
      (loop [result (list (rem n 10)) n (quot n 10)]
            (if (pos? n)
                  (recur (conj result (rem n 10))
                         (quot n 10))
                  result)))
