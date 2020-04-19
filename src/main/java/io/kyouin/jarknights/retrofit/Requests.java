package io.kyouin.jarknights.retrofit;

import com.google.gson.JsonElement;
import io.kyouin.jarknights.utils.AKConstants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Requests {

    @GET(AKConstants.JSON_CHAR_WORD)
    Call<JsonElement> getCharWords(@Path("lang") String lang);

    @GET(AKConstants.JSON_CHECK_IN)
    Call<JsonElement> getCheckIns(@Path("lang") String lang);

    @GET(AKConstants.JSON_HANDBOOK)
    Call<JsonElement> getHandbooks(@Path("lang") String lang);

    @GET(AKConstants.JSON_ITEM)
    Call<JsonElement> getItems(@Path("lang") String lang);

    @GET(AKConstants.JSON_CHARACTER)
    Call<JsonElement> getOperators(@Path("lang") String lang);

    @GET(AKConstants.JSON_RANGE)
    Call<JsonElement> getRanges(@Path("lang") String lang);

    @GET(AKConstants.JSON_SKILL)
    Call<JsonElement> getSkills(@Path("lang") String lang);

    @GET(AKConstants.JSON_SKIN)
    Call<JsonElement> getSkins(@Path("lang") String lang);

    @GET(AKConstants.JSON_STAGE)
    Call<JsonElement> getStages(@Path("lang") String lang);

    // ACESHIP

    @GET(AKConstants.JSON_ACESHIP_AKHR)
    Call<JsonElement> getAceshipOperators();

    @GET(AKConstants.JSON_ACESHIP_CHAR)
    Call<JsonElement> getAceshipOperatorNames();

    @GET(AKConstants.JSON_ACESHIP_SKILLS)
    Call<JsonElement> getAceshipSkills();

    @GET(AKConstants.JSON_ACESHIP_TAGS)
    Call<JsonElement> getAceshipTags();

    @GET(AKConstants.JSON_ACESHIP_TALENTS)
    Call<JsonElement> getAceshipTalents();

    @GET(AKConstants.JSON_ACESHIP_TYPE)
    Call<JsonElement> getAceshipTypes();

    @GET(AKConstants.JSON_ACESHIP_UNREADABLENAME)
    Call<JsonElement> getAceshipUnreadableNames();
}
