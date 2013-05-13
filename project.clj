(defproject sh-deps "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-stacktrace "0.2.4"]
                 [org.clojure/tools.cli "0.2.2"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}}
  :main sh-deps.core
  :min-lein-version "2.0.0"
  :description "Shell script dependency graph analyzer")
