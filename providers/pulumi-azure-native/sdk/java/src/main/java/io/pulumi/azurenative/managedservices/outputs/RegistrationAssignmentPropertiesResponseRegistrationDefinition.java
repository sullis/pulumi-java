// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.outputs;

import io.pulumi.azurenative.managedservices.outputs.PlanResponse;
import io.pulumi.azurenative.managedservices.outputs.RegistrationAssignmentPropertiesResponseProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegistrationAssignmentPropertiesResponseRegistrationDefinition {
    /**
     * Fully qualified path of the registration definition.
     * 
     */
    private final String id;
    /**
     * Name of the registration definition.
     * 
     */
    private final String name;
    /**
     * Plan details for the managed services.
     * 
     */
    private final @Nullable PlanResponse plan;
    /**
     * Properties of registration definition inside registration assignment.
     * 
     */
    private final @Nullable RegistrationAssignmentPropertiesResponseProperties properties;
    /**
     * Type of the resource (Microsoft.ManagedServices/registrationDefinitions).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","plan","properties","type"})
    private RegistrationAssignmentPropertiesResponseRegistrationDefinition(
        String id,
        String name,
        @Nullable PlanResponse plan,
        @Nullable RegistrationAssignmentPropertiesResponseProperties properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.plan = plan;
        this.properties = properties;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified path of the registration definition.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the registration definition.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Plan details for the managed services.
     * 
    */
    public Optional<PlanResponse> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * Properties of registration definition inside registration assignment.
     * 
    */
    public Optional<RegistrationAssignmentPropertiesResponseProperties> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Type of the resource (Microsoft.ManagedServices/registrationDefinitions).
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PlanResponse plan;
        private @Nullable RegistrationAssignmentPropertiesResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder setProperties(@Nullable RegistrationAssignmentPropertiesResponseProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RegistrationAssignmentPropertiesResponseRegistrationDefinition build() {
            return new RegistrationAssignmentPropertiesResponseRegistrationDefinition(id, name, plan, properties, type);
        }
    }
}