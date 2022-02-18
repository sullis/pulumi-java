// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This activity suspends pipeline execution for the specified interval.
 * 
 */
public final class WaitActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final WaitActivityResponse Empty = new WaitActivityResponse();

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is 'Wait'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    /**
     * Duration in seconds.
     * 
     */
    @InputImport(name="waitTimeInSeconds", required=true)
    private final Object waitTimeInSeconds;

    public Object getWaitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    public WaitActivityResponse(
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        String name,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        Object waitTimeInSeconds) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.waitTimeInSeconds = Objects.requireNonNull(waitTimeInSeconds, "expected parameter 'waitTimeInSeconds' to be non-null");
    }

    private WaitActivityResponse() {
        this.dependsOn = List.of();
        this.description = null;
        this.name = null;
        this.type = null;
        this.userProperties = List.of();
        this.waitTimeInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private Object waitTimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.waitTimeInSeconds = defaults.waitTimeInSeconds;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setWaitTimeInSeconds(Object waitTimeInSeconds) {
            this.waitTimeInSeconds = Objects.requireNonNull(waitTimeInSeconds);
            return this;
        }

        public WaitActivityResponse build() {
            return new WaitActivityResponse(dependsOn, description, name, type, userProperties, waitTimeInSeconds);
        }
    }
}
