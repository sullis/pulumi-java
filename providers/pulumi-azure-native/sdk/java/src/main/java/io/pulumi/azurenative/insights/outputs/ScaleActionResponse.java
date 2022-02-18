// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScaleActionResponse {
    /**
     * the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and 1 minute in ISO 8601 format.
     * 
     */
    private final String cooldown;
    /**
     * the scale direction. Whether the scaling action increases or decreases the number of instances.
     * 
     */
    private final String direction;
    /**
     * the type of action that should occur when the scale rule fires.
     * 
     */
    private final String type;
    /**
     * the number of instances that are involved in the scaling action. This value must be 1 or greater. The default value is 1.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"cooldown","direction","type","value"})
    private ScaleActionResponse(
        String cooldown,
        String direction,
        String type,
        @Nullable String value) {
        this.cooldown = Objects.requireNonNull(cooldown);
        this.direction = Objects.requireNonNull(direction);
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    /**
     * the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and 1 minute in ISO 8601 format.
     * 
     */
    public String getCooldown() {
        return this.cooldown;
    }
    /**
     * the scale direction. Whether the scaling action increases or decreases the number of instances.
     * 
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * the type of action that should occur when the scale rule fires.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * the number of instances that are involved in the scaling action. This value must be 1 or greater. The default value is 1.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cooldown;
        private String direction;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldown = defaults.cooldown;
    	      this.direction = defaults.direction;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setCooldown(String cooldown) {
            this.cooldown = Objects.requireNonNull(cooldown);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public ScaleActionResponse build() {
            return new ScaleActionResponse(cooldown, direction, type, value);
        }
    }
}
