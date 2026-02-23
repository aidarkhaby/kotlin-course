package org.example.lessons.kaspresso.lesson06.homework

import org.hamcrest.Description
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.hamcrest.TypeSafeDiagnosingMatcher

data class GeometricShape(val sideLength: Float, val sides: Int, val color: Color)


class LengthRangeMatcher(
    private val expectedMinLength: Float,
    private val expectedMaxLength: Float,
) : TypeSafeDiagnosingMatcher<GeometricShape>() {

    override fun describeTo(description: Description) {
        description.appendText("Figure with side length from $expectedMinLength to $expectedMaxLength")
    }

    override fun matchesSafely(item: GeometricShape, mismatchDescription: Description): Boolean {
        if (item.sideLength !in expectedMinLength..expectedMaxLength) {
            mismatchDescription
                .appendText("length was ")
                .appendValue(item.sideLength)
            return false
        }
        return true
    }
}

class LengthNegativeSideMatcher() : TypeSafeDiagnosingMatcher<GeometricShape>() {

    override fun describeTo(description: Description) {
        description.appendText("Figure with positive side length")
    }

    override fun matchesSafely(item: GeometricShape, mismatchDescription: Description): Boolean {
        if (item.sideLength < 0) {
            mismatchDescription
                .appendText("Figure with negative side length")
                .appendValue(item.sideLength)
            return false
        }
        return true
    }
}

class ColorMatcher(
    private val expectedColor: Color
) : TypeSafeDiagnosingMatcher<GeometricShape>() {

    override fun describeTo(description: Description) {
        description.appendText("Figure with color $expectedColor")
    }

    override fun matchesSafely(item: GeometricShape, mismatchDescription: Description): Boolean {
        if (!item.color.equals(expectedColor)) {
            mismatchDescription
                .appendText("Figure color was ")
                .appendValue(item.color)
            return false
        }
        return true
    }
}

class QuantityNegativeSideMatcher() : TypeSafeDiagnosingMatcher<GeometricShape>() {

    override fun describeTo(description: Description) {
        description.appendText("Figure with positive sides quantity")
    }

    override fun matchesSafely(item: GeometricShape, mismatchDescription: Description): Boolean {
        if (item.sides < 0) {
            mismatchDescription
                .appendText("Figure sides quantity was")
                .appendValue(item.sides)
            return false
        }
        return true
    }
}

class EvenSides(
) : TypeSafeDiagnosingMatcher<GeometricShape>() {

    override fun describeTo(description: Description) {
        description.appendText("The figure has an even number of sides")
    }

    override fun matchesSafely(item: GeometricShape, mismatchDescription: Description): Boolean {
        if (item.sides % 2 != 0) {
            mismatchDescription
                .appendText("The figure has an odd number of sides")
            return false
        }
        return true
    }
}

class CornerNumberMatcher(
    private val cornerNumber: Int
) : TypeSafeDiagnosingMatcher<GeometricShape>() {

    override fun describeTo(description: Description) {
        description.appendText("corner number")
            .appendValue(cornerNumber)
    }

    override fun matchesSafely(item: GeometricShape, mismatchDescription: Description): Boolean {
        val actualCorner = if (item.sides <= 2) {
            0
        }
            else {
                item.sides
            }
        if (cornerNumber != actualCorner){
            mismatchDescription
                .appendText("corner number was ")
                .appendValue(actualCorner)
            return false
        }
        return true
    }
}

enum class Color { RED, BLUE, GREEN, YELLOW, BLACK, WHITE }
val shapes = listOf(
    GeometricShape(10f, 3, Color.RED), GeometricShape(5f, 4, Color.BLUE), GeometricShape(7f, 2, Color.GREEN),
    GeometricShape(0.5f, 1, Color.YELLOW), GeometricShape(-3f, 5, Color.BLACK), GeometricShape(8f, -2, Color.WHITE),
    GeometricShape(12f, 6, Color.RED), GeometricShape(15f, 8, Color.BLUE), GeometricShape(20f, 4, Color.GREEN),
    GeometricShape(9f, 5, Color.YELLOW), GeometricShape(2f, 3, Color.BLACK), GeometricShape(11f, 7, Color.WHITE),
    GeometricShape(6f, 10, Color.RED), GeometricShape(3f, 2, Color.BLUE), GeometricShape(4f, 1, Color.GREEN),
    GeometricShape(25f, 12, Color.YELLOW), GeometricShape(30f, 14, Color.BLACK), GeometricShape(35f, 16, Color.WHITE),
    GeometricShape(40f, 18, Color.RED), GeometricShape(50f, 20, Color.BLUE)
)

fun hasCorners(cornerNumber: Int) = CornerNumberMatcher(cornerNumber)
fun hasValidSides() = QuantityNegativeSideMatcher()
fun hasValidSideLength() = LengthNegativeSideMatcher()
fun hasSideLengthInRange(min: Float, max: Float) = LengthRangeMatcher(min, max)
fun hasEvenSides() = EvenSides()
fun hasColor(expectedColor: Color) = ColorMatcher(expectedColor)

// Фильтрация с использованием allOf
val filteredShapes = shapes.filter { shape ->
    allOf(
        hasSideLengthInRange(1f, 20f),
        hasEvenSides(),
        hasValidSideLength(),
        hasValidSides()
    ).matches(shape)
}

// Примеры ассертов
fun testMatchers() {
    val shape = GeometricShape(10f, 4, Color.RED)
    assertThat(shape, hasSideLengthInRange(1f, 20f))
    assertThat(shape, hasColor(Color.RED))
    assertThat(shape, hasValidSideLength())
    assertThat(shape, hasValidSides())
}

fun main() {
    testMatchers()
    println("Фигуры, прошедшие фильтрацию: $filteredShapes")
}
