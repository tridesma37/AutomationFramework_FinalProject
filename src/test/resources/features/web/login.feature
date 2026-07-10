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
  Scenario: User berhasil menghapus produk dari cart
    Given User membuka halaman login SauceDemo
    When User login menggunakan username "standard_user" dan password "secret_sauce"
    And User menambahkan produk ke cart
    And User membuka cart
    And User menghapus produk dari cart
    Then Cart menjadi kosong

  @web
  Scenario: User berhasil melakukan checkout produk
    Given User membuka halaman login SauceDemo
    When User login menggunakan username "standard_user" dan password "secret_sauce"
    And User menambahkan produk ke cart
    And User membuka cart
    And User checkout dengan data
    Then User berhasil menyelesaikan checkout

  @web
  Scenario: User berhasil logout
    Given User membuka halaman login SauceDemo
    When User login menggunakan username "standard_user" dan password "secret_sauce"
    And User logout
    Then User kembali ke halaman login