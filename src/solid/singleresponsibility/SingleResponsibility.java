package solid.singleresponsibility;

public class SingleResponsibility {

    /*
        WRONG EXAMPLE:
        - AppSetting class has check access method which will be a problem when u want to change the accessibility
          of the application
        - Accessibility of the application should not be the responsibility of AppSetting class, because AppSetting
          is only responsible for changing the application setting for user
        - If u want to modify the access, u might need additional variables/methods that do not correlate to AppSetting
     */
    public class AppSetting {
        public void changeTheme() {
            if (checkAccess()) {
                // code logic to change theme
            }
        }
        public boolean checkAccess() {
            // code logic to check access
            return true;
        }
    }

    /*
        RIGHT EXAMPLE:
        - Move checkAccess method into their own class of SecuritySetting
        - Now both class have their own responsibility to do
     */

    public class AppSettingCorrect {
        private SecuritySetting securitySetting;
        public AppSettingCorrect(SecuritySetting securitySetting) {
            this.securitySetting = securitySetting;
        }
        public void changeTheme() {
            if (this.securitySetting.checkAccess()) {
                // code logic to change theme
            }
        }
    }

    public class SecuritySetting {
        public boolean checkAccess() {
            // code logic to check access
            return true;
        }
    }
}
