(println "Informe um numero: ")
(let [numerotexto (read-line)
      numero (Integer/parseInt numerotexto)]
  
  (doseq [i (range 1 11)]
    (println (format "%d x %d = %d" numero i (* numero i)))))