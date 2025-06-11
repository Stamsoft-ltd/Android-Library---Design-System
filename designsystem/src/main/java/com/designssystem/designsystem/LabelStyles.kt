package com.designssystem.designsystem


import androidx.annotation.FontRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun LabelActive(text: String, color: Color = LocalDSTheme.current.colors.base0, textAlign: TextAlign? = null, @FontRes font: Int) {
    Text(
        text = text,
        fontSize = FontSizeTokens.font_size_50,
        fontWeight = LineWeightTokens.line_weight_100,
        color = color,
        textAlign = textAlign,
        fontFamily = FontFamily(Font(font)),
    )
}

@Composable
fun LabelRegular(
    text: String,
    color: Color = LocalDSTheme.current.colors.base0,
    textDecoration: TextDecoration = TextDecoration.None,
    overflow: TextOverflow = TextOverflow.Clip,
    @FontRes font: Int,
    textAlign: TextAlign? = null,
) {
    Text(
        text = text,
        fontSize = FontSizeTokens.font_size_100,
        fontWeight = LineWeightTokens.line_weight_100,
        color = color,
        fontFamily = FontFamily(Font(font)),
        textDecoration = textDecoration,
        overflow = overflow,
        textAlign = textAlign,
    )
}

@Composable
fun LabelTabBar(text: String, color: Color = LocalDSTheme.current.colors.base0, textAlign: TextAlign? = null, @FontRes font: Int) {
    Text(
        text = text,
        fontSize = FontSizeTokens.font_size_50,
        fontWeight = LineWeightTokens.line_weight_100,
        lineHeight = LineHeightTokens.line_height_50,
        color = color,
        textAlign = textAlign,
        fontFamily = FontFamily(Font(font)),
    )
}

@Composable
fun ErrorMessageTextInput(
    text: String,
    color: Color = LocalDSTheme.current.colors.base0,
    textAlign: TextAlign? = null,
    @FontRes font: Int,
) {
    Text(
        text = text,
        fontSize = FontSizeTokens.font_size_50,
        fontWeight = LineWeightTokens.line_weight_100,
        lineHeight = LineHeightTokens.line_height_50,
        color = color,
        textAlign = textAlign,
        fontFamily = FontFamily(Font(font)),
    )
}
