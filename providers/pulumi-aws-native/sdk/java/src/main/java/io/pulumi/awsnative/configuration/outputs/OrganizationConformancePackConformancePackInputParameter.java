// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OrganizationConformancePackConformancePackInputParameter {
    private final String parameterName;
    private final String parameterValue;

    @OutputCustomType.Constructor({"parameterName","parameterValue"})
    private OrganizationConformancePackConformancePackInputParameter(
        String parameterName,
        String parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName);
        this.parameterValue = Objects.requireNonNull(parameterValue);
    }

    public String getParameterName() {
        return this.parameterName;
    }
    public String getParameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConformancePackConformancePackInputParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConformancePackConformancePackInputParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setParameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder setParameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public OrganizationConformancePackConformancePackInputParameter build() {
            return new OrganizationConformancePackConformancePackInputParameter(parameterName, parameterValue);
        }
    }
}