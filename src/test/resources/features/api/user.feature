Feature: Dummy API User

  @api
  Scenario: Get User By ID
    Given User memiliki endpoint Get User
    When User mengirim request GET User
    Then Status code API harus 200

  @api
  Scenario: Create User
    Given User memiliki endpoint Create User
    When User mengirim request POST User
    Then User berhasil dibuat

  @api
  Scenario: Update User
    Given User memiliki endpoint Update User
    When User mengirim request PUT User
    Then User berhasil diupdate

  @api
  Scenario: Delete User
    Given User memiliki endpoint Delete User
    When User mengirim request DELETE User
    Then User berhasil dihapus

  @api
  Scenario: Get List Tags
    Given User memiliki endpoint Tag
    When User mengirim request GET Tag
    Then Tag berhasil ditampilkan

  @api
  Scenario: Get User dengan ID tidak valid
    Given User memiliki endpoint Invalid User
    When User mengirim request GET Invalid User
    Then Status code API harus 404