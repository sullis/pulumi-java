// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.DistributionPolicyZoneConfigurationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DistributionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final DistributionPolicyResponse Empty = new DistributionPolicyResponse();

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    @Import(name="targetShape", required=true)
    private String targetShape;

    /**
     * @return The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    public String targetShape() {
        return this.targetShape;
    }

    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    @Import(name="zones", required=true)
    private List<DistributionPolicyZoneConfigurationResponse> zones;

    /**
     * @return Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    public List<DistributionPolicyZoneConfigurationResponse> zones() {
        return this.zones;
    }

    private DistributionPolicyResponse() {}

    private DistributionPolicyResponse(DistributionPolicyResponse $) {
        this.targetShape = $.targetShape;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionPolicyResponse $;

        public Builder() {
            $ = new DistributionPolicyResponse();
        }

        public Builder(DistributionPolicyResponse defaults) {
            $ = new DistributionPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetShape The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
         * 
         * @return builder
         * 
         */
        public Builder targetShape(String targetShape) {
            $.targetShape = targetShape;
            return this;
        }

        /**
         * @param zones Zones where the regional managed instance group will create and manage its instances.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<DistributionPolicyZoneConfigurationResponse> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Zones where the regional managed instance group will create and manage its instances.
         * 
         * @return builder
         * 
         */
        public Builder zones(DistributionPolicyZoneConfigurationResponse... zones) {
            return zones(List.of(zones));
        }

        public DistributionPolicyResponse build() {
            $.targetShape = Objects.requireNonNull($.targetShape, "expected parameter 'targetShape' to be non-null");
            $.zones = Objects.requireNonNull($.zones, "expected parameter 'zones' to be non-null");
            return $;
        }
    }

}
