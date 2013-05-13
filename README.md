# sh-deps

Tool to generate a graphiz dot file with the dependency between the shell scripts of a project.

# Usage

## repl

```clojure
sh-deps.core> (-main "--directory" "/home/tony/bin" "--graph-file" "/home/tony/graph.dot")
Scanning directory /home/tony/bin and generating graph dot file /home/tony/graph.dot.
nil
sh-deps.core>
```

## CLI

```sh
tony@job (0,96,) 15:17:39 ~/repositories/perso/sh-deps (master) $ lein run -m sh-deps.core/-main -h
Usage:

Switches                 Default  Desc
--------                 -------  ----
-h, --no-help, --help    false    Show help
-d, --directory                   Directory to analyze
-o, --output-dot-file             Graph dot file to generate
-g, --no-graph, --graph  false    Generate the png from the dot file (needs graphviz in the classpath)

```

```sh
tony@dagobah(0.28,) 22:26:30 ~ (master) $ lein run --directory /home/tony/bin --graph-file /home/tony/graph.dot
Scanning directory /home/tony/bin and generating graph dot file /home/tony/graph.dot .
```

# License

Copyright (C) 2012 commiters

Distributed under the Eclipse Public License, the same as Clojure.
