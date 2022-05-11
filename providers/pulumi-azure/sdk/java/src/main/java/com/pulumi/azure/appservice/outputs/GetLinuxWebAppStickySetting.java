// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppStickySetting {
    /**
     * @return A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    private final List<String> appSettingNames;
    /**
     * @return A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    private final List<String> connectionStringNames;

    @CustomType.Constructor
    private GetLinuxWebAppStickySetting(
        @CustomType.Parameter("appSettingNames") List<String> appSettingNames,
        @CustomType.Parameter("connectionStringNames") List<String> connectionStringNames) {
        this.appSettingNames = appSettingNames;
        this.connectionStringNames = connectionStringNames;
    }

    /**
     * @return A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    public List<String> appSettingNames() {
        return this.appSettingNames;
    }
    /**
     * @return A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
     * 
     */
    public List<String> connectionStringNames() {
        return this.connectionStringNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppStickySetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> appSettingNames;
        private List<String> connectionStringNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppStickySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSettingNames = defaults.appSettingNames;
    	      this.connectionStringNames = defaults.connectionStringNames;
        }

        public Builder appSettingNames(List<String> appSettingNames) {
            this.appSettingNames = Objects.requireNonNull(appSettingNames);
            return this;
        }
        public Builder appSettingNames(String... appSettingNames) {
            return appSettingNames(List.of(appSettingNames));
        }
        public Builder connectionStringNames(List<String> connectionStringNames) {
            this.connectionStringNames = Objects.requireNonNull(connectionStringNames);
            return this;
        }
        public Builder connectionStringNames(String... connectionStringNames) {
            return connectionStringNames(List.of(connectionStringNames));
        }        public GetLinuxWebAppStickySetting build() {
            return new GetLinuxWebAppStickySetting(appSettingNames, connectionStringNames);
        }
    }
}
