// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OrganizationConformancePackInputParameter {
    /**
     * @return The input key.
     * 
     */
    private final String parameterName;
    /**
     * @return The input value.
     * 
     */
    private final String parameterValue;

    @CustomType.Constructor
    private OrganizationConformancePackInputParameter(
        @CustomType.Parameter("parameterName") String parameterName,
        @CustomType.Parameter("parameterValue") String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    /**
     * @return The input key.
     * 
     */
    public String parameterName() {
        return this.parameterName;
    }
    /**
     * @return The input value.
     * 
     */
    public String parameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConformancePackInputParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConformancePackInputParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }        public OrganizationConformancePackInputParameter build() {
            return new OrganizationConformancePackInputParameter(parameterName, parameterValue);
        }
    }
}
