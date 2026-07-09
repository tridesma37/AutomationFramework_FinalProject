Feature: Login SauceDemo

  @web
  Scenario: Login dengan username dan password yang valid
    Given User membuka halaman login SauceDemo
    When User login menggunakan username "standard_user" dan password "secret_sauce"
    Then User berhasil masuk ke halaman produk

  @web
  Scenario: Login dengan password salah
    Given User membuka halaman login SauceDemo
    When User login menggunakan username "standard_user" dan password "salah123"
    Then Muncul pesan error login

  @web

  Scenario: User berhasil melakukan checkout produk
    Given User membuka halaman login SauceDemo
    When User login menggunakan username "standard_user" dan password "secret_sauce"
    And User menambahkan produk ke cart
    And User membuka cart
    And User checkout dengan data
    Then User berhasil menyelesaikan checkout