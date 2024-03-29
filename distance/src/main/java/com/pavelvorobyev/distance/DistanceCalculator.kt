package com.pavelvorobyev.distance

import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.sin

fun distanceLocations(
    location1: Location,
    location2: Location,
): Double {
    val theta = location1.longitude - location2.longitude
    val distance =
        rad2deg(
            acos(
                (sin(deg2rad(location1.latitude)) * sin(deg2rad(location2.latitude)) +
                        (cos(deg2rad(location1.latitude)) * cos(deg2rad(location2.latitude)) *
                                cos(deg2rad(theta))))
            )
        )
    return distance * 60 * 1.1515 * 1.60934
}

private fun deg2rad(deg: Double) = deg * Math.PI / 180.0

private fun rad2deg(rad: Double) = rad * 180.0 / Math.PI