package components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Android
import androidx.compose.material.icons.twotone.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation

object Fields {
    @Composable fun fs() {
        val rem = remember { mutableStateOf("") }
        //
        TextField(
            value = rem.value,
            onValueChange = { rem.value = it },
            modifier = Modifier,
            enabled = true,
            readOnly = false,
            textStyle = LocalTextStyle.current,
            label = { Text("this is text field!") },
            placeholder = { Text("user input.") },
            leadingIcon = { Icon(Icons.TwoTone.Image,null) },
            trailingIcon = { Icon(Icons.Rounded.Android,null) },
            isError = false,
            visualTransformation = VisualTransformation.None, // PasswordVisualTransformation() for password input.
            keyboardOptions = KeyboardOptions.Default,
            keyboardActions = KeyboardActions.Default,
            singleLine = false,
            maxLines = 200,
            interactionSource = remember { MutableInteractionSource() },
            shape = MaterialTheme.shapes.small.copy(bottomEnd = ZeroCornerSize, bottomStart = ZeroCornerSize),
            colors = TextFieldDefaults
                .textFieldColors(
                    textColor = LocalContentColor.current.copy(LocalContentAlpha.current),
                    disabledTextColor = LocalContentColor.current.copy(ContentAlpha.disabled),
                    backgroundColor = MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.BackgroundOpacity),
                    cursorColor = MaterialTheme.colors.primary,
                    errorCursorColor = MaterialTheme.colors.error,
                    focusedIndicatorColor = MaterialTheme.colors.primary.copy(alpha = ContentAlpha.high),
                    unfocusedIndicatorColor = MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.UnfocusedIndicatorLineOpacity),
                    disabledIndicatorColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
                    errorIndicatorColor = MaterialTheme.colors.error,
                    leadingIconColor = MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.IconOpacity),
                    disabledLeadingIconColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
                    errorLeadingIconColor = MaterialTheme.colors.onSurface,
                    trailingIconColor = MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.IconOpacity),
                    disabledTrailingIconColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
                    errorTrailingIconColor = MaterialTheme.colors.error,
                    focusedLabelColor = MaterialTheme.colors.primary.copy(alpha = ContentAlpha.high),
                    unfocusedLabelColor = MaterialTheme.colors.onSurface.copy(ContentAlpha.medium),
                    disabledLabelColor = MaterialTheme.colors.onSurface.copy(ContentAlpha.disabled),
                    errorLabelColor = MaterialTheme.colors.error,
                    placeholderColor = MaterialTheme.colors.onSurface.copy(ContentAlpha.medium),
                    disabledPlaceholderColor = MaterialTheme.colors.onSurface.copy(ContentAlpha.disabled)
                )
        )
        //
        BasicTextField(value = rem.value,
            onValueChange = {rem.value = it},
        )
        //
        OutlinedTextField("out line field", {})

    }
}