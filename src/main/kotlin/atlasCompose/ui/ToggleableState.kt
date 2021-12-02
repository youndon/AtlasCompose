package atlasCompose.ui

private enum class ToggleableState {
    /**
     * State that means a component is on
     */
    On,
    /**
     * State that means a component is off
     */
    Off,
    /**
     * State that means that on/off value of a component cannot be determined
     */
    Indeterminate
}