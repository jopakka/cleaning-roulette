package fi.joonasniemi.cleaningroulette.di

import android.content.Context
import androidx.room.Room
import fi.joonasniemi.cleaningroulette.data.database.AndroidCleaningRouletteDatabase
import fi.joonasniemi.cleaningroulette.data.database.AndroidCleaningTasksDao
import fi.joonasniemi.cleaningroulette.data.database.AndroidRoomCleaningTasksDao
import fi.joonasniemi.cleaningroulette.data.database.CleaningTasksDao
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

private fun provideDatabase(context: Context) = Room.databaseBuilder(
    context,
    AndroidCleaningRouletteDatabase::class.java,
    "cleaning_roulette_database"
).build()

private fun provideAndroidCleaningTasksDao(database: AndroidCleaningRouletteDatabase) = database.getCleaningTasksDao()

private fun provideCleaningTasksDao(dao: AndroidRoomCleaningTasksDao) = AndroidCleaningTasksDao(dao)

actual val platformModule: Module = module {
    single { provideDatabase(get()) }
    single { provideAndroidCleaningTasksDao(get()) }
    single { provideCleaningTasksDao(get()) }.bind<CleaningTasksDao>()
}
