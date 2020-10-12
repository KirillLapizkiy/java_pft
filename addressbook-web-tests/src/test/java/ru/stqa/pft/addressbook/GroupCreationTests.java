package ru.stqa.pft.addressbook;


import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test3", "Test3", "Test3"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

}
