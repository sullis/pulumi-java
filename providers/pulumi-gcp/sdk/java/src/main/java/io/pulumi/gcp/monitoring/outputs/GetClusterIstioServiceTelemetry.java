// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterIstioServiceTelemetry {
    private final String resourceName;

    @OutputCustomType.Constructor({"resourceName"})
    private GetClusterIstioServiceTelemetry(String resourceName) {
        this.resourceName = Objects.requireNonNull(resourceName);
    }

    public String getPropResourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIstioServiceTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIstioServiceTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public GetClusterIstioServiceTelemetry build() {
            return new GetClusterIstioServiceTelemetry(resourceName);
        }
    }
}