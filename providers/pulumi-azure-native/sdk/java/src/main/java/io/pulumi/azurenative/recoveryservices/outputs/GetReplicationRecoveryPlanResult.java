// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReplicationRecoveryPlanResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource Location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource Name
     * 
     */
    private final String name;
    /**
     * The custom details.
     * 
     */
    private final RecoveryPlanPropertiesResponse properties;
    /**
     * Resource Type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","type"})
    private GetReplicationRecoveryPlanResult(
        String id,
        @Nullable String location,
        String name,
        RecoveryPlanPropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource Location
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource Name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The custom details.
     * 
     */
    public RecoveryPlanPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource Type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationRecoveryPlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private RecoveryPlanPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationRecoveryPlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(RecoveryPlanPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetReplicationRecoveryPlanResult build() {
            return new GetReplicationRecoveryPlanResult(id, location, name, properties, type);
        }
    }
}
