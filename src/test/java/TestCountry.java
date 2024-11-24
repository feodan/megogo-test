import io.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import net.megogo.api.GeolocationData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

@Slf4j
public class TestCountry {
    private static final String URL = "http://ip-api.com/json/";
    private static final String UKRAINE = "Ukraine";

    @DataProvider(name = "domains", parallel = true)
    public static String[] domains() {
        return new String[]{
                "0.ua.pool.ntp.org",
                "1.ua.pool.ntp.org",
                "2.ua.pool.ntp.org",
                "3.ua.pool.ntp.org",
                "4.ua.pool.ntp.org"
        };
    }

    @Test(dataProvider = "domains")
    public void checkDomain(String domain) {
        GeolocationData data = getGeolocationData(domain);

        assertEquals(data.getCountry(), UKRAINE);
    }

    private static GeolocationData getGeolocationData(String domain) {
        log.info("Check availability {} domain for Ukraine.", domain);

        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + domain)
                .then()
                .statusCode(200)
                .log().all()
                .extract().as(GeolocationData.class);
    }
}

