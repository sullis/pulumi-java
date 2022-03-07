// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange Empty = new GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange();

    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange(
        String description,
        String value) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange() {
        this.description = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.value = defaults.value;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange build() {
            return new GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange(description, value);
        }
    }
}