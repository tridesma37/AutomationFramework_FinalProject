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