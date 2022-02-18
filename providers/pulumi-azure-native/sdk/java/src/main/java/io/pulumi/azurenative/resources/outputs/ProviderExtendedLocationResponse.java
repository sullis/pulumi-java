// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderExtendedLocationResponse {
    /**
     * The extended locations for the azure location.
     * 
     */
    private final @Nullable List<String> extendedLocations;
    /**
     * The azure location.
     * 
     */
    private final @Nullable String location;
    /**
     * The extended location type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"extendedLocations","location","type"})
    private ProviderExtendedLocationResponse(
        @Nullable List<String> extendedLocations,
        @Nullable String location,
        @Nullable String type) {
        this.extendedLocations = extendedLocations;
        this.location = location;
        this.type = type;
    }

    /**
     * The extended locations for the azure location.
     * 
     */
    public List<String> getExtendedLocations() {
        return this.extendedLocations == null ? List.of() : this.extendedLocations;
    }
    /**
     * The azure location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The extended location type.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderExtendedLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> extendedLocations;
        private @Nullable String location;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderExtendedLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocations = defaults.extendedLocations;
    	      this.location = defaults.location;
    	      this.type = defaults.type;
        }

        public Builder setExtendedLocations(@Nullable List<String> extendedLocations) {
            this.extendedLocations = extendedLocations;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ProviderExtendedLocationResponse build() {
            return new ProviderExtendedLocationResponse(extendedLocations, location, type);
        }
    }
}
