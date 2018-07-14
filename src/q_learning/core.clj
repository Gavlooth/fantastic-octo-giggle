(ns q-learning.core
  (:gen-class)
  (:require [clojure.reflect])
  (:import [org.deeplearning4j.rl4j.learning.sync.qlearning QLearning]))

(defn config-q-learing [{:keys [random-seed max-epoch-step
                                max-step max-experience-replay
                                batch-size target-update
                                num-step-noop-warmup reward-scaling
                                gamma td-error-cliping min-epsilon
                                num-step-gready-anneal double-DQN]}]
  (QLearning/QLConfiguration
   random-seed max-epoch-step max-step
   max-experience-replay batch-size
    target-update num-step-noop-warmup
    reward-scaling gamma td-error-cliping
    min-epsilon num-step-gready-anneal
    double-DQN))





(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
