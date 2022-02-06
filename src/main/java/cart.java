import basesteps.BaseSteps;
import org.junit.Test;

public class cart {
    package org.//qa5.fasttrackit.org:8008/.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
}

    public class CartSteps extends BaseSteps {


        private Object productPage;
        @Test

        public void clickAddProductToCart() {
            clickAddProductToCart();
        }
         @Test
        public void clickAddProductToCart(Object productPage){
            this.productPage = productPage;
            productPage.clickAddToCartButton();

            }
            @Test
        public void navigateToCart() {
            Object homePage = null;
            homePage.clickOnCartIcon();
            homePage.clickOnViewShoppingCartLink();
            


            }


        public Object getProductPage() {
            return productPage;
        }

        public void setProductPage(Object productPage) {
            this.productPage = productPage;
        }
        




