package di

import androidx.room.Room
import fi.joonasniemi.cleaningroulette.core.database.CrDatabase
import org.koin.dsl.module

internal val databaseModule = module {
    single<CrDatabase> {
        Room.databaseBuilder(
            context = get(),
            klass = CrDatabase::class.java,
            name = "cr_database"
        )
            .build()
    }
}