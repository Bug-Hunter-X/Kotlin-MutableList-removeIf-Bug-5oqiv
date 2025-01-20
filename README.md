# Kotlin MutableList removeIf Bug
This repository demonstrates a subtle bug in Kotlin when using the `removeIf` function on a `MutableList`.  The `removeIf` function modifies the list in place while iterating, potentially leading to elements being skipped or unexpected results.

The `bug.kt` file contains the buggy code, and `bugSolution.kt` provides a corrected version.

## Bug Description
The bug occurs because `removeIf` modifies the list while it's being iterated over.  When an element is removed, the indices of subsequent elements shift, potentially causing `removeIf` to skip elements.

## Solution
The solution involves creating a copy of the list before applying the `removeIf` operation. This ensures that the iteration isn't affected by the list's modification.