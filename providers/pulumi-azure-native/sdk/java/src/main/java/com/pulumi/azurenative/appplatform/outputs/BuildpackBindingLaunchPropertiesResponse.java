// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BuildpackBindingLaunchPropertiesResponse {
    /**
     * @return Non-sensitive properties for launchProperties
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return Sensitive properties for launchProperties
     * 
     */
    private final @Nullable Map<String,String> secrets;

    @CustomType.Constructor
    private BuildpackBindingLaunchPropertiesResponse(
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("secrets") @Nullable Map<String,String> secrets) {
        this.properties = properties;
        this.secrets = secrets;
    }

    /**
     * @return Non-sensitive properties for launchProperties
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Sensitive properties for launchProperties
     * 
     */
    public Map<String,String> secrets() {
        return this.secrets == null ? Map.of() : this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackBindingLaunchPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackBindingLaunchPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.secrets = defaults.secrets;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder secrets(@Nullable Map<String,String> secrets) {
            this.secrets = secrets;
            return this;
        }        public BuildpackBindingLaunchPropertiesResponse build() {
            return new BuildpackBindingLaunchPropertiesResponse(properties, secrets);
        }
    }
}
