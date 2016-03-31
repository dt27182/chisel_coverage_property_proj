run-cpp:
	sbt "run Hello --backend c --compile --test --genHarness"

run-cpp-vcd:
	sbt "run Hello --backend c --compile --test --genHarness --vcd"

run-vcs:
	sbt "run Hello --backend v --genHarness"

clean:
	rm -f Hello*
	rm -f *.h
	rm -f *.v
	rm -f vpi*
	rm -f opendatabase.log
	rm -rf DVEfiles
