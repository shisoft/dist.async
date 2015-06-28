(ns dist.async
  (:require [dist.async.networking :refer [start-server]]))

(defn start-channel-server [port]
  (start-server port))