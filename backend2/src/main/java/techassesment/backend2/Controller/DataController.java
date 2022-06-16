package techassesment.backend2.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Repository.AccountRepository;
import techassesment.backend2.Repository.TransactionRepository;
import techassesment.backend2.Repository.UserRepository;

import javax.management.ObjectName;
import java.io.IOException;
import java.util.List;

public class DataController {
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public DataController(UserRepository userRepository, AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/data")
    public ResponseEntity<Object> getData() {
        try {
            String command = "curl -k -X GET https://ob.sandbox.natwest.com/open-banking/v2.0/accounts " +
                    "-H 'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHAiOiJQb3J0ZW1vbm5haWUiLCJvcmciOiJwb3J0ZW1vbmFpZWRhdGEuY29tIiwiaXNzIjoiaHR0cHM6Ly9hcGkuc2FuZGJveC5uYXR3ZXN0LmNvbSIsInRva2VuX3R5cGUiOiJBQ0NFU1NfVE9LRU4iLCJleHRlcm5hbF9jbGllbnRfaWQiOiJpeUZpc0dHQ2ZZTGdrckM4V0FRenY0Z2hMLUYyelA2VjVQNGpYeGQyZ3NVPSIsImNsaWVudF9pZCI6IjYwOTkwOTU0LTM4MTEtNDYzOC1hMDViLTQzN2U5MzJlZDVlNCIsIm1heF9hZ2UiOjg2NDAwLCJhdWQiOiI2MDk5MDk1NC0zODExLTQ2MzgtYTA1Yi00MzdlOTMyZWQ1ZTQiLCJ1c2VyX2lkIjoiMTIzNDU2Nzg5MDEyQHBvcnRlbW9uYWllZGF0YS5jb20iLCJncmFudF9pZCI6ImQzZTE0YzU2LWIzYjQtNGVmMi05NmZjLTczNDAxZTg5ZjU5YiIsInNjb3BlIjoiYWNjb3VudHMgb3BlbmlkIiwiY29uc2VudF9yZWZlcmVuY2UiOiJjNGRhNGE5Mi0yOTU2LTRiMzAtOWMxOC1iZjljMmY2Yzk0NGIiLCJleHAiOjE2NTUzMTk2NjMsImlhdCI6MTY1NTMxOTA2MywianRpIjoiNTY4NTM3MjItNDk2MC00ZDcwLWJlOGQtY2Y4NGZiNWRjZGM2IiwidGVuYW50IjoiTmF0V2VzdCJ9.sjnzc6qCLCXJls79DCfWAJtIqbwGV0YUk3uYJ5toAuajt_TfC0pnN6_bCkZL-mzcyp7dt-QqxWwjvvQXX18wcjJYGYTR_gtUr3TT1gOokpC3XhgTZjzxC9K8iSYJZllgCdyAJ2jOEIanmn3v1SVFPkIkAIp8Zz2K98TStDSFF3BXNQQ6c-DQkfhozN4BIPcwAyI1UARFulRvzi5jTWksnou3lOUdinF9XUO2jDOFSmOb2GY22YX3TnN0LT3-XAzfRVuQdOz1ZB33CddA3H4rrBRMEipsEdf_m1KzZZU0rGWSBEMEUQ3ZVIjvbeoOy0inPm8Tnk-5JCGLnY1aSWatyQ' " +
                    "-H 'x-fapi-financial-id: 0015800000jfwxXAAQ'";
            Process process = Runtime.getRuntime().exec(command);
            Object data = process.getOutputStream();
            return (ResponseEntity<Object>) data;

        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }

    }
}


   // public void getData() throws JsonProcessingException, JSONException {
//        String url ="https://ob.sandbox.natwest.com/token";
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("grant_type", "client_credentials");
//        map.put("client_id", "iyFisGGCfYLgkrC8WAQzv4ghL-F2zP6V5P4jXxd2gsU=");
//        map.put("client_secret", "ymxDMT_1xst2CN-tTB01L0r9BHrQJFZ0JEKO3tODn-U=");
//        map.put("scope", "accounts");
//        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
//        ResponseEntity<Object> response = restTemplate.postForEntity(url, entity, Object.class);
//        String token = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHAiOiJQb3J0ZW1vbm5haWUiLCJvcmciOiJwb3J0ZW1vbmFpZWRhdGEuY29tIiwiaXNzIjoiaHR0cHM6Ly9hcGkuc2FuZGJveC5uYXR3ZXN0LmNvbSIsInRva2VuX3R5cGUiOiJBQ0NFU1NfVE9LRU4iLCJleHRlcm5hbF9jbGllbnRfaWQiOiJpeUZpc0dHQ2ZZTGdrckM4V0FRenY0Z2hMLUYyelA2VjVQNGpYeGQyZ3NVPSIsImNsaWVudF9pZCI6IjYwOTkwOTU0LTM4MTEtNDYzOC1hMDViLTQzN2U5MzJlZDVlNCIsIm1heF9hZ2UiOjg2NDAwLCJhdWQiOiI2MDk5MDk1NC0zODExLTQ2MzgtYTA1Yi00MzdlOTMyZWQ1ZTQiLCJzY29wZSI6ImFjY291bnRzIiwiZXhwIjoxNjU1MDgxNjcxLCJpYXQiOjE2NTUwODEwNzEsImp0aSI6ImMxNTk1NjFiLTg1YjMtNDM5My1iZGEwLTBlZWZiZTYwZGQ5MiIsInRlbmFudCI6Ik5hdFdlc3QifQ.FarVwsN4oKAtjnL3NIflhJASG_2UinGpPOJ1es3E2Z0F7SrmG9xthaPSWQb5h2ZrH6MVHfq4da2yGYW1dTlIQ8kIcrItykjRJGru_D2Gbl0EWfB9eodoYBMLoW7SKlWKcrtb3TkBqsXmS4an3w0KZarWnJ3N1D2gwFRdbUIykUecQFstv4I2HXgHw0mS_ZcfmryUOsr0wvCGbXvaQN5DdpBko2XFfQODcOYtR0rzw5Cs4ThLEaaWYqpVQlv_Y2cZesDTkQfhdzlf6jIcYysfv6Lj9WPuV62sNMF-GsyWaVg_jZ8KE6XgRhXoxw-0zvD-q3DgUQDnBrWivhph6z0h3A";
//        String url2 = "https://ob.sandbox.natwest.com/open-banking/v2.0/accounts";
//        HttpHeaders headers2 = new HttpHeaders();
//        headers2.setBearerAuth(token);
//        headers2.set("x-fapi-financial-id", "0015800000jfwxXAAQ");
//        ResponseEntity<JSONPObject> response2 = restTemplate.postForEntity(url, headers2, JSONPObject.class);
//        String dummyJSON = "{\"Data\":{\"Account\":[{\"AccountId\":\"06f1c4ea-8d17-4845-a27f-da3922e4e5f2\",\"Currency\":\"GBP\",\"AccountType\":\"Personal\",\"AccountSubType\":\"CurrentAccount\",\"Description\":null,\"Nickname\":\"DebitAccount-RBS-Alice\",\"Account\":[{\"SchemeName\":\"SortCodeAccountNumber\",\"Identification\":\"50000020803729\",\"Name\":\"DebitAccount-RBS-Alice\"}]},{\"AccountId\":\"775a26eb-e564-4944-b2e9-a263f50dc419\",\"Currency\":\"GBP\",\"AccountType\":\"Personal\",\"AccountSubType\":\"CurrentAccount\",\"Description\":null,\"Nickname\":\"SavingsAccount-RBS-Alice\",\"Account\":[{\"SchemeName\":\"SortCodeAccountNumber\",\"Identification\":\"50000020803737\",\"Name\":\"SavingsAccount-RBS-Alice\"}]}]},\"Links\":{\"Self\":\"https://ob.sandbox.natwest.com/open-banking/v2.0/accounts\"},\"Meta\":{}}";
//        JSONObject obj = new JSONObject(dummyJSON);





