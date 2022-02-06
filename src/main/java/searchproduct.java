import basesteps.BaseSteps;
import org.junit.Assert;

public class searchproduct<field, form> {
    
}
    package org://qa5.fasttrackit.org:8008/..steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

    public class SearchSteps<form> extends BaseSteps {

        @Step
    public void findAndOpenProduct(String productName, Object searchResultsPage){
        Assert.assertTrue(searchResultsPage.openProduct(productName));
    }

    #search-2 > form > input.search-field;
        public void searchAndSelectProduct(String productName){
            executeSearch(productName);
            String cap;
            findAndOpenProduct(searchAndSelectProduct(cap);
            

}

        private void findAndOpenProduct(String productName) {
        }
