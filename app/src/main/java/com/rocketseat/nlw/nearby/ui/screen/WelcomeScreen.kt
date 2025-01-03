package com.rocketseat.nlw.nearby.ui.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rocketseat.nlw.nearby.ui.components.button.NearbyButton
import com.rocketseat.nlw.nearby.ui.components.welcome.WelcomeContent
import com.rocketseat.nlw.nearby.ui.components.welcome.WelcomeHeader
import com.rocketseat.nlw.nearby.ui.theme.Gray500
import com.rocketseat.nlw.nearby.ui.theme.RedBase
import com.rocketseat.nlw.nearby.ui.theme.Typography

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.White)
            .padding(horizontal = 40.dp, vertical = 48.dp)
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        WelcomeHeader()
        WelcomeContent()
        NearbyButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Começar",
            onClick = {}
        )
    }
}


@Composable
fun WelcomeHowItWorksTip(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    @DrawableRes iconRes: Int
) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = iconRes),
            tint = RedBase,
            contentDescription = "Ícone Como funciona"
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = title, style = Typography.headlineSmall)
            Text(text = subtitle, color = Gray500, style = Typography.bodyLarge)
        }
    }
}


@Preview
@Composable
private fun WelcomeScreenPreview() {
    WelcomeScreen()
}