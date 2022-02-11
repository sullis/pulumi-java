// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConformancePackArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConformancePackArgs Empty = new GetConformancePackArgs();

    @InputImport(name="conformancePackName", required=true)
    private final String conformancePackName;

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    public GetConformancePackArgs(String conformancePackName) {
        this.conformancePackName = Objects.requireNonNull(conformancePackName, "expected parameter 'conformancePackName' to be non-null");
    }

    private GetConformancePackArgs() {
        this.conformancePackName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConformancePackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String conformancePackName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConformancePackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conformancePackName = defaults.conformancePackName;
        }

        public Builder setConformancePackName(String conformancePackName) {
            this.conformancePackName = Objects.requireNonNull(conformancePackName);
            return this;
        }

        public GetConformancePackArgs build() {
            return new GetConformancePackArgs(conformancePackName);
        }
    }
}
