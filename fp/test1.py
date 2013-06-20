
"Test w/o decorator syntax."

import datetime
import time
import os

from elapsed import elapsed

def test(a, b="unkwnown"):
    print a, b
    time.sleep(5)

test = elapsed(test)

test("hello", os.getenv("USER"))
