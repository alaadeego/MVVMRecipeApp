package com.example.mvvmrecipeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.findNavController


class RecipeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Recipe List",
                        style = TextStyle(fontSize = 10.sp)
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {
                        findNavController().navigate(R.id.action_recipeListFragment_to_recipeFragment)
                    }) {
                        Text(text = "TO RECIPE FRAGMENT")
                    }


                }
            }
        }


    }


}


/* with XML


  /* val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
         return view*/

        //how to use compos inside fragment
        /*val view = ComposeView(requireContext())
        view.apply {
            setContent { Text(text = "Hey Look a composable") }
        }
        return  view*/

        // how to use custom view in compose
        // Add Composable inside XML
        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {

            Column(modifier = Modifier
                .border(border = BorderStroke(1.dp, Color.Blue))
                .padding(16.dp)
            ) {
                Text(text = "This is Composable inside Fragment")
                Spacer(modifier = Modifier.padding(16.dp))
                CircularProgressIndicator()
                Spacer(modifier = Modifier.padding(16.dp))
                Text(text = "Neat")
                Spacer(modifier = Modifier.padding(16.dp))
                //custom view in compose
                val customView = HorizontalDottedProgress(LocalContext.current)
                AndroidView({ customView })


            }
        }
        return view




 */