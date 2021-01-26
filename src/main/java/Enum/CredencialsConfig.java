package Enum;

import Interfaces.Credencials;
import PropertiesManager.PropertiesManager;

public enum CredencialsConfig implements Credencials {
    Values{
        @Override
        public String email() {
            return PropertiesManager.getPropertiesValue("EMAIL");
        }

        @Override
        public String password() {
            return PropertiesManager.getPropertiesValue("PASSWORD");
        }
    }
}
