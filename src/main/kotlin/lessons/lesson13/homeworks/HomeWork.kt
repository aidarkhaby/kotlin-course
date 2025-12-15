package org.example.lessons.lesson13.homeworks

class HomeWork {

    //Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val autotestsMap = mapOf("ScreenTest" to 2, "LostInternetTest" to 7, "PageTest" to 5)
    val averageTestTime = autotestsMap.values.average()

    //Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val metaData = mapOf("ТестМетод1" to "Метаданные1", "ТестМетод2" to "Метаданные2", "ТестМетод3" to "Метаданные3")
    val testMethods = metaData.keys.toList()

    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    fun addTestResult(testResults: MutableMap<String, String>, testName: String, result: String) {
        testResults[testName] = result
    }

    //Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val resultMap = mapOf("Тест1" to "passed", "Тест2" to "failed", "Тест3" to "skipped")
    val countPassedTest = resultMap.values.count { it == "passed" }

    //Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    fun ex5(){
        val bugMap = mutableMapOf("bug1" to "in progress", "bug2" to "done", "bug3" to "to do")
        bugMap.remove("bug2", "done")
    }

    //Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    fun ex6(){
        val map6 = mapOf("page1" to 200, "page2" to 404, "page3" to 500)
        println(map6)
    }

    //Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    fun ex7(){
        val map7 = mapOf("сервис1" to 2, "сервис2" to 3, "сервис3" to 1)
        println(map7.filter{it.value > 1})
    }

    //В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    fun ex8(){
        val map8 = mapOf("endpoint1" to "200", "endpoint2" to "200", "endpoint3" to "500")
        map8.getOrDefault("endpoint1", "Не протестирован")
    }

    //Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    fun ex9(){
        val map8 = mapOf("parametr1" to "config1", "parametr2" to "config2", "browserType" to "config3")
        println(map8.getValue("browserType"))
    }

    //Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    fun ex10(){
        val map8 = mapOf("version1" to "01.02.2025", "version2" to "06.03.2025", "version3" to "10.08.2025")
        val map8Copy = map8 + ("version4" to "01.10.2025")
    }

    //Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    fun ex11(){
        val map8 = mapOf("iphone13" to "settings1", "samsung galaxy" to "settings2", "nokia_3310" to "settings3")
        val settingsForXiaomi = map8.getOrDefault("xiaomi", "defaultSettings")
    }

    //Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    fun ex12(){
        val map8 = mapOf("400" to "Bad Request", "401" to "Unauthorized", "404" to "Not Found")
      //  println(map8.containsKey(500))
    }

    //Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    fun ex13(){
        val map8 = mapOf("101_1.1" to "Passed", "102_2.0" to "Failed", "103_1.1" to "Skipped")
        map8.filterKeys { it.contains("1.1") }
    }

    //У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    fun ex14(){
        val mapExample = mapOf("модуль1" to "Passed", "модуль2" to "Failed", "модуль3" to "Skipped")
        println(mapExample.containsValue("Failed"))
    }

    //Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    fun ex15(){
        val mapExample = mutableMapOf("iphone13" to "settings1", "samsung galaxy" to "settings2", "nokia_3310" to "settings3")
        mapExample.putAll(mapOf("huawei" to "settings999"))
    }

    //Объедините два неизменяемых словаря с данными о багах.
    fun ex16(){
        val mapExample1 = mapOf("bug1" to "in progress", "bug2" to "done", "bug3" to "to do")
        val mapExample2 = mapOf("bug4" to "in progress", "bug5" to "done", "bug6" to "to do")
        val mapExample3 = mapExample1 + mapExample2
    }

    //Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    fun ex17(){
        val mapExample = mutableMapOf("прогон1" to 4, "прогон1" to 8, "прогон1" to 5)
        mapExample.clear()
    }

    //Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    fun ex18(){
        val mapExample = mutableMapOf("Тест1" to "passed", "Тест2" to "failed", "Тест3" to "skipped")
        mapExample.filterNot { it.value == "skipped"}
    }

    //Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    fun ex19(){
        val mapExample = mapOf("parametr1" to "config1", "parametr2" to "config2", "browserType" to "config3")
        val mapCopy = mapExample - listOf("parametr1")
    }

    //Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    fun ex20(){
        val mapExample = mutableMapOf("Тест1" to "passed", "Тест2" to "failed", "Тест3" to "skipped")
        val listResult = mutableListOf<String>()
        mapExample.forEach {
            listResult.add("${it.key}: ${it.value}")
        }
        println(listResult)
    }

    // 21. Преобразование в неизменяемый словарь
    fun archiveTestResults(mutableResults: MutableMap<String, String>): Map<String, String> {
        return mutableResults.toMap()
    }

    // 22. Замена числовых ID на строковые
    fun convertTestIdsToString(testData: Map<Int, Double>): Map<String, Double> {
        return testData.mapKeys { it.key.toString() }
    }

    // 23. Увеличение оценок на 10%
    fun adjustPerformanceScores(performance: Map<String, Double>): Map<String, Double> {
        return performance.mapValues { it.value * 1.1 }
    }

    // 24. Проверка пустоты словаря с ошибками
    fun areCompilationErrorsEmpty(errorDict: Map<String, String>): Boolean {
        return errorDict.isEmpty()
    }

    // 25. Проверка непустоты словаря нагрузочного тестирования
    fun hasLoadTestResults(loadTestResults: Map<String, Any>): Boolean {
        return loadTestResults.isNotEmpty()
    }

    // 26. Проверка успешности всех тестов
    fun areAllTestsPassed(testResults: Map<String, String>): Boolean {
        return testResults.values.all { it == "passed" }
    }

    // 27. Проверка наличия тестов с ошибкой
    fun hasAnyTestFailed(testResults: Map<String, String>): Boolean {
        return testResults.values.any { it == "failed" }
    }

    // 28. Фильтрация неудачных optional тестов
    fun findFailedOptionalTests(serviceTests: Map<String, String>): Map<String, String> {
        return serviceTests.filter { (key, value) ->
            value == "failed" && "optional" in key.toLowerCase()
        }
    }

}