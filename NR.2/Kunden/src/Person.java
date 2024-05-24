import javax.lang.model.element.Name;
import javax.xml.namespace.QName;

abstract class Person {
    private String Name;
    private String Email;


    public Person (String Name, String Email) {
        this.Name = Name;
        this.Email = Email;
    }

        public void setName(String Name) {
            this.Name = Name;
        }

            public String getName() {
                return Name;
            }

                public void setEmail(String Email) {
                    this.Email = Email;
                }

                    public String getEmail(String Email){
                        return this.Email;
                    }
    abstract void displayInfo();
}


