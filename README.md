# SI_lab2_196022

<img src="https://raw.githubusercontent.com/Aleksandra0507/SI_lab2_196022/master/ControlFlowGraph.jpg"
     alt="Control_Flow_Graph"
     style="float: left; Height: 200px; Width: 200px" />

-Цикломатска комплексност:
цик_комплексност = број_ребра + број_темиња + 2 * поврзани_компоненти = 31-25+2 = 8

-Тест случаи според Multiple Condition Ги бараме сите conditional statements каде има најмалку еден логички оператор.

=== if (hr < 0 || hr > 24) Можни сценарија:

ТX - Целиот израз е точен, затоа што првиот дел е точен. 
Test case: Time(0, 0, 0)

FF - Целиот израз ќе биде неточен, затоа што двата дела се неточни.
Test case: Time(-100, 0, 2)

FT - Целиот израз ќе биде точен, затоа што првиот дел е неточен но вториот дел е точен.
Test case: Time(100, 0, 2)


=== if (min < 0 || min > 59) Можни сценарија:

ТX - Целиот израз ќе биде точен, затоа што првиот дел е точен.
Test case: Time(0, -100, 0)

FF - Целиот израз ќе биде неточен, затоа што двата дела се неточни.
Test case: Time(0, 30, 0)

FT - Целиот израз ќе биде точен, затоа што првиот дел е неточен, но вториот дел е точен.
Test case: Time(0, 100, 0)


=== if (sec >= 0 && sec <= 59)

ТX - Целиот израз ќе биде точен, затоа што првиот дел е точен.
Test case: Time(0, 0, 100)

TT - Целиот израз ќе биде точен, затоа што двата дела се точни.
Test case: Time(0, 0, 30)

FT - Целиот израз ќе биде точен, затоа што првиот дел е неточен но вториот дел е точен.
Test case: Time(0, 0, -100)


=== if (hr == 24 && min == 0 && sec == 0)

TTF - Целиот израз е точен, затоа што првите 2 дела се точни.
Test case: Time(24, 0, 100)

ТTT - Целиот израз е точен, затоа што трите дела дела се точни.
Test case: Time(24, 0, 0)

TFX - Целиот израз е точен, затоа што првиот израз е точен.
Test case: Time(24, 100, 0)


*За исклучоците користев assertThrows од класа RuntimeException, а потоа за проверка assertTrue,заедно со String методата contains.
