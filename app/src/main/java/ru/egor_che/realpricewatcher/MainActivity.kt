package ru.egor_che.realpricewatcher

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.egor_che.realpricewatcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewBinding - современный способ работы с layout
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Инициализируем ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        // Кнопка "Добавить товар"
        binding.btnAddProduct.setOnClickListener {
            Toast.makeText(this, "Добавление товара...", Toast.LENGTH_SHORT).show()
            // TODO: Открыть диалог добавления
        }

        // Кнопка "Проверить цены"
        binding.btnCheckPrices.setOnClickListener {
            Toast.makeText(this, "Проверка цен...", Toast.LENGTH_SHORT).show()
            checkAllPrices()
        }

        // Кнопка "Настройки"
        binding.btnSettings.setOnClickListener {
            Toast.makeText(this, "Настройки...", Toast.LENGTH_SHORT).show()
            // TODO: Открыть настройки
        }
    }

    private fun checkAllPrices() {
        // Временная заглушка
        binding.tvStatus.text = "Функция проверки цен в разработке"
    }
}