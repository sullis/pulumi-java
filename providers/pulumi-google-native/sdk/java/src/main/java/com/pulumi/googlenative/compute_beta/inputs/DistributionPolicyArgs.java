// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.DistributionPolicyTargetShape;
import com.pulumi.googlenative.compute_beta.inputs.DistributionPolicyZoneConfigurationArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionPolicyArgs Empty = new DistributionPolicyArgs();

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    @Import(name="targetShape")
    private @Nullable Output<DistributionPolicyTargetShape> targetShape;

    /**
     * @return The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    public Optional<Output<DistributionPolicyTargetShape>> targetShape() {
        return Optional.ofNullable(this.targetShape);
    }

    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<DistributionPolicyZoneConfigurationArgs>> zones;

    /**
     * @return Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    public Optional<Output<List<DistributionPolicyZoneConfigurationArgs>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private DistributionPolicyArgs() {}

    private DistributionPolicyArgs(DistributionPolicyArgs $) {
        this.targetShape = $.targetShape;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionPolicyArgs $;

        public Builder() {
            $ = new DistributionPolicyArgs();
        }

        public Builder(DistributionPolicyArgs defaults) {
            $ = new DistributionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetShape The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
         * 
         * @return builder
         * 
         */
        public Builder targetShape(@Nullable Output<DistributionPolicyTargetShape> targetShape) {
            $.targetShape = targetShape;
            return this;
        }

        /**
         * @param targetShape The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
         * 
         * @return builder
         * 
         */
        public Builder targetShape(DistributionPolicyTargetShape targetShape) {
            return targetShape(Output.of(targetShape));
        }

        /**
         * @param zones Zones where the regional managed instance group will create and manage its instances.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<DistributionPolicyZoneConfigurationArgs>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Zones where the regional managed instance group will create and manage its instances.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<DistributionPolicyZoneConfigurationArgs> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Zones where the regional managed instance group will create and manage its instances.
         * 
         * @return builder
         * 
         */
        public Builder zones(DistributionPolicyZoneConfigurationArgs... zones) {
            return zones(List.of(zones));
        }

        public DistributionPolicyArgs build() {
            return $;
        }
    }

}
