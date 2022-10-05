(defproject clojure_example "0.1.0-SNAPSHOT"
  :description "An example project demonstrating how to build a REST API in Clojure"
  :url "https://maddennis.io"
  :license {:name "MIT"
    :url "https://github.com/dennismasinde/clojure-example/blob/master/LICENSE"}
  :dependencies [
    [org.clojure/clojure "1.11.1"]
    [org.clojure/data.json "2.4.0"]
    [org.clojure/java.jdbc "0.7.12"]
    [org.postgresql/postgresql "42.5.0"]
    [ring/ring-defaults "0.3.4"]
    [ring/ring-devel "1.9.6"]
    [ring/ring-json "0.5.1"]
    [compojure "1.6.3"]
    [http-kit "2.6.0"]
    [lynxeyes/dotenv "1.1.0"]]
  :main ^:skip-aot clojure-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} :dev {:main clojure-example.core/-dev-main}})
