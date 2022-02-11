// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentArgs Empty = new GetEnvironmentArgs();

    @InputImport(name="environmentIdentifier", required=true)
    private final String environmentIdentifier;

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    public GetEnvironmentArgs(String environmentIdentifier) {
        this.environmentIdentifier = Objects.requireNonNull(environmentIdentifier, "expected parameter 'environmentIdentifier' to be non-null");
    }

    private GetEnvironmentArgs() {
        this.environmentIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentIdentifier = defaults.environmentIdentifier;
        }

        public Builder setEnvironmentIdentifier(String environmentIdentifier) {
            this.environmentIdentifier = Objects.requireNonNull(environmentIdentifier);
            return this;
        }

        public GetEnvironmentArgs build() {
            return new GetEnvironmentArgs(environmentIdentifier);
        }
    }
}
