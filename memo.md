# 5

* Single input method calls
* Functional interfaces in lambdas
* new way of writing getter setter

# 9

* to have partial function(PF) methods define it with explicitly PartialFunction[] type, otherwise it will be - proper
  function
* to promote from partial to total use .lift on PF

# 10 - #14 INCLUSIVE SKIPPED

# 14

curries are useful to reduce the amount of arguments and produce template functions to be used many times - see example
with curriedFormatter

# 14-19 INCLUSIVE SKIPPED

# 22 SKIPPED

# 24

mutable.Queue as a buffer

# 26

deadlock, livelock examples

# 27

Thread vs Future

* thread not returnvalue
* use notify/wait to wait for result in Threads, use Await.result(future) to automatically resolve when result is
  available

# 28

* Ugly used nested onComplete must be replaced by for-comprehensions ... see example
* for fallbacks and exceptions use .recover, recoverWIth or .fallbackTo

# 29

Promise is a container over a future. Can simplify problem solution with Threads. See example ThreadCommunitation and
FuturePromises

# 32 - 41  INCLUSIVE SKIPPED

# 43

* possible to create new type while defining a function
* super + type linearization - with multitype inheritance and super call - see example with Colors
* diamond problem - scala will call same method of the most right type

# 44-45   INCLUSIVE SKIPPED

# 48

nudge to implement self types (traits) - forbid extend without implementing

# 49 - Unfinished because of implicits

F bounded polymorphism used in ORM as an example
