// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ManagedIntegrationRuntimeStatusResponse;
import io.pulumi.azurenative.datafactory.outputs.SelfHostedIntegrationRuntimeStatusResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetIntegrationRuntimeStatusResult {
    /**
     * The integration runtime name.
     * 
     */
    private final String name;
    /**
     * Integration runtime properties.
     * 
     */
    private final Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties;

    @OutputCustomType.Constructor({"name","properties"})
    private GetIntegrationRuntimeStatusResult(
        String name,
        Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties) {
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
    }

    /**
     * The integration runtime name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Integration runtime properties.
     * 
     */
    public Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public GetIntegrationRuntimeStatusResult build() {
            return new GetIntegrationRuntimeStatusResult(name, properties);
        }
    }
}
