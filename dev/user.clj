 (ns user
  (:require [clojure.tools.namespace.repl :as tn]
            [q-learning.core :as ql]))


(defn reset [] (tn/refresh-all))
