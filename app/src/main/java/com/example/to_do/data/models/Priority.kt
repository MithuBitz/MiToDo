package com.example.to_do.data.models

import android.graphics.Color
import com.example.to_do.ui.theme.HighPriorityColor
import com.example.to_do.ui.theme.LowPriorityColor
import com.example.to_do.ui.theme.MediumPriorityColor
import com.example.to_do.ui.theme.NonePriorityColor

enum class Priority(val color: androidx.compose.ui.graphics.Color) {

    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)

}