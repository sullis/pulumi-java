// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.SyncPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParentPropertiesResponse {
    /**
     * The resource ID of the parent to which the connected registry will be associated.
     * 
     */
    private final @Nullable String id;
    /**
     * The sync properties of the connected registry with its parent.
     * 
     */
    private final SyncPropertiesResponse syncProperties;

    @OutputCustomType.Constructor({"id","syncProperties"})
    private ParentPropertiesResponse(
        @Nullable String id,
        SyncPropertiesResponse syncProperties) {
        this.id = id;
        this.syncProperties = Objects.requireNonNull(syncProperties);
    }

    /**
     * The resource ID of the parent to which the connected registry will be associated.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The sync properties of the connected registry with its parent.
     * 
    */
    public SyncPropertiesResponse getSyncProperties() {
        return this.syncProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private SyncPropertiesResponse syncProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ParentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.syncProperties = defaults.syncProperties;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setSyncProperties(SyncPropertiesResponse syncProperties) {
            this.syncProperties = Objects.requireNonNull(syncProperties);
            return this;
        }
        public ParentPropertiesResponse build() {
            return new ParentPropertiesResponse(id, syncProperties);
        }
    }
}