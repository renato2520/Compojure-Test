(ns compojure-test.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello Woooooooooorld")
  (route/not-found "Not Founda"))

(def app
  (wrap-defaults app-routes site-defaults))
