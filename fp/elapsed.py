
"Elapsed decorator."

import datetime

def elapsed(func):
    "Elapsed decorator"
    def _func(*args, **kwargs):
        "Decoration function"
        start = datetime.datetime.now()
        ret = func(*args, **kwargs)
        print "Elapsed time", datetime.datetime.now() - start
        return ret
    return _func

if __name__ == "__main__":
    import time
    import os

    @elapsed
    def test(a, b="unkwnown"):
        print a, b
        time.sleep(5)

    test("hello", os.getenv("USER"))
