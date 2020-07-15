package io.github.erikjhordanrey.kotlin_devises.di

import javax.inject.Scope
import kotlin.annotation.AnnotationRetention.RUNTIME

@Scope
@Retention(RUNTIME)
annotation class FeatureScope
