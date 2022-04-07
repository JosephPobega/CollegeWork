  GNU nano 2.3.1                       File: example.sh                                           Modified

#!/bin/bash

if test $# -eq 0; then
        echo "What is your name? "
        read name

else
        name= $1
fi

echo "Hello $name."
exit 0
