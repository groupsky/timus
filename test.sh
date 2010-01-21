#!/bin/bash
javac Problem$1.java
rm -f problem$1.test.work*
for i in problem$1.test.in*; do
  work=problem$1.test.work${i#problem$1.test.in}
  java -Xmx64m -Xms64m -Xss64m -DONLINE_JUDGE -cp $PWD Problem$1 < $i > $work
  diff problem$1.test.out${i#problem$1.test.in} $work
done

