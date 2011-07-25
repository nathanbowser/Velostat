(ns velostat.core)

(def a #(reduce (fn [[t c] val] [(+ t val) (inc c)]) [0 0] %))

(defn total-mileage [d]
	(reduce + (map :distance (vals d))))

(defn average-speed [d]
	(let [[t c] (a (map :distance (vals d)))] (/ t c)))

(defn -main [& args]
	(println (total-mileage (read-string (slurp (first args)))))
	(println (average-speed (read-string (slurp (first args))))))
