package lecture19

/**
 *
 * Kotlin Collections Hierarchy (Immutable)
 * =============================
 *
 *                               Iterable<T>
 *                                    |
 *                            -------------------
 *                            |
 *                     Collection<T>
 *                            |
 *                    ----------------
 *                    |              |
 *              List<T>           Set<T>
 *                    |              |
 *           ----------------   ---------------
 *           |              |   |             |
 *       ArrayList       LinkedList         HashSet
 *                                            |
 *                                       LinkedHashSet
 *
 *
 *         Mutable side (inherits from read-only)
 *         --------------------------------------
 *                                  Iterable<T>
 *                                     |
 *                              -------------------
 *                              |                 |
 *
 *                       Collection<T>          MutableIterable<T>
 *                                |             |
 *                              MutableCollection<T>
 *                                       |
 *                  -------------------------------------------
 *                  |                    |                    |
 *             MutableList<T>       MutableSet<T>            MutableQueue<T>*
 *                  |                    |
 *         --------------------       ------------------------
 *         |                  |           |                 |
*    ArrayList         LinkedList      HashSet            LinkedHashSet
 *
 *
 * Map Hierarchy (separate — NOT a Collection)
 * =============================================
 *
 *                                Map<K,V>
 *                                    |
 *                            -------------------------
 *                            |                       |
 *                   MutableMap<K,V>             SortedMap<K,V>
 *                            |
 *                  ---------------------------
 *                  |                         |
 *              HashMap                   LinkedHashMap
 *                                                |
 *                                             TreeMap
 *
 *
 *
 *
 */