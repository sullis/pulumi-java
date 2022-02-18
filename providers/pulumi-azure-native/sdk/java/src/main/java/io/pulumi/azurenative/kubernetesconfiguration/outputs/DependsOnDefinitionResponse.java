// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DependsOnDefinitionResponse {
    /**
     * Name of the kustomization to claim dependency on
     * 
     */
    private final @Nullable String kustomizationName;

    @OutputCustomType.Constructor({"kustomizationName"})
    private DependsOnDefinitionResponse(@Nullable String kustomizationName) {
        this.kustomizationName = kustomizationName;
    }

    /**
     * Name of the kustomization to claim dependency on
     * 
     */
    public Optional<String> getKustomizationName() {
        return Optional.ofNullable(this.kustomizationName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DependsOnDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kustomizationName;

        public Builder() {
    	      // Empty
        }

        public Builder(DependsOnDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kustomizationName = defaults.kustomizationName;
        }

        public Builder setKustomizationName(@Nullable String kustomizationName) {
            this.kustomizationName = kustomizationName;
            return this;
        }

        public DependsOnDefinitionResponse build() {
            return new DependsOnDefinitionResponse(kustomizationName);
        }
    }
}
