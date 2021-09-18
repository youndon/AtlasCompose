package compose.foundation

import androidx.compose.foundation.MutatePriority

private enum class MutatePriority {

    /**
     * The default priority for mutations. Can be interrupted by other [Default], [UserInput] or
     * [PreventUserInput] priority operations.
     * [Default] priority should be used for programmatic animations or changes that should not
     * interrupt user input.
     */
    Default,

    /**
     * An elevated priority for mutations meant for implementing direct user interactions.
     * Can be interrupted by other [UserInput] or [PreventUserInput] priority operations.
     */
    UserInput,

    /**
     * A high-priority mutation that can only be interrupted by other [PreventUserInput] priority
     * operations. [PreventUserInput] priority should be used for operations that user input should
     * not be able to interrupt.
     */
    PreventUserInput
}