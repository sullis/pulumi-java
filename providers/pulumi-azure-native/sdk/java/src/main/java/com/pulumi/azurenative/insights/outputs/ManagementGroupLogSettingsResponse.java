// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagementGroupLogSettingsResponse {
    /**
     * @return Name of a Management Group Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    private final String category;
    /**
     * @return a value indicating whether this log is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private ManagementGroupLogSettingsResponse(
        @CustomType.Parameter("category") String category,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.category = category;
        this.enabled = enabled;
    }

    /**
     * @return Name of a Management Group Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return a value indicating whether this log is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupLogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupLogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public ManagementGroupLogSettingsResponse build() {
            return new ManagementGroupLogSettingsResponse(category, enabled);
        }
    }
}
