// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRouteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteArgs Empty = new GetRouteArgs();

    @InputImport(name="applicationIdentifier", required=true)
    private final String applicationIdentifier;

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    @InputImport(name="environmentIdentifier", required=true)
    private final String environmentIdentifier;

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    @InputImport(name="routeIdentifier", required=true)
    private final String routeIdentifier;

    public String getRouteIdentifier() {
        return this.routeIdentifier;
    }

    public GetRouteArgs(
        String applicationIdentifier,
        String environmentIdentifier,
        String routeIdentifier) {
        this.applicationIdentifier = Objects.requireNonNull(applicationIdentifier, "expected parameter 'applicationIdentifier' to be non-null");
        this.environmentIdentifier = Objects.requireNonNull(environmentIdentifier, "expected parameter 'environmentIdentifier' to be non-null");
        this.routeIdentifier = Objects.requireNonNull(routeIdentifier, "expected parameter 'routeIdentifier' to be non-null");
    }

    private GetRouteArgs() {
        this.applicationIdentifier = null;
        this.environmentIdentifier = null;
        this.routeIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationIdentifier;
        private String environmentIdentifier;
        private String routeIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationIdentifier = defaults.applicationIdentifier;
    	      this.environmentIdentifier = defaults.environmentIdentifier;
    	      this.routeIdentifier = defaults.routeIdentifier;
        }

        public Builder setApplicationIdentifier(String applicationIdentifier) {
            this.applicationIdentifier = Objects.requireNonNull(applicationIdentifier);
            return this;
        }

        public Builder setEnvironmentIdentifier(String environmentIdentifier) {
            this.environmentIdentifier = Objects.requireNonNull(environmentIdentifier);
            return this;
        }

        public Builder setRouteIdentifier(String routeIdentifier) {
            this.routeIdentifier = Objects.requireNonNull(routeIdentifier);
            return this;
        }

        public GetRouteArgs build() {
            return new GetRouteArgs(applicationIdentifier, environmentIdentifier, routeIdentifier);
        }
    }
}
