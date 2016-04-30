def sieve():
    markers = [0] * 2000000
    total = 2
    val = 3
    while val < 2000000:
        if markers[val] == 0:
            total += val
            i = val
            while i < 2000000:
                markers[i] = 1
                i += val
        val += 2
    print total

sieve()