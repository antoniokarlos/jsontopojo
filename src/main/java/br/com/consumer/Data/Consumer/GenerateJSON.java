package br.com.consumer.Data.Consumer;

public class GenerateJSON {

    public String geraJSON(){

        StringBuilder json = new StringBuilder("{\n" +
                "  \"data\": {\n" +
                "    \"brand\": [\n" +
                "      {\n" +
                "        \"name\": \"Marca A\",\n" +
                "        \"companies\": [\n" +
                "          {\n" +
                "            \"name\": \"Empresa da Organização A\",\n" +
                "            \"cnpjNumber\": \"50.685.362/0001-35\",\n" +
                "            \"personalLoans\": [\n" +
                "              {\n" +
                "                \"types\": \"CHEQUE_ESPECIAL\",\n" +
                "                \"fees\": [\n" +
                "                  {\n" +
                "                    \"serviceName\": \"Cheque Especial\",\n" +
                "                    \"serviceCode\": \"Cheque Especial\",\n" +
                "                    \"chargingTriggerInfo\": \"(e) Tarifa válida a partir de 06.01.2020, para novas contratações de Cheque Especial e Cheque Empresarial direcionado a clientes MEI (f) Tarifa válida a partir de 01.06.2020, para contratações de Cheque Especial e Cheque Empresarial direcionado a clientes MEI realizadas até 05.01.2020\",\n" +
                "                    \"price\": [\n" +
                "                      {\n" +
                "                        \"interval\": \"1_FAIXA_VALORES\",\n" +
                "                        \"value\": \"500\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      },\n" +
                "                      {\n" +
                "                        \"interval\": \"2_FAIXA_VALORES\",\n" +
                "                        \"value\": \"600\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      },\n" +
                "                      {\n" +
                "                        \"interval\": \"3_FAIXA_VALORES\",\n" +
                "                        \"value\": \"700\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      },\n" +
                "                      {\n" +
                "                        \"interval\": \"4_FAIXA_VALORES\",\n" +
                "                        \"value\": \"800\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      }\n" +
                "                    ],\n" +
                "                    \"additionalInfo\": \"Vamor mínimo aplicado\"\n" +
                "                  }\n" +
                "                ],\n" +
                "                \"interestRates\": [\n" +
                "                  {\n" +
                "                    \"rate\": \"0.9\",\n" +
                "                    \"referencialRate\": null,\n" +
                "                    \"indexer\": \"IGPM\",\n" +
                "                    \"prePostTax\": \"POS\",\n" +
                "                    \"occurrence\": \"AA\",\n" +
                "                    \"incomeRateInfo\": \"Informações adicionais do calculo de juros\",\n" +
                "                    \"application\": [\n" +
                "                      {\n" +
                "                        \"interval\": \"1_FAIXA_VALORES\",\n" +
                "                        \"value\": \"500\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      },\n" +
                "                      {\n" +
                "                        \"interval\": \"2_FAIXA_VALORES\",\n" +
                "                        \"value\": \"600\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      },\n" +
                "                      {\n" +
                "                        \"interval\": \"3_FAIXA_VALORES\",\n" +
                "                        \"value\": \"700\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      },\n" +
                "                      {\n" +
                "                        \"interval\": \"4_FAIXA_VALORES\",\n" +
                "                        \"value\": \"800\",\n" +
                "                        \"currency\": \"BRL\",\n" +
                "                        \"frequency\": \"0.25\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ],\n" +
                "                \"requiredWarranties\": [\n" +
                "                  \"CESSAO_DIREITOS_CREDITORIOS\"\n" +
                "                ],\n" +
                "                \"termsConditions\": \"\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }  \n" +
                "}");

        return json.toString();

    }
}
