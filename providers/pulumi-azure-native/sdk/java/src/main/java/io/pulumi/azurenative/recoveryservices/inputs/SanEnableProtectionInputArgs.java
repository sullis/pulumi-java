// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * San enable protection provider specific input.
 * 
 */
public final class SanEnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final SanEnableProtectionInputArgs Empty = new SanEnableProtectionInputArgs();

    /**
     * The class type.
     * Expected value is 'San'.
     * 
     */
    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    public SanEnableProtectionInputArgs(@Nullable Input<String> instanceType) {
        this.instanceType = instanceType;
    }

    private SanEnableProtectionInputArgs() {
        this.instanceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SanEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(SanEnableProtectionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public SanEnableProtectionInputArgs build() {
            return new SanEnableProtectionInputArgs(instanceType);
        }
    }
}
