// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeResourceStatementRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeResourceStatementRequestArgs Empty = new NetworkInsightsAccessScopeResourceStatementRequestArgs();

    @InputImport(name="resourceTypes")
    private final @Nullable Input<List<String>> resourceTypes;

    public Input<List<String>> getResourceTypes() {
        return this.resourceTypes == null ? Input.empty() : this.resourceTypes;
    }

    @InputImport(name="resources")
    private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    public NetworkInsightsAccessScopeResourceStatementRequestArgs(
        @Nullable Input<List<String>> resourceTypes,
        @Nullable Input<List<String>> resources) {
        this.resourceTypes = resourceTypes;
        this.resources = resources;
    }

    private NetworkInsightsAccessScopeResourceStatementRequestArgs() {
        this.resourceTypes = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeResourceStatementRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> resourceTypes;
        private @Nullable Input<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeResourceStatementRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.resources = defaults.resources;
        }

        public Builder setResourceTypes(@Nullable Input<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder setResourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Input.ofNullable(resourceTypes);
            return this;
        }

        public Builder setResources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public NetworkInsightsAccessScopeResourceStatementRequestArgs build() {
            return new NetworkInsightsAccessScopeResourceStatementRequestArgs(resourceTypes, resources);
        }
    }
}
