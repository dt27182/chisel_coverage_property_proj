run-cpp:
	sbt "run ChiselDriver --backend c --compile --test --genHarness"

run-cpp-vcd:
	sbt "run ChiselDriver --backend c --compile --test --genHarness --vcd"

run-vcs:
	sbt "run ChiselDriver --backend v --genHarness"

clean:
	rm -f ChiselDriver*
	rm -f *.h
	rm -f *.v
	rm -f vpi*
	rm -f opendatabase.log
	rm -rf DVEfiles
