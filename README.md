# Velostat

Velostat is a simple, no frills, way to keep track of cycling statistics.  

## Usage

Create a clojure data file with the following syntax:

`
{"mm/dd/yyyy"
	{:time "hh:mm'ss"
	:distance X
	:average Y
	:max Z}
"mm/dd/yyyy"
	{:time "hh:mm'ss"
	:distance X
	:average Y
	:max Z}}
`
mm/dd/yyyy: Date of the ride, used as the key
hh:mm'ss: Total ride time
X: Total distance
A: Average
Z: Max

## License

Copyright (C) 2011 Nathan Bowser

Distributed under the Eclipse Public License, the same as Clojure.
