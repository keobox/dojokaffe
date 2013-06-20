
"Test w/ decorator syntax."

import datetime
import time
import os

from elapsed import elapsed

@elapsed
def test(a, b="unkwnown"):
    print a, b
    time.sleep(5)

test("hello", os.getenv("USER"))
