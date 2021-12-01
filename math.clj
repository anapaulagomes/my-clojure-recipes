(ns recipes-math)

(defn pow
    "Pow but for integers."
    ([base expo] (pow base expo base))
    ([base expo current-result]
    (if (not= 0 (dec expo))
        (pow base (dec expo) (* base current-result))
        current-result)))
