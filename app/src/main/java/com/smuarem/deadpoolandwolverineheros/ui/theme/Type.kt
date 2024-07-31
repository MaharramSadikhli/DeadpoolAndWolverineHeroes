package com.smuarem.deadpoolandwolverineheros.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.smuarem.deadpoolandwolverineheros.R

val MarvelFont = FontFamily(Font(R.font.marvel_regular))
val MarvelItalicFont = FontFamily(Font(R.font.marvel_italic, FontWeight.Normal, FontStyle.Italic))
val MarvelBoldFont = FontFamily(Font(R.font.marvel_bold, FontWeight.Bold))
val MarvelBoldItalicFont = FontFamily(Font(R.font.marvel_bold_italic, FontWeight.Bold, FontStyle.Italic))


// Set of Material typography styles to start with
val Typography = Typography(
    /**
     * Font For Hero Description
     */
    bodyLarge = TextStyle(
        fontFamily = MarvelFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.5.sp
    ),
    /**
        * Font For Top App Bar
    */
    displayLarge = TextStyle(
        fontFamily = MarvelBoldFont,
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp,
    ),
    /**
     * Font For Hero Name
     */
    displayMedium = TextStyle(
        fontFamily = MarvelBoldItalicFont,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        fontSize = 30.sp,
    ),
    /**
     * Font For Actor Name
     */
    displaySmall = TextStyle(
        fontFamily = MarvelItalicFont,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
        fontSize = 26.sp,
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)