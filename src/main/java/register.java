public class register<MySteps> {

    MySteps mySteps=new MySteps();

    public void setMySteps(MySteps mySteps, Object NavigateToclickRegister) {
        this.mySteps = mySteps;
        mySteps.Register("email","Password");

        public void clickRegister(){
            NavigateToclickRegister().clickRegisterButton();
            
        }


    }
}
