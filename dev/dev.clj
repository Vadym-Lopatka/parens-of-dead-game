(ns dev
  (:require [integrant.repl :as repl]
            [undead.system :as system]))

(defn start []
  (repl/set-prep! (constantly system/system))
  (repl/go))

(defn stop []
  (repl/halt))

(comment
  (start)
  (stop)
  integrant.repl.state/system
  )
