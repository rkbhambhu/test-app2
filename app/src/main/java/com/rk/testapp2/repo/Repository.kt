package com.rk.testapp2.repo

class Repository {

    val BASE_URL = "https://enigmatic-coast-6264.herokuapp.com"

    companion object {
        lateinit var INSTANCE: Repository

        fun getInstance() : Repository {
            if (INSTANCE == null) {
                val repo = Repository()
                INSTANCE = repo
                return INSTANCE
            } else {
                return INSTANCE
            }
        }

        fun getCategories() {

        }
    }


}