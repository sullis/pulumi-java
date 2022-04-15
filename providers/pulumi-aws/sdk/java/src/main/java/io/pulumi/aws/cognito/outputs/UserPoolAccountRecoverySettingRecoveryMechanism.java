// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserPoolAccountRecoverySettingRecoveryMechanism {
    /**
     * Name of the attribute.
     * 
     */
    private final String name;
    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    private final Integer priority;

    @CustomType.Constructor
    private UserPoolAccountRecoverySettingRecoveryMechanism(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    /**
     * Name of the attribute.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     * 
    */
    public Integer priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingRecoveryMechanism defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySettingRecoveryMechanism defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }        public UserPoolAccountRecoverySettingRecoveryMechanism build() {
            return new UserPoolAccountRecoverySettingRecoveryMechanism(name, priority);
        }
    }
}
