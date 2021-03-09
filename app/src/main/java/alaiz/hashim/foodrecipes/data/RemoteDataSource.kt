package alaiz.hashim.foodrecipes.data

import alaiz.hashim.foodrecipes.FoodRecipesApi
import alaiz.hashim.foodrecipes.model.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
        private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }




}