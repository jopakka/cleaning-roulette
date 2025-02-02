package fi.joonasniemi.cleaningroulette

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform