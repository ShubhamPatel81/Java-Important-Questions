@REM  Refer to Notes file ----

##
JAVA
 │
 ├── OOP
 ├── Collections
 ├── Data Structures
 └── Algorithms
        │
        ▼
CONCURRENCY
 │
 ├── Threads
 ├── Locks
 ├── Synchronization
 ├── Atomic Operations
 ├── Java Memory Model
 ├── Concurrent Collections
 └── Executors
        │
        ▼
PARALLEL COMPUTING
 │
 ├── Fork/Join
 ├── Data Parallelism
 ├── Task Parallelism
 ├── Divide & Conquer
 ├── Parallel Sorting
 ├── Parallel Graph Algorithms
 ├── Reduction
 ├── Prefix Sum
 └── Performance Analysis
        │
        ▼
NETWORKING
 │
 ├── TCP/UDP
 ├── Sockets
 ├── Message Passing
 └── RPC
        │
        ▼
DISTRIBUTED SYSTEMS
 │
 ├── Failures
 ├── Communication
 ├── Logical Clocks
 ├── Mutual Exclusion
 ├── Leader Election
 ├── Snapshots
 ├── Deadlocks
 └── Failure Detection
        │
        ▼
ADVANCED DISTRIBUTED ALGORITHMS
 │
 ├── Consensus
 │    ├── Paxos
 │    └── Raft
 │
 ├── Replication
 ├── Consistency
 ├── Transactions
 ├── Distributed Hash Tables
 ├── Fault Tolerance
 ├── MapReduce
 ├── Distributed Graph Algorithms
 └── Byzantine Fault Tolerance
        │
        ▼
ADVANCED PROJECTS
 │
 ├── Distributed KV Store
 ├── Raft Cluster
 ├── MapReduce Engine
 ├── Distributed Database
 └── Fault-Tolerant Service
##

Yes. Think of this roadmap as **one continuous staircase**: first you learn how one Java program works, then how multiple threads work inside one machine, then how multiple machines communicate, and finally how those machines coordinate despite failures.

I’ll explain every block in your roadmap, including **what it means, why it matters, what to learn, what Java provides, and what you should build**.

---

# 1. The Big Picture

Your entire journey is:

```text
JAVA
  ↓
Write correct programs
  ↓
CONCURRENCY
  ↓
Run multiple tasks at the same time
  ↓
PARALLEL COMPUTING
  ↓
Use multiple CPU cores to speed up computation
  ↓
NETWORKING
  ↓
Make different programs communicate
  ↓
DISTRIBUTED SYSTEMS
  ↓
Coordinate multiple machines
  ↓
ADVANCED DISTRIBUTED ALGORITHMS
  ↓
Handle agreement, replication, failures, consistency
  ↓
PROJECTS
  ↓
Build real distributed systems
```

There are three major conceptual jumps:

### Jump 1

```text
One thread
     ↓
Multiple threads
```

This is **concurrency**.

### Jump 2

```text
One CPU/core
     ↓
Multiple CPU cores
```

This is **parallel computing**.

### Jump 3

```text
One computer
     ↓
Multiple computers connected by a network
```

This is **distributed computing**.

These three ideas are related, but they are **not the same thing**.

---

# PART I — JAVA FOUNDATION

# 2. Java

Before parallel and distributed algorithms, you need enough Java that the language itself doesn't become the difficult part.

You should eventually be able to write a medium-sized Java program without constantly looking up syntax.

Learn:

```text
Java syntax
    ↓
Methods
    ↓
Classes
    ↓
Interfaces
    ↓
Generics
    ↓
Collections
    ↓
Exceptions
    ↓
Streams/Lambdas
    ↓
Files/I/O
    ↓
Testing
```

---

# 3. OOP

OOP = **Object-Oriented Programming**.

Java is heavily object-oriented, and distributed systems contain many objects representing things such as:

```text
Node
Message
Server
Client
Task
Worker
Transaction
LogEntry
Request
Response
```

## 3.1 Classes and objects

A class describes a type.

```java
class Node {
    int id;
    String address;
}
```

An object is an instance:

```java
Node node = new Node();
```

In distributed systems, you might have:

```text
Node 1
Node 2
Node 3
Node 4
```

Each can be represented by a `Node` object.

---

# 4. Encapsulation

Keep an object's internal state controlled.

Instead of allowing everything to modify:

```java
node.state = ...
```

you may expose controlled methods:

```java
node.start();
node.stop();
node.receive(message);
```

This becomes extremely important when building concurrent systems because uncontrolled shared state creates bugs.

---

# 5. Inheritance

You should understand inheritance, although modern Java design often prefers composition.

Example:

```text
Node
 ├── LeaderNode
 ├── FollowerNode
 └── CandidateNode
```

A Raft implementation could represent different node states this way, although you don't necessarily need inheritance to implement Raft.

---

# 6. Interfaces

Interfaces are particularly important.

For example:

```java
interface MessageHandler {
    void handle(Message message);
}
```

Different components can implement it.

```text
MessageHandler
      |
      +---- ElectionHandler
      |
      +---- ReplicationHandler
      |
      +---- SnapshotHandler
```

This is useful for designing distributed software.

---

# 7. Generics

Learn:

```java
List<String>
Map<Integer, Node>
Queue<Message>
```

You should understand:

* Generic classes
* Generic methods
* Type parameters
* Wildcards
* `extends`
* `super`

Concurrent programming uses generics everywhere.

---

# 8. Collections

You need very strong knowledge of Java collections.

Learn:

### List

```text
ArrayList
LinkedList
```

### Set

```text
HashSet
TreeSet
LinkedHashSet
```

### Map

```text
HashMap
TreeMap
LinkedHashMap
```

### Queue

```text
Queue
Deque
PriorityQueue
```

Why?

Because algorithms constantly manipulate:

```text
nodes
messages
tasks
requests
logs
events
edges
vertices
```

---

# 9. Data Structures

You need these before serious algorithm work.

## Arrays

Understand:

* Indexing
* Memory layout
* Traversal
* Searching
* Updating

## Linked lists

Understand:

* Nodes
* Pointers/references
* Insertion
* Deletion
* Traversal

## Stack

```text
push
pop
peek
```

Used in:

* DFS
* Parsing
* Backtracking

## Queue

```text
enqueue
dequeue
```

Extremely important in concurrent programming.

Queues are used for:

```text
Tasks
Messages
Requests
Jobs
```

---

# 10. Trees

Learn:

* Binary trees
* Binary search trees
* AVL trees conceptually
* Heaps
* Priority queues
* Tries

Heaps are particularly useful for scheduling.

---

# 11. Graphs

This is **critical**.

Distributed systems can naturally be represented as graphs.

For example:

```text
        Node A
       /      \
    Node B -- Node C
       \       /
        Node D
```

Learn:

* Vertices
* Edges
* Directed graphs
* Undirected graphs
* Weighted graphs
* Adjacency matrix
* Adjacency list

Then:

* BFS
* DFS
* Connected components
* Shortest paths
* MST
* Topological sorting

---

# 12. Algorithms

You need algorithmic thinking before parallel algorithms.

Learn:

## Searching

* Linear search
* Binary search

## Sorting

* Bubble sort
* Insertion sort
* Selection sort
* Merge sort
* Quick sort
* Heap sort

You don't need to use bubble sort in real systems, but understanding basic algorithms teaches complexity.

---

# 13. Divide and conquer

This becomes extremely important later.

Pattern:

```text
Problem
   |
   +---- Problem 1
   +---- Problem 2
   +---- Problem 3
   |
   ↓
Combine results
```

Examples:

* Merge sort
* Quick sort
* Binary search

Why is it important?

Because many divide-and-conquer algorithms can become **parallel algorithms**.

---

# 14. Complexity

You must understand:

```text
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(2ⁿ)
```

For example:

```text
Sequential algorithm: O(n)
```

doesn't automatically mean:

```text
Parallel algorithm: O(n/p)
```

because parallel programs have:

* Synchronization
* Communication
* Scheduling
* Thread creation
* Memory contention

This is why parallel algorithm analysis matters.

---

# PART II — CONCURRENCY

# 15. What is concurrency?

Concurrency means **multiple tasks are making progress during overlapping periods**.

Imagine:

```text
Task A ────────
      Task B ──────────
            Task C ───────
```

They may not literally execute simultaneously.

On one CPU:

```text
A → B → A → C → B → A
```

The operating system switches between them.

On multiple cores, they may actually execute simultaneously.

---

# 16. Threads

A thread is an execution path inside a process.

A Java program might have:

```text
Process
 ├── Thread 1
 ├── Thread 2
 ├── Thread 3
 └── Thread 4
```

Create threads using mechanisms such as:

```java
Thread
Runnable
Callable
ExecutorService
```

Don't make `Thread` creation your default approach for large applications. Learn the lower-level mechanism, then move toward executors.

---

# 17. Race conditions

One of the most important concurrency problems.

Suppose:

```java
counter++;
```

looks like one operation.

Conceptually it can involve:

```text
read counter
    ↓
add 1
    ↓
write counter
```

Now:

```text
Thread A       Thread B

read 0         read 0
add 1          add 1
write 1        write 1
```

Expected:

```text
2
```

Actual:

```text
1
```

That's a **race condition**.

---

# 18. Critical sections

A critical section is code that accesses shared state and must be coordinated.

```text
Thread A
   |
   ↓
[ Critical Section ]
   ↑
Thread B
```

You need synchronization mechanisms to protect it.

---

# 19. Locks

A lock ensures that only appropriate threads access a protected resource at a time.

Java provides:

```java
synchronized
ReentrantLock
ReadWriteLock
StampedLock
```

Conceptually:

```text
Thread A → acquire lock
            ↓
         modify data
            ↓
          release

Thread B → waits
```

---

# 20. Synchronization

Synchronization coordinates multiple threads.

Learn:

* Mutual exclusion
* Condition synchronization
* Monitors
* `synchronized`
* `wait`
* `notify`
* `notifyAll`

A classic example is producer-consumer:

```text
Producer
   ↓
[ Queue ]
   ↓
Consumer
```

The producer adds work.

The consumer removes work.

You need coordination when the queue is empty or full.

---

# 21. Atomic Operations

An atomic operation appears indivisible to other threads.

Java provides:

```text
AtomicInteger
AtomicLong
AtomicBoolean
AtomicReference
```

Example:

```java
AtomicInteger counter = new AtomicInteger();

counter.incrementAndGet();
```

This is different from naïvely doing:

```java
counter++;
```

---

# 22. CAS

CAS = **Compare-And-Swap**.

Conceptually:

```text
if current value == expected value
       ↓
change it
else
       ↓
retry
```

CAS is fundamental to many lock-free algorithms.

You should eventually understand:

```text
Locks
   vs
CAS
   vs
Lock-free algorithms
```

---

# 23. Java Memory Model

This is one of the hardest but most important Java topics.

It explains how threads interact with memory.

Suppose:

```java
boolean ready = false;
```

Thread A changes it:

```text
ready = true
```

Thread B reads it.

Can Thread B always immediately observe the new value?

Not necessarily in the naïve conceptual model.

You need to understand:

* Visibility
* Atomicity
* Ordering
* Happens-before
* `volatile`
* Synchronization
* Safe publication

---

# 24. `volatile`

`volatile` helps with visibility and ordering guarantees for a variable.

It does **not** make compound operations like:

```java
counter++
```

atomic.

That's a critical distinction.

---

# 25. Concurrent Collections

Java provides collections designed for concurrent access.

Important ones:

```text
ConcurrentHashMap
BlockingQueue
ConcurrentLinkedQueue
CopyOnWriteArrayList
ConcurrentSkipListMap
```

Understand **when** each is appropriate.

For example:

```text
Producer 1 ─┐
Producer 2 ─┼→ BlockingQueue → Consumer
Producer 3 ─┘
```

---

# 26. Executors

Instead of manually creating:

```text
Thread 1
Thread 2
Thread 3
...
Thread 1000
```

use an executor/thread pool.

Conceptually:

```text
Tasks
 ↓
Executor
 ↓
Thread Pool
 ├── Worker 1
 ├── Worker 2
 ├── Worker 3
 └── Worker 4
```

Learn:

* `ExecutorService`
* `Callable`
* `Future`
* Thread pools
* Scheduled execution
* Cancellation
* Timeouts

---

# PART III — PARALLEL COMPUTING

# 27. What is parallel computing?

Parallel computing means dividing computation among multiple processing resources.

Suppose:

```text
1,000,000 numbers
```

Need to calculate their sum.

Sequential:

```text
CPU
 ↓
1,000,000 numbers
```

Parallel:

```text
             ┌── Core 1 → 250K
             ├── Core 2 → 250K
Array ───────┼── Core 3 → 250K
             └── Core 4 → 250K
                       ↓
                     combine
```

---

# 28. Fork/Join

Java's `ForkJoinPool` is designed for parallel divide-and-conquer tasks.

Concept:

```text
              Problem
             /       \
         Problem     Problem
          /  \         /  \
        ...  ...     ...  ...
```

Then results are joined.

Learn:

```text
ForkJoinPool
RecursiveTask
RecursiveAction
work stealing
```

---

# 29. Work stealing

Suppose:

```text
Worker 1: ███████████
Worker 2: ██
Worker 3: █████
Worker 4: █
```

Worker 4 finishes early.

Instead of staying idle, it can take work from another worker.

That's **work stealing**.

This helps load balancing.

---

# 30. Data parallelism

Same operation applied to different pieces of data.

Example:

```text
Data:
[1 2 3 4 5 6 7 8]

Worker 1 → [1 2]
Worker 2 → [3 4]
Worker 3 → [5 6]
Worker 4 → [7 8]
```

Each performs:

```text
x → x²
```

---

# 31. Task parallelism

Different workers perform different tasks.

```text
Worker 1 → Read file
Worker 2 → Process network
Worker 3 → Compress data
Worker 4 → Write output
```

The tasks themselves differ.

---

# 32. Divide and conquer

Suppose we need to sort:

```text
[8 3 7 4 2 9 1 5]
```

Split:

```text
[8 3 7 4] [2 9 1 5]
```

Then split again.

Independent subproblems can execute concurrently.

That's why merge sort is a natural example for parallel computing.

---

# 33. Parallel sorting

Study:

### Parallel merge sort

```text
             Array
            /     \
         Sort     Sort
         / \      / \
        ... ...  ... ...
            ↓
          Merge
```

### Parallel quicksort

Partitions can sometimes be processed concurrently.

### Sorting networks

Study:

* Bitonic sort
* Odd-even merge sort

These introduce a more algorithmic/theoretical perspective on parallel computation.

---

# 34. Parallel graph algorithms

Graphs become interesting because different parts may or may not be processed independently.

Study:

* Parallel BFS
* Parallel connected components
* Parallel shortest path
* Parallel MST

Example:

```text
             A
          /  |  \
         B   C   D
        / \      |
       E   F     G
```

A frontier in BFS can potentially be processed in parallel.

---

# 35. Reduction

Reduction means combining many values into one.

Example:

```text
1 2 3 4 5 6 7 8
```

Sequential:

```text
(((((((1+2)+3)+4)+5)+6)+7)+8)
```

Parallel:

```text
1+2   3+4   5+6   7+8
  \     /     \     /
   3       7      11
       \    /     /
         10 + 11
            ↓
           21
```

This pattern appears everywhere.

---

# 36. Prefix sum

Input:

```text
1 2 3 4
```

Output:

```text
1 3 6 10
```

Parallel prefix algorithms are important because they demonstrate that even apparently sequential computations can sometimes be reorganized for parallel execution.

---

# 37. Parallel performance analysis

You need to measure more than "it runs."

Important metrics:

### Speedup

```text
Speedup = sequential execution time
          -------------------------
          parallel execution time
```

### Efficiency

```text
Efficiency = Speedup / number of processors
```

Suppose:

```text
Sequential = 10 sec
Parallel = 3 sec
Processors = 4
```

Speedup:

```text
10 / 3 ≈ 3.33
```

Efficiency:

```text
3.33 / 4 ≈ 83%
```

You also need to understand:

* Amdahl's law
* Gustafson's law
* Synchronization overhead
* Communication overhead
* Load imbalance
* Memory contention
* Cache effects
* False sharing

---

# PART IV — NETWORKING

# 38. Why networking comes next

Until now:

```text
Thread A
Thread B
Thread C
```

were on the same machine.

Now we want:

```text
Machine A
    ↕
Network
    ↕
Machine B
```

This is the foundation of distributed systems.

---

# 39. TCP

TCP provides a reliable, ordered byte stream.

Conceptually:

```text
Client
  |
  | TCP
  ↓
Server
```

Learn:

* Connection establishment
* Ports
* IP addresses
* Streams
* Reliability
* Ordering
* Retransmission
* Connection termination

Java:

```text
Socket
ServerSocket
```

---

# 40. UDP

UDP is connectionless and doesn't provide TCP's reliability guarantees.

Conceptually:

```text
Packet
 ↓
Network
 ↓
Destination
```

Packets may be:

* Lost
* Duplicated
* Reordered

Understanding this is useful because distributed algorithms often have to reason about unreliable communication.

---

# 41. Sockets

A socket gives your Java application a communication endpoint.

A simple architecture:

```text
Client
  |
Socket
  |
Network
  |
ServerSocket
  |
Server
```

Build a basic Java client/server application before moving into distributed algorithms.

---

# 42. Message passing

Instead of sharing memory:

```text
Thread A
   ↓
Shared Memory
   ↑
Thread B
```

distributed systems often communicate through messages:

```text
Node A
  |
  | Message
  ↓
Node B
```

Messages might be:

```text
REQUEST
RESPONSE
VOTE
HEARTBEAT
APPEND_ENTRIES
ACK
```

This concept is central to distributed algorithms.

---

# 43. RPC

RPC = **Remote Procedure Call**.

Conceptually:

```text
Client
   |
   | "getUser(123)"
   ↓
Network
   ↓
Server
   |
   | executes
   ↓
Response
```

The client behaves somewhat as though it is calling a local function, but the operation actually occurs remotely.

You should learn the concepts behind:

* Serialization
* Deserialization
* Request/response
* Timeouts
* Retries
* Idempotency
* Remote failures

---

# PART V — DISTRIBUTED SYSTEMS

# 44. What is a distributed system?

A distributed system consists of multiple independent computers that communicate over a network and cooperate to provide some functionality.

Example:

```text
             Client
               |
       ┌───────┼───────┐
       ↓       ↓       ↓
     Node 1  Node 2  Node 3
       ↕       ↕       ↕
       └───────┼───────┘
               ↓
            Storage
```

The difficult part isn't simply communication.

The difficult part is:

> **How do multiple independent machines agree on what happened when communication can be delayed and machines can fail?**

That question leads directly to distributed algorithms.

---

# 45. Failures

In normal programming:

```text
function failed
```

might be enough.

In distributed systems, you have many failure possibilities.

## Crash failure

A node stops working.

```text
Node A → DEAD
```

## Network failure

The node works, but communication fails.

```text
A XXXXXXXXX B
```

## Message loss

```text
A → message → X
```

## Message delay

The message eventually arrives, but much later.

## Byzantine failure

A node behaves arbitrarily or maliciously.

```text
A → says X to B
A → says Y to C
```

These different failure models produce different algorithms.

---

# 46. Distributed communication

You need to understand:

```text
Node A
  |
  | message
  ↓
Network
  |
  ↓
Node B
```

Unlike shared memory, you cannot assume instantaneous communication.

There can be:

```text
delay
loss
duplication
reordering
failure
```

---

# 47. Logical clocks

Physical clocks aren't sufficient for many distributed algorithms.

Imagine:

```text
Node A                Node B

Event A1
   |
   | message
   └──────────────→ Event B1
```

We want to know:

```text
A1 happened before B1
```

Lamport clocks provide a logical ordering mechanism.

---

# 48. Lamport clocks

Each process maintains a counter.

Conceptually:

```text
Event → increment clock
Send  → attach timestamp
Receive → update clock
```

A simplified rule:

```text
receive timestamp T

clock = max(clock, T) + 1
```

This gives a logical ordering of events.

Important:

> Lamport timestamps can establish ordering consistent with causality, but they cannot by themselves tell you that two events are truly concurrent.

---

# 49. Vector clocks

Vector clocks provide more information.

For three nodes:

```text
A = [1,0,0]
B = [0,1,0]
C = [0,0,1]
```

They allow you to reason about causality and concurrency more precisely than scalar Lamport clocks.

Learn:

* Vector timestamp
* Causality
* Concurrent events
* Partial ordering

This becomes important in distributed databases and eventually consistent systems.

---

# 50. Distributed mutual exclusion

Suppose multiple nodes want access to one distributed resource.

```text
Node A ─┐
Node B ─┼── Critical Section
Node C ─┘
```

Only one should enter at a time.

There is no single shared lock.

Algorithms include:

* Lamport mutual exclusion
* Ricart-Agrawala
* Token ring

---

# 51. Leader election

Distributed systems often need one node to act as coordinator.

```text
Node 1
Node 2
Node 3 ← Leader
Node 4
Node 5
```

If Node 3 fails:

```text
Node 3 → DEAD
```

the remaining nodes must elect another leader.

Study:

* Bully algorithm
* Ring election

This is excellent preparation for Raft.

---

# 52. Distributed snapshots

How do you take a snapshot of a distributed system when there is no single global clock?

You want:

```text
Global State =
    Local state of A
  + Local state of B
  + Local state of C
  + Channel state
```

The **Chandy-Lamport snapshot algorithm** addresses this problem under its communication assumptions.

Learn:

* Marker messages
* Local state
* Channel state
* Consistent global state
* Distributed snapshot

---

# 53. Distributed deadlocks

Suppose:

```text
Node A waits for Node B
Node B waits for Node C
Node C waits for Node A
```

You have a cycle:

```text
A → B → C → A
```

Nobody can proceed.

Study:

* Wait-for graphs
* Detection
* Prevention
* Recovery

Distributed deadlock detection is harder because the information is spread across machines.

---

# 54. Failure detection

A major problem:

Suppose Node A sends to Node B.

No response.

What happened?

```text
A ──────→ B
```

Possibilities:

1. B crashed.
2. Network failed.
3. Message was lost.
4. B is slow.
5. Response was lost.

A timeout does not magically tell you which one happened.

This uncertainty is fundamental to distributed systems.

Learn:

* Heartbeats
* Timeouts
* Failure detectors
* Suspicion
* Leader monitoring

---

# PART VI — ADVANCED DISTRIBUTED ALGORITHMS

# 55. Consensus

Consensus asks multiple nodes to agree on a value despite failures.

Imagine:

```text
Node A → "X"
Node B → "X"
Node C → "X"
```

They must eventually agree.

Typical properties include:

### Agreement

Correct nodes don't decide conflicting values.

### Validity

The chosen value has an appropriate relationship to proposed values.

### Termination

Correct nodes eventually decide under the algorithm's assumptions.

Consensus is one of the central problems of distributed computing.

---

# 56. Why consensus is difficult

Imagine:

```text
Node A
   |
   X
Network failure
   X
   |
Node B
```

A doesn't know whether B:

* crashed
* is slow
* lost the message
* is partitioned

Yet they need to coordinate.

This leads to deep theoretical results such as the **FLP impossibility result** under its specific asynchronous model and failure assumptions.

You should study FLP **before** trying to memorize Paxos.

---

# 57. Paxos

Paxos is a family of consensus algorithms/protocols.

The simplified conceptual roles are:

```text
Proposer
Acceptor
Learner
```

You need to understand:

```text
Prepare
   ↓
Promise
   ↓
Accept
   ↓
Accepted
   ↓
Learn
```

Don't start by coding Paxos.

First understand:

1. The problem.
2. Failure scenarios.
3. Safety.
4. Proposal numbers.
5. Quorums.
6. Why majority agreement matters.
7. How conflicting proposals are handled.

Then implement a simplified version.

---

# 58. Raft

Raft is designed to make consensus easier to understand and implement.

Node states:

```text
Follower
   ↓
Candidate
   ↓
Leader
```

The leader manages replicated log entries.

```text
Client
   |
   ↓
Leader
   |
   +--------→ Follower
   |
   +--------→ Follower
```

Learn:

* Terms
* Elections
* `RequestVote`
* `AppendEntries`
* Log replication
* Commit index
* Leader changes
* Safety
* Persistence
* Recovery

Raft is an excellent major Java project.

---

# 59. Replication

Replication means keeping multiple copies of data/state.

Example:

```text
             Primary
            /       \
           ↓         ↓
       Replica 1   Replica 2
```

Why?

* Availability
* Fault tolerance
* Performance
* Durability

But replication introduces consistency problems.

---

# 60. Consistency

Suppose:

```text
Node A → balance = ₹100
Node B → balance = ₹100
```

A client updates A:

```text
balance = ₹50
```

Now:

```text
A = ₹50
B = ₹100
```

What should another client see?

That's a consistency question.

Study:

* Linearizability
* Sequential consistency
* Causal consistency
* Eventual consistency

---

# 61. Linearizability

Very important.

A linearizable operation appears to happen atomically at some point between invocation and response, while respecting real-time ordering.

Conceptually:

```text
Client
  |
  | write X
  ↓
System
  |
  | response
  ↓
Client
```

Later operations should observe a result consistent with that operation having taken effect at a valid point in time.

This is one of the most important consistency concepts to understand deeply.

---

# 62. Eventual consistency

With eventual consistency, replicas may temporarily disagree:

```text
A = 10
B = 20
C = 10
```

But if updates stop and communication continues, they eventually converge under the system's guarantees.

This is common in highly distributed architectures where availability and scalability are prioritized.

---

# 63. Transactions

A transaction groups operations into a unit.

Database ACID:

```text
A = Atomicity
C = Consistency
I = Isolation
D = Durability
```

Distributed transactions are harder because participants communicate over a network.

---

# 64. Two-Phase Commit

2PC:

```text
             Coordinator
              /       \
             ↓         ↓
        Participant Participant
```

### Phase 1

Prepare:

```text
Coordinator → Prepare
Participants → Yes/No
```

### Phase 2

If everyone agrees:

```text
Coordinator → Commit
```

Otherwise:

```text
Coordinator → Abort
```

The important lesson is not merely how 2PC works, but why it can block and why distributed transactions have difficult failure modes.

---

# 65. Distributed Hash Tables

A DHT distributes key/value mappings across nodes.

Instead of:

```text
HashMap
```

inside one machine:

```text
key → value
```

you have:

```text
             DHT
       /      |      \
    Node A  Node B  Node C
```

Keys are distributed among nodes.

Study:

* Hashing
* Consistent hashing
* Node joining
* Node leaving
* Key redistribution
* Replication

---

# 66. Chord

Chord is a classic structured DHT.

Learn:

* Identifier space
* Ring
* Successor
* Predecessor
* Finger table
* Lookup
* Node join
* Node departure

A simplified picture:

```text
       Node A
      /      \
 Node D      Node B
      \      /
       Node C
```

The important idea is that nodes can locate responsible nodes without contacting every machine.

---

# 67. Fault tolerance

Fault tolerance means the system continues operating despite certain failures.

Techniques include:

```text
Replication
    +
Failover
    +
Retries
    +
Timeouts
    +
Recovery
    +
Checkpointing
```

For example:

```text
Leader
   ↓
FAILS

Follower
   ↓
New Leader
```

This is central to systems such as Raft clusters.

---

# 68. MapReduce

MapReduce divides large data processing into two conceptual stages.

```text
Input
  ↓
MAP
  ↓
Shuffle
  ↓
REDUCE
  ↓
Output
```

Example word count:

```text
"cat dog cat"
```

Map:

```text
(cat,1)
(dog,1)
(cat,1)
```

Reduce:

```text
cat → 2
dog → 1
```

Study:

* Map
* Shuffle
* Partition
* Reduce
* Fault tolerance
* Data locality

Then build your own simplified MapReduce engine.

---

# 69. Distributed graph algorithms

Now combine:

```text
Graphs
+
Parallelism
+
Distributed communication
```

Study:

* Distributed BFS
* Distributed shortest paths
* Distributed connected components
* Distributed MST
* PageRank
* Distributed graph processing models

You should understand how graph computation changes when the graph doesn't fit inside one machine.

---

# 70. Byzantine Fault Tolerance

This is an advanced level.

A Byzantine node can behave arbitrarily.

For example:

```text
Node A → "X" to B
Node A → "Y" to C
Node A → nothing to D
```

The system must still reach reliable conclusions under the algorithm's assumptions.

Study:

* Byzantine generals problem
* Byzantine failures
* Byzantine agreement
* PBFT concepts
* Quorums
* Authentication assumptions

Do this **after** mastering ordinary crash-failure consensus.

---

# PART VII — PROJECTS

# 71. Distributed Key-Value Store

Your first serious distributed project.

API:

```text
PUT(key, value)
GET(key)
DELETE(key)
```

Start with:

```text
Node 1
Node 2
Node 3
```

Then add:

```text
Replication
Leader
Failure detection
Recovery
```

Eventually:

```text
Client
  |
  ↓
Leader
 /    \
↓      ↓
N2     N3
```

---

# 72. Raft Cluster

This should be your flagship project.

Build:

```text
Node 1
Node 2
Node 3
Node 4
Node 5
```

Implement:

```text
Follower
Candidate
Leader
```

Then:

```text
Election
   ↓
Leader
   ↓
Client request
   ↓
Replicate log
   ↓
Majority
   ↓
Commit
```

Then deliberately kill the leader.

Your system should elect another leader.

This one project teaches an enormous amount.

---

# 73. MapReduce Engine

Build:

```text
Master
  |
  +── Worker 1
  +── Worker 2
  +── Worker 3
  +── Worker 4
```

Master assigns jobs.

Workers execute:

```text
Map
 ↓
Intermediate data
 ↓
Reduce
```

Then add worker failure.

For example:

```text
Worker 2 → FAILED
```

Master should detect it and reassign work.

---

# 74. Distributed Database

This is significantly more advanced.

Eventually combine:

```text
Storage
+
Partitioning
+
Replication
+
Consensus
+
Transactions
+
Recovery
```

Architecture:

```text
                   Client
                     |
                     ↓
                Coordinator
                 /   |   \
                ↓    ↓    ↓
               N1   N2   N3
               ↕    ↕    ↕
              Storage
```

Don't start here.

This should be one of your final projects.

---

# 75. Fault-Tolerant Service

Build a service that survives failures.

For example:

```text
Client
   |
Load Balancer
   |
   +-------+
   |       |
  S1      S2
   |       |
   +---+---+
       |
    Storage
```

Introduce failures:

```text
S1 crashes
```

The service should continue through S2.

Then:

```text
Network partition
```

Then:

```text
Storage failure
```

This is where your theoretical knowledge becomes engineering skill.

---

# 76. The order I recommend for actual learning

Don't study your diagram simply from top to bottom without depth.

Use these levels.

## Level 1 — Java

Master:

```text
Java
OOP
Collections
Data Structures
Algorithms
Complexity
```

**Goal:** You can solve ordinary algorithmic problems comfortably.

---

## Level 2 — Concurrency

Master:

```text
Threads
Race Conditions
Locks
Synchronization
Atomic Operations
JMM
Concurrent Collections
Executors
```

**Goal:** You can write correct multithreaded Java code.

---

## Level 3 — Parallel algorithms

Master:

```text
Fork/Join
Data Parallelism
Task Parallelism
Divide & Conquer
Parallel Sorting
Reduction
Prefix Sum
Parallel Graph Algorithms
Speedup
Efficiency
Amdahl
Gustafson
```

**Goal:** You can take an algorithm and reason about how to parallelize it.

---

## Level 4 — Networking

Master:

```text
TCP
UDP
Sockets
Message Passing
Serialization
RPC
Timeouts
Retries
```

**Goal:** You can build multiple Java processes that communicate.

---

## Level 5 — Distributed fundamentals

Master:

```text
Failure Models
Message Ordering
Lamport Clocks
Vector Clocks
Mutual Exclusion
Leader Election
Snapshots
Deadlocks
Failure Detection
```

**Goal:** You understand why distributed algorithms are difficult.

---

## Level 6 — Consensus and replication

Master:

```text
Consensus
FLP
Paxos
Raft
Replication
Linearizability
Consistency
Quorums
```

**Goal:** You understand how distributed nodes coordinate and maintain replicated state.

---

## Level 7 — Advanced systems

Master:

```text
Transactions
2PC
DHT
Consistent Hashing
Fault Tolerance
MapReduce
Distributed Graph Algorithms
Byzantine Fault Tolerance
```

**Goal:** You can reason about real distributed architectures.

---

# 77. The most important concepts to understand deeply

If you're studying for an exam, interview, research, or serious engineering, don't treat every topic equally.

These deserve **very deep understanding**:

### Java

```text
Collections
Generics
Threads
Synchronization
JMM
Executors
```

### Algorithms

```text
Complexity
Divide & Conquer
Graphs
Parallel algorithms
```

### Parallel

```text
Data vs task parallelism
Fork/Join
Work stealing
Reduction
Prefix sum
Speedup
Efficiency
Amdahl's Law
```

### Distributed

```text
Message passing
Failure models
Lamport clocks
Vector clocks
Mutual exclusion
Leader election
Snapshots
Consensus
Replication
Consistency
Fault tolerance
```

### Advanced

```text
Paxos
Raft
Quorums
2PC
DHT
MapReduce
Byzantine fault tolerance
```

---

# 78. How to approach every distributed algorithm

For **every algorithm**, use this exact template:

```text
1. Problem
2. System model
3. Assumptions
4. Failure model
5. Inputs
6. Outputs
7. Messages
8. Algorithm steps
9. Example execution
10. Correctness
11. Safety
12. Liveness
13. Complexity
14. Communication cost
15. Failure scenarios
16. Java implementation
17. Testing
18. Limitations
```

For example, when learning Raft, don't just memorize:

```text
RequestVote
AppendEntries
```

Ask:

```text
What problem does Raft solve?

What happens if the leader crashes?

What happens if two candidates start an election?

What happens if a message is delayed?

Why does a majority matter?

Why can't two different leaders safely commit conflicting entries?

What happens after a node restarts?
```

That is how you develop **distributed-algorithm thinking**.

---

# 79. Your final mental model

Eventually, you should see the entire field like this:

```text
                         COMPUTING
                            │
             ┌──────────────┴──────────────┐
             │                             │
        Single Machine                Multiple Machines
             │                             │
             ↓                             ↓
          Threads                     Networking
             │                             │
             ↓                             ↓
       Concurrency                  Distribution
             │                             │
             ↓                             ↓
       Parallelism                Distributed Algorithms
             │                             │
             │                ┌────────────┼────────────┐
             │                ↓            ↓            ↓
             │            Ordering     Consensus    Replication
             │                │            │            │
             │                ↓            ↓            ↓
             │             Clocks        Raft       Consistency
             │                             │
             └──────────────┬──────────────┘
                            ↓
                    Fault Tolerant Systems
                            │
             ┌──────────────┼───────────────┐
             ↓              ↓               ↓
           DHT           MapReduce       Database
             │              │               │
             └──────────────┼───────────────┘
                            ↓
                    Distributed Systems
```

The key progression is:

> **Java teaches you how to program.**
> **Data structures and algorithms teach you how to solve problems.**
> **Concurrency teaches you how multiple tasks interact.**
> **Parallel computing teaches you how to accelerate computation.**
> **Networking teaches you how programs communicate.**
> **Distributed algorithms teach you how independent machines coordinate.**
> **Consensus, replication, and fault tolerance teach you how to make that coordination survive failures.**

If you follow that progression rather than jumping directly into Raft/Paxos, the advanced topics become much easier to understand.
