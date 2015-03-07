(defproject chatter "0.1.0-SNAPSHOT"
  :description "A simple web app that will display posted messages. Molly is making it as part of ClojureBridge.MN. Huzzah!"
  :url "https://github.com/mollyocr/chatter"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler chatter.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
