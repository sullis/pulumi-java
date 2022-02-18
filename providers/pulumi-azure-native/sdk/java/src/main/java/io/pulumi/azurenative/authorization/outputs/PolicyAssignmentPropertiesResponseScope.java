// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyAssignmentPropertiesResponseScope {
    /**
     * Display name of the resource
     * 
     */
    private final @Nullable String displayName;
    /**
     * Scope id of the resource
     * 
     */
    private final @Nullable String id;
    /**
     * Type of the resource
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"displayName","id","type"})
    private PolicyAssignmentPropertiesResponseScope(
        @Nullable String displayName,
        @Nullable String id,
        @Nullable String type) {
        this.displayName = displayName;
        this.id = id;
        this.type = type;
    }

    /**
     * Display name of the resource
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Scope id of the resource
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Type of the resource
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponseScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponseScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public PolicyAssignmentPropertiesResponseScope build() {
            return new PolicyAssignmentPropertiesResponseScope(displayName, id, type);
        }
    }
}
