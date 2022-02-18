// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork Empty = new GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork();

    @InputImport(name="expirationTime", required=true)
    private final String expirationTime;

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * The name of the instance.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork(
        String expirationTime,
        String name,
        String value) {
        this.expirationTime = Objects.requireNonNull(expirationTime, "expected parameter 'expirationTime' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork() {
        this.expirationTime = null;
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork build() {
            return new GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork(expirationTime, name, value);
        }
    }
}
