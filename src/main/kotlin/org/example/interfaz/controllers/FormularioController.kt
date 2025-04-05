package org.example.interfaz.controllers

import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

class FormularioController {
    @FXML
    private lateinit var holaButtton: Button

    @FXML
    private lateinit var nombreText: TextField

    @FXML
    private lateinit var nombreLabel: Label

    private var clickCount = 0

    @FXML
    private fun initialize() {
        initEvents()
    }

    @FXML
    private fun initEvents() {
        holaButtton.onMouseClicked = EventHandler { event -> onClick() }
        holaButtton.onMouseEntered = EventHandler { event -> mouseClick() }
    }

    private fun mouseClick() {
        clickCount++
    }

    @FXML
    private fun onClick() {
        if (clickCount >= 1) {
            nombreLabel.text = ("${holaButtton.text} ${nombreText.text}")
        }
    }
}

