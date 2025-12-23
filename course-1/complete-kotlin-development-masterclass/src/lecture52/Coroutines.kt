package lecture52

fun main() {
    // Coroutines Theory:
    // Threads are resource-intensive, Coroutines are light-weight threads (using thread pool)
    // Coroutines simplify async code, callbacks and synchronisation with simple syntax
    // Coroutines can be paused, resumed at any time

    // Basic Concepts
    // Scope
        // Create and run coroutine, provides lifecycle events
    // Context
        // The scope provides a context in which the coroutine runs
    // Suspending functions
        // Functions that can be run in a coroutine
    // Jobs
        // a handle on a coroutine
    // Deferred
        // A future result of a coroutine
    // Dispatcher
        // manages which thread(s) the coroutines runs on
}