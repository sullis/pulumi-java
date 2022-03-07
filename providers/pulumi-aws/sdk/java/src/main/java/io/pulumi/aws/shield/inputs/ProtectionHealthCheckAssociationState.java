// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionHealthCheckAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionHealthCheckAssociationState Empty = new ProtectionHealthCheckAssociationState();

    /**
     * The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
     * 
     */
    @InputImport(name="healthCheckArn")
      private final @Nullable Input<String> healthCheckArn;

    public Input<String> getHealthCheckArn() {
        return this.healthCheckArn == null ? Input.empty() : this.healthCheckArn;
    }

    /**
     * The ID of the protected resource.
     * 
     */
    @InputImport(name="shieldProtectionId")
      private final @Nullable Input<String> shieldProtectionId;

    public Input<String> getShieldProtectionId() {
        return this.shieldProtectionId == null ? Input.empty() : this.shieldProtectionId;
    }

    public ProtectionHealthCheckAssociationState(
        @Nullable Input<String> healthCheckArn,
        @Nullable Input<String> shieldProtectionId) {
        this.healthCheckArn = healthCheckArn;
        this.shieldProtectionId = shieldProtectionId;
    }

    private ProtectionHealthCheckAssociationState() {
        this.healthCheckArn = Input.empty();
        this.shieldProtectionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionHealthCheckAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> healthCheckArn;
        private @Nullable Input<String> shieldProtectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionHealthCheckAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckArn = defaults.healthCheckArn;
    	      this.shieldProtectionId = defaults.shieldProtectionId;
        }

        public Builder setHealthCheckArn(@Nullable Input<String> healthCheckArn) {
            this.healthCheckArn = healthCheckArn;
            return this;
        }

        public Builder setHealthCheckArn(@Nullable String healthCheckArn) {
            this.healthCheckArn = Input.ofNullable(healthCheckArn);
            return this;
        }

        public Builder setShieldProtectionId(@Nullable Input<String> shieldProtectionId) {
            this.shieldProtectionId = shieldProtectionId;
            return this;
        }

        public Builder setShieldProtectionId(@Nullable String shieldProtectionId) {
            this.shieldProtectionId = Input.ofNullable(shieldProtectionId);
            return this;
        }
        public ProtectionHealthCheckAssociationState build() {
            return new ProtectionHealthCheckAssociationState(healthCheckArn, shieldProtectionId);
        }
    }
}