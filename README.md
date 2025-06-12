# Stamsoft Design System Library

Welcome to the **Stamsoft Design System Library** – a modular, lightweight, and scalable UI component kit built with **Jetpack Compose** for Android development.

This library provides a cohesive set of components, typography styles, theme tokens, and a custom theming engine that aligns with **Stamsoft's** visual and UX principles.

> Whether you're starting a new feature or building a full app UI, this library ensures **consistency**, **reusability**, and **developer productivity** across teams.

## 🛠️ Installation

This library is published as a **private GitHub Package** and can be used by any developer with access to the `Stamsoft-ltd` GitHub organization.

### 1. Authenticate to GitHub Packages

You'll need a **GitHub Personal Access Token (PAT)** with the following scope:

- `read:packages`

Create a token [here](https://github.com/settings/tokens), then add the following to your `~/.gradle/gradle.properties` file:

```
gpr.user=YOUR_GITHUB_USERNAME
gpr.key=YOUR_GITHUB_PAT
```

### 2. Add the GitHub Maven repository

Add the following to your **`settings.gradle.kts`** file:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Stamsoft-ltd/Android-Library---Design-System")
            credentials {
                username = providers.gradleProperty("gpr.user").get()
                password = providers.gradleProperty("gpr.key").get()
            }
        }
        google()
        mavenCentral()
    }
}

### 3. Add the dependency

In your **module-level `build.gradle.kts`** (usually `app/build.gradle.kts`), add the library to your dependencies block:

```
dependencies {
    implementation("com.stamsoft:designsystem:1.1")
}
```

🔄 Replace 1.1 with the latest version

## 🔍 Quick Overview

This library provides a complete set of reusable, theme-aware UI components and design primitives built with **Jetpack Compose**, following Stamsoft’s internal design guidelines.

### 🎨 Theming System
- `MyApplicationTheme`: Centralized app theming with light/dark mode support
- Custom `Colors` class with full palette: primary, secondary, alert, success, neutral, gradient, etc.
- Material 3 color scheme integration

### 🧱 Typography
Semantic text components based on font size and usage context:
- **Headings:** `H1` – `H6`
- **Body text:** `Body1Regular`, `Body1Bold`, `Body1Medium`, `Body2Regular`
- **Buttons:** `ButtonRegular`, `ButtonBold`, `ButtonLink`
- **Labels & Feedback:** `LabelRegular`, `LabelTabBar`, `LabelActive`, `ErrorMessageTextInput`

### 🔘 Buttons
Fully styled, gradient-enabled button components:
- `PrimaryButton`
- `ButtonWithIcon`

### 📐 Design Tokens
Centralized styling constants:
- `SpaceTokens` – spacing from `2.dp` to `80.dp`
- `BorderRadiusToken` – radius presets including pill shapes
- `FontSizeTokens` – consistent text sizing
- `LineHeightTokens` – line height control
- `LineWeightTokens` – font weights
- `FractionTokens` – fractional values for sizing/layout

> 🧩 All components are theme-aware and built with composability in mind for easy extension and reuse.

## 🚀 Getting Started

Follow these examples to quickly integrate the design system into your app.

### 🧩 1. Apply the Theme in `MainActivity`

Wrap your UI in `MyApplicationTheme` to enable custom colors and dark mode support:

```
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.compose.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.designssystem.designsystem.MyApplicationTheme
import com.designssystem.designsystem.DefaultColors
import com.yourapp.ui.MainScreen // your composable screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyApplicationTheme(
                darkTheme = isSystemInDarkTheme(),
                lightColors = DefaultColors,
                darkColors = DefaultColors,
            ) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
```

Add your MainScreen and call your wished UI components:

```
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.designssystem.designsystem.PrimaryButton
import com.designssystem.designsystem.R

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    PrimaryButton(
        modifier = modifier,
        text = "Get Started",
        font = R.font.your_font, // replace with your font resource
        onClick = { /* Handle click */ }
    )
}
```
