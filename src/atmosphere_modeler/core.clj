(ns atmosphere-modeler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

; Define the important constants
; Define the length of the world
(def world-length 10)
; Define the width of the world
(def world-width 10)
; Define a struct that represents a cube of air for purposes of the simulation
(defstruct cube-of-air :air-pressure)

(def myworld (ref (zone 0)))

(def world
  (apply vector
         (map (fn [_]
                (apply vector (map (fn [_] (ref (struct cube-of-air 0)))
                                   (range world-width))))
              (range world-length))))



