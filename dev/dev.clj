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
  integrant.repl.state/system
  )
